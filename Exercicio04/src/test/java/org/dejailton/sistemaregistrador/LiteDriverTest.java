package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.LiteDriver;
import org.dejailton.sistemaregistrador.Patient;

public class LiteDriverTest {
	public void run () {
		System.out.print("test 3 \t LiteDriverTest...\t");
		String name = "James";
		String cpf = "12312312300";
		String birthdate = "20/12/2001";
		char gender = 'M';
		Patient patient = new Patient(name, cpf, birthdate, gender);
		{
			boolean success = LiteDriver.registerPatient(patient);
			assert(success) : "Register Operation Gone Wrong";
		}
		{
			Patient receivedPatient = LiteDriver.getPatientByCpf(cpf);
			assert(receivedPatient.getName() == name) : "Wrong name";
			assert(receivedPatient.getCpf() == cpf) : "Wrong cpf";
			assert(receivedPatient.getBirthDate() == birthdate) : "Wrong birth date";
			assert(receivedPatient.getGender() == gender) : "Wrong gender";
		}
		{
			String wrongCpf = "123";
			Patient receivedPatient = LiteDriver.getPatientByCpf(wrongCpf);
			assert(receivedPatient == Patient.NULL) : "Result must be nullPatient";
		}
		System.out.println("OK");	
	}
}

