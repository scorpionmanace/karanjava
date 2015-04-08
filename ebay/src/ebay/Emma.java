package ebay;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Emma {
public static void main(String p[]){
	
	Scanner in = new Scanner(System.in);
    int testCount = Integer.parseInt(in.nextLine());
    
    
    ArrayList<String> testCasesList = new ArrayList<String>();
    int i = 0;
    while(i<testCount){
   	 testCasesList.add(in.nextLine());
   	 i++;
    }
    
    for(int j=0;j<testCasesList.size();j++){
   	 String testCaseStr = testCasesList.get(i);
   	 StringTokenizer tkn=new StringTokenizer(testCaseStr);
   	 String limit[] = testCaseStr.split(" ");
   	 
   	 
   	 int startInt = (int)Math.ceil(Math.sqrt(Integer.parseInt(limit[0])));;
   	 int endInt = (int)Math.floor(Math.sqrt(Integer.parseInt(limit[1])));
   	 System.out.println(endInt-startInt+1);
    }
    
    in.close();
}
}
