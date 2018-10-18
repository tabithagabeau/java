
public class MyConsole extends Console {

	public MyConsole() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getString(String prompt) {
		  String s = "";
	        boolean isValid = false;
	        while (!isValid) {
	            System.out.print(prompt);
	            if (s.equals("")) {
	                System.out.println("Error! This entry is required. Try again.");
	            } else {
	                isValid = true;
	            }
	        }
	        return s;
	}
}
