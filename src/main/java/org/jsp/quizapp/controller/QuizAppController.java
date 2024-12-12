package org.jsp.quizapp.controller;

import java.util.List;

import org.jsp.quizapp.entity.QuizApp;
import org.jsp.quizapp.responsestructure.ResponseStructure;
import org.jsp.quizapp.service.QuizAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuizAppController {
	
	@Autowired
	private QuizAppService service;
	@PostMapping
	public ResponseStructure<QuizApp> saveQuestion(@RequestBody QuizApp quizapp) {
		return service.saveQuestion(quizapp);
	}

	@GetMapping
	public ResponseStructure<List<QuizApp>> findAll() {
		return service.findAllQuestions();
	}
	
	@GetMapping("/{id}")
	public ResponseStructure<QuizApp> findQuestionById(@PathVariable int id){
		return service.findQuestionById(id);
	}

}
