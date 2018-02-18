package tests.fixedtile;
import code.model.*;

//Satya, Josh, Ian 03-16-16

import static org.junit.Assert.*;

import org.junit.Test;

public class SetTokenTests {
	
	@Test public void referenceToTokenSameInasOut(){
		Token t = new Token(5, "Four-leaf Clover");
		Token expected = t;
		FixedTile fT = new FixedTile();
		fT.setToken(t);
		Token actual = fT.getToken();
		assertTrue("", expected == actual);
	}
	
	@Test public void nullInSameAsnullOut(){
		Token t = null;
		Token expected = t;
		FixedTile fT = new FixedTile();
		fT.setToken(t);
		Token actual = fT.getToken();
		assertTrue("", expected == actual);
	}

}