package com.suhuan.exception;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 21:23
 */
public class Exception1 {

    public static void main(String[] args) {
        try {
            int i = 1 / 0;//1.这里出了异常直接跳到对应的catch里面
            System.out.println("=========");
            int[] arr = {1, 23, 45};
            for (int j = 0; j <= arr.length; j++) {
                System.out.println(arr[j]);
            }
            System.out.println("@@@@@@@@@@@@");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("$$$$$$$$$$");
        }
        System.out.println("----------");
    }

}
