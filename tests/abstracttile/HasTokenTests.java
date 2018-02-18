package tests.abstracttile;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class HasTokenTests {

	@Test
	public void noTokenThenTokenOnTile() {
		AbstractTile at = new FixedTile("L");
		Token t = new Token(5,"test");
		boolean actual1 = at.hasToken();
		at.setToken(t);
		boolean actual2 = at.hasToken();
		boolean expected1 = false;
		boolean expected2 = true;
		assertTrue("We expected the tile to return " + expected1 + " before a token was placed on it" +
					" but got " + actual1 + " and expected it to return " + expected2 + " after a token was "
					+ "placed on it but got " + actual2, expected1==actual1 && expected2==actual2);
	}
	
	@Test
	public void noTokenOnTile() {
		AbstractTile at = new FixedTile("L");
		boolean actual1 = at.hasToken();
		boolean expected1 = false;
		assertTrue("We expected the tile to return " + expected1 + " but got " + actual1,
				expected1==actual1);
	}
	
	@Test
	public void tokenOnTile() {
		AbstractTile at = new FixedTile("L");
		Token t = new Token(5,"test");
		at.setToken(t);
		boolean actual2 = at.hasToken();
		boolean expected2 = true;
		assertTrue("We expected the tile to return " + expected2 + "but got " + actual2, expected2==actual2);
	}

}
