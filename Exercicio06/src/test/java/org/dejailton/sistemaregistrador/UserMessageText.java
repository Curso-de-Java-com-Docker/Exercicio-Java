package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.UserMessage;

class UserMessageTest {
	public static void test () {		
		System.out.print("test 6 \t UserMessage...\t");
		{	
			String expected = "Value is valid!";
			UserMessage answer = new UserMessage(expected);
			String output = answer.getString();
			String expectedType = "String";
			String outputType = answer.getType();
			assert(expected.equals(output)) : "Value String incorrect"; 
			assert(expectedType.equals(outputType)) : "Type String incorret";
		}
		{	
			int expected = 1;
			UserMessage answer = new UserMessage(expected);
			int output = answer.getInt();
			String expectedType = "int";
			String outputType = answer.getType();
			assert(expected == output) : "Value Int incorrect"; 	
			assert(expectedType.equals(outputType)) : "Type int incorret";
		}
		{	
			char expected = 'M';
			UserMessage answer = new UserMessage(expected);
			char output = answer.getChar();
			String expectedType = "char";
			String outputType = answer.getType();
			assert(expected == output) : "Value Char incorrect"; 
			assert(expectedType.equals(outputType)) : "Type char incorret";
		}
		System.out.println("OK");
	}
}

