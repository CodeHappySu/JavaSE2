package com.suhuan.homework5;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 15:52
 */
public interface Vehicles {

    void work();

}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("马正在工作");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("船正在工作");
    }
}

interface Situation{
    String COMM = "comm";
    String RIVER = "river";
}

class VehiclesFactory implements Situation{//单例模式和工厂模式的结合
    private static Horse horse;
    private static Boat boat;

    private VehiclesFactory() {
    }

    public static Vehicles getVehicles(String str) {
        if (COMM.equals(str)) {
            if (horse == null) {
                horse = new Horse();
            }
            return horse;
        } else if (RIVER.equals(str)) {
            if (boat == null) {
                boat = new Boat();
            }
            return boat;
        } else {
            throw new RuntimeException("输入有误");
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Vehicles pass(String str) {
        Vehicles vehicles = VehiclesFactory.getVehicles(str);
        vehicles.work();
        return vehicles;
    }
}

class Test {
    public static void main(String[] args) {
        Person person = new Person("唐僧");
        System.out.println(person.pass("river") == person.pass("river"));
        person.pass("comm");
        person.pass("com");
    }
}

