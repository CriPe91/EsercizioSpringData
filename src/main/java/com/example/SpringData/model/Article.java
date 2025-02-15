package com.example.SpringData.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_prodotto")
@Table(name = "prodotti")
public abstract class Article {

    @Id
    @GeneratedValue
    protected long id;
    protected int calories;
    protected double price;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    protected Menu menu;

    public Article(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
