package fowler.couplers.feature_envy.before;

public class Student extends Binusian {

	public Student(String id, String name) {
		super(id, name);
		if(id.length() != 10) {
			throw new IllegalArgumentException();
		}
	}
	
}
