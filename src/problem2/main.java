package problem2;

import utils.methods;

public class main {
	
	final static int max = 4000000;
	static int sum = 0;
	static int lastAwnser = 0;
	
	public static void main(String[] args) {
		for(int term = 0; lastAwnser < max; term++){
			int fib = methods.getFib(term);
			
			if(fib < max){
				if(fib % 2 == 0){
					sum += fib;
				}
			}
			
			lastAwnser = fib;
			
		}
		
		System.out.println(sum+"");
	}
	
	
}
