package com.suhuan.map;

/**
 * @Auther: suhuan
 * @Date: 2022/10/1 - 10 - 01 - 14:27
 */
public class MoNiHashMap {

    public static void main(String[] args) {
        Node[] table = new Node[16];
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack",null);
        john.next = jack;
        Node tom = new Node("tom", null);
        jack.next = tom;
        System.out.println(table);
        //链表的遍历
        Node p = john;
         while(p != null){
             System.out.println(p);
             p = p.next;
         }
    }

}
class Node{
    Object element;
    Node next;

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }
}
