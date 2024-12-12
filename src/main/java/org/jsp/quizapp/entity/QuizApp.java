package org.jsp.quizapp.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizApp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	
	
	private String Question;
	
	private String a;
	
	private String b;
	
	
	private String  c;
	
	private String d;

}
