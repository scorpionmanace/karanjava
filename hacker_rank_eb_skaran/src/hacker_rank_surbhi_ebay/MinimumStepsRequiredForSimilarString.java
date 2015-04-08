package hacker_rank_surbhi_ebay;

public class MinimumStepsRequiredForSimilarString {
	public static int minimumStepsRequired(String a, String b){
		char[] characters_A = a.toCharArray();
		char[] characters_B = b.toCharArray();
	        char temp;
	        int n = characters_B.length;
	        int j, i = 0;
	        int count = 0;
	        while(n > i) {
	                        j = i;
	                        System.out.println(new String(characters_A));
	                        while(characters_A[j] != characters_B[i]) {
	                        		if(new String(characters_A).equals(new String(characters_B)))
	                        		{
	                        			return ++count;
	                        		}
	                                j++;
	                        }
	                        while(j > i) {
	                                temp = characters_A[j];
	                                characters_A[j] = characters_A[j-1];
	                                characters_A[j-1] = temp;
	                                ++count;
	                                System.out.println(new String(characters_A));
	                                if(new String(characters_A).equals(new String(characters_B)))
	                                	return count;
	                                j--;
	                                
	                        }
	                        i++;
	        }
	        return 0;
	}
	public static void main(String p[]){
		String s1 = "aaaab", s2= "abaaa";
		System.out.println(minimumStepsRequired(s1,s2));
	}
}
