
public class FizzBuzzMultiplesOf3and5 {

	 static String findNumber( int n) {
		    
		 String[] arr = new String [n];
		 String resp = "";
		 String Fizz = "";
		 String Buzz = "";
		 String FizzBuzz = "";
		 n=5;
		 
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