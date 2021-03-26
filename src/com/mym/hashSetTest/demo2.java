package com.mym.hashSetTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("zhangsan", 18, "nan"));
        students.add(new Student("zhangsan", 18, "nan"));
        students.add(new Student("lisi", 17, "male"));
        students.add(new Student("野原新之助", 5, "男"));
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
