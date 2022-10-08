package com.suhuan.generic;

/**
 * @Auther: suhuan
 * @Date: 2022/10/7 - 10 - 07 - 20:25
 */
public class GenericMethod {

    public static void main(String[] args) {
        A a = new A();
        Integer a1 = a.a(12, 12.0);
    }

}
class A{
    public <T,R> T a(T t,R r){
        return null;
    }
}
