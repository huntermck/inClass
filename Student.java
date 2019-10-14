
public class Student extends Person implements Comparable<Student> {

	private static final int INITIAL_RATING = 5;
	
	private String className;
	private Integer rating;
	
	public Student() throws NameException {
		super();
		rating = INITIAL_RATING;
	}


	@Override
	public int compareTo(Student o) {
		return 0;
	}


	public Integer getRating() {
		return new Integer(rating);
	}
}
