
public class Square  extends Shape {
	
	double width;
	double area;
	
	public Square() {
		super();
	}

	
	public Square(double width) {
		super();
		this.width = width;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return area=width*width;
	}


}
