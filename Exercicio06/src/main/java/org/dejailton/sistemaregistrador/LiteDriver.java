package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LiteDriver {
	public static boolean registerPatient(Patient patient) {
		Patient patientRegister = patient;
		boolean success = false;
		Connection connection = null;
		try {
			
			String name1 = patientRegister.getName();
			String cpf1 = patientRegister.getCpf();
			String brithDate1 = patientRegister.getBirthDate();
			char gender1 = patientRegister.getGender();
			Class.forName("org.sqlite.JDBC");
			success = true;
			connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			
			statement.executeUpdate("CREATE TABLE patienttable(name STRING, cpf STRING, birthdate STRING, gender CHAR)");
			statement.executeUpdate("INSERT INTO patienttable (name, cpf, birthdate, gender) VALUES (name1, cpf1, birthDate1, gender1)");
		} catch(SQLException e) {
			System.err.println(e.getMessage());
			success = false;
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			} 
			return success;
		}
	}

	public static Patient getPatientByCpf(String wrongCpf) {
		Connection connection = null;
		Patient patient;
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);

			ResultSet patientReturnSet = statement.executeQuery("SELECT cpf FROM patienttable WHERE cpf = 'wrongCpf'");
			if (patientReturnSet.getFetchSize() == 1) {
				patientReturnSet.next();
				patientReturnSet.first();
				String name = patientReturnSet.getString("name");
				String cpf = patientReturnSet.getString("cpf");
				String birthdate = patientReturnSet.getString("birthdate");
				char gender = patientReturnSet.getString("gender").charAt(0);
				patient = new Patient(name, cpf, birthdate, gender);
			} else if (patientReturnSet.getFetchSize() > 1) {
				throw new Exception("Expected an unique result for cpf, but got multiple");
			} else {
				throw new Exception("No results for this cpf");
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			patient = new Patient();
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return patient;
	}
}
