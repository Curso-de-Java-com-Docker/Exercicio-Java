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

	public static Patient NULL = new NullPatient();

	private class NullPatient extends Patient {
		NullPatient () {
			super(null, null, null, null);
		}
		@Override void getName () {}
		void getCpf() {}
		void getBirthDate() {}
		void getGender() {}
	}
}

