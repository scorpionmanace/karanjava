package snippet;

import java.util.Arrays;

public class Anagram {
	public static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}

	public static boolean allCharsBetween_a_z(String str1, String str2) {
		int length_str = str1.length(), count = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if ((int) str1.charAt(i) >= 97 && (int) str1.charAt(i) <= 122
						&& (int) str2.charAt(i) >= 97
						&& (int) str2.charAt(i) <= 122) {
					count++;
				}
			}
			System.out.println(length_str);
			System.out.println(count);
			if (length_str == count)
				return true;
		}
		return false;
	}

	public static void main(String p[]) {
		System.out.println(checkAnagram("aaaaababbbbc", "bbbbaabaaaa"));
		System.out.println(allCharsBetween_a_z("aaaaababbb", "bbbbaabaaaa"));
	}
}
