package com.lvlp.stu.request.pojo;

/**
 * @Author : 吕良平
 * @Date: 2024-09-04 17:20
 * @Description:
 */
public class User {
    private String name;
    private int age;
    private double score;

    public User() {
    }

    public User(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
