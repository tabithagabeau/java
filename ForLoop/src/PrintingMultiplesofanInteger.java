import java.util.Scanner;

public class PrintingMultiplesofanInteger {

	public static void main(String[] args) {
		//Given an integer, n, print its first  multiples. 
		//Each multiple n*i (where 1<=i<=10) and 2<=n<=20 
		//printed result on a new line in the form: n x i = result.
		
	System.out.println("Welcome to the PrintingMultiplesofanInteger App");
	System.out.println("Enter a number between 1 and 21: ");
	
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int res = 0;
	
	if (2<=n && n<=20) {
	for (int i=1; i<11; i++) {
		res=n*i;
		System.out.println(n + " x " + i + " = " +res);
//		System.out.printf("%d x %d = %d\n", n, i, n*i);
//		%d = int, hence the above-line is translated: int n *int i=int res (int n, int i, and res=n*i)
	}
	}
	else{
		System.out.println("Oops! the number you entered is outside of range! ");
	
	}
	sc.close();
	System.out.println("Bye for now!");
		
	}
}

	
