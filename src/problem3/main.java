package problem3;

import java.math.BigInteger;
import java.util.ArrayList;
import utils.*;


public class main {

	public static void main(String[] args) {
		
		long numm = 600851475143L;
		
		
		
		for(long i = 2; i < numm; i++){
			if(methods.isPrime(i)){
				if(numm % i ==0){					
					System.out.println(i);
				}
			}
		}
		
	}
	
	

}
