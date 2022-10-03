package com.suhuan.array;

import com.suhuan.test2.Main;

import java.util.Arrays;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 21:31
 */
public class Test1 {

    public static void main(String[] args) {
        //字符串的反转
        String str = "abcdefghijklmn";
        char[] arr = str.toCharArray();
        char temp = ' ';
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
