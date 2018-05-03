
public class ArrayDemo {
	public static void main(String[] args) {
		System.out.println ("hello");
		
		//see page 359	
		int [] values = new int[10];
		
		// populate array
		for ( int i=0; i < values.length; i++) {
			values [i] = i;
		}		
		
		// display all elements of array
				for (int i = 0; i < values.length; i++) {
					System.out.println(values[i]);
				}
				
				double[] prices = {14.95, 11.11, 12.50, 5.75, 498.0 };
				for (double p : prices) {
					System.out.println(p);
				}
//				for (int i = 0; i < prices.length; i++) {
//					System.out.println(prices[i]);
//				}
			System.out.println("bye");
			}

	
}
