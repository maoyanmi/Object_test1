package com.mym;

import java.util.Calendar;

public class Calendar_test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");


    }
}
