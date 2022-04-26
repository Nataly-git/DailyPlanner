package com.example.dailyplanner.entity;

import javax.persistence.*;

@Entity
@Table(name="users_info")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String username;

    @Column
    private int age;

    @Column
    private int height;

    @Column
    private int weight;

    @Column
    private String sex;

    public User(String username, int age, int height, int weight, String sex) {
        this.username = username;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
