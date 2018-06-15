import java.lang.reflect.Array;
import java.util.Arrays;

public class Students2Score {

	public static void main(String[] args) {
		
	
		Students2 [] student2 = new Students2 [4];
		
		student2[0] = new Students2 ("Muhire", "Marie", 98);
		student2[1] = new Students2 ("Zebraman", "Claude", 88);
		student2[2] = new Students2 ("Hahirwa", "Aimee", 98);
		student2[3] = new Students2 ("Higiro", "Annick", 70);
			
		Arrays.sort(student2);

		for (Students2 s: student2) {
			System.out.println(s.getlName()+" " + s.getfName() + " " + s.getScore());
			
		}

	}

}
