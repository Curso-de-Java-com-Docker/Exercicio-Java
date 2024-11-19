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
	
	public String init () {
		return "Welcome to sistemaregistrador!";
	}
	public Question nextQuestion () {
		Question question;
		int lastquestion = 0;
		String  text = "";
		String type = "";
		if (this.option == 0) {
			text = "Select operation [1] Register [2] Query";
			type = "int"; 
			lastquestion = 1; 
		} else if (this.name == null) {
			text = "Name: ";
			type = "String";	
			lastquestion = 2;
		} else if (this.cpf == null) {
			text = "Cpf: ";
			type = "String";
			lastquestion = 3;
		} else if (this.birthdate == null) {
			text = "Birth date: ";
			type = "String";
			lastquestion = 4;
		} else if (this.gender == '\u0000') {
			text = "Gender: ";
			type = "char";
			lastquestion = 5;
		} else {
			text = "Done with sucess!";
			type = "null";
		}
		this.lastquestion = lastquestion;
		return new Question(text, type);	
	}
	public void answer (Answer answer) {
		if (lastquestion == 1) {
			this.response = answer.getInt();	
		} else if (lastquestion == 2) {
			this.name = answer.getString();
		} else if (lastquestion == 3) {
			this.cpf = answer.getString();
		} else if (lastquestion == 4) {
			this.birthdate = answer.getString();
		} else if (lastquestion == 5) {
			this.gender = answer.getChar();
		} else {
			System.out.println("Last question is not valid!");
		}
	}
}

