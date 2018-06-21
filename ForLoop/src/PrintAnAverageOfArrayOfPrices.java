
public class PrintAnAverageOfArrayOfPrices {

	public static void main(String[] args) {
		
		double [] prices= {14.25, 15.00, 17.19};
		
		for (int i=0; i<prices.length; i++) {
			
			int n=prices.length;
			double sum =0.0;
			sum = prices[i]++;
			
			double av= sum/n;
			// modulus % gives the remainder; while / divides
			System.out.println(av);
		}
		

	}

}
