package com.example.PiRSpring.repository;

import com.example.PiRSpring.model.AccessLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessLevelRepository extends JpaRepository<AccessLevel, Integer> {

    AccessLevel findAllByLevel(String level);
}
