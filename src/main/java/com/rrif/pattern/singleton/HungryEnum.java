
package com.rrif.pattern.singleton;

/**
 * 饿加载模式-枚举方式
 *   极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次
 *   枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式
 */
public enum HungryEnum {

    INSTANCE;

}