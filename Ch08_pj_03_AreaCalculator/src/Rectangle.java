
public class Rectangle  extends Square{

	double width;
	double height;
	double area;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return area= width * height;
	}

}
