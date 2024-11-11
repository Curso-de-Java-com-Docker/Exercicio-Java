package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Client;

class ClientTest {
	public static void test () {
		System.out.print("test 1 \t Client...\t");
		String name = "Jonas";
		String cpf = "23158937500";
		int bornYear = 2005;
		Client client = new Client(name, cpf, bornYear);
		assert(client.getName() == name) : "Wrong name";
		assert(client.getCpf() == cpf) : "Wrong cpf";
		assert(client.getYear() == bornYear) : "Wrong year";
		System.out.println("OK");
	}
}

