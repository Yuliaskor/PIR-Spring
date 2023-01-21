package com.example.PiRSpring.repository;

import com.example.PiRSpring.model.AuthorizationMessage;
import com.example.PiRSpring.model.AuthorizationMessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface AuthorizationMessageRepository extends JpaRepository<AuthorizationMessage, Integer> {

    @Query("FROM AuthorizationMessage ORDER BY date desc ")
    List<AuthorizationMessage> findAllOrderByDate();

    List<AuthorizationMessage> findAllByAuthorizationMessageStatusAndDateAfter(AuthorizationMessageStatus authorizationMessageStatus, Timestamp date);
}
