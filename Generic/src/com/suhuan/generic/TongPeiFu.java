package com.suhuan.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: suhuan
 * @Date: 2022/10/7 - 10 - 07 - 22:49
 */
public class TongPeiFu {

    public static void main(String[] args) {
        List<?> l = new ArrayList<>();//任意
        List<? extends AA> l1 = new ArrayList<>();//AA的子类
        List<? super CC> l2 = new ArrayList<>();//CC的父类

        List<Map.Entry> list = new ArrayList<>();
        List<AA> lista = new ArrayList<>();
        List<BB> listb = new ArrayList<>();
        List<CC> listc = new ArrayList<>();
        List<Object> listobj = new ArrayList<>();
        l = list;//true
        l1 = listb;//true
        l1 = listc;//true
        //l1 = listo;//false
        l2 = lista;
        l2 = listb;
        l2 = listc;
        //l2 = list;//false

    }

}

class AA {

}

class BB extends AA {

}

class CC extends BB {

}
