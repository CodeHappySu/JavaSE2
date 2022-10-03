package com.suhuan.map;

import java.util.*;

/**
 * @Auther: suhuan
 * @Date: 2022/10/2 - 10 - 02 - 16:54
 */
@SuppressWarnings({"all"})
public class Map_ {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("lisa", "tom");
        map.put("lisa2", "tom2");
        map.put(null, "123");
        map.put("suhuan", 123);
        map.put("haha", "hello");
        map.put("perosn1", new Person("lisi"));
        //遍历1：
        System.out.println("=============");
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "=" +map.get(key));
        }
        System.out.println("=============");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "=" +map.get(key));
        }
        //遍历2：取出所有value值
        System.out.println("=============");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        //还可以用迭代器
        System.out.println("=============");
        //遍历3：
        Set set = map.entrySet();
        for (Object obj : set) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("=============");
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("=============");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry next = (Map.Entry) iterator1.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }
    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
