
public class Box {
	double width;
	double height;
	double length;
	
	public Box(){
		width = 10;
		height = 10;
		length = 5;
	}
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public double compute() {
		return width * height * length;
	}
	
	
	
	
}
