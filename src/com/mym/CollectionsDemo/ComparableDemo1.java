package com.mym.CollectionsDemo;

import com.mym.hashSetTest.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("张三", 18, "male"), new Student("lisi", 17, "male"), new Student("野原新值之助", 5, "male"));
        Collections.sort(list);
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
