package com.suhuan.generic;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: suhuan
 * @Date: 2022/10/7 - 10 - 07 - 18:50
 */
public class GenericHomeWork01 {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("lisa", 4000.0, new MyDate(1998, 3, 12)));
        list.add(new Employee("linda", 3000.0, new MyDate(1994, 11, 1)));
        list.add(new Employee("tom", 1000.0, new MyDate(1997, 5, 30)));
        list.add(new Employee("jerry", 2000.0, new MyDate(1993, 12, 24)));
        list.add(new Employee("jack", 5000.0, new MyDate(1994, 11, 15)));
        list.add(new Employee("hello", 6000.0, new MyDate(1994, 11, 2)));
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    throw new RuntimeException("类型不匹配");
                }
                //比较两个int类型的数
                int res = Integer.compare(emp1.getName().length(), emp2.getName().length());
                if(res != 0){
                    return res;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("排序后：");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}

class Employee {
    private String name;
    private Double sal;
    private MyDate birthday;

    public Employee(String name, Double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private Integer year;
    private Integer month;
    private Integer day;

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "号";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if(yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if(monthMinus != 0){
            return monthMinus;
        }
        return day - o.getDay();
    }
}
