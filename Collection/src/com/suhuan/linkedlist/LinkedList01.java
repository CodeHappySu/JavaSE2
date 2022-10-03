package com.suhuan.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: suhuan
 * @Date: 2022/9/30 - 09 - 30 - 20:40
 */
public class LinkedList01 {

    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node lisa = new Node("lisa");

        //连接以上，形成双向链表
        jack.setPre(null);
        jack.setNext(tom);
        tom.setPre(jack);
        tom.setNext(lisa);
        lisa.setNext(null);
        lisa.setPre(tom);

        Node first = jack;
        Node last = lisa;
        //遍历
        while(true){
            if(first == null){
                break;
            }else{
                System.out.println(first);
                first = first.getNext();
            }
        }
        System.out.println("==========");
        //插入数据
        //在Jack和tom中间插入信息为marry的节点
        first = jack;
        Node marry = new Node("marry");
        jack.setNext(marry);
        marry.setNext(tom);
        tom.setPre(marry);
        marry.setPre(jack);
        while(true){
            if(last == null){
                break;
            }else{
                System.out.println(last);
                last = last.getPre();
            }
        }

    }

}
class Node{//真正存放数据的地方

    public Object elements;
    public Node pre;
    public Node next;
    public Node(Object elements){
        this.elements = elements;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "elements=" + elements;
    }
}
