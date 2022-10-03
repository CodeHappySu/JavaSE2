package com.suhuan.enum2;

/**
 * @Auther: suhuan
 * @Date: 2022/9/23 - 09 - 23 - 21:33
 */
public class Enumeration02 {

    public static void main(String[] args) {
        System.out.println(Season.AUTUMN == Season.AUTUMN);//true,说明在底层就是同一个对象
        System.out.println(Season.SPRING);
        System.out.println("============");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
    }

}

enum Gender{
    BOY,GIRL;//就是调用无参构造器
}

class Test{
    public static void main(String[] args) {
        Gender boy = Gender.BOY;//OK
        Gender boy2 = Gender.BOY;//OK
        System.out.println(boy);//BOY,本质实际上在调用父类的toString方法
        System.out.println(boy == boy2);//true
    }
}

enum Season {
    SPRING("春天", "春暖大地"),//必须放在第一行
    WINTER("冬天", "银装素裹"),
    WHAT(),
    AUTUMN("春天", "春暖大地"),
    SUMMER("夏天", "热气腾腾");
//    public static final Season SPRING = new Season("春天","春暖大地");
    private String name;
    private String desc;

    Season(){

    }

    private Season(String name, String desc) {//1.
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
