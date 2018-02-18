package tests.fixedtile;
import code.model.*;

//Satya, Josh, Ian 03-16-16

import static org.junit.Assert.*;

import org.junit.Test;

public class HasTokenTests {

	@Test
	public void test00() {
		boolean expected = true;
		FixedTile fT = new FixedTile();
		Token t = new Token(1, "Crab Apple");
		fT.setToken(t);
		boolean actual = fT.hasToken();
		assertTrue("We expected " + expected + " but got " + actual, actual == expected);
	}

}
