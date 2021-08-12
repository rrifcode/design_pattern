
package com.rrif.pattern.singleton.test;


import com.rrif.pattern.singleton.*;

public class Test {
    public static void main(String[] args) {

        HungryStaticVariable hungryStaticVariable1 =  HungryStaticVariable.getInstance();
        HungryStaticVariable hungryStaticVariable2 =  HungryStaticVariable.getInstance();
        System.out.println(hungryStaticVariable1 == hungryStaticVariable2);

        HungryStaticCode hungryStaticCode1 = HungryStaticCode.getInstance();
        HungryStaticCode hungryStaticCode2 = HungryStaticCode.getInstance();
        System.out.println(hungryStaticCode1 == hungryStaticCode2);

        HungryEnum hungryEnum1 = HungryEnum.INSTANCE;
        HungryEnum hungryEnum2 = HungryEnum.INSTANCE;
        System.out.println(hungryEnum1 == hungryEnum2);

        LazyThreadUnsafe lazyThreadUnsafe1 = LazyThreadUnsafe.getInstance();
        LazyThreadUnsafe lazyThreadUnsafe2 = LazyThreadUnsafe.getInstance();
        System.out.println(lazyThreadUnsafe1 == lazyThreadUnsafe2);

        LazyThreadSafe lazyThreadSafe1 = LazyThreadSafe.getInstance();
        LazyThreadSafe lazyThreadSafe2 = LazyThreadSafe.getInstance();
        System.out.println(lazyThreadSafe1 == lazyThreadSafe2);

        LazyDoubleCheckLock lazyDoubleCheckLock1 = LazyDoubleCheckLock.getInstance();
        LazyDoubleCheckLock lazyDoubleCheckLock2 = LazyDoubleCheckLock.getInstance();
        System.out.println(lazyDoubleCheckLock1 == lazyDoubleCheckLock2);

        LazyStaticInnerClass lazyStaticInnerClass1 = LazyStaticInnerClass.getInstance();
        LazyStaticInnerClass lazyStaticInnerClass2 = LazyStaticInnerClass.getInstance();
        System.out.println(lazyStaticInnerClass1 == lazyStaticInnerClass2);

    }
}