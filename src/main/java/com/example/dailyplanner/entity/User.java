package com.example.dailyplanner.entity;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users_info")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    @NotBlank(message="Name cannot be empty")
    private String username;

    @Column
    @Min(value = 18, message = "must be greater than 17")
    @Max(value = 90, message = "must be less than 91")
    private int age;

    @Column
    @Min(value = 150, message = "must be greater than 149")
    @Max(value = 210, message = "must be less than 211")
    private int height;

    @Column
    @Min(value=40, message = "must be greater than 39")
    @Max(value=200, message = "must be less than 201")
    private int weight;

    @Column
    @NotBlank(message="You should choose one variant")
    private String sex;

    @ManyToMany(cascade={CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinTable(name="user_calories",
               joinColumns = @JoinColumn(name="user_id"),
               inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProductToUser(Product product) {
        if(products == null)
            products = new ArrayList<>();
        products.add(product);
    }
}
