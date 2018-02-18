package tests.abstracttile;

import code.model.AbstractTile;
import code.model.FixedTile;
import code.model.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class HasPlayerTests {

	@Test
	public void noPlayerOntTile() {
		AbstractTile at = new FixedTile("T");
		boolean actual = at.hasPlayer();
		boolean expected = false;
		assertTrue("We expected " + expected + " but got " + actual, actual==expected);
	}
	
	@Test
	public void hasPlayerOntTile() {
		AbstractTile at = new FixedTile("T");
		Player p = new Player("Red");
		at.addPlayer(p);
		boolean actual = at.hasPlayer();
		boolean expected = true;
		assertTrue("We expected " + expected + " but got " + actual, actual==expected);
	}

}
