import consolehelper.util.Console;

public class ConsoleHelperDemoApp {

	public static void main(String[] args) {
		System.out.println("hello");
		String str = Console.getString("Enter some text: ");
				System.out.println("you entered: "+str);
		
		
		
		System.out.println("bye");

	}

}
