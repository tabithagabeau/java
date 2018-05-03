
public class Students implements Comparable {
	// initialize variables fields to private
	private String studentLastName;
	private String studentFirstName;
	private int score=0;
	
	//constructors
	public Students() {
		//this is an empty constructor we always need it,then get constructors for your fields above
	}

	public Students(String studentLastName, String studentFirstName, int score) {
		super();
		this.studentLastName = studentLastName;
		this.studentFirstName = studentFirstName;
		this.score = score;
	}

	//Getters/Setters methods 
	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//see page 367 /pg 366 use CompareTo CompareToIgnore case last paragraph of page 366 see ex 11.3	
	public int compareTo(Object o) {
		Students s= (Students) o;;
		int Response= this.getStudentLastName().compareToIgnoreCase(s.getStudentLastName());
			if (Response < 0) {
				return -1;
			}
			if (Response > 0) {
				return 1;
			}
			return 0;
		}
	}
	
