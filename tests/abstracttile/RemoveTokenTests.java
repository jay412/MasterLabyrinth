package tests.abstracttile;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTokenTests {

	@Test
	public void noTokenThenTokenOnTile() {
		AbstractTile at = new FixedTile("L");
		Token t = new Token(5,"test");
		Token t2 = at.removeToken(); //t2 should be null
		at.setToken(t);
		Token t3 = at.removeToken(); //t3 should be the same token as t
		assertTrue("We expected t2 to be null but it was " + t2 + " and expected t3 to be the same token as "
				+ "the one placed on it, and this was " + (t3==t), t2==null && t3==t);
	}
	
	@Test
	public void noTokenOnTile() {
		AbstractTile at = new FixedTile("L");
		Token expected = null;
		Token actual = at.removeToken(); //t2 should be null
		assertTrue("We expected t2 to be " + expected + " but it was " + actual, expected==actual);
	}

	@Test
	public void tokenOnTile() {
		AbstractTile at = new FixedTile("L");
		Token expected = new Token(5,"test");
		at.setToken(expected);
		Token actual = at.removeToken(); //t3 should be the same token as t
		assertTrue("We expected the token removed to be the same token as the one placed on it, and this was " + 
					(expected==actual), expected==actual);
	}

}
