
public class PersonTest {

	public void test() {
		try {
			String firstName = "";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);
		} catch (NameException e) {
			
		}
	}

	public void constructorOrderTest() {
		try {
			String firstName = "Bo";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);

			String expected = "*** First Name: " + firstName + " Last Name: " + lastName + "***";

			String actual = x.describeSelf();
			assertEquals(expected, actual);

		} catch (NameException e) {
			fail("Where is my exception?");
		}
	}

	private void assertEquals(String expected, String actual) {
		// TODO Auto-generated method stub

	}

	private void fail(String string) {
		// TODO Auto-generated method stub

	}

}
