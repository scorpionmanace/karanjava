package arrays_and_strings;

public class MaxPaths {
	static int numberOfPaths(int [][]a,int M,int N){
		int i=a.length;
		int j=a[0].length;
		if(M==0 && N==0)
            return a[M][N];
        else if (M==0)
            return a[M][N-1];
        else if (N==0)
            return a[M-1][N];
        else if(a[M][N]==1)
            return (int) ((numberOfPaths(a,M-1,N) + numberOfPaths(a,M,N-1)) % (Math.pow(10, 9)+7));
        else
            return 0;
	}
	
	
	public static void main(String p[]){
//		int a[][]={ {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
		int a[][]={{1,1},{0,1}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println(numberOfPaths(a,1,1));
	}
}
