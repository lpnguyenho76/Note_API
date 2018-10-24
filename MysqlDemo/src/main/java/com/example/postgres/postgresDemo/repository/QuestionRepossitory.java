package com.example.postgres.postgresDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgres.postgresDemo.model.Question;

@Repository
public interface QuestionRepossitory extends JpaRepository<Question,Long> {

}
