package org.dejailton.sistemaregistrador;                                                                
import org.dejailton.sistemaregistrador.Patient;

public class NullPatient extends Patient{
	public NullPatient() {
		super();
	}
	
	
	@Override
	public String getName() {
		String nameresponse;
		if (Patient.name == null) {
			String nameresponse = "This name was not found";
		} else {
			String nameresponse = Patient.name;
		}
		return nameresponse;
	}
	@Override
	public static String getCpf() {
		return "This CPF was not found";
	}
	@Override
	public static String getBirthDate() {
		return "This birth date was not found"; 
	}
	@Override
	public static char getGender() {
		return '-';
	}
}
