package com.example.car;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String make;

    @NotNull
    private String model;

    @NotNull
    private int year;

    @NotNull
    private long price;

    @NotNull
    private String carimgae;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    public Car() {
    }

    public Car(@NotNull String make,
               @NotNull String model,
               @NotNull int year,
               @NotNull long price,
               @NotNull String carimgae) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.carimgae = carimgae;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCarimgae() {
        return carimgae;
    }

    public void setCarimgae(String carimgae) {
        this.carimgae = carimgae;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
