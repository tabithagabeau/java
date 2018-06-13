
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
	
	
	public static class OddNumbers {
		
		 static int[] oddNumbers(int l, int r) {
			 
			 int arraySize;
			 if (l%2==1 && r%2==1){
			arraySize=(r-l+2)/2;
			 }
			 else {
				 arraySize=(r-l+1)/2;
				 }
			 
			int [] arr = new int [arraySize];
			
			if (l%2==1); {
			for (int i=1; i<arr.length; i++) {
				
				arr[i]=l+2;
			}
				
			return arr;	 

		    }
	}
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[] res = oddNumbers(l, r);

        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
}
