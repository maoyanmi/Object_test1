package com.mym;

import java.util.Date;

public class Data_test {
    public static void main(String[] args) {
        Date time1 = new Date();
        System.out.println(time1);  //Wed Feb 24 15:18:05 CST 2021
        System.out.println("毫秒值" + time1.getTime());
        System.out.println(new Date(0L));
        //注：0l表示标准基准时间，“L”表示该变量为long类型。long类型的变量定义方式为：long a = 12345l;
        long a = 123l;


    }
}
