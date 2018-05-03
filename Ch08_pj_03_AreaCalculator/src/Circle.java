
public class Circle extends Shape {
	
	double radius;
	double area;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
		
	}
	public void setRadius (double radius) {
		
	}
	@Override
	public double getArea() {
		return area=radius*radius*3.1416;
		
	}
	
	

}
