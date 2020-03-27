package fowler.couplers.inappropriate_intimacy.after;

public abstract class Shape2D {
	protected float width;
	protected float height;
	
	public abstract float area();

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
