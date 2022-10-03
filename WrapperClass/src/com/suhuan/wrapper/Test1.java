package com.suhuan.wrapper;


/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 16:10
 */
public class Test1 {

    public static void main(String[] args) {
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);//这里输出是1.0,因为三元运算符是一个整体，会提升最高精度的值
    }

}
