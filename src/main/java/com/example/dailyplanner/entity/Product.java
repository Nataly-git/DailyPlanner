package com.example.dailyplanner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=20, message="Item name should be between 3 and 20 characters")
    @Column(name="item_name")
    private String itemName;

    @PositiveOrZero
    @Column
    private double proteins;

    @PositiveOrZero
    @Column
    private double fats;

    @PositiveOrZero
    @Column
    private double carbohydrates;

    @Positive(message="Calories amount should be more than 0")
    @Column
    private int calories;

//    @Positive(message="Weight amount should be more than 0")
    @Column(name="product_weight")
    private int productWeight = 100;

    @ManyToMany(cascade={CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinTable(name="user_calories",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<User> users;

    public Product() {
    }

    public Product(String itemName, double proteins, double fats, double carbohydrates, int calories) {
        this.itemName = itemName;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public void addUser(User user) {
        if(users == null)
            users = new ArrayList<>();
        users.add(user);
    }
}
