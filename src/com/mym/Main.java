package com.mym;

public class Main {
    /**
     * public boolean equals(Object anObject) {
     *         if (this == anObject) {
     *             return true;
     *         }
     * equals方法：判断两个对象是否是同一个
     */
    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setAge(18);
        person.setName("zhangsan");

        System.out.println(person.equals(null));  //false  判断两个对象的成员变量是否相同

        String str1 = "zhang";
        System.out.println(person.equals(str1));  //false    判断两个对象的成员变量是否相同

        Person person1 = new Person();
        System.out.println(person.equals(person1));  //false   判断两个对象的成员变量是否相同

        person1.setName("zhangsan");
        person1.setAge(18);
        System.out.println(person.equals(person1));  //true

        String str2 = "zhang";
        System.out.println(str1.equals(str2));   //判断两个对象是否是同一个
    }
}
