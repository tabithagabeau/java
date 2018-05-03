
public class MyConsole extends Console {

	public MyConsole() {
		super(); // call constructor of superclass
	}
	
	
	@Override
    public  String getString(String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s=super.getString(prompt);
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
}
