package tests.abstracttile;

import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetTokenTests {

	@Test
	public void noTokentoGetThenTokenToGet() {
		AbstractTile at = new MoveableTile("I");
		Token t1 = at.getToken(); //t should be null
		Token t2 = new Token(1,"test");
		at.setToken(t2);
		Token t3 = at.getToken(); //t3 should be the same token as t2
		assertTrue("We expected token 1 to be null and it was " + t1 + " and we expected "
				+ "tokens t2 and t3 to be the same token, and this was " + (t2==t3), t1==null && t2==t3);
	}
	
	@Test
	public void noTokentoGet() {
		AbstractTile at = new MoveableTile("I");
		Token expected = null;
		Token actual = at.getToken(); //actual should null
		assertTrue("We expected " + expected + " but got "+ actual, expected==actual);
	}
	
	@Test
	public void tokenToGet() {
		AbstractTile at = new MoveableTile("I");
		Token expected = new Token(1,"test");
		at.setToken(expected);
		Token actual = at.getToken(); //actual should be the same token as expected
		assertTrue("We expected the token placed on the tile to be the same as that returned by getToken"+
					"and this was " +(expected==actual), expected==actual);
	}

}
