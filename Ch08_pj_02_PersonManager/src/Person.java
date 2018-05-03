
public class Person {
	
private String firstName;
private String lastName;

public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

//use Source shortcut to override same as you used constructor and getter and setters
@Override
public String toString() {
String msg="Name: " + firstName + " " + lastName;
	return msg;
}


}
