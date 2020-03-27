package fowler.couplers.inappropriate_intimacy.before;

public class Square extends Rectangle{
	@Override
	public void setWidth(float width) {
		this.setHeight(width);
	}

	@Override
	public void setHeight(float height) {
		this.height = this.width = height;
	}
}