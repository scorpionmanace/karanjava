package code_golf;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Trignometic_Ratios {
//	 static Map<Integer, Integer> f = new HashMap<Integer, Integer>();

		public static void main(String args[]) {
			Scanner o = new Scanner(System.in);
			int n=Integer.parseInt(o.nextLine());
			float t[]=new float[n];
			for(int i=0;i<n;i++){
				t[i]=Float.parseFloat(o.nextLine());
			}
			
//			f.put(1, 1);
//			for (int i = 2; i < 10; i++) f.put(new Integer(i), i*f.get(i-1));
			
			DecimalFormat _ = new DecimalFormat("#0.000");
	        
			for (int i = 0; i < n; i++){
//	            double x9 = Math.pow(t[i], 9), x3 = t[i]*t[i]*t[i], s = t[i] - x3 / f.get(3) + (x9/(x3*t[i]))
//					/ f.get(5) - (x9/(t[i]*t[i])) / f.get(7) + x9
//					/ f.get(9);
//	            double x4 = t[i]*t[i]*t[i]*t[i], c = 1 - (t[i]*t[i]) / f.get(2) + x4
//					/ f.get(4) - (x4*t[i]*t[i]) / f.get(6) + (x4*x4)
//					/ f.get(8);
	            double s=6.70-(t[i]*t[i]);
				System.out.println(_.format(s)+"\n"+_.format(1-(s*s)));
	        }
			o.close();
		}
		

}
