package org.dejailton.sistemaregistrador;

abstract class Patient {
	static protected String name;
	protected String cpf;
	protected String birthdate;
	protected char gender;

	public Patient() {
	}
	public Patient(String name, String cpf, String birthdate, char gender) {
		this.name = name;
		this.cpf = cpf;
		this.birthdate = birthdate;
		this.gender = gender;
	}
	public abstract String getName();
	public abstract String getCpf() {
		return this.cpf;
	}
	public abstract String getBirthDate() {
		return this.birthdate;
	}
	public abstract char getGender() {
		return this.gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setBirthDate(String birthdate) {
		this.birthdate = birthdate;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}

