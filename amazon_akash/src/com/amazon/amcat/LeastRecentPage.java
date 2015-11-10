package com.amazon.amcat;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class LeastRecentPage {
	 
	 public static int lruCountMiss(int max_cache_size, int[] pages) {
		 int count = 0;
		 if(pages.length == 0) return count;
		 HashMap<Integer,Integer>  nums = new HashMap<>();
		 LinkedList<Integer> cache = new LinkedList<>();
		 for(int i=0;i<pages.length;i++)  {
			 if(nums.containsKey(pages[i])) {
				 count++;
			 } else {
				 // check capacity
				 if(cache.size() == max_cache_size) {
					 cache.removeLast();
					 count++;
				 }
					 Integer temp = new Integer(pages[i]);
					 cache.addFirst(temp);
					 nums.put(pages[i],temp);
//					 count++;
//				 } else if(cache.size()<max_cache_size){
//					 Integer temp = new Integer(pages[i]);
//					 cache.addFirst(temp);
//					 nums.put(pages[i],temp);
//					 count++;
//				 }
				 
			 }
		  }
		  return count;
	 }
	 public static void main(String[] args) throws IOException{
//		 int[]  nums = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0};
		 int[]  nums = {2,3,1,3,2,1,4,3,2};
		 System.out.println(lruCountMiss(3, nums));
		 return ;
	 }
}