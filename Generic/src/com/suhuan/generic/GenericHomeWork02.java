package com.suhuan.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Auther: suhuan
 * @Date: 2022/10/7 - 10 - 07 - 18:50
 */
public class GenericHomeWork02 {

    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        Map<String, Integer> map = new HashMap<>();
        map.put("1",123);
        System.out.println(map.put("1", 234));
        System.out.println(map.replace("1", 456));
        System.out.println(map);
    }
    @Test
    public void testList(){
        Dao<User> dao = new Dao<>();
        dao.save("001",new User(1,10,"tom"));
        dao.save("002",new User(2,18,"lisa"));
        dao.save("003",new User(3,15,"jack"));
        dao.save("004",new User(4,19,"linda"));
        dao.update("004",new User(4,23,"suhuan"));
        dao.delete("001");
        List<User> list = dao.list();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println(next);
        }

    }

}

class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
//        map.put(id,entity);
        map.replace(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            list.add(entry.getValue());
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
