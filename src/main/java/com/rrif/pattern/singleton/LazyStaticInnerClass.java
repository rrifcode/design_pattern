
package com.rrif.pattern.singleton;

import java.io.Serializable;

/**
 * 懒加载-静态内部类
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
public class LazyStaticInnerClass implements Serializable {

    /** 私有构造器 */
    private LazyStaticInnerClass(){}

    /**
     * 内部类创建实例
     * 由于JVM在类加载时, 是不会加载内部类的,
     * 只有内部类的属性和方法被调用的时候才会被加载,并初始化其静态属性
     * 静态属性被static修饰,保证只被实例化一次, 并且严格保证实例化顺序
     * 保证线程安全和实例的唯一性
     */
    private static class LazyStaticInnerClassHolder {
        private static final LazyStaticInnerClass INSTANCE = new LazyStaticInnerClass();
    };

    /** 对外提供获取对象方法, 使用时返回内部内创建的实例 */
    public static LazyStaticInnerClass getInstance(){
        return LazyStaticInnerClassHolder.INSTANCE;
    }


    /** 以下解决序列化和反序列化被破解的问题 */
    //在Singleton类中添加`readResolve()`方法，在反序列化时被反射调用，如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。
    private Object readResolve(){
        return LazyStaticInnerClassHolder.INSTANCE;
    }

}