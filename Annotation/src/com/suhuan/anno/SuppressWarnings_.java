package com.suhuan.anno;

import java.util.ArrayList;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 13:31
 */
@SuppressWarnings({"all"})
public class SuppressWarnings_ {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("lisa  ");
    }

}
class B{
    //@SuppressWarnings()//抑制编译器警告
    public void b(){

    }
}
