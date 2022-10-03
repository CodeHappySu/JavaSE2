package com.suhuan.arrays;

import java.util.Arrays;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 18:28
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]
        Arrays.fill(arr,1,3,1);//[1,3)之间索引对应的值改成1
        System.out.println(Arrays.toString(arr));//[0, 1, 1, 0]
    }

}
