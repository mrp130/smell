package fowler.couplers.inappropriate_intimacy.after;

public class Triangle extends Shape2D {

	@Override
	public float area() {
		return (this.width * this.height) / 2;
	}
	
}