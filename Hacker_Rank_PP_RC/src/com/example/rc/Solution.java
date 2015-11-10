package com.example.rc;


import java.util.Scanner;

public class Solution {
	
	private int[] listOfIndexValues;
	int _maxItemInTheList;
	
	public Solution(int numberOfItems)
	{
		this.listOfIndexValues = new int[numberOfItems];
		this._maxItemInTheList = 0;
		for(int i = 0; i < numberOfItems; i++)
		{
			listOfIndexValues[i]=0;
		}
	}
	
	public void calculateListMax(int a, int b, int k)
	{
		for(int i = a-1; i < b; i++)
		{
			int valAtPos = this.listOfIndexValues[i];
			valAtPos += k;
			
			if(valAtPos>this._maxItemInTheList){
				_maxItemInTheList = valAtPos;
			}
			this.listOfIndexValues[i]=valAtPos;
		}
	}
	
	public int getListMax(){
		return this._maxItemInTheList;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int noOfOperrations = 0;
		Solution solution = new Solution(n);
		if(n >=1 && n <= 10000000 && m >= 1 && m <= 1000000)
		{
			while(noOfOperrations != m)
			{
				String line = sc.nextLine();
				int a = Integer.parseInt(line.split(" ")[0]);
				int b = Integer.parseInt(line.split(" ")[1]);
				int k = Integer.parseInt(line.split(" ")[2]);
				if(a >= 1 && a <= n && b >= 1 && b <= n && k >=1 && k <= 1000000000)
				{
					solution.calculateListMax(a, b, k);
				}
				noOfOperrations++;
			}
		}
		System.out.println(solution.getListMax());
	}

}

