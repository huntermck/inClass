import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	void testStudent() {
		try {
			Student s = new Student();

			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;

			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}

	@Test
	void testCompareTo() throws NameException {
		Student firstStudent = new Student("X", "Y", 2);
		Student secondStudent = new Student("X", "Y", 3);

		int actual = secondStudent.compareTo(firstStudent);
		int expected = 1;

		assertEquals(expected, actual);

		Student thirdStudent = new Student("X", "Y", 5);
		
		expected = -1;
		actual = secondStudent.compareTo(thirdStudent);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}

}
