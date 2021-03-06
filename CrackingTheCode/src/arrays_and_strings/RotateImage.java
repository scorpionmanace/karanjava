package arrays_and_strings;

public class RotateImage {
	public static int[][] rotateImage(int[][]a){
		int b[][]=new int[a.length][a[0].length];
		int _n_length=a.length-1;
		for(int i=0;i<=_n_length;i++){
			for(int j=0;j<=_n_length;j++){
				b[i][j]=a[_n_length-j][i];
			}
		}
		return b;
	}
	
	public static void main(String p[]){
		int image[][]={{90,91,92,93},{10,11,12,13},{20,21,22,23},{30,31,32,33}};
		System.out.println("Original Image");
		for(int i=0;i<image.length;i++){
			for(int j=0;j<image[0].length;j++){
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
		
		int inverted[][] = rotateImage(image);
		System.out.println("Rotated Image");
		for(int i=0;i<inverted.length;i++){
			for(int j=0;j<inverted[0].length;j++){
				System.out.print(inverted[i][j]+" ");
			}
			System.out.println();
		}
	}
}
