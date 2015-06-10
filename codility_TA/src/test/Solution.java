package test;

public class Solution {
	public String solution(String s){
		
		String newStr[]=s.split(" ");
		String revString="";
		for(int i=0;i<newStr.length;i++){
			revString+=revString(newStr[i])+(i<newStr.length-1?" ":"");
		}
		return revString;
	}
	
	private String revString(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		return rev;
	}
	public static void main(String p[]){
		
		String s="we test coders";
		Solution obj=new Solution();
		System.out.println(obj.solution(s));
	}
}


