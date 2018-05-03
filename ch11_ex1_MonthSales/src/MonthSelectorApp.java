import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String [] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] monthSales = {1234.45, 1123.76, 1001.45, 9874.35, 7654.12, 4567.65, 3451.14, 8945.23, 3452.12, 7845.24};

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");  
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }

          //   get the index number for the month
            int monthIndex = monthNumber - 1;
          //   and display the month name and sales            
            Console.displayLine("Sales for" + " " + monthName[monthIndex] + ":" 
             + " " + currency.format(monthSales[monthIndex]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double sum = 0.0;
//        for (int i=0; i<monthSales.length; i++) {
//        	sum+=monthSales[i];
//        }
        for (double sales : monthSales) {
            sum += sales;
        }
        Console.displayLine("Total sales: " + currency.format(sum));
        Console.displayLine();
    }    

}
