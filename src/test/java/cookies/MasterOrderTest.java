package cookies;

import static org.junit.Assert.*;
import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void shouldInstantiateAMasterOrderObject() {
		MasterOrder underTest = new MasterOrder();

		assertNotNull(underTest);
	}

	@Test
	public void assertThatAnOrderHasBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("tagalongs", 1));
		int check = underTest.listSize();
		assertEquals(1, check);
	}

	@Test
	public void assertThatTwoOrdersHaveBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("tagalongs", 1));
		underTest.addOrder(new CookieOrder("thin mints", 1));
		int check = underTest.listSize();
		assertEquals(2, check);
	}

	@Test
	public void assertThatGetTotalBoxesIsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs", 1));
		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}
	//
	// @Test
	// public void assertThatGetTotalBoxesIsTwo() {
	//
	//
	// assertEquals(____, check);
	// }
	//
	// @Test
	// public void assertThatAnOrderHasBeenRemoved() {
	// //create object
	// //add an order
	// //add another order
	// //remove one of the cookie varieties
	// //check the size of the list
	// //run your assertion
	//
	// }

}
