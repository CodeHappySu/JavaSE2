package com.suhuan.linkedlist;

import java.util.LinkedList;

/**
 * @Auther: suhuan
 * @Date: 2022/9/30 - 09 - 30 - 22:43
 */
public class LinkedList02 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.remove();//默认删除第一个节点
        list.remove(1);//默认删除对应所用位置的节点
        list.remove(Integer.valueOf(2));//删除传进来的节点对象
    }

}
