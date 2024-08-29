package com.lvlp.stu.spring.allanno.pojo;

/**
 * @Author : 吕良平
 * @Date: 2024-08-29 17:43
 * @Description:
 */
public class Student {
    private String name;
    private String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
