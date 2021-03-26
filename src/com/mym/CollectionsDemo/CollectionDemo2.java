package com.mym.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc","aba","abb","chgi","ban");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);  //升序
//              return o2.charAt(0) - o1.charAt(0);  //降序
            }
        });
        System.out.println(list);
    }
}
