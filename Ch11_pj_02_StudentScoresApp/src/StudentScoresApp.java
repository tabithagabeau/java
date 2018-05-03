import java.util.Arrays;

public class StudentScoresApp {

	public static void main(String[] args) {
		// TODO this is  where you call upon Students class and 
		//also create an array that sort students see page 367
		
		Students [] Student = new Students[3];
		Student[0] = new Students("Murach", "Mike", 99);
		Student[1] = new Students("Murach", "Joel", 87);
		Student[2] = new Students("Bohen", "Anne", 93);
        Arrays.sort(Student);
        for (Students s : Student) {
            System.out.println( s.getStudentLastName() + " " + s.getStudentFirstName() + " " + s.getScore());
        }
	}
}