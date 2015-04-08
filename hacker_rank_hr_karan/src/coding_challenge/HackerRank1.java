package coding_challenge;

import java.util.Scanner;
import java.util.Stack;

public class HackerRank1 {
	
	public static void main(String args[]){
				
//		int[] silver = {2,3,5,7,9,10,11,12};
		int max=0;
		Scanner in=new Scanner(System.in);
		String inputs[]=in.nextLine().split(" ");
		int no_silver_coins=Integer.parseInt(inputs[0]);
		int gold=Integer.parseInt(inputs[1]);
		int silver[]=new int[no_silver_coins];
		for(int k=0;k<no_silver_coins;k++){
			silver[k]=in.nextInt();
		}
		for(int i=1;i<silver.length;i++){
			Stack<Integer> s = new Stack<Integer>();
			System.out.println("Fist Element:"+silver[i-1]);
			s.push(silver[i-1]);
			int goldCount = gold;
			for(int j=i;j<silver.length;j++){
//				System.out.println("Stack Top:"+s.peek()+": Current Element:"+silver[j]);
				if((silver[j]-s.peek())==1){
					s.push(silver[j]);
				}else{
					if(goldCount==0){
						break;
					}
//					System.out.println(":"+(s.peek()+1));
					s.push(s.peek()+1);
					goldCount--;
					j--;
					
				}
			}
			max=max>(s.size()+goldCount)?max:(s.size()+goldCount);
//			System.out.println("Length:::::::::::;"+s.size());
		}
		System.out.println("Length:::::::::::;"+max);
	}

}
