package problem6;

public class main {

	public static void main(String[] args) {
		//1. first sum of 1-100 squared
		//2. sum 1-100, then square
		//get difference
		
		int sumOfSquared = 0;
		int sumNotSquared = 0;
		int sumNotSquaredSquared = 0;
		int delta = 0;
		
		for(int i = 1; i <=100; i++){
			sumNotSquared += i;
			
			sumOfSquared += (i*i);
		}
		
		sumNotSquaredSquared = sumNotSquared * sumNotSquared;
		
		delta = sumNotSquaredSquared - sumOfSquared;

		System.out.println(delta);
		
	}

}
