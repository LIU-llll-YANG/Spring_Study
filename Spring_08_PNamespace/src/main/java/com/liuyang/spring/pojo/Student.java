package com.liuyang.spring.pojo;

public class Student {
    private String name;
    private Integer age;
    private Clazz clazz;

    public Student() {
    }

    public Student(String name, Integer age, Clazz clazz) {
        this.name = name;
        this.age = age;
        this.clazz = clazz;
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
     * @return clazz
     */
    public Clazz getClazz() {
        return clazz;
    }

    /**
     * 设置
     * @param clazz
     */
    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", clazz = " + clazz + "}";
    }
}
