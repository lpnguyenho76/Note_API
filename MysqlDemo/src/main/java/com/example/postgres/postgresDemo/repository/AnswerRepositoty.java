package com.example.postgres.postgresDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgres.postgresDemo.model.Answer;

@Repository
public interface AnswerRepositoty extends JpaRepository<Answer, Long>{
	List<Answer>findbyQuestionId(Long questionId);

	
	
}
