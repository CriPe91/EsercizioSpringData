package com.example.SpringData.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Articoli",discriminatorType = DiscriminatorType.STRING)

@NoArgsConstructor
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int calories;
    protected double price;

    public Article(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }


}

