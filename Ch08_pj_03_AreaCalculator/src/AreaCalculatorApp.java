
public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to AreaCalculatorApp!");

		
		String choice=("Y");
		while (choice.equalsIgnoreCase("y")) {
			// start by getting user input
			String csr= Console.getString("Calculate area of a Circle, Square or Rectangle? (c/s/r): " ); 
			if (csr.equalsIgnoreCase("c")) { //cant use getString str1, str2, 1ad str3, instead use getString with if's
				double r=Console.getDouble("Enter radius:  ");
				Circle c = new Circle(r); 
				double area=c.getArea();
				System.out.print("The area of the circle you entered " + "is " + area+ "\n" );
			} 
			else if  (csr.equalsIgnoreCase("s")) {
				double w=Console.getDouble("Enter width:  ");
				Square s = new Square(w);
				double area=s.getArea();
				System.out.print("The area of the square you entered " + "is " + area + "\n");
			}
			else if (csr.equalsIgnoreCase("r")) {
				double w=Console.getDouble("Enter width:  ");
				double h=Console.getDouble("Enter height:  ");
				Rectangle r = new Rectangle(w, h);
				double area=r.getArea();
				System.out.print("The area of the rectangle you entered " + "is " + area + "\n");
			}
			choice=Console.getString("Continue? (y/n)  " , "y", "n"); //this is already validated in Console, use getString that takes 3 arguments
			System.out.println();
			System.out.println("Bye!");
		}	
	}
}


