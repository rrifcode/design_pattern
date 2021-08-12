
package com.rrif.pattern.singleton;

/**
 * 懒加载-线程不安全
 *   使用时才实例化对象, 避免资源浪费
 *   增加同步锁, 保证线程安全
 *   由于同步锁, 获取对象效率低, 而且是在初次实例时才会有线程安全问题.
 */
public class LazyThreadSafe {

    /** 私有构造器 */
    private LazyThreadSafe(){}

    /** 声明成员变量 */
    private static LazyThreadSafe instance;

    /** 对外提供获取对象方法, 使用时现实例化对象, 增加同步锁, 保证线程安全 */
    public static synchronized LazyThreadSafe getInstance(){
        if(null == instance){
            instance = new LazyThreadSafe();
        }
        return instance;
    }


}