package com.example.PiRSpring.repository;

import com.example.PiRSpring.model.AuthorizationMessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationMessageStatusRepository extends JpaRepository<AuthorizationMessageStatus, Integer> {
    AuthorizationMessageStatus findByStatus(String status);
}
