package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Question;

public class Controller {
	private int option;
	private String name;
	private String cpf;
	private String birthdate;
	private char gender;
	private int lastquestion;
	private int response;
	private String questionresponse;
	
	public String init () {
		return "Welcome to sistemaregistrador!";
	}
	public String nextQuestion () {
		Question question = new Question();
		String  questionresponse = "";
		String type = "";
		if (this.option == 0) {
			question.setText("Select operation [1] Register [2] Query");
			question.setType("String"); //Future implementation.
			questionresponse = question.getText();
			this.option = 1;
			lastquestion = 1;
		} else if (this.name == null) {
			question.setText("Name: ");
			question.setType("String"); //Future implementation.
			questionresponse = question.getText();	
			lastquestion = 2;
		} else if (this.cpf == null) {
			question.setText("Cpf: ");
			question.setType("String"); //Future implementation.
			questionresponse = question.getText();
			lastquestion = 3;
		} else if (this.birthdate == null) {
			question.setText("Birth date: ");
			question.setType("String"); //Future implementation.
			questionresponse = question.getText();	
			lastquestion = 4;
		} else {
			question.setText("Gender: ");
			question.setType("char"); //Future implementation.
			questionresponse = question.getText(); 			
			lastquestion = 5;
		}
		return questionresponse;	
	}
	public void answer (String answer) {
		if (lastquestion == 2) {
			this.name = answer;
		} else if (lastquestion == 3) {
			this.cpf = answer;
		} else if (lastquestion == 4) {
			this.birthdate = answer;
		} else {
			System.out.println("Last question is not valid!");
		}
	}
	public void answer (int answer) {
		if (lastquestion == 1) {
			this.response = answer;
		}
	}	
	public void answer (char answer) {
		if (lastquestion == 5) {
			this.gender = answer;
		}
	}
}

