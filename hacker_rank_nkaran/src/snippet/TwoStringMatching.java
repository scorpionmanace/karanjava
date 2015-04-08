package snippet;

public class TwoStringMatching {

	public static void main(String[] args) {
		String str1 = "abcdeacde";

		String str2 = "ebdcecada";

		System.out.println(easyStrings(str1, str2));

	}

	static int easyStrings(String a, String b){
		if(a.length()<1 || a.length() >2000){
			return -1;
		}
		if(b.length()<1 || b.length()>2000){
			return -1;
		}
		if(!isStringLowerCase(a) || !isStringLowerCase(b)){
			return -1;
		}
//		if(a.cocompareTo(b)<0){
//			System.out.println(a.compareTo(b));
//			return -1;
//		}
		return minimumSwapsRequired(a,b);
	}

	static boolean isStringLowerCase(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 97 || str.charAt(i) > 122) {
				return false;
			}
		}

		return true;
	}

	public static int minimumSwapsRequired(String a, String b) {
		if (a == b)
			return 0;
		if(a.length()==0)
			return a.length();
		if(b.length()==0)
			return b.length();
		
		int len1 = minimumSwapsRequired(a.substring(1), b) + 1;
		int len2 = minimumSwapsRequired(a, b.substring(1)) + 1;
		int len3 = minimumSwapsRequired(a.substring(1), b.substring(1))
				+ (a.charAt(0) == b.charAt(0) ? 0 : 1);

		return Math.min(Math.min(len1, len3), Math.min(len2, len3));
	}
}
