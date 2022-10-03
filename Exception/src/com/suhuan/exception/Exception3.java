package com.suhuan.exception;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 21:23
 */
public class Exception3 {

    public int add(int a,int b){
        try {
            return a+b;
        } catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
            a = 1;
            return a + b;
        }
        //return 0;
    }

    public static void main(String[] args) {
        Exception3 e = new Exception3();
        System.out.println(e.add(12, 23));
    }

}
