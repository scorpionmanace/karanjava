package snippet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snippet {
	
	public int processStringsAndFindMinimumStringMoves(String a, String b){
		if(a.length()<1 || b.length()<1 || a.length()>2000 || b.length()>2000 || a.length() != b.length()){
			return -1;
		}
		return findMinimumStringMovement(a, b);
	}
	private int findMinimumStringMovement(String a, String b) {
	    int moves = 0;
	    char[] _a_char = a.toCharArray();
	    char[] _b_char = b.toCharArray();
	    char cChar;
	
	    if (_a_char != _b_char) {
	        for (int i = 0; i < _a_char.length; i++) {
	            for (int j = i + 1; j < _a_char.length; j++) {
	                if (_a_char[i] != _b_char[i]) {
	                    /*
	                     * It checks if some character from the array of _a_char
	                     * is same as other character from the array of B and if
	                     * it's j less then the length of the array. If it's
	                     * true, then swap the characters and count moves
	                     */
	                    if (_a_char[j] == _b_char[i] && j < _a_char.length) {
	                        for (int k = j; k > i; k--) {
	                            cChar = _a_char[k];
	                            _a_char[k] = _a_char[k - 1];
	                            _a_char[k - 1] = cChar;
	                            moves++;
	                        }
	                        
	                    } else if (_a_char[_a_char.length - 1] == _b_char[i]) {
	                        if (i == 0) {
	                            cChar = _a_char[_a_char.length - 1];
	                            _a_char[_a_char.length - 1] = _a_char[i];
	                            _a_char[i] = cChar;
	                            moves++;
	                        } else if (i < (_a_char.length - 1) / 2) {
	                            for (int k = i; k > 0; k--) {
	                                cChar = _a_char[k];
	                                _a_char[k] = _a_char[k - 1];
	                                _a_char[k - 1] = cChar;
	                                moves++;
	                            }
	                            cChar = _a_char[i];
	                            _a_char[i] = _a_char[_a_char.length - 1];
	                            _a_char[_a_char.length - 1] = cChar;
	                        }
	                    } else if (_b_char[_b_char.length - 1] == _a_char[i]) {
	                        if (i == 0) {
	                            cChar = _b_char[_b_char.length - 1];
	                            _b_char[_b_char.length - 1] = _b_char[i];
	                            _b_char[i] = cChar;
	                            moves++;
	                        } else if (i < (_a_char.length - 1) / 2) {
	                            for (int k = i; k > 0; k--) {
	                                cChar = _a_char[k];
	                                _a_char[k] = _a_char[k - 1];
	                                _a_char[k - 1] = cChar;
	                                moves++;
	                            }
	                            cChar = _a_char[i];
	                            _a_char[i] = _a_char[_a_char.length - 1];
	                            _a_char[_a_char.length - 1] = cChar;
	                            moves++;
	                        }
	                        /*
	                         * And the last case is if there is no other option,
	                         * then we asks if some characters in array with
	                         * positions i and j are different and if the j
	                         * value is less then length of the array and do the
	                         * swap.
	                         */
	                    } else {
	                        if (_a_char[j] != _a_char[i] && j < _a_char.length) {
	                            if (_a_char[j] == _b_char[j]) {
	                                cChar = _b_char[j];
	                                _b_char[j] = _b_char[i];
	                                _b_char[i] = cChar;
	                                moves++;
	                            }
	                            cChar = _a_char[j];
	                            _a_char[j] = _a_char[i];
	                            _a_char[i] = cChar;
	                            moves++;
	                        } else if (_b_char[j] != _b_char[i] && j < _a_char.length) {
	                            if (_a_char[j] == _b_char[j]
	                                    && _a_char[j] != _a_char[i]) {
	                                cChar = _a_char[j];
	                                _a_char[j] = _a_char[i];
	                                _a_char[i] = cChar;
	                                moves++;
	                            }
	                            cChar = _b_char[j];
	                            _b_char[j] = _b_char[i];
	                            _b_char[i] = cChar;
	                            moves++;
	                        }
	                    }
	                    /*
	                     * At the end, if arrays are equal, then it is done.
	                     */
	                    if (_a_char == _b_char) {
	                        break;
	                    }
	                }
	            }
	        }
	    }
	    return moves;
	}

	public static void main(String p[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Fitst String");
		String str_a=br.readLine();
		
		System.out.println("Enter Second String");
		String str_b=br.readLine();
		
		Snippet obj=new Snippet();
		
		System.out.println("Minimum Moves Required: "+obj.processStringsAndFindMinimumStringMoves(str_a, str_b));
	}
}

