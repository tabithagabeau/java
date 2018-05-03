import java.text.NumberFormat;

public class Rectangle {
	

	//define what type of parameters
	private double length;
    private double width;
    
    //initialize parameters to zero
	public Rectangle() {
	double length=0;
	double width=0;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double getArea() {
		 double area = width * length;
		 return area;
	}
	
	public String getAreaNumberFormat() {
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        return number.format(getArea());
		
	}
	
	 public double getPerimeter() {
	        double perimeter = 2 * width + 2 * length;
	        return perimeter;
	    }
	    
	    public String getPerimeterNumberFormat() {
	        NumberFormat number = NumberFormat.getNumberInstance();
	        number.setMinimumFractionDigits(3);
	        String numberFormatted = number.format(this.getPerimeter());
	        return numberFormatted;        
	    }        

}
