package org.dejailton.sistemaregistrador;

public class Client {
	private String name;
	private String cpf;
	private int bornYear;

	public Client (String name, String cpf, int bornYear) {
		this.name = name;
		this.cpf = cpf;
		this.bornYear = bornYear;
	}
	public String getName() {
		return this.name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public int getYear() {
		return this.bornYear;
	}
}

