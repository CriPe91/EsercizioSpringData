package com.example.SpringData.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class Topping extends Article {

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    private String name;

    public Topping(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

}
