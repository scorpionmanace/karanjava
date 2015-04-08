package hacker_rank_surbhi_ebay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Emma {
	public static void main(String p[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
    int testCount = Integer.parseInt(br.readLine());
    
    String[] _test_case_list=new String[testCount];
    int i = 0;
    while(i<testCount){
    	_test_case_list[i] = br.readLine();
   	 i++;
    }
    
    for(int j=0;j<_test_case_list.length;j++){
   	 String testCaseStr = _test_case_list[j];
   	 StringTokenizer st = new StringTokenizer(testCaseStr);
   	 int startNumber = Integer.parseInt(st.nextToken());
   	 int endNumber = Integer.parseInt(st.nextToken());
   	 
   	 int index_first = (int)Math.ceil(Math.sqrt(startNumber));;
   	 int index_last = (int)Math.floor(Math.sqrt(endNumber));
   	 
   	 int _final_result = index_last  - index_first +1;
   	 System.out.println(_final_result);
    }
    
	}
}
