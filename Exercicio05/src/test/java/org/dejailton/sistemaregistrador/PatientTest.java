package org.dejailton.sistemaregistrador;
import org.dejailton.sistemaregistrador.PatientFactory;
import org.dejailton.sistemaregistrador.Patient;

class PatientTest {
	public static void test() {
		System.out.print("test 1 \t Patient...\t");
		String name = "Jose";
		String cpf = "98298389391";
		String birthdate = "27/11/2000";
		char gender = 'M';
		Patient patient = PatientFactory.createPatient(name, cpf, birthdate, gender);
		assert(patient.getName() == name) : "Wrong name";
		assert(patient.getCpf() == cpf) : "Wrong cpf";
		assert(patient.getBirthDate() == birthdate) : "Wrong birth date";
		assert(patient.getGender() == gender) : "Wrong gender";
		System.out.println("OK");	
	}
}
