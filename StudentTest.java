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

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
