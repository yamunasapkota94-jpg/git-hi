package com.example.Hi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hi.model.Costumer;

public interface CostumerRepo extends JpaRepository<Costumer,Integer> {

}
