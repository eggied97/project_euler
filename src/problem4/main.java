package problem4;

import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		//largest palindrome of multiplying 3 digits numbers.
		
		
		ArrayList<Integer> palins = new ArrayList<Integer>();
		
		for(int i = 999; i >= 1; i-- ){
			for(int j = 999; j >= 1; j--){
			
				
				String value = String.valueOf(i*j);
				
				switch (value.length()) {
				case 6:
					
					if(value.charAt(0) == value.charAt(5) && value.charAt(1) == value.charAt(4) && value.charAt(2) == value.charAt(3)){
						//palindrome
						palins.add(i*j);
					}
					
					break;
				case 5:
					
					if(value.charAt(0) == value.charAt(4) && value.charAt(1) == value.charAt(3)){
						//palindrome
						palins.add(i*j);
					}
					
					break;

				default:
					break;
				}
			}
		}

		Collections.sort(palins);
		
		for (Integer integer : palins) {
			System.out.println(integer);
		}
		
	}

}
