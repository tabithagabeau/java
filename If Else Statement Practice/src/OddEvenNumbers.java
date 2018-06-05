	import java.io.*;
	import java.util.Scanner;
//		import java.math.*;
//		import java.security.*;
//		import java.text.*;
//		import java.util.*;
//		import java.util.concurrent.*;
//		import java.util.regex.*;

public class OddEvenNumbers {

//		Given an integer, n, perform the following conditional actions:
//			If n is odd, print Weird
//			If n is even and in the inclusive range of  2 to 5, print Not Weird
//			If n is even and in the inclusive range of  6 to 20, print Weird
//			If n is even and greater than 20 , print Not Weird
//	Constraints
// 1<= n <=100


		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        
		        int n = scanner.nextInt();
		
		       
//		         
		            
		        if (n%2 ==1 || (n>=6 && n<=20) ) {
		            System.out.println("Weird");
		        }
		        else if (n<=100) {
		            System.out.println("Not Weird");
		        }
		        
		       else { //outside of Constraints
		    	   System.out.println("Undefined");
		       }
		     };
		}
		



