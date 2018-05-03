
public class Sheep extends Animal implements Cloneable {

	private String name ;

	public Sheep(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		return count + " "+ name;
	}
	
	//implement the clonable interface see pg 317
	@Override
	public Object clone () throws CloneNotSupportedException {
		return super.clone();
	}

}
