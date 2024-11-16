package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Question;

class Controller {
	String option;
	String name = null;
	String cpf;
	String birthdate;
	char gender;
	int lastquestion;
	int response;
	String questionresponse;
	
	public String init () {
		return "Welcome to sistemaregistrador!";
	}
	public String nextQuestion () {
		Question question = new Question();
		String textquestion = "";
		String questionresponse = "";
		if (this.option == null) {
			textquestion = "Select operation [1] Register [2] Query";
			lastquestion = 1;
		} else if (this.name == null) {
			question.setText("Name: ");
			questionresponse = question.getText();	
			lastquestion = 2;
		} else if (this.cpf == null) {
			question.setText("Cpf: ");
			questionresponse = question.getText();	
			lastquestion = 3;
		} else if (this.birthdate == null) {
			question.setText("Birth date: ");
			questionresponse = question.getText();	
			lastquestion = 4;
		} else {
			question.setText("Gender: ");
			questionresponse = question.getText(); 			
			lastquestion = 5;
		}
		if (lastquestion == 1) {
			return textquestion;
		} else {
			return questionresponse;
		}	
	}
	public String answer (String answer) {
		if (lastquestion == 2) {
			this.name = answer;
			return name;
		} else if (lastquestion == 3) {
			this.cpf = answer;
			return cpf;
		} else if (lastquestion == 4) {
			this.birthdate = birthdate;
			return birthdate;
		} else {
			return "Last question is not valid!";
		}
	}
	public int answer (int answer) {
		if (lastquestion == 1) {
			this.response = answer;
		}
		return response;
	}	
	public char answer (char answer) {
		if (lastquestion == 5) {
			this.gender = answer;
		}
		return gender;
	}
}
