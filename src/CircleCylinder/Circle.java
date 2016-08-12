package CircleCylinder;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle(){
		setRadius (1.0);
		setColor ("Red");
	}
		
	public Circle(double radius){
		setRadius (radius);
		setColor ("Red");
		
	}
		
	public Circle(double radius, String color) {
		setRadius (radius);
		setColor (color);
	
				
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public void printCircle(){
		System.out.println("Radius: " + getRadius() + " Color: " + getColor() + " Area: " + getArea());
	}
	
	

}
