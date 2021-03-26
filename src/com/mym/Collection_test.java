package com.mym;

import java.util.ArrayList;
import java.util.Collection;

/**
 * public boolean add(E e) ： 把给定的对象添加到当前集合中 。
 * public boolean clear():清空集合中所有的元素。
 * public boolean remove(E e) : 把给定的对象在当前集合中删除。
 * public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty() : 判断当前集合是否为空。
 * public int size() : 返回集合中元素的个数。
 * public Object[] toArray() : 把集合中的元素，存储到数组中。
 */
public class Collection_test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        System.out.println(coll);
        Object[] array = coll.toArray();

        //删除一个对象
        coll.remove("zhangsan");

        if (!coll.isEmpty()) {
            System.out.print("该集合共有" + coll.size() + "个对象，其中，");
            for (Object str : array){
                if (coll.contains(str)) {
                    System.out.println(str + "在集合中");
                }else {
                    System.out.println(str + "不在集合中");
                }
            }
        }


        //清空该集合
        coll.clear();
        System.out.println("coll集合：" + coll);

    }
}
