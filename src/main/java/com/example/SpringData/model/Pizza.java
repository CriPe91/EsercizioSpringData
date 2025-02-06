package com.example.SpringData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity

@NoArgsConstructor
@Data
public class Pizza extends Article {

    private String name;
    @OneToMany(mappedBy = "pizza")
    private List<Topping> toppingList;

    public Pizza(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
        this.toppingList = new ArrayList<Topping>();
    }

    public void addTopping(Topping t) {
        this.toppingList.add(t);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name +
                ", toppingList=" + toppingList +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

}
