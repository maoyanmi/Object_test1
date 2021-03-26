package com.mym.MapDemo;

import com.mym.hashSetTest.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2_Student {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("1", new Student("zhangsan",18, "male"));
        studentMap.put("2", new Student("lisi",17, "male"));
        studentMap.put("3", new Student("wangwu",5, "female"));

        //遍历元素
        //1.键找值的方式
        System.out.println("键找值的方式: ");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Student student = studentMap.get(key);
            System.out.println("第" + key + "个学生是：" + student);
        }
        System.out.println();
        //2.键值对的方式
        System.out.println("键值对的方式: ");
        Set<Map.Entry<String, Student>> entries = studentMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("第" + key + "个学生是：" + value);

        }
        System.out.println("直接输出：");
        System.out.println(studentMap);
    }
}
