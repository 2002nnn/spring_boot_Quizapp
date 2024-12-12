package org.jsp.quizapp.exceptionclasses;

public class NoQueFound extends RuntimeException{
	private String message = "Question not found";

	public NoQueFound() {

	}

	public NoQueFound(String message) {
		this.message = message;

	}

	@Override
	public String getMessage() {

		return this.message;
	}

}


