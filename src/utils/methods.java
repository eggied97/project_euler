package utils;

public class methods {

	public static int getFib(int term){
		
		final int term0 = 1;
		final int term1 = 1;
		
		if(term == 0){
			return term0;
		}
		
		if(term == 1){
			return term1;
		}
		
		return getFib(term -1) + getFib(term - 2);
		
	}
	
	public static boolean isPrime(long a){
		long x;
		boolean result = false;
		
		
		if(a == 2){
			return true;
		}
		
		
		for (x = 2; x < a; x++){
			if (a % x == 0){
				result = false;
				x = a;
			}else{ result = true; }
		}
		return result;
	}
	
}
