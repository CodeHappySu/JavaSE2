package com.suhuan.test2;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 22:32
 */
@SuppressWarnings({"all"})
public class Arrays_ {

    public static void main(String[] args) {
        Integer[] arr = {1, -4, 8, 0, 45, 12, 36};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

}

@SuppressWarnings({"all"})
class Test {
    public static void main(String[] args) {
        Integer[] arr = {1, -4, 8, 0, 45, 12, 36, 25};
        MyComparator1 myComparable = new MyComparator1();
        Arrays.sort(arr, myComparable);
        System.out.println(Arrays.toString(arr));
    }
}
/*
class MyComparable implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int res = o1 - o2;
        if (res > 0) {
            return 1;
        } else if (res < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}*/
class MyComparator1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
        //这样颠倒一下，就可以实现反向排序了
        return o2.compareTo(o1);
    }

}
