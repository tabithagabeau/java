
public class FindSumInAnArray {

	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50} ;
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){ 
		    sum = sum+ array[i]; 
		} 
		//return sum;
		System.out.println("The sum is " + sum);
	}

}


//public class FindSumInAnArray {
//
//	public static int main(String[] args) {
//		
//		int [] array = new int [10] ;
//		int sum = 0;
//		
//		for(int i = 0; i < array.length; i++){ 
//		    sum = sum+ array[i]; 
//		} 
//		return sum;
//	
//	}
//
//}