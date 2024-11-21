package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LiteDriver {
	public static boolean registerPatient(Patient patient) {
		String insertString = getInsertString(patient);
		boolean success = false;	// bota pra ser se deu certo ou nao depois
		executeUpdate(insertString);
		return success;
	}

	private static String getInsertString (Patient patient) {
		String queryString;
		String name = patient.getName();
		String cpf = patient.getCpf();
		///...
		// queryString = String.format(...);
		queryString = "";
		return queryString;
	}

	private static void executeUpdate (String sqlString) {
		ensureTable();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			statement.executeUpdate(sqlString);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void ensureTable () {
		String tableName = "Patients";
		String nameCol = "name STRING";
		String cpfCol = "cpf STRING";
		String birth = "birth STRING";
		String gender = "gender STRING";
		String preStatement = "CREATE TABLE IF NOT EXISTS %s (%s, %s, %s, %s);";
		String statementString = String.format(preStatement, nameCol, cpfCol, birth, gender);
		execute(statementString);
	}

	private static void execute (String sqlString) {
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			statement.execute(sqlString);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Connection getConnection () {
		Connection connection;
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db");
		return connection;
	}

	public static Patient getPatientByCpf(String cpf) {
		String queryString = getQueryString(cpf);
		executeQuery(queryString);
	}

	private static Patient getQueryString (String cpf) {
		ensureTable();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			Result result = statement.executeQuery(sqlString);
			Patient patient = resultToPatient(result);
			return patient;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Patient resultToPatient (Result result) {
		if (patientReturnSet.getFetchSize() > 1) {
			throw new Exception("Expected an unique result for cpf, but got multiple");
		} else if (patientReturnSet.getFetchSize() < 1) {
			throw new Exception("No results for this cpf");
		}
		// troca patientReturnSet por result
		Patient patient;
		patientReturnSet.next();
		patientReturnSet.first();
		String name = patientReturnSet.getString("name");
		String cpf = patientReturnSet.getString("cpf");
		String birthdate = patientReturnSet.getString("birthdate");
		char gender = patientReturnSet.getString("gender").charAt(0);
		patient = new Patient(name, cpf, birthdate, gender);
		return patient;
	}
}

