package com.suhuan.wrapper;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 16:24
 */
public class WrapperVSString {

    public static void main(String[] args) {
        //以Integer为例
        //包装类-->String
        Integer i1 = 100;
        //方式1:
        String s1 = i1 + "";//i1本身没有变化
        //方式2：
        String s2 = i1.toString();//包装类都有的方法
        //方式3：
        String s3 = String.valueOf(i1);


        //String-->包装类
        String str1 = "123";
        Integer i = Integer.parseInt(str1);//自动装箱
        Integer integer = new Integer(str1);
    }

}
