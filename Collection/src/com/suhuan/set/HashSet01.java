package com.suhuan.set;


import java.util.HashMap;
import java.util.HashSet;

/**
 * @Auther: suhuan
 * @Date: 2022/10/1 - 10 - 01 - 12:50
 */
public class HashSet01 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person tom = new Person("tom");
        Person tom1 = new Person("tom");
        System.out.println(set.add(1));//true
        System.out.println(set.add(1));//false
        System.out.println(set.add("lisa"));//true
        System.out.println(set.add("lisa"));//false
        System.out.println(set.add(new Person("suhuan")));//true
        System.out.println(set.add(new Person("suhuan")));//true
        System.out.println(set.add(tom));//true
        System.out.println(set.add(tom));//false
        System.out.println(set.add(new String("jack")));//true
        System.out.println(set.add(new String("jack")));//false???为啥呢
        System.out.println(set);
    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        int i1 = (16 - 1) & hash();
        int i2 = (32 - 1) & hash();
        int i3 = (64 - 1) & hash();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
    static int hash() {
        return 100 ^ (100 >>> 16);
    }
}