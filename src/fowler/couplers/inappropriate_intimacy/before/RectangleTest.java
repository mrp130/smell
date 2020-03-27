package fowler.couplers.inappropriate_intimacy.before;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	
	@Test
	void test() {
		foo(new Rectangle());
		foo(new Square());
	}
	
	void foo(Rectangle r) {
		r.setHeight(10);
		r.setWidth(20);
		assertEquals(200, r.area());
	}
}
