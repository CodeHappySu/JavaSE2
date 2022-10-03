package com.suhuan.enum1;

/**
 * @Auther: suhuan
 * @Date: 2022/9/23 - 09 - 23 - 21:33
 */
public class Enumeration {

    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }

}

class Season {
    private String name;
    private String desc;

    //3.定义静态常量
    public static final Season SPRING = new Season("春天","春暖大地");
    public static final Season WINTER = new Season("冬天","银装素裹");
    public static final Season AUTUMN = new Season("秋天","果实累累");
    public static final Season SUMMER = new Season("夏天","热气腾腾");

    private Season(String name, String desc) {//1.
        this.name = name;
        this.desc = desc;
    }

    //2.去掉set相关的方法，防止被属性被修改

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
