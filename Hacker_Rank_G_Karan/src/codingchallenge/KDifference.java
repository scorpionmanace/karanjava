package codingchallenge;

import java.util.HashSet;
import java.util.Scanner;

public class KDifference {

	public static void main(String args[]) {
//		int _elements[] = { 1, 3, 4, 5, 8, 8 };
		
//		int _diff_k = 2;

		int _num_pairs = 0;
		Scanner in = new Scanner(System.in);
		String _line1[]=in.nextLine().split(" ");
		String _line2[]=in.nextLine().split(" ");
		
		int _inputs[]=new int[_line1.length];
		int _elements[]=new int[_line2.length];
		for(int i=0;i<_line2.length;i++){
			if(i<2){
				_inputs[i]=Integer.parseInt(_line1[i]);
			}
			_elements[i]=Integer.parseInt(_line2[i]);
		}
		
		int _diff_k=_inputs[1];
//		&& elements.length == elements.length) {
		if (_elements.length > 1 && _diff_k > 0){


			HashSet<Integer> hSet = new HashSet<Integer>();

			for (int i = 0; i < _elements.length; i++) {
//				int inputElement = elements[i];
				if (!hSet.contains(_elements[i])) {
					hSet.add(_elements[i]);
				}
			}

			// Iterator<Integer> itSet = hSet.iterator();

			for (Integer _hSet_value : hSet) {
				int _resultant_value = _hSet_value + _diff_k;
				if (hSet.contains(new Integer(_resultant_value))) {
					System.out.println("Pair found : (" + _hSet_value +" , "
							+ _resultant_value + ")");
					_num_pairs++;
				}
			}
		} else {
			_num_pairs = 0;
		}

		// while (itSet.hasNext()) {
		//
		// Integer value = itSet.next();
		// Integer subtractValue = value+kDiff;
		//
		// if(hSet.contains(subtractValue)){
		// System.out.println("Pair Found:"+value+" & "+subtractValue);
		// pairCount++;
		// }
		// }

		System.out.println("Total Pairs:" + _num_pairs);
		in.close();
	}

}
