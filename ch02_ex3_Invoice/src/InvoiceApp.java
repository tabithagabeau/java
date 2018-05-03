import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice is equal to "y" or "Y" (page 47)
        
        int numInvoices=0;
        double totalInvoiceAmount = 0.0;
        double totalDiscountAmount=0.0;
        double total=0;
        
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
        	
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            }
            else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            total = subtotal - discountAmount;
            
            totalDiscountAmount += discountAmount;
            totalInvoiceAmount += total;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n"
                           + "Number of Invoices:    " + total + "\n"
                           + "Average Invoice amount:    " + total + "\n";
            
            numInvoices=numInvoices+1;
            
            System.out.println(message);
            
            
            
         /* display the Invoice Totals, invoice and discount average 
            String messageInvoice = "Number of Invoices:    " + total + "\n"
                           + "Average Invoice amount:    " + total + "\n"
                           + "Average Discount amount:    " + total + "\n" ;            
            System.out.println(message);
            */
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        // add this after the while loop bc instructions says so ,this is where the program ends
        double avgInvAmount = totalInvoiceAmount / numInvoices;
        double avgDicAmount = totalDiscountAmount / numInvoices;
        
        String summaryMessage = "Number of Invoices:    " + total + "\n"
                + "Average Invoice amount:    " + total + "\n"
                + "Average Discount amount:    " + total + "\n" ; 
    }
}