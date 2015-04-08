package arrays_and_strings;

import java.util.Scanner;

public class Rotation_right_90 {
	public static void main(String p[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array double");
		int n=in.nextInt();
		long a[][]=new long[n][n];
		long b[][]=new long[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Rotated Array Now: ");
		for(int i=0;i<n;i++){
			int k=n-1;
			for(int j=0;j<n;j++){
				b[i][j]=a[k-j][i];
						System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
