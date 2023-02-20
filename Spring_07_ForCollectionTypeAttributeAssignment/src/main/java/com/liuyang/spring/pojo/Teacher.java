package com.liuyang.spring.pojo;

public class Teacher {
    private String teacherId;
    private String teacherName;

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    /**
     * 获取
     * @return teacherId
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * 设置
     * @param teacherId
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 获取
     * @return teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String toString() {
        return "Teacher{teacherId = " + teacherId + ", teacherName = " + teacherName + "}";
    }
}
