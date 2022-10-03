package com.suhuan.collection;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: suhuan
 * @Date: 2022/9/28 - 09 - 28 - 22:17
 */
@SuppressWarnings({"all"})
public class ArrayList1 {

    public static void main(String[] args) {
        List<Book> list = new ArrayList();
        list.add(new Book("Head First",78.5));
        list.add(new Book("Spring Boot源码",62.5));
        list.add(new Book("图解设计模式",99.8));
        list.add(new Book("蓝宝书",35.5));
        BubbleSort.sort(list);
        for (Book book : list) {
            System.out.println(book);
        }
    }

}
class Book{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class BubbleSort{

    public static void sort(List<Book> list){
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                Book book1 = list.get(j);
                Book book2 = list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j + 1,book1);
                }
            }
        }
    }

}
