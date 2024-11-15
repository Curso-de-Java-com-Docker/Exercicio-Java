package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Controller;

class ControllerTest {
	public static void test() {
		System.out.print("test4 \t Controller...\t");
		Controller controller = new Controller();
		{		
			String output = controller.init();
			String expected = "Welcome to sistemaregistrador!";
			assert(expected.equals(output)) : "Welcome message is wrong!";
		}
		{
			String output = controller.nextQuestion();
			String expected = "Select operation [1] Register [2] Query";
			assert(expected.equals(output)) : "Controller options is wrong!";
			int answer = 1; 
			controller.answer(answer);
		}
		{
			String question = controller.nextQuestion();
			String expected = "Name: ";
			assert(expected.equals(question)) : "Name question is not valid";
			String answer = "José";
			controller.answer(answer);			
		}
		{
			String question = controller.nextQuestion();
			String expected = "Cpf: ";
			assert(expected.equals(question)) : "CPF question is not valid";
			String answer = "82998289221";
			controller.answer(answer);
		}
		{
			String question = controller.nextQuestion();
			String expected = "Birth date: ";
			assert(expected.equals(question)) : "Birth date question is not valid";
			String answer = "27/09/2000";
			controller.answer(answer);
		}
		{
			String question = controller.nextQuestion();
			String expected = "Gender: ";
			assert(expected.equals(question)) : "Gender question is not valid";
			char answer = 'M';
			controller.answer(answer);
		}

		System.out.println("OK");
	}	
}

