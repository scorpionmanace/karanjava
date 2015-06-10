package arrays_and_strings;

import java.util.regex.Pattern;

public class Regex_Patterns {
	
	public static void main(String p[]){
		String mydata = "some string with #the #thing data i want inside";
		Pattern _pattern = Pattern.compile("#(.*?) "); 
		Pattern _pattern1 =Pattern.compile("#(.*?)");
//		Matcher matcher =  || ;
		if (_pattern.matcher(mydata).find())
		{
		    System.out.println(_pattern.matcher(mydata).group(1));
		}
		else if(_pattern1.matcher(mydata).find()){
			System.out.println(_pattern1.matcher(mydata).group(1));
		}
	}

}
