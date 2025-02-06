package com.example.SpringData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity

@NoArgsConstructor
@Data

public class Drink extends Article {

    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }


}
