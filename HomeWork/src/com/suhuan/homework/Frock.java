package com.suhuan.homework;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 15:05
 */
public class Frock {

    private static int currentNum = 100000;//衣服出厂的序列号
    private long serialNum;//序列号

    public static int getNextNum(){
        return currentNum+=100;
    }

    public Frock(){
        serialNum = getNextNum();
    }

    public long getSerialNum() {
        return serialNum;
    }

    public static int getCurrentNum() {
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        System.out.println("==========");
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNum());
        System.out.println(frock1.getSerialNum());
        System.out.println(frock2.getSerialNum());
    }
}
