package com.mym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        coll.add("zhaoliu");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){  //public boolean hasNext()判断是否仍然有元素可以迭代，有则返回true
            System.out.println(it.next());  //public E next()返回迭代的下一个元素
        }
    }
}
