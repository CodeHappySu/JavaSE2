package com.suhuan.homework3;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 15:39
 */
public class A {
    private String name = "suhuan";

    public void a() {
        class B {
            private String name = "hello";

            public void show() {
                System.out.println(name);//这是局部内部类的变量
                System.out.println(A.this.name);//这是外部类的变量
            }
        }
        B b = new B();
        b.show();
    }

}

class Test {
    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}
