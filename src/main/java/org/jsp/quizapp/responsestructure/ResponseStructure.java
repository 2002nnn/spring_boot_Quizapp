package org.jsp.quizapp.responsestructure;

import java.util.Optional;

import org.jsp.quizapp.entity.QuizApp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int httpStatus;
	private String message;
	private T body;
}
