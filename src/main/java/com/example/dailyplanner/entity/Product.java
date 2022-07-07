package com.example.dailyplanner.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
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
    private double calories;

    @PositiveOrZero(message="Weight amount should be more than 0")
    @Column(name="product_weight")
    private int productWeight = 100;

    @ManyToMany(cascade=CascadeType.ALL,
                fetch = FetchType.EAGER)
    @JoinTable(name="user_calories",
            joinColumns = @JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name="user_id"))
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
}
