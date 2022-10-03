package com.suhuan.system;

import java.util.Arrays;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 19:30
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("ok");
        //System.exit(0);//正常退出
        System.out.println("end");

        int[] arr = {1, 2, 3};
        int[] ints = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints));
        System.out.println("===========");

        //一般使用Arrays.copyOf(),但是底层的话一般使用System中的方法
        int[] src = {1, 2, 3};
        int[] dest = new int[src.length];
        System.arraycopy(src,0,dest,0,src.length);//从src索引为0的位置开始copy，到dest目标数组从0开始，2为拷贝的个数
        System.out.println(Arrays.toString(dest));//[1, 2, 0]

        //常用：
        long t = System.currentTimeMillis();//the difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
    }

}
