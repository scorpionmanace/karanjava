package warmups;
import java.util.Scanner;
import java.util.TreeMap;

public class LonelyInteger {
	   static int lonelyinteger(int[] a) {
//		   	int[] _new_a=new int[a.length];
		   	TreeMap<Integer, Integer> _new_a=new TreeMap<Integer,Integer>();
		   	int _lonely_integer_count=0;
		   	for(int _i_loop=0;_i_loop<a.length;_i_loop++){
		   		int _count_integer=1;
			   	if(_new_a.containsKey(new Integer(a[_i_loop]))){
			   		_count_integer++;
			   	}
			   	_new_a.put(new Integer(a[_i_loop]), new Integer(_count_integer));
		   	}
		   	for(Integer _a_key: _new_a.keySet()){
		   		if(_new_a.get(_a_key)==1){
		   			_lonely_integer_count = _a_key;
		   		}
		   		System.out.print(_a_key.intValue()+ " ");
		   	}
//		   	_lonely_integer_count=a.length-_new_a.size();
//		   	System.out.println("Total Lonely Integer Count = "+_lonely_integer_count);
		      return _lonely_integer_count;
		    }
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = lonelyinteger(_a);
	        System.out.println(res);
	        
	        in.close();
	        
	    }
}
