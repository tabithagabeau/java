import java.util.Scanner;

public class LoopThroughArray {
//	Task:
//	Reads an integer from stdin and saves it to a variable, n , denoting some number of integers.
//	Reads n integers corresponding to a0, a1, a2, ..., an-1 from stdin and saves each integer ai to val variable, .
//	Attempts to print each element of an array of integers named a.
	
		public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        
        int n=0;
        int [] a= new int [n];
        //loop thru an array
        for (int i=0; i<a.length; i++) {
        	
        	a[i] = val;
        }	
      

     // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
           
        }
         System.out.println("Bye!");
         sc.close();
        }
        
	}
