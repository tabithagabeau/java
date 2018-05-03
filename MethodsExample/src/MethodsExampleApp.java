
public class MethodsExampleApp {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		System.out.println(multiply(a, b));
	}
	
	private static int multiply(int integer1, int integer2) {
		int result = integer1*integer2;
		return result;
	}
}