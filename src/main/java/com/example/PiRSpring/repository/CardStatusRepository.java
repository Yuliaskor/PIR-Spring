package com.example.PiRSpring.repository;

import com.example.PiRSpring.model.CardStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardStatusRepository extends JpaRepository<CardStatus, Integer> {

    CardStatus findByStatus(String status);
}
