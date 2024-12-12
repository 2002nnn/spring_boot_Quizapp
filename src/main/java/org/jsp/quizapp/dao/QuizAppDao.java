package org.jsp.quizapp.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.quizapp.entity.QuizApp;
import org.jsp.quizapp.repository.QuizAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizAppDao {
	@Autowired
	private QuizAppRepository repository;
	public QuizApp saveQuestion(QuizApp quizapp) {
		return repository.save(quizapp);
	}

	
	
	public List<QuizApp> findAllQuestions(){
		return  repository.findAll();
		
	}



	public Optional<QuizApp> findQuestionById(int id) {
		
		return repository.findById(id);
	}



	
	}

