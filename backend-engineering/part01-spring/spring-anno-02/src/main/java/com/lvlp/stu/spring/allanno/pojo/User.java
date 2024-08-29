package com.lvlp.stu.spring.allanno.pojo;

public class User {
    private String userName;
    private String passWord;

    public User() {
    }
    public void init(){
        System.out.println("init 初始化");
    }
    public void destroy(){
        System.out.println("destroy 销毁");
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
