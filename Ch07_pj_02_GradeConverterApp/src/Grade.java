import java.text.NumberFormat;
import java.util.Scanner;

public class Grade {
	
	private int number; //initialize it 
     
	public Grade() {
      int number=0;
	}
    
  // public Grade(int nunber) {
   //   this.number=number;
 //   } alternatively, it is easy to ready the below but are the same
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Grade(int n) {
	number=n;
		   }
  // outwards bound (greater than 100, less than zero) are not tested here bc we assume it is done in the console class
 
		
		public String getLetter() {
			
		    String letterGrade =" "; //declare your output letter grade variable 
		   
		    if (number <60) {
				letterGrade = "F";	
			}
			else if (number <=67) {
				letterGrade = "D";	
			}
			else if (number <=79) {
				letterGrade = "C";	
			}
		else if (number <=87) {
			letterGrade = "B";	
			
			}
		else if (number<=100) {
				letterGrade = "A";	
			}  
	   
		 return letterGrade;
		
		/*or alternatively go from top down
		 if (number >=88) {
				letterGrade = "A";	
			}
			else if (number >=80{
				letterGrade = "B";	
			}
			else if (number >=80) {
				letterGrade = "C";	
			}
		else if (number >=60
			letterGrade = "D";	
			
			}
		else if (number<60 {
				letterGrade = "F";	
			}  
		  
		 */
		} 
}

