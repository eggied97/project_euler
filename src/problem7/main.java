package problem7;

import utils.methods;

public class main {
	public static void main(String[] args) {
		//find 10 001th prime ( 2 = 1, 3 = 2, 5 = 3;)
		int lastPrime = 0;
		int primeCount = 0;
		int number = 0;
		
		boolean run = true;
		
		
		while(run){
			number += 1;
			
			if(methods.isPrime(number)){
				lastPrime = number;
				primeCount++;
			}
			
			if(primeCount == 10001){
				run = false;
				System.out.println(lastPrime);
			}
			
		}
	
		
	}

}
