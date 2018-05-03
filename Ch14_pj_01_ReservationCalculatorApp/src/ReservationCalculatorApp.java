import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ReservationCalculatorApp {



	public static void main(String[] args) {
		System.out.println("Welcome to the Reservation App!");


		String choice=("Y");
		while (choice.equalsIgnoreCase("y")) {

			// Create user input and instance variables/calling on methods of Reservation Class
			String ard=Console.getString("Enter the arrival date(YYYY-MM-DD):  ");
			Reservation r= new Reservation();
			r.setArrivalDate(LocalDate.parse(ard)); //parse the user input String date into (YYYY/MM/DD) format
			ard=Reservation.getArrivalDateFormatted(); //use the formated date

			String dpd=Console.getString("Enter the departure date(YYYY-MM-DD):  ");
			r.setDepartureDate(LocalDate.parse(dpd));
			dpd=Reservation.getDepartureDateFormatted();

			//get the biz logic methods from Reservation class
			int numNights=Reservation.getnumNights();
			//get the formated nightlyRate and totalPrice;Formatted to String otherwise should be double
			String nightlyRate=Reservation.getNightlyRateFormatted(); //use formatted currency
			String totalPrice=Reservation.getTotalPriceFormatted(); 
		


			System.out.println("Arrival Date: " + ard + "\n" + "Departure Date: " + dpd+ "\n" + 
					"Nightly Rate: " + nightlyRate  + " per night"+ "\n" +
					"Total Price: " + totalPrice + "  for  " + numNights + "  nights" ); 

			choice=Console.getString("Continue? (y/n)  " , "y", "n"); 
			System.out.println();
			System.out.println("Bye!");
		}	
	}

}
