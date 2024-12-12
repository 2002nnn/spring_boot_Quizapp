package org.jsp.quizapp.service;

import java.util.List;
import java.util.Optional;

import org.jsp.quizapp.dao.QuizAppDao;
//import org.jsp.quizapp.dao.QuizAppDao;
import org.jsp.quizapp.entity.QuizApp;

import org.jsp.quizapp.responsestructure.ResponseStructure;
import org.jsp.quizapp.exceptionclasses.NoQueFound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class QuizAppService {
	@Autowired
	private QuizAppDao dao;

	public ResponseStructure<QuizApp> saveQuestion(QuizApp quizapp) {
		quizapp = dao.saveQuestion(quizapp);
		ResponseStructure<QuizApp> structure = new ResponseStructure<>();
		structure.setHttpStatus(HttpStatus.CREATED.value());
		structure.setMessage("Question saved successfully");
		structure.setBody(quizapp);
		return structure;

	}

	public ResponseStructure<List<QuizApp>> findAllQuestions() {
		
			List<QuizApp> quizapp = dao.findAllQuestions();
			ResponseStructure<List<QuizApp>> structure = new ResponseStructure<>();
			if (quizapp.isEmpty()) {
				throw new NoQueFound("no questions found");
			}
			structure.setHttpStatus(HttpStatus.OK.value());
			structure.setMessage("All questions found successfully");
			structure.setBody(quizapp);
			return structure;
		
	}

	public ResponseStructure<QuizApp> findQuestionById(int id) {
		Optional<QuizApp> optional=dao.findQuestionById(id);
		ResponseStructure<QuizApp> structure=new ResponseStructure<>();
		if(optional.isEmpty()) {
			throw new NoQueFound("no question find unable to find the question");
			
		}
		structure.setHttpStatus(HttpStatus.OK.value());
		structure.setMessage("question found successfully by id");
		structure.setBody(optional.get());
		return structure;
	}

	
	}

