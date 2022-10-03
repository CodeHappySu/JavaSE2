package com.suhuan.exception;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 14:26
 */
public class RegisterException_ extends Exception{

    public RegisterException_(){//1.空参构造器

    }

    public RegisterException_(String message){//2.表示异常提示
        super(message);
    }

}
class Test{
    private static String[] arr = {"lisa,","tom","jerry"};

    public static void main(String[] args) {

        try{
            checkName("tom");
            System.out.println("注册成功！");
        }catch (RegisterException_ e){
            e.getMessage();
        }

    }

    private static boolean checkName(String name) throws RegisterException_ {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)){
                throw new RegisterException_("改名字已经被注册！");
            }
        }
        return true;
    }


}
