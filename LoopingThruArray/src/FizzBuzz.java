import java.sql.Array;

public class FizzBuzz {

	 static String[] findNumber( int n) {
		    
		 String[] arr;
		 String[] resp;
		 String[] Fizz;
		 String[] Buzz;
		 String[] FizzBuzz;

		 for (int i=0; i<arr.length; i++){	
			 resp=arr[i];

			 if (i%3==0 && i%5==0){
				 resp= FizzBuzz; 
			 }
			 else if (i%3==0){
				 resp= Fizz; 
			 }
			 else if (i%5==0){
				 resp= Buzz;       
			 }
			 else {
				 resp =arr[i];
			 }
		 }   
		 return resp;
	 }
}
