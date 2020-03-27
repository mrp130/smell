package fowler.couplers.inappropriate_intimacy.before;

public class Triangle extends Rectangle{
	@Override
	public float area() {
		return (this.width * this.height) / 2;
	}
}