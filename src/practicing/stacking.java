package practicing;

import java.util.Scanner;
import java.util.Stack;

public class stacking {
	public static boolean isParenthesisMatch(String str) {

		Stack stack = new Stack();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (c == '(')
				stack.push(new Character(c));
			else if (c == '{')
				stack.push(new Character(c));
			else if (c == '[')
				stack.push(new Character(c));
			else if (c == ')')
				if (stack.empty())
					return false;
				else if (stack.peek().equals( Character.valueOf('(')))
					stack.pop();
				else
					return false;
			else if (c == '}')
				if (stack.empty())
					return false;
				else if (stack.peek().equals( Character.valueOf('{')))
					stack.pop();
				else
					return false;
			else if (c == ']')
				if (stack.empty())
					return false;
				else if (stack.peek().equals(Character.valueOf('[')))
					stack.pop();
				else
					return false;
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isParenthesisMatch(input));
		}
	}
}
