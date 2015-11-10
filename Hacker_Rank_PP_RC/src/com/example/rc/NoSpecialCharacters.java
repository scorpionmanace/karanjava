package com.example.rc;

public class NoSpecialCharacters {
	public static void main(String p[]){
	String str = new String("!@#@#%@%  ~!!~~!~ +++-=-=-== haoiah +-=kjasd\"sfsa?aodshjfokaran!@$!Khar^&*");
	String result= str.replaceAll("[^\\p{L}\\p{Z}]", "");
	System.out.println(result);
	}

}
