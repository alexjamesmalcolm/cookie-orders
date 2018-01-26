package cookies;

import static org.junit.Assert.*;

import org.junit.Test;

public class MasterOrderTest {
	
	@Test
	public void shouldInstantiateAMasterOrderObject() {
		_____ underTest = new ______();
		
		______(underTest);
	}
	
	@Test
	public void assertThatAnOrderHasBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",0));
		int check = underTest.listSize();
		assertEquals(____, check);
	}
	
	@Test
	public void assertThatTwoOrdersHaveBeenAdded() {
		
		
		
		assertEquals(2, check);
	}
	
	@Test
	public void assertThatGetTotalBoxesIsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs",1));
		int check = underTest.getTotalBoxes();
		
		assertEquals(____, check);
	}
	
	@Test
	public void assertThatGetTotalBoxesIsTwo() {
		
		
		assertEquals(____, check);
	}
	
	@Test
	public void assertThatAnOrderHasBeenRemoved() {
		//create object
		//add an order
		//add another order
		//remove one of the cookie varieties
		//check the size of the list
		//run your assertion
	
	}

}
