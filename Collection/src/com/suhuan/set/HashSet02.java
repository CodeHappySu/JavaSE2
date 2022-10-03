package com.suhuan.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Auther: suhuan
 * @Date: 2022/10/2 - 10 - 02 - 12:42
 */
public class HashSet02 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        Employee tom = new Employee("tom", 19);
        Employee lisa = new Employee("lisa", 23);
        Employee jack = new Employee("jack", 20);
        Employee tom1 = new Employee("tom", 19);
        Employee linda = new Employee("linda", 25);
        Employee jack1 = new Employee("jack", 20);
        System.out.println(set.add(tom));
        System.out.println(set.add(lisa));
        System.out.println(set.add(jack));
        System.out.println(set.add(tom1));
        System.out.println(set.add(linda));
        System.out.println(set.add(jack1));
        System.out.println(set);
    }

}

class Employee {


    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
