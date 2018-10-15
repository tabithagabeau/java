
public class PrintAnAverageOfAnArray {

	 public static void main (String[] args) {
		
		int [] numbers = {15, 25, 35};
		int sum = 0;
		double average=0.0;
		
	for (int i=0; i<numbers.length; i++) {
		sum= sum + numbers[i]++;
		int n = numbers.length;
		
		average = sum/n;
		
		System.out.println(average);
	}

	}
}
