
package com.rrif.pattern.singleton;

/**
 * 饿汉式-静态变量方式
 *   在成员位置声明静态变量并创建对象
 *   随类加载创建, 如果对象足够大,并且一直没使用会造成内存资源浪费
 */
public class HungryStaticVariable {


    /** 私有构造方式 */
    private HungryStaticVariable(){}

    /** 静态成员变量 */
    private static HungryStaticVariable instance = new HungryStaticVariable();

    /** 对外提供静态方式获取该对象实例 */
    public static HungryStaticVariable getInstance(){
        return instance;
    }
}