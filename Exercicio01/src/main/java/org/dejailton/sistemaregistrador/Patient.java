package org.dejailton.sistemaregistrador;

public class Patient {
        private String name;
        private String sex;
        private String datebirth;
        private String cpf;

        public Patient(String name, String sex, String datebirth, String cpf) {
                this.name = name;
                this.sex = sex;
                this.datebirth = datebirth;
                this.cpf = cpf;
        }

        public Patient(String name, String sex, String cpf) {
                this.name = name;
                this.sex = sex;
                this.cpf = cpf;
        }
        public void consultPatientName(String name) {
                if(this.name == name) {
                        System.out.println("Name of patient: " + name);
                        System.out.println("Sex of patient: " + sex);
                        System.out.println("Patient's date of birth: " + datebirth);
                        System.out.println("CPF of patient: " + cpf);
                } else {
                        System.out.println("Name not found!");
                }
        }
        public void consultPatientCpf(String cpf) {
		if(this.cpf == cpf) {
			System.out.println("Name of patient: " + name);
                        System.out.println("Sex of patient: " + sex);
                        System.out.println("Patient's date of birth: " + datebirth);
                        System.out.println("CPF of patient: " + cpf);
                } else {
                        System.out.println("CPF not found!");
		}
        }
        public void consultPatientDateBirth(String datebirth) {
		if(this.datebirth == datebirth) {
			System.out.println("Name of patient: " + name);
                        System.out.println("Sex of patient: " + sex);
                        System.out.println("Patient's date of birth: " + datebirth);
                        System.out.println("CPF of patient: " + cpf);
                } else {
                        System.out.println("Date of birth not found!");
		}
	}
	public String getName() {
                return this.name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getSex() {
                return this.sex;
        }
        public void setSex(String sex) {
                this.sex = sex;
        }
        public String getDateBirth() {
                return this.datebirth;
        }
        public void setDateBirth(String datebirth) {
                this.datebirth = datebirth;
        }
        public String getCpf() {
                return this.cpf;
        }
        public void setCpf(String cpf) {
                this.cpf = cpf;
        }
}

