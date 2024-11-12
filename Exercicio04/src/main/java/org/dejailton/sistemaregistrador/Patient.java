package org.dejailton.sistemaregistrador;

class Patient {
	String name;
	String cpf;
	String birthdate;
	char gender;


	public Patient(String name, String cpf, String birthdate, char gender) {
		this.name = name;
		this.cpf = cpf;
		this.birthdate = birthdate;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getBirthDate() {
		return this.birthdate;
	}
	public char getGender() {
		return this.gender;
	}
}
