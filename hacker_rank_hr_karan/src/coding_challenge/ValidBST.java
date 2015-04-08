package coding_challenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ValidBST {
public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int testCaseNumber = Integer.parseInt(in.nextLine());
		ArrayList<String> output = new ArrayList<String>(); 
		while(testCaseNumber>0){
			int size = Integer.parseInt(in.nextLine());
			int[] inOrderArray = new int[size];
			String[] numberStrArray = in.nextLine().split(" ");
			for(int i=0;i<numberStrArray.length;i++){
				inOrderArray[i] = Integer.parseInt(numberStrArray[i]);
			}
			output.add(checkBST(inOrderArray));
			testCaseNumber--;
		}
		
		for(int i=0;i<output.size();i++){
			System.out.println(output.get(i));
		}
		
		in.close();
		
		
	}
	
	public static String checkBST(int[] inOrderArray){
		Stack<Integer> s = new Stack<Integer>();
		int lower = -1;
		for(int i=0;i<inOrderArray.length;i++){
			if(lower>-1 && inOrderArray[i] < lower){
				return "NO";
			}
			while(!s.isEmpty() && s.peek()<inOrderArray[i]){
				lower = s.pop();
			}
			
			s.push(inOrderArray[i]);
		}
		return "YES";
	}

}
