
package com.rrif.pattern.singleton;

/**
 * 饿汉式-静态代码块方式
 *   在静态代码块中创建该类对象
 *   也是随类加载时创建, 对象很大并且一直没有使用会造成内存资源浪费
 *
 */
public class HungryStaticCode {

    /** 私有构造方法 */
    private HungryStaticCode() {}

    /** 声明静态成员变量 */
    private static HungryStaticCode instance;

    /** 在静态代码块里初始化对象 */
    static {
        instance = new HungryStaticCode();
    }

    /** 对外提供对象获取方法 */
    public static HungryStaticCode getInstance(){
        return instance;
    }

}