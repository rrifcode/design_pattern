
package com.rrif.pattern.singleton.test;

import com.rrif.pattern.singleton.LazyDoubleCheckLock;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 利用反射破坏单例模式
 * 枚举无法被破坏
 * 解决方法
 *   私有构造里增加判断
 */
public class BreakByReflex {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //获取单例的字节码对象
        Class lazyDoubleCheckLockClass = LazyDoubleCheckLock.class;
        //获取字节码对象的私有无参构造方法对象
        Constructor declaredConstructor = lazyDoubleCheckLockClass.getDeclaredConstructor();

        //取消访问检查
        declaredConstructor.setAccessible(true);

        //创建实例
        LazyDoubleCheckLock o1 = (LazyDoubleCheckLock) declaredConstructor.newInstance();
        LazyDoubleCheckLock o2 = (LazyDoubleCheckLock) declaredConstructor.newInstance();

        System.out.println(o1 == o2);

    }


}