
package com.rrif.pattern.singleton;

/**
 * 懒加载-线程安全
 *   使用时才实例化对象, 避免资源浪费
 *   多线程时, 会出现线程安全问题
 */
public class LazyThreadUnsafe {

    /** 私有构造器 */
    private LazyThreadUnsafe(){}

    /** 声明成员变量 */
    private static LazyThreadUnsafe instance;

    /** 对外提供获取对象方法, 使用时现实例化对象 */
    public static LazyThreadUnsafe getInstance(){
        if(null == instance){
            instance = new LazyThreadUnsafe();
        }
        return instance;
    }


}