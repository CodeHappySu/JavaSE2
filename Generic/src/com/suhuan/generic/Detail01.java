package com.suhuan.generic;

/**
 * @Auther: suhuan
 * @Date: 2022/10/7 - 10 - 07 - 18:34
 */
public class Detail01 {

    public static void main(String[] args) {
        Animal<Father> an = new Animal<>(new Son());
        Animal an0 = new Animal(new Son());
        Animal<Father> an1 = new Animal<>(new Father());
        an.getClazz();//class com.suhuan.generic.Son
        an1.getClazz();//class com.suhuan.generic.Father
        an0.getClazz();
    }

}

class Father{

}

class Son extends Father{

}
class Animal<E>{

    private E name;

    public Animal(E name){
        this.name = name;
    }

    public void getClazz(){
        System.out.println(name.getClass());
    }
}
