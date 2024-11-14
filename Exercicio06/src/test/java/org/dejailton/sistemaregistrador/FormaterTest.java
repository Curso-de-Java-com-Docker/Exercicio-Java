package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Formater;
import org.dejailton.sistemaregistrador.Patient;

class FormaterTest {
	public static void test() {
		System.out.print("test 3 \t Formater...\t");
		{
			String expected = "Welcome to sistemaregistrador!";
			String output = Formater.WELCOME;
			assert(output.equals(expected)) : "Welcome message is wrong!";
		}
		{
			String name = "Jose";
			String cpf = "98298389391";
			String birthdate = "27/11/2000";
			char gender = 'M';
			Patient patient = new Patient(name, cpf, birthdate, gender);
			String output = Formater.patientInfo(patient);
			String expected = String.format("name\t%s\ncpf\t%s\nbirthdate\t%s\ngender\t%s", name, cpf, birthdate, gender);
			assert(expected.equals(output)) : "Formater test for Patient info failed";
		}
		{
			String output = Formater.OPTIONS;
			String expected = "Select operation [1] Register [2] Query";
			assert(output.equals(expected)) : "Formater options are wrong";
		}
		{
			String output = Formater.SUCCESS;
			String expected = "Done with success!";
			assert(output.equals(expected)) : "Formater success message is wrong";
		}
		System.out.println("OK");	
	}
}
