package hacker_rank_surbhi_ebay;

import java.util.Stack;

public class BracesCheck {

	public static void main(String args[]) {
		 System.out.println(braces("))))))))))"));
		// System.out.println(braces("([{}])"));
		// System.out.println(braces(""));
	}

	static String braces(String value) {
		Stack _stack_spcl_char = new Stack();
		String res = "NO";
		String pattern[] = { "([{", ")]}" };
		char _temp_char;

		if (value == null || value.length() < 1) {
			return res;
		} else {

			for (int i = 0; i < value.length(); i++) {
				_temp_char = value.charAt(i);

				if (!(pattern[0].contains((String.valueOf(_temp_char))) || pattern[1]
						.contains((String.valueOf(_temp_char)))))
					return res;

				if (pattern[0].contains((String.valueOf(_temp_char)))) {
					_stack_spcl_char.push(new Character(_temp_char));
				} else {
					if (!_stack_spcl_char.isEmpty()) {
						if (_temp_char == ')') {
							if (_stack_spcl_char.peek().equals(
									new Character('(')))
								_stack_spcl_char.pop();
							else
								return res;
						} else if (_temp_char == '}') {
							if (_stack_spcl_char.peek().equals(
									new Character('{')))
								_stack_spcl_char.pop();
							else
								return res;
						} else if (_temp_char == ']') {
							if (_stack_spcl_char.peek().equals(
									new Character('[')))
								_stack_spcl_char.pop();
							else
								return res;
						}
					} else {
						return res;
					}
				}
			}

		}

		if (_stack_spcl_char.isEmpty()) {
			res = "YES";
			return res;
		} else {
			return res;
		}
	}
}
