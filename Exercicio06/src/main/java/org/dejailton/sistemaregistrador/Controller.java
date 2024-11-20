package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Formater;
import org.dejailton.sistemaregistrador.Patient;
import org.dejailton.sistemaregistrador.RobotMessage;
import org.dejailton.sistemaregistrador.UserMessage;
import org.dejailton.sistemaregistrador.LiteDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
	private int option;
	private String name;
	private String cpf;
	private String birthDate;
	private char gender;
	private int lastRobotMessage;
	private int question;
	private String patitentReturn;
	private Patient patient;
	

	public String init () {
		return "Welcome to sistemaregistrador!";
	}

	public RobotMessage nextRobotMessage () {
		RobotMessage question;
		int lastRobotMessage = 0;
		String  text = "";
		String type = "";
		if (this.option == 0) {
			text = "Select operation [1] Register [2] Query";
			type = "int"; 
			lastRobotMessage = 1; 
		} else if (this.option == 1) {
			if (this.name == null) {
				text = "Name: ";
				type = "String";	
				lastRobotMessage = 2;
			} else if (this.cpf == null) {
				text = "Cpf: ";
				type = "String";
				lastRobotMessage = 3;
			} else if (this.birthDate == null) {
				text = "Birth date: ";
				type = "String";
				lastRobotMessage = 4;
			} else if (this.gender == '\u0000') {
				text = "Gender: ";
				type = "char";
				lastRobotMessage = 5;
			} else {
				Patient patient = new Patient(this.name, this.cpf, this.birthDate, this.gender);
				LiteDriver.registerPatient(patient);
				text = "Done with success!";
				type = "null";
				this.option = 0;
			}
		} else if (option == 2) {
			if (this.cpf != null) {
				text = "Cpf: ";
				type = "String";
				lastRobotMessage = 6;	
			} else {
				
			}
		}

		this.lastRobotMessage = lastRobotMessage;
		return new RobotMessage(text, type);	
	}

	public void answer (UserMessage answer) {
		if (this.option == 0) {
			if (lastRobotMessage == 1) {
				this.option = answer.getInt();
			}
		} else if (this.option == 1) {
			if (lastRobotMessage == 2) {
				this.name = answer.getString();
			} else if (lastRobotMessage == 3) {
				this.cpf = answer.getString();
			} else if (lastRobotMessage == 4) {
				this.birthDate = answer.getString();
			} else if (lastRobotMessage == 5) {
				this.gender = answer.getChar();
			} else {
				System.out.println("Last question is not valid!");
			}
		} else if (this.option == 2) {
			if (lastRobotMessage == 6) {
				Patient patientResponse = LiteDriver.getPatientByCpf(answer.getString());
				String patientReturn = Formater.patientInfo(patientResponse);

			}
		}
	}

}

