
package com.rrif.pattern.singleton.test;

import com.rrif.pattern.singleton.LazyStaticInnerClass;

import java.io.*;

/**
 * 利用序列化和反序列化破坏单例模式
 * 枚举无法被破坏
 * 解决办法:
 *   在单例类里增加readResolve()方法, 返回创建的实例
 */
public class BreakBySerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 1. 把实例写入文件
        writer2File();

        // 2. 从文件里读取实例
        LazyStaticInnerClass lazyStaticInnerClass1 = readFromFile();
        LazyStaticInnerClass lazyStaticInnerClass2 = readFromFile();

        // 3. 比较实例是否是同一个实例
        System.out.println(lazyStaticInnerClass1 == lazyStaticInnerClass2);

    }

    private static void writer2File() throws IOException {
        LazyStaticInnerClass lazyStaticInnerClass = LazyStaticInnerClass.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\boyi-bai\\Desktop\\a.txt"));
        oos.writeObject(lazyStaticInnerClass);
        oos.close();
    }

    private static LazyStaticInnerClass readFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\boyi-bai\\Desktop\\a.txt"));
        LazyStaticInnerClass o = (LazyStaticInnerClass) ois.readObject();
        ois.close();
        return o;
    }

}