
public class Person implements Printable{

	//creating instance variables
	private String name;
	private char sex; // 'm' or 'f'
	private int age;
	private int hairLength;
	
	//generate constructor on the instance variables created - get them by Source Constructors all fields
	public Person(String name, char sex, int age, int hairLength) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.hairLength = hairLength;
	}

	
	//get setters and getters to create methods - A method is what a class can do:
	//example a method can return a variable name, person sex, or age..
	//Notice that setter uses "void" bc it returns nothing; also Notice that setter add names of what you return in ();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHairLength() {
		return hairLength;
	}
	//what this extra method for ? to get the hair cut of this boy!
	public void setHairLength(int hairLength) {
		this.hairLength = hairLength;
	}
	
//	public int getHairCut(int inches) {
//	 return hairLength -= inches;
//	 
//	} alternatively use bellow what out how "void is introduced bc you are not returning anythin (not how much is left) 
	//you are only user input (how much you want cut off) so use void
	
	
	public void getHairCut(int inches) throws Exception {
		if ( inches <= hairLength) hairLength -=inches;
		else
			// System.out.println ("You goofball, you cant cut that much off!!!!"); 
			throw new Exception ("You goofball, you can't cut that much off!!!!");
		}
	
	
	
	//override USE source toString gives you options of what to choose and where to place them. AFTER you override, 
	//the hashcode "Welcome to Method Definion Demo App! Person@70dea4e bye!" disappears 
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", hairLength=" + hairLength + "]";
	}


	//this is generated to implements the Interface Printable
	@Override
	public String print() {
		return "Person print method: " + name+ " ; " + sex + "," + age ;
	}
	
	//after you override, you get this: Welcome to Method Definion Demo App!
	//Person [name=Breck, sex=m, age=8, hairLength=5]	bye!
}
