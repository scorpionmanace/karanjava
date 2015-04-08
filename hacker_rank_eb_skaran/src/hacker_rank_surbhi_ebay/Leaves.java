package hacker_rank_surbhi_ebay;

import java.util.ArrayList;

public class Leaves {
	public static int easyLeaves(int A[], int N) {

		ArrayList newCatterPillars = new ArrayList();
		newCatterPillars.add(new Integer(A[0]));
		for (int i = 1; i < A.length; i++) {
			boolean isEnable = false;
			for (int j = 0; j < newCatterPillars.size(); j++) {
			
				int dividend = ((Integer)newCatterPillars.get(j)).intValue();
				if (A[i] % dividend == 0) {
					isEnable = true;
					break;
				}
			}

			if (!isEnable) {
				newCatterPillars.add(new Integer(A[i]));
			}
		}

		int survivedLeaves = 0;
		for (int m = 1; m <= N; m++) {
			for (int j = 0; j < newCatterPillars.size(); j++) {
				int dividend = ((Integer)newCatterPillars.get(j)).intValue();
				if (m % dividend == 0) {
					survivedLeaves++;
					break;
				}
			}
		}

		return N-survivedLeaves;
	}
	
	public static void main(String args[]){
		int A[] = {2,4,5};
		System.out.println(easyLeaves(A, 10));
	}
}
