package com.liuayng.spring.pojo;

import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private List<String> hobbies;

    public Student() {
    }

    public Student(String name, Integer age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return hobbies
     */
    public List<String> getHobbies() {
        return hobbies;
    }

    /**
     * 设置
     * @param hobbies
     */
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", hobbies = " + hobbies + "}";
    }
}
