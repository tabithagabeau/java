import java.util.Scanner;

public class FindElementsInAnArrayInReverseOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=n-1; i>=0; i--) {	
			System.out.println(arr[i]+" ");
		}
		
		//example with a given arr1;
		int arr1[]= {1,2,3,4,5,6};
		
		for (int i=arr1.length-1; i>=0; i-- ) {
				System.out.println(arr1[i]);
		}

		sc.close();
	}

}
