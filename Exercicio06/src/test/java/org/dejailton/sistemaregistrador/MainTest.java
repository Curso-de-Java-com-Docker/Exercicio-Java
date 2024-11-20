package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.ClientTest;
import org.dejailton.sistemaregistrador.PatientTest;
import org.dejailton.sistemaregistrador.FormaterTest;
import org.dejailton.sistemaregistrador.ControllerTest;
import org.dejailton.sistemaregistrador.UserMessageTest;

public class MainTest {
	public static void main (String[] args) {
		System.out.println("Starting Automated Tests...");
		ClientTest.test();
		PatientTest.test();
		LiteDriverTest.test();
		FormaterTest.test();
		ControllerTest.test();
		UserMessageTest.test();
		System.out.println("End of Automated Tests...");
	}
}

