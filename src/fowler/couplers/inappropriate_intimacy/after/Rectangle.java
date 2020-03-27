package fowler.couplers.inappropriate_intimacy.after;

public class Rectangle extends Shape2D {

	@Override
	public float area() {
		return width * height;
	}
	
}