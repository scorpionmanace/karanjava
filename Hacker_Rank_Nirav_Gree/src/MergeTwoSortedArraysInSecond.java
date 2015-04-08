public class MergeTwoSortedArraysInSecond {
	public static void mergeInOther(int a[], int b[], int m) {
		if (m < 10 || m > 1000) {
			return;
		}
		if (b[(b.length) / 2] > 0) {
			return;
		}
		// int end_index_of_b = 2 * m - 1;
		// int high_index_a = a.length - 1, high_index_b = (b.length)/2 - 1;
		//
		// while (high_index_a >= 0) {
		// if ( a[high_index_a] > b[high_index_b]) {
		// b[end_index_of_b] = a[high_index_a];
		// high_index_a--;
		// } else {
		// b[end_index_of_b] = b[high_index_b];
		// high_index_b--;
		// }
		// end_index_of_b--;
		// }
		for (int i = m; i <= 2 * m - 1; i++) {
			b[i] = b[i - m];
			 
		}
		for(int i=0;i<2*m;i++){
			System.out.print(b[i]+" ");
		}
		 System.out.println();
		int start_index_of_b = 0;
		int low_index_of_a = 0;
		int low_index_of_b = m;

		while (low_index_of_a < m) {
			if (low_index_of_b > m-1 || a[low_index_of_a] <= b[low_index_of_b]) {
				b[start_index_of_b] = b[low_index_of_b];
				low_index_of_a++;
			} else {
				b[start_index_of_b] = a[low_index_of_a];
				low_index_of_b++;
			}
			start_index_of_b++;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " , ");
		}
	}

	public static void main(String p[]) {
		int[] a = { 30, 32, 34, 36, 38, 40, 42, 44, 46, 48 };
		int size = a.length;
		int b[] = new int[2 * size];
		b[0] = -100;
		b[1] = 0;
		b[2] = 5;
		b[3] = 6;
		b[4] = 8;
		b[5] = 22;
		b[6] = 24;
		b[7] = 27;
		b[8] = 28;
		b[9] = 100;
		// b[10]=51;
		// b[11]=98;
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(b[i]+ " , ");
		// }

		mergeInOther(a, b, size);
	}
}
