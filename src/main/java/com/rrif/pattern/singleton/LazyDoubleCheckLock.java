
package com.rrif.pattern.singleton;

/**
 * 懒加载-双重检查
 *   解决单例,性能, 线程安全问题.
 *   在多线程的情况下, 由于JVM在实例化对象的时候会进行优化和指令重排操作, 有可能会导致空指针问题
 *   要解决空指针问题, 成员变量使用volatile关键字修饰, 保证可见性和有序性
 */
public class LazyDoubleCheckLock {

    /** 私有构造器 */
    private LazyDoubleCheckLock(){

        /** 以下解决反射破解单例的问题 */
        //当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。
        if(null == instance){
            throw new RuntimeException();
        }

    }

    /** 声明成员变量 */
    /** 要解决空指针问题, 成员变量使用volatile关键字修饰, 保证可见性和有序性 */
    private static volatile LazyDoubleCheckLock instance;

    /** 对外提供获取对象方法, 使用时现实例化对象 */
    public static LazyDoubleCheckLock getInstance(){

        //第一次判断,如果已经实例化, 直接返回, 不进入抢锁阶段
        if(null == instance){
            synchronized (LazyDoubleCheckLock.class){
                //抢到锁后, 检查一下是否已经实例化
                if(null == instance){
                    instance = new LazyDoubleCheckLock();
                }
            }
        }
        return instance;
    }


}