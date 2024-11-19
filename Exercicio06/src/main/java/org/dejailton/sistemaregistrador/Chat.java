package org.dejailton.sistemaregistrador;

import org.dejailton.sistemaregistrador.Answer;
import org.dejailton.sistemaregistrador.Question;
import org.dejailton.sistemaregistrador.Controller;
import java.util.Scanner;

public class Chat {
	public static void main () {
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller();
		Question question;
		Answer answer = new Answer();
		while (true) {
			question = controller.nextQuestion();
			System.out.println(question.getText());
			if (question.getType() != "null") {
				break;
			}
		}
		while (true) {
			if (question.getType() == "String") {
				String input = scanner.next();
				answer = new Answer(input);
			} else if (question.getType() == "char") {
				char input = scanner.next().charAt(0);
				answer = new Answer(input);
			} else if (question.getType() == "int") {
				int input = scanner.nextInt();
				answer = new Answer(input);
			}
			controller.answer(answer);
			break;
		}
	}
}

