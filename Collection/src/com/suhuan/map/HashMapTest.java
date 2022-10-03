package com.suhuan.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @Auther: suhuan
 * @Date: 2022/10/2 - 10 - 02 - 22:15
 */
@SuppressWarnings({"all"})
public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer,Employee> map = new HashMap();
        map.put(1001,new Employee("tom",20003.4,1001));
        map.put(1002,new Employee("lisa",35543.0,1002));
        map.put(1003,new Employee("linda",4154.5,1003));
        map.put(1004,new Employee("jerry",8547.6,1004));
        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            if(entry.getValue().getSalary() > 18000){
                System.out.println(entry.getValue());
            }
        }

    }

}
class Employee{
    private String name;
    private Double salary;
    private Integer id;

    public Employee(String name, Double salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}