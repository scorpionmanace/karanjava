package arrays_and_strings;

public class StringReverse {
	
	private String reverse(String str){
		char _str[]=str.toCharArray();
		int _str_length=_str.length, _str_last=_str_length-1;
		for(int i=0;i<=_str_length/2;i++){
			char c=_str[i];
			_str[i]=_str[_str_last];
			_str[_str_last--]=c;
		}
		return new String(_str);
	}
	
	public static void main(String p[]){
		StringReverse obj=new StringReverse();
		System.out.println(obj.reverse("Madam, I'm Adam"));
	}
}
