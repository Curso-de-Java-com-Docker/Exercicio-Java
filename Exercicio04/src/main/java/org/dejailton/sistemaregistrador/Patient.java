package org.dejailton.sistemaregistrador;

class Patient {
	String name;
	String cpf;
	String birthdate;
	char gender;
	boolean isNull;
	public static boolean NULL = true;

	public Patient() {
		this.isNull = true;
	}

	public Patient(String name, String cpf, String birthdate, char gender) {
		this.name = name;
		this.cpf = cpf;
		this.birthdate = birthdate;
		this.gender = gender;
		this.isNull = false;
	}

	public boolean getIsNull () {
		return this.isNull;
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

