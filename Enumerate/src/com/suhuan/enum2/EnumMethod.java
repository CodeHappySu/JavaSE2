package com.suhuan.enum2;

/**
 * @Auther: suhuan
 * @Date: 2022/9/23 - 09 - 23 - 23:12
 */
public class EnumMethod {

    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
    }

}
