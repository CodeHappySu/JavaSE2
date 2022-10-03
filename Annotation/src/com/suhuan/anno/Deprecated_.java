package com.suhuan.anno;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 13:29
 */
public class Deprecated_ {

    public static void main(String[] args) {
        A a = new A();
        a.a();
    }

}
class A{
    @Deprecated//声明这个方法过时了
    public void a(){

    }
}
