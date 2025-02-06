package com.example.SpringData.repository;

import com.example.SpringData.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableDAORepository extends JpaRepository<Table, Long> {
    Table findByNumTable(int num);
}