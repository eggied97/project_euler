package problem5;

public class main {

	public static void main(String[] args) {
		boolean run = true;
		
		int number = 0;
		
		while(run){
			number += 1;
			
			run = !checkNumber(number);			
			
		}
		
		System.out.println(number);

	}
	
	public static boolean checkNumber(int number){
		for(int i = 1; i <=20; i++){
			if(number % i != 0){
				return false;
			}
		}
		
		return true;
		
	}

}
