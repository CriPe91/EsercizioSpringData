package com.example.SpringData.repository;

import com.example.SpringData.model.Article;
import com.example.SpringData.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticoloDAORepository extends JpaRepository<Article, Long> {
    Topping findByName(String name);
}