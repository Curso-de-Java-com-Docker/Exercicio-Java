package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.UserMessage;
import org.dejailton.sistemaregistrador.RobotMessage;
import org.dejailton.sistemaregistrador.Controller;
import java.util.Scanner;

public class Chat {
	public static void main () {
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller();
		RobotMessage question;
		UserMessage answer = new UserMessage();
		while (true) {
			question = controller.nextRobotMessage();
			System.out.println(question.getText());
			if (question.getType() != "null") {
				break;
			}
		}
		while (true) {
			if (question.getType() == "String") {
				String input = scanner.next();
				answer = new UserMessage(input);
			} else if (question.getType() == "char") {
				char input = scanner.next().charAt(0);
				answer = new UserMessage(input);
			} else if (question.getType() == "int") {
				int input = scanner.nextInt();
				answer = new UserMessage(input);
			}
			controller.answer(answer);
			break;
		}
	}
}

