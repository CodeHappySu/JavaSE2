package com.suhuan.homework1;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 15:15
 */
public abstract class Animal {

    public abstract void shout();

}
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫咪喵喵叫");
    }
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗汪汪叫");
    }
}
class Test{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
