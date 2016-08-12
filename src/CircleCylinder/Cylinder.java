package CircleCylinder;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(){
		super();
		setHeight (1.0);
		
	}
	public Cylinder(double radius){
		super (radius);
		setHeight(1.0);
				
	}
	public Cylinder(double radius, double height){
		super (radius);
		setHeight (height);
		
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		setHeight (height);
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double volume = getArea() * getHeight();
		return volume;
	}
		
	@Override 
	public double getArea() {
		return ((2 * Math.PI * getRadius() * getHeight()) + 2 * Math.PI * getRadius() * getRadius());
	}
	
	@Override 
	public void printCircle(){
		System.out.println("Radius: " + getRadius() + " Color: " + getColor() + " Area: " + getArea() +
							" Volume: " + getVolume());
	}

	

}
