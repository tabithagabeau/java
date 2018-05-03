
public class Friend {
	
	//create instance variables remember private
	private String name;
	private String race; // 'b', 'w', 's', 'o'
	private char sex; // 'm' or 'f'
	private int age;
	
	//initialize variables using source and constructors fields
	public Friend(String name, String race, char sex, int age) {
		super();
		this.name = name;
		this.race = race;
		this.sex = sex;
		this.age = age;
	}

	//Get methods using source getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
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

	@Override
	public String toString() {
		return "Friend [name=" + name + ", race=" + race + ", sex=" + sex + ", age=" + age + " ]";
	}
	
	
	
//do biz logic
	
	
	
}

