package com.suhuan.exception2;

import java.util.Scanner;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 15:09
 */
public class RegisterException extends RuntimeException {//让这个类变成一个运行时异常类


    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
class Demo1{
    /*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已被注册。

    分析：
        1.使用数组保存已经注册过的用户名（数据库存）
        2.使用Scanner获取用户输入的注册的用户名（前端，页面）
        3.定义一个方法，对用户输入的用户名进行判断
            遍历存储已经注册过的用户名，获取每一个用户名
            使用获取到的用户名和用户输入的用户比较
            true:
                用户名已经存在，抛出RegisterException异常，告知用户：亲，该用户名已被注册。
            false：
                继续遍历比较
           如果循环结束了，还没有找到重复的用户名，提示用户：“恭喜你注册成功！”

  */
    private static String[] arr = {"tom","lisa","jerry"};

    public static void checkName(String name){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)){//说明用户存在
                throw new RegisterException("用户名"+name+"已经被占用！");
            }
        }
        System.out.println("注册成功！");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        checkName(name);
    }

}
