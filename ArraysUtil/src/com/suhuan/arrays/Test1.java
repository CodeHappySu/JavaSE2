package com.suhuan.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 18:28
 */
public class Test1 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 34, 3, 0, -10, 75, 26};
        Arrays.sort(arr);//默认是从小到大排序
        System.out.println(Arrays.toString(arr));

        //对自定义的对象进行排序,按照某个一个字段
        Student[] arrStu = new Student[4];
        arrStu[0] = new Student("tom", 98.5);
        arrStu[1] = new Student("hanni", 50);
        arrStu[2] = new Student("lisacol", 78.5);
        arrStu[3] = new Student("jack", 68.5);

        //方式1：
        /*Arrays.sort(arrStu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double res = o1.getScore() - o2.getScore();
                if (res != 0) {
                    return res > 0 ? 1 : -1;
                } else {
                    return 0;
                }
            }
        });*/

        //方式2：
        MyBubbleCompactor.sort(arrStu, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                double res = s1.getScore() - s2.getScore();
                if (res != 0) {
                    return res > 0 ? 1 : -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(arrStu));
        //方式3：按照名字的长度
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("tom", 98.5));
        list.add(new Student("hanni", 50));
        list.add(new Student("lisacol", 78.5));
        list.add(new Student("jack", 68.5));

        Collections.sort(list);
        System.out.println(list);
        //方式4：

    }

}

class MyBubbleCompactor {

    public static void sort(Object[] arrays, Comparator c) {
        Student[] arr = (Student[]) arrays;
        int size = arr.length;
        double temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j].getScore();
                    arr[j].setScore(arr[j + 1].getScore());
                    arr[j + 1].setScore(temp);
                }
            }
        }
    }

}

class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().length() - o.getName().length();
    }
}
