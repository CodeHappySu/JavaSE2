package com.suhuan.generic;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: suhuan
 * @Date: 2022/10/3 - 10 - 03 - 0:24
 */
@SuppressWarnings({"all"})
public class Generic01 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList();
        List<Integer> listInt = new ArrayList();
        System.out.println(listStr.getClass());
        System.out.println(listInt.getClass());

    }

}
