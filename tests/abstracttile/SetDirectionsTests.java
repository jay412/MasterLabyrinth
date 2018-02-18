package tests.abstracttile;

import code.model.AbstractTile;
import code.model.MoveableTile;
import static org.junit.Assert.*;
import org.junit.Test;

public class SetDirectionsTests {

	
	public void commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized
				(int t, int b, int l, int r, boolean expected){
		AbstractTile at = new MoveableTile();
		boolean actual = at.setDirections(t,b,l,r);
		assertTrue("We expected " + expected + " but got " + actual, expected == actual);
	}
	
	@Test public void test05(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(0,0,1,1,true);}
	@Test public void test06(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(0,1,1,0,true);}
	@Test public void test07(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,1,0,0,true);}
	@Test public void test08(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,0,0,1,true);}
	@Test public void test09(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,0,1,0,true);}
	@Test public void test10(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(0,1,0,1,true);}
	@Test public void test11(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(0,1,1,1,true);}
	@Test public void test12(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,1,0,1,true);}
	@Test public void test13(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,1,1,0,true);}
	@Test public void test14(){commonCodeFor_CheckLegalDirectionsReturnsTrueAndTileNotInitialized(1,0,1,1,true);}
	
	@Test
	public void checkLegalDirectionsReturnsTrueAndTileNotInitialized() {
		AbstractTile at = new MoveableTile();
		boolean expected = true;
		boolean actual = at.setDirections(1,1,1,0);
		assertTrue("We expected " + expected + " but got " + actual, expected == actual);
	}
	
	@Test
	public void checkLegalDirectionsReturnsTrueAndTileInitialized() {
		AbstractTile at = new MoveableTile("T");
		boolean expected = false;
		boolean actual = at.setDirections(1,1,1,0);
		assertTrue("We expected " + expected + " but got " + actual, expected == actual);
	}
	
	@Test
	public void checkLegalDirectionsReturnsFalseAndTileInitialized() {
		AbstractTile at = new MoveableTile("T");
		boolean expected = false;
		boolean actual = at.setDirections(1,1,1,1); //1,1,1,1 does NOT correspond to legal tile
		assertTrue("We expected " + expected + " but got " + actual, expected == actual);
	}
	
	@Test
	public void checkLegalDirectionsReturnsFalseAndTileNotInitialized() {
		AbstractTile at = new MoveableTile();
		boolean expected = false;
		boolean actual = at.setDirections(1,1,1,1);
		assertTrue("We expected " + expected + " but got " + actual, expected == actual);
	}

}
