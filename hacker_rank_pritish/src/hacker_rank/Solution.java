package hacker_rank;

public class Solution {
	
	 static String decode(String encoded){
		 String s = "";
		 int shift=0;
		for(int key=1;key<=26;key++){
			shift = key;
		    int len = encoded.length();
		    s="";
		    for(int x = 0; x < len; x++){
		        char c = (char)encoded.charAt(x);
		        if(c == ' ' || c== ',' || c=='.' ){
		        	s+=(char)c;
		        }
		        else{
		        	c=(char)(encoded.charAt(x) + shift);
		        	if (c > 'z')
		            s += (char)(encoded.charAt(x) - (26-shift));
		        	else
		            s += (char)(encoded.charAt(x) + shift);
		        }
		    }
		    if(s.equals(encode(s,shift))){
		    System.out.println(s);
		    }
		    
		}
		    return s;
	 }
	 
	 private static String encode(String num, int x)
	 {
	   StringBuilder sb = new StringBuilder();
	   for (char c : num.toCharArray()) {
	     sb.append((char) (c + x));
	    
	   }
	   return sb.toString();
	 }

	 public static void main(String p[]){
//		 System.out.println();
		 System.out.println(decode("vjg pgnnkg, c etwkukpi acyn, uywpi vq jgt cpejqt ykvjqwv c hnwvvgt qh vjg ucknu, cpf ycu cv tguv. vjg hnqqf jcf ocfg, vjg ykpf ycu pgctna ecno, cpf dgkpi dqwpf fqyp vjg tkxgt, vjg qpna vjkpi hqt kv ycu vq eqog vq cpf yckv hqt vjg vwtp qh vjg vkfg."));
//		 System.out.println(decode("spwwz hzcwo"));
	 }
}
