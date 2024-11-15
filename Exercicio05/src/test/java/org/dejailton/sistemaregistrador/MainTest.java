package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.ClientTest;

public class MainTest {
	public static void main (String[] args) {
		System.out.println("Starting Automated Tests...");
		ClientTest.test();
		PatientTest.test();
		FormaterTest.test();
		System.out.println("End of Automated Tests...");
	}
}

