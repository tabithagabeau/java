import java.sql.Array;

public class FindTheNumber {

	 static String findNumber(int[] arr, int k) {
		    
	       String sol=" ";
	        
		        for (int i=0; i<arr.length; i++){
	                
		            if (arr[i]==k){
	               sol= "NO";
		               // System.out.println("YES");
		            }
		            else {
	                  sol="YES";
		               //System.out.println("No");
		            }
		        }   
		   return sol;
		    }
}


//		static int[] findNumber(int[] arr, int k) {	
//	
//			k=5;
//			
//	        int n =0;
//	        for (int i=0; i<arr.length; i++){
//	            arr[i]=n; 
//	    
//	            if (n==k){
//	                System.out.println("YES");
//	            }
//	            else {
//	               System.out.println("No");
//	            }
//	        }   
//	    return arr;
//	    }
//	}