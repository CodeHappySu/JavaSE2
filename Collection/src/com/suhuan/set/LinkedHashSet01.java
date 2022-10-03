package com.suhuan.set;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Auther: suhuan
 * @Date: 2022/10/2 - 10 - 02 - 13:34
 */
@SuppressWarnings({"all"})
public class LinkedHashSet01 {

    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        Customer lisa = new Customer("lisa", 10002);
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("苏",1001));
        set.add(new Customer("苏",1001));
        set.add(lisa);
        set.add(lisa);//这种情况再没有重写equals方法的前提下才能保证不被添加
        set.add(123);
        set.add("abc");
        System.out.println(set);//[AA, 456, Customer{name='苏', no=1001}, Customer{name='苏', no=1001}, Customer{name='lisa', no=10002}, 123, abc]
    }

}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return no == customer.no &&
                Objects.equals(name, customer.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, no);
    }
}
