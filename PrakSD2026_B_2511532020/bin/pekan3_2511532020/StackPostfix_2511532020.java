package pekan3_2511532020;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532020 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input_2511532020 = new Scanner(expression);
		while(input_2511532020.hasNext()) {
			if (input_2511532020.hasNextInt()) {
				s.push(input_2511532020.nextInt());
			} else {
				String operator_2511532020 = input_2511532020.next();
				int operand2_2511532020 = s.pop();
				int operand1_2511532020 = s.pop();
				if (operator_2511532020.equals("+")) {
					s.push(operand1_2511532020 + operand2_2511532020);
				} else if (operator_2511532020.equals("-")) {
					s.push(operand1_2511532020 - operand2_2511532020);
				} else if (operator_2511532020.equals("*")) {
					s.push(operand1_2511532020 * operand2_2511532020);
				} else {
					s.push(operand1_2511532020 / operand2_2511532020);
				}
			}
		}
		input_2511532020.close();
		return s.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix= " + postfixEvaluate("5 2 4 * + 7 -"));
	}

}
