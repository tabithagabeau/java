
public class InheritanceDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Product jakesBook = new Product("java", "Murach's Java", 54.50);
		Product chrissBook = new Product("java", "Murach's Java", 54.50);
		
		System.out.println(jakesBook.hashCode());
		System.out.println(chrissBook.getClass());
		System.out.println(jakesBook);
		
		System.out.println("Bye");
	}

}
