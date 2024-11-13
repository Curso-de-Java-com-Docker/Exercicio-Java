package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LiteDriver {
	public static void registerPatient(Patient patient) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:base.db");
			Statement statement = connection.createStatement();
			statement = setQueryTimeout(30);

			statement.executeUpdate("CREATE TABLE patienttable(name STRING, cpf STRING, birthdate String, gender char");
			statement.executeUpdate("INSERT INTO patienttable VALUES(patient.getName(), patient.getCpf(), patient.getBirthDate(), patient.getGender()");
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public static void getPatientByCpf(String wrongCpf) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:base.db");
			Statement statement = connection.createStatement();
			statement = setQueryTimeout(30);

			statement.executeUpdate("SELECT cpf FROM patienttable WHERE cpf = 'wrongCpf'");
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
