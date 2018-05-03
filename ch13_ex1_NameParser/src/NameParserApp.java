

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
// see page 427 how to parse first and last name
        System.out.print("Enter a name: ");    
        String name = sc.nextLine(); 
        name = name.trim(); // 2- this add a method separate the name into 2 or 3 only no spaces
        int index1 = name.indexOf(" "); // 3-display each word on separate line and this example is on page 427
        // 4-the line displays error message
        if (index1 == -1) {
            System.out.println("Name not in valid format.");
        }
        else { // 4 use example on page 427 how to store parts on name in an array
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1) {
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name:  " + firstName);
                System.out.println("Last name:   " + lastName);                
            }
            else {
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                
                    System.out.println("First name:   " + firstName);
                    System.out.println("Middle name:  " + middleName);
                    System.out.println("Last name:    " + lastName);                                    
                }
                else {
                    System.out.println("Name not in valid format.");
                }
            }
        }
        
        System.out.println();
        
    }
}
