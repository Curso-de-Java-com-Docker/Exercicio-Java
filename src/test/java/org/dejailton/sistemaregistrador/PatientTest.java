package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Patient;

class PatientTest {
	public static void test () {
                String name = "Dejailton";
                String sex = "M";
                String datebirth = "27/11/2000";
                String cpf = "09289298791";

                Patient patient1 = new Patient(name, sex, datebirth, cpf);
                System.out.println("System of patients started:");
                patient1.consultPatientName("Dejailton");
                patient1.consultPatientCpf("09289298791");
                patient1.consultPatientDateBirth("27/11/2000");
                System.out.println("Deleting patient!");    
                System.out.println("Patient deleted!");
                System.out.println("System of patient closed!");
        }
}

