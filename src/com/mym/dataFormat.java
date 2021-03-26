package com.mym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataFormat {
    public static void main(String[] args) {
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        //格式化日期/事件类：将Date类型转换为String类型
        String formatTime = sdf.format(time);
        System.out.println(formatTime);
        String formatTime1 = sdf.format(new Date());

        //解析：将String类型转化为Date类型
        String timeStr = "21年02月24日 15:46:06";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yy年MM月dd日 HH:mm:ss");
        try {
            Date parseTime = sdf1.parse(timeStr);
            System.out.println(parseTime);
        } catch (ParseException e) {
            System.out.println("解析异常，指定格式和字符串格式不一致");
            e.printStackTrace();
        }

    }
}
