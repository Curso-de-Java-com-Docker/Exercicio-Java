package org.dejailton.sistemaregistrador;
import org.dejailton.sistemaregistrador.Patient;

class Formater {
	static final String WELCOME = "Welcome to sistemaregistrador!";
	static final String OPTIONS = "Select operation [1] Register [2] Query";
	static final String SUCCESS = "Done with success!";
	
	public static String patientInfo (Patient patient) {
		String name = patient.getName();
		String cpf = patient.getCpf();
		String birthdate = patient.getBirthDate();
		char gender = patient.getGender();
		String patientinforeturn = String.format("name\t%s\ncpf\t%s\nbirthdate\t%s\ngender\t%s", name, cpf, birthdate, gender);
		return patientinforeturn;
	} 
}

