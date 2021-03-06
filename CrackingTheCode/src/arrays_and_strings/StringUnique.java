package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class StringUnique {
	
	public static boolean isUniqueUsingMap(String s){
		Map<Character,Integer> string_map=new HashMap<Character,Integer>();
		for(int i=0 ; i<s.length();i++){
			Integer count=string_map.get(s.charAt(i))==null? new Integer(0):string_map.get(s.charAt(i))+1;
			string_map.put(new Character(s.toLowerCase().charAt(i)),count);
			if(count>0)
				return false;
			
		}
		return true;
	}
	
	public static void main(String p[]){
		System.out.println(isUniqueUsingMap("kk"));
	}

}
