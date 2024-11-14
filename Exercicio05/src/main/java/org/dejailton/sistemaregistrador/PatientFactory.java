package org.dejailton.sistemaregistrador;
import org.dejailton.sistemaregistrador.Patient;
import org.dejailton.sistemaregistrador.NullPatient;

public class PatientFactory {
	public static Patient createPatient(String name, String cpf, String birthdate, char gender) {
		Patient patient = new Patient();
		String namefactory = name;
		String cpffactory = cpf;
		String birthdatefactory = birthdate;
		char genderfactory = gender;
		if (namefactory == null) {
			patient.setName(NullPatient.getName());
		} else {
			patient.setName(namefactory);
		}
		if (cpffactory == null) {
			patient.setCpf(NullPatient.getCpf());
		} else {
			patient.setCpf(cpffactory);
		}
		if (birthdatefactory == null) {
			patient.setBirthDate(NullPatient.getBirthDate());
		} else {
			patient.setBirthDate(birthdatefactory);
		}
		if (genderfactory == '\u0000') {
			patient.setGender(NullPatient.getGender());
		} else {
			patient.setGender(genderfactory);
		}
		return patient;
	}
}
