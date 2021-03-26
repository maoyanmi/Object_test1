package com.mym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算一个人出生的天数
 */
public class BirthdayTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入出生年月日（格式为年-月-日）：");
        String bornString = in.next();

        //将出生日期转换为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        try {
            Date bornDate = sdf.parse(bornString);
            long born = bornDate.getTime();

            //获取当前时间
            Date nowDate = new Date();
            long now = nowDate.getTime();

            long exit = now - born;
            if (exit < 0l) {
                System.out.println("还没出生呢");
            }else {
                long exitDays = exit / 1000 / 60 / 60 / 24;
                System.out.println("他已经出生了" + exitDays + "天了");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
