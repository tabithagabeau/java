
public  class Students2 implements Comparable {

	private String fName;
	private String lName;
	private int score=0;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Students2(String lName, String fName, int score) {
		super();
		this.lName = lName;
		this.fName = fName;
		this.score = score;
	}
	
	public int compareTo(Object o) {
		Students2 s= (Students2) o;
		int Resp= this.getlName().compareToIgnoreCase(s.getlName());
		if (Resp < 0) {
			return -1;
		}
		if (Resp > 0) {
			return 1;
		}
		else {
		return 0;
		}
	}
	
		
}
