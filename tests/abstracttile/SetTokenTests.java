package tests.abstracttile;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetTokenTests {
	
	@Test
	public void SetOneToken() {
		AbstractTile at = new MoveableTile("T");
		Token t = new Token(6,"test");
		boolean actual = at.setToken(t);
		boolean expected = true;
		assertTrue("We expected " + expected + " but got " + actual, actual == expected);
	}
	
	@Test
	public void SetTwoTokens() {
		AbstractTile at = new MoveableTile("T");
		Token t = new Token(6,"test");
		Token t2 = new Token(5,"test2");
		at.setToken(t);
		boolean actual = at.setToken(t2);
		boolean expected = false;
		assertTrue("We expected " + expected + " but got " + actual, actual == expected);
	}
}
