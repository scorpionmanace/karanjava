package arrays_and_strings;

public class MaxSubarraySum {
	public int maxSubArraySum(int a[]){
		int newSum=a[0];
		int max=a[0];
		
		for(int i=1;i<a.length;i++){
			newSum=Math.max(newSum+a[i],a[i]);
			max=Math.max(max, newSum);
		}
		
		return max;
		
	}
	
	public static void main(String p[]){
		MaxSubarraySum obj=new MaxSubarraySum();
		
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(obj.maxSubArraySum(a));
	}
}
