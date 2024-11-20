package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Controller;
import org.dejailton.sistemaregistrador.RobotMessage;

class ControllerTest {
	public static void test () {
		System.out.print("test 5 \t Controller...\t");
		Controller controller = new Controller();
		UserMessage answer;
		RobotMessage question;
		{		
			String output = controller.init();
			String expected = "Welcome to sistemaregistrador!";
			assert(expected.equals(output)) : "Welcome message is wrong!";
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Select operation [1] Register [2] Query";
			assert(expected.equals(output)) : "Controller options is wrong!";
			answer = new UserMessage(1); 
			controller.answer(answer);
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Name: ";
			assert(expected.equals(output)) : "Name question is not valid";
			answer = new UserMessage("João");
			controller.answer(answer);			
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Cpf: ";
			assert(expected.equals(output)) : "CPF question is not valid";
			answer = new UserMessage("82998289221");
			controller.answer(answer);
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Birth date: ";
			assert(expected.equals(output)) : "Birth date question is not valid";
			answer = new UserMessage("27/09/2000");
			controller.answer(answer);
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Gender: ";
			assert(expected.equals(output)) : "Gender question is not valid";
			answer = new UserMessage('M');
			controller.answer(answer);
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Done with success!";
			assert(expected.equals(output)) : "Register failled!";
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Select operation [1] Register [2] Query";
			assert(expected.equals(output)) : "Controller options is wrong!";
			answer = new UserMessage(2); 
			controller.answer(answer);
		}
		{
			question = controller.nextRobotMessage();
			String output = question.getText();
			String expected = "Cpf: ";
			assert(expected.equals(output)) : "CPF question is not valid";
			answer = new UserMessage("82998289221");
			controller.answer(answer);
						
		}

		System.out.println("OK");
	}
}

