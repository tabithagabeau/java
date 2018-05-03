
public class Employee  extends Person{
private String Ssn;

public Employee(String firstName, String lastName, String ssn) {
	super(firstName, lastName);
	Ssn = ssn;
}

public String getSsn() {
	return Ssn;
}

public void setSsn(String ssn) {
	Ssn = ssn;
}

}
