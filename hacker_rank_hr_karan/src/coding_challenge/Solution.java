package coding_challenge;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String _inputs = in.nextLine();
		String[] _inputs_item = _inputs.split(" ");
		int _input_silver_coins = Integer.parseInt(_inputs_item[0]);
		int gold = Integer.parseInt(_inputs_item[1]);
		int[] _silver_coins = new int[_input_silver_coins];
		
		for (int i = 0; i < _silver_coins.length; i++) {
			_silver_coins[i] = Integer.parseInt(in.nextLine());
		}
		
		int max = _silver_coins.length<=1?_silver_coins.length+1:0;
		for (int i = 1; i < _silver_coins.length; i++) {
			int goldCount = gold;
			Stack<Integer> s = new Stack<Integer>();
			s.push(_silver_coins[i - 1]);
			for (int j = i; j < _silver_coins.length; j++) {
				if ((_silver_coins[j] - s.peek()) == 1) {
					s.push(_silver_coins[j]);
				} else {
					if (goldCount == 0) {
						break;
					}
					s.push(s.peek() + 1);
					goldCount--;
					j--;

				}
			}
			max = max > (s.size() + goldCount) ? max : (s.size() + goldCount);
		}
		System.out.println(max);
		in.close();
	}

}
