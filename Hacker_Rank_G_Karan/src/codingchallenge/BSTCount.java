package codingchallenge;

import java.util.Scanner;

	
	public class BSTCount {

		public static void main(String args[]){
			
//			System.out.println(factorial(20));
			Scanner in = new Scanner(System.in);
	        
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
			System.out.println(maxNoOfBST(4));
			
			in.close();
		}
		
		public static long factorial(int x){
			if(x==0)
				return 1;
			long f=x*factorial(x-1);
			return f;
			
		}
		
		public static long maxNoOfBST(int num){
			
			long fact_n=factorial(num);
			long fact_n1=fact_n*(num+1);
			long count = factorial(2*num)/(fact_n*fact_n1);
			
			return count;
		}
		
	}

