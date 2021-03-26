package com.mym.hashSetTest;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private String sex;
    private int age;

    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;  //如果o是否是Student类的实例
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getSex(), student.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge());
    }

    @Override
    public int compareTo(Student o) {
        return this.name.charAt(0) - o.name.charAt(0);  //升序
    }
}
