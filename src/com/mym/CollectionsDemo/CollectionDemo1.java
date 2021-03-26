package com.mym.CollectionsDemo;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
       forList();
       forSet();
    }

    private static void forSet() {
        Set<Integer> set = new HashSet<>();
      /*  //原来的写法
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/
        //采用工具类往集合中添加元素
        Collections.addAll(set, 1,2,3,45,12,78,123);

        System.out.println(set);
    }

    private static void forList() {
        List<Integer> list = new ArrayList<>();
      /*  //原来的写法
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/
        //采用工具类往集合中添加元素
        Collections.addAll(list, 1,2,3,4,5,78);
        System.out.println(list);
    }

}
