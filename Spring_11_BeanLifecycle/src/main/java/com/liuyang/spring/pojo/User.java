package com.liuyang.spring.pojo;

public class User {
    private Integer id;
    private String userName;
    private String password;
    
    //初始化方法 

    /**
     * 初始化方法
     */
    public void initMethod() {
        System.out.println("3.初始化方法");
        
    }

    /**
     * 销毁方法
     */
    public void destroyMethod() {
        System.out.println("4.销毁方法");
        
    }


    public User() {
        System.out.println("1. 创建对象User.User");
    }

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        System.out.println("2.依赖注入");
        this.id = id;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", password = " + password + "}";
    }
}
