package ebay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class perfectSquareCount {

	public int countIntegerSquare(int num1, int num2) {
		int count = 0;
		int num = num1, _num_last = num2;
		if (num1 < 0 && num2 < 0) {
			return count;
		}
		if (num1 < 0 && num1 < num2) {
			num1 = 1;
			num = num1;
			_num_last = num2;
		}
		if (num2 < 0 && num2 < num1) {
			num2 = 1;
			num = num2;
			_num_last = num1;
		}
		
		count=(int)Math.floor((new Double(Math.sqrt(_num_last)-Math.sqrt(num))).intValue())+1;

		return count;
	}

	public static void main(String p[]) throws IOException {
		perfectSquareCount obj = new perfectSquareCount();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num_test_case = Integer.parseInt(br.readLine());
		int output[] = new int[num_test_case];
		if (num_test_case > 0) {
			
			String str_numbers;
			for (int i = 0; i < num_test_case; i++) {
				str_numbers = br.readLine();
				String nums[] = str_numbers.split(" ");
				output[i] = obj.countIntegerSquare(Integer.parseInt(nums[0]),
						Integer.parseInt(nums[1]));
			}
		}
		
		for(int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}
}
