package com.liuyang.spring.pojo;

import java.util.Map;

public class Student {
    private String name;
    private Integer age;
    private String gender;
    private Clazz clazz;
    private Map<String,Teacher> teacherMap;

    public Student() {
    }

    public Student(String name, Integer age, String gender, Clazz clazz, Map<String, Teacher> teacherMap) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
        this.teacherMap = teacherMap;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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

    /**
     * 获取
     * @return teacherMap
     */
    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    /**
     * 设置
     * @param teacherMap
     */
    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", clazz = " + clazz + ", teacherMap = " + teacherMap + "}";
    }
}
