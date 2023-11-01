package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	//constructor
	public Rectangle(double initLength, double initWidth) {
		length=initLength;
		this.width=initWidth;
	}
	
	/**
	 * calculates area of rectangle
	 *  @param rectangle rectangle that is being worked with
	 *  @return area of rectangle
	 */
	//calculate area
	public double calculateArea () {
		return this.getLength()*this.getWidth();
	}
	
	/**
	 * calculates perimeter of rectangle
	 * @param rectangle rectangle being worked with
	 * @return perimeter of rectangle
	 */
	//calculate perimeter
	public double calculatePerimeter () {
		return (2*this.getLength()) + (2*this.getWidth());
	}
	
	//get length
	public double getLength () {
		return length;
	}
	
	//get width
	public double getWidth () {
		return width;
	}
	
	//is smaller (by area)
	public static boolean firstIsSmaller (Rectangle a, Rectangle b) {
		double areaA = a.calculateArea();
		double areaB = b.calculateArea();
		return areaA < areaB; 
	}
	
	//check if is a square
	public boolean isSquare () {
		return this.getLength()== this.getWidth();
	}
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.0,3.0);
		Rectangle r2 = new Rectangle (1.0,1);
		
		double r1Length= r1.getLength();
		System.out.println(r1Length);
		System.out.println("Perimeter of r1: " + r1.calculatePerimeter());
		System.out.println(firstIsSmaller(r1,r2));
		boolean square = r2.isSquare();
		System.out.println(square);

	}

}
