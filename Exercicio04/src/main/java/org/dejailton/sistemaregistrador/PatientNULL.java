package org.dejailton.sistemaregistrador;

public abstract class NullPatient {
	private String name = null;
	private String cpf = null;
	private String bithdate = null;
	private char gender = null;


	public abstract String getName();
	
	public abstract String getCpf();

	public abstract String getBirthDate();

	public abstract char getGender();

	private static NULL = new NullPatient();<F9>



}
