package Ball;

public class Ball implements Comparable {
	//color and ize will not be validated, but assumed valid values are: 
	//-color: black, red, blue, and green
	//-sizes: S, M, and L
	private String color;
	private String size;
	
	public Ball(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public Ball() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", size=" + size + "]";
	}
	

	@Override
	public int compareTo(Object arg0) {
		Ball b2= (Ball)arg0;
		return color.compareTo(b2.getColor());
	}
	

}

