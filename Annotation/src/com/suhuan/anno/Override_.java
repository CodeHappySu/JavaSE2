package com.suhuan.anno;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 13:35
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void m(){}
}
class Son extends Father{
    @Override//编译器就会检查该方法是否真的重写了父类的主方法，如果重写了，编译通过
    public void m(){

    }
}
