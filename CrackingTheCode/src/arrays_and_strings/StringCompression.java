package arrays_and_strings;

public class StringCompression {
	
	public static String compressedString(String s){
		int count=1;
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<s.length();i++){
			if(i+1<s.length()){
				if(s.charAt(i)==s.charAt(i+1))
					count++;
				else
				{
					sb.append(Character.toString(s.charAt(i))+Integer.toString(count));
					count=1;
				}
			}
			else
				{
				sb.append(Character.toString(s.charAt(i))+Integer.toString(count));
				count=1;
				}
		}
		if(sb.length()>=s.length()){
			return s;
		}
		return sb.toString();
	}

	public static void main(String p[]){
		System.out.println(compressedString("abbbbcaaddd"));
	}
}
