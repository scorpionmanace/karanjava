package hacker_rank_surbhi_ebay;

public class MinimumStepsString {

	public static int minimumStringMoves(String a, String b) {
		char[] characters_A = a.toCharArray();
		char[] characters_B = b.toCharArray();
		int swap_count = 0;
		
		if (characters_A[0] != characters_B[0] && characters_A[0] == characters_B[characters_B.length - 1]) {
			if (a.substring(1, a.length() - 2).equals(
					b.substring(1, b.length() - 2))) {
				char temp = characters_B[0];
				characters_B[0] = characters_B[characters_B.length - 1];
				characters_B[characters_B.length - 1] = temp;

				if (new String(characters_A).equals(new String(characters_B))) {
					return 1;
				}
			}
		}

		int index = 0;
		while (true) {
			if (index >= characters_B.length - 1) {
				index = 0;
			}

			if (characters_A[index] != characters_B[index]) {
				char tempChar = characters_B[index];
				characters_B[index] = characters_B[index + 1];
				characters_B[index + 1] = tempChar;
				swap_count++;
				if (new String(characters_A).equals(new String(characters_B))) {
					return swap_count;
				}
			}

			index++;
		}
	}
	
	public static void main(String p[]){
		String s1="aaaab", s2="abaaa";
		System.out.println(minimumStringMoves(s1,s2));
	}
}
