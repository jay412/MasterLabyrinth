package tests.token;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetTokenPickedUpStatusTests {

	@Test
	public void test0() {
		Token t = new Token(1, "Crab Apple");
		t.setTokenPickedUpStatus();
		boolean expected = true;
		boolean actual = t.getTokenPickedUpStatus();
		assertTrue("",actual==expected);
	}
	
	@Test
	public void test1() {
		Token t = new Token(1, "Crab Apple");
		boolean expected = false;
		boolean actual = t.getTokenPickedUpStatus();
		assertTrue("",actual==expected);
	}

}
