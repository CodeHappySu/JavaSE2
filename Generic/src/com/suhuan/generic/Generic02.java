package com.suhuan.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: suhuan
 * @Date: 2022/10/3 - 10 - 03 - 0:24
 */
@SuppressWarnings({"all"})
public class Generic02 {

    public static void main(String[] args) {
        Person<String> p = new Person<String>("suhuan",23);//后面的String可以省略不写
        Person p2 = new Person(123, 34);//如果没有写的话就取决于传入的实参的类型
        p.show();//class java.lang.String
        p2.show();//class java.lang.Integer
    }

}
class Person<E>{

    private E name;//当某个类型不确定想根据实例来确定该属性的类型
    private Integer age;

    public Person(E name,Integer age) {//当实例一个Person并确定泛型，那么该name形参的类型也被确认
        this.name = name;
        this.age = age;
    }

    public E f(){
        return name;
    }

    public void show(){
        System.out.println(name.getClass());
    }
}
