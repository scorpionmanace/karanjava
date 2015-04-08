package hacker_rank_FE_rohit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMinInsertions {
	 
	static int min(int a, int b)
	{  return a < b ? a : b; }
	 
	static int findMinInsertions(String a, int start, int _total_length)
	{
		if(a.length()>1000){
			return -1;
		}
		if(!isStringLowerCase(a)){
			return -1;
		}
		char []str=a.toCharArray();
	    if (start > _total_length) return Integer.MAX_VALUE;
	    if (start == _total_length) return 0;
	    if (start == _total_length - 1) return (str[start] == str[_total_length])? 0 : 1;
	 
	    return (str[start] == str[_total_length])? findMinInsertions(new String(str), start + 1, _total_length - 1):
	                               (min(findMinInsertions(new String(str), start, _total_length - 1),
	                                   findMinInsertions(new String(str), start + 1, _total_length)) + 1);
	}
	
	
	static boolean isStringLowerCase(String str){
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)<97 || str.charAt(i)>122){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String p[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String _txt_string=br.readLine();
		
		System.out.println(findMinInsertions(_txt_string,0,_txt_string.length()-1));
	}
}