package hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	private final int _total_alphabets = 26;

	private Map<Character, Integer> char_map = new HashMap<Character, Integer>();

	private void initMap() {
		for (char item = 'A'; item <= 'Z'; item++) {
			char_map.put(item, 0);
		}
	}

	public boolean isPangram(String s) {
		initMap();
		int count = 0;
		for (Character c : s.toCharArray()) {
			if (char_map.containsKey(c)
					|| char_map.containsKey(Character.toUpperCase(c))) {
				char_map.put(Character.toUpperCase(c), 1);
			}
		}
		for (Integer val : char_map.values()) {
			if (val == 1) {
				count++;
			}
		}
		if (count == _total_alphabets)
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		Solution soln = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String sentence = br.readLine();
		System.out.println(sentence.length());
		if (sentence.length() > 0 && sentence.length() <= Math.pow(10.0, 3.0)) {
			if (soln.isPangram(sentence)) {
				System.out.println("pangram");
			} else {
				System.out.println("not pangram");
			}
		}
		else{
			System.out.println("not pangram");
		}
	}
}
