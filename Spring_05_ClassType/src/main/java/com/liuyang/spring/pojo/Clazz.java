package com.liuyang.spring.pojo;

public class Clazz {
    private String clazzId;
    private String clazzName;


    public Clazz() {
    }

    public Clazz(String clazzId, String clazzName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
    }

    /**
     * 获取
     * @return clazzId
     */
    public String getClazzId() {
        return clazzId;
    }

    /**
     * 设置
     * @param clazzId
     */
    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    /**
     * 获取
     * @return clazzName
     */
    public String getClazzName() {
        return clazzName;
    }

    /**
     * 设置
     * @param clazzName
     */
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String toString() {
        return "Clazz{clazzId = " + clazzId + ", clazzName = " + clazzName + "}";
    }
}
