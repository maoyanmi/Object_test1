package com.mym;

/**
 * public StringBuilder append(...) ：添加任意类型数据的字符串形式，并返回当前对象自身。
 * public String toString() ：将当前StringBuilder对象转换为String对象
 */
public class StringBuilder_test {
    public static void main(String[] args) {
        appendTest();
        toStringTest();
    }

    /**
     * public StringBuilder append(...) ：添加任意类型数据的字符串形式，并返回当前对象自身。
     */
    private static void appendTest() {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = builder1.append("zhangsan").append(123).append(true);
        System.out.println("builder1: " + builder1);
        System.out.println("builder2: " + builder2);
        System.out.println(builder1 == builder2);
    }

    /**
     * public String toString() ：将当前StringBuilder对象转换为String对象
     */
    private static void toStringTest() {
    }
}
