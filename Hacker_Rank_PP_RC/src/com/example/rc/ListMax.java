package com.example.rc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Collections;

public class ListMax {
	
	private List<Integer> _dataItems;
	int n;
	
	public ListMax(int n)
	{
		this.n = n;
		this._dataItems = new ArrayList<Integer>(this.n);
		for(int i = 0; i < n; i++)
		{
			this._dataItems.add(0);
		}
	}
	
	public void performGetAndSet(int a, int b, int k)
	{
		for(int i = a-1; i < b; i++)
		{
			int val = this._dataItems.get(i);
			val += k;
			this._dataItems.set(i, val);
		}
	}
	
	public int getListMaximum()
	{
		Collections.sort(this._dataItems);
		int size = this._dataItems.size();
		return this._dataItems.get(size-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int opCounter = 0;
		ListMax lm = new ListMax(n);
		if(n >=1 && n <= 10000000 && m >= 1 && m <= 1000000)
		{
			while(opCounter != m)
			{
				String line = sc.nextLine();
				int a = Integer.parseInt(line.split(" ")[0]);
				int b = Integer.parseInt(line.split(" ")[1]);
				int k = Integer.parseInt(line.split(" ")[2]);
				if(a >= 1 && a <= n && b >= 1 && b <= n && k >=1 && k <= 1000000000)
				{
					lm.performGetAndSet(a, b, k);
				}
				opCounter++;
			}
		}
		System.out.println("Maximum value in the final list: " + lm.getListMaximum());
	}

}
