package assignment;

class Triangle {
	double bottom;
	double height;
	
	public Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
}

class TriangleArea extends Triangle {
	
	public TriangleArea(double bottom, double height) {
		super(bottom, height);
	}
	
	public double getArea() {
		return bottom*height/2;
	}
}

public class assign1 {
	public static void main(String[] args) {
		TriangleArea tr = new TriangleArea(6.0,3.0);
		
		System.out.println(tr.getArea());
	}
}