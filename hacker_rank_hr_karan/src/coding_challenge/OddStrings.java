package coding_challenge;

import java.util.Scanner;

public class OddStrings {
	public static void main(String p[]){
		Scanner in=new Scanner(System.in);
		int _num_test_cases=Integer.parseInt(in.nextLine());
		boolean _output[]=new boolean[_num_test_cases];
		for(int i=0;i<_num_test_cases;i++){
			String []_inputs=in.nextLine().split(" ");
			String []_elements=in.nextLine().split(" ");
			int m=Integer.parseInt(_inputs[0]);
			int k=Integer.parseInt(_inputs[1]);
			if(_elements.length != k)
				return;
			_output[i]=evenOddCal(_elements,m,k);
			
		}
		for(int i=0;i<_num_test_cases;i++){
			System.out.println(_output[i]?"EVEN":"ODD");
		}
		in.close();
	}
	
public static  boolean evenOddCal(String data[],int m, int k ){
		
		boolean isEvenOdd[] = new boolean[data.length] ;
		int tempVal;
		boolean tempEvenOdd= false;		
		
		for(int i=0; i<data.length;i++){
			tempEvenOdd= false;
			
			for(int j=0; j<data[i].length();j++ ){
				tempVal = (int) data[i].charAt(j);
				if(tempVal%2==0){
					tempEvenOdd = true;
				}
			}
			
			isEvenOdd[i] = tempEvenOdd;
			
		}
		
		int oddCount=0;
		
		for(int i=0; i<data.length; i++){
			
			if(!isEvenOdd[i])
				oddCount++;
			
		}
		if(oddCount%2!=0)
			return false;
		else return true;

		
} 
}
