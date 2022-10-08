package com.suhuan.generic;

import java.util.*;

/**
 * @Auther: suhuan
 * @Date: 2022/10/3 - 10 - 03 - 0:24
 */
@SuppressWarnings({"all"})
public class Generic03 {

    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("苏欢",new Student("苏欢",23));
        map.put("linda",new Student("linda",25));
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

}
class Student{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
