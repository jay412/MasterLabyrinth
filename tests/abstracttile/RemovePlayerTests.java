package tests.abstracttile;

import code.model.AbstractTile;
import code.model.FixedTile;
import code.model.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class RemovePlayerTests {

	@Test
	public void removeWithNoPlayersOnTile() {
		AbstractTile at = new FixedTile();
		int sizeBeforeRemoveAttempt = at.getPlayers().size();
		Player p = new Player("Blue");
		boolean actual = at.removePlayer(p);
		int sizeAfterRemoveAttempt = at.getPlayers().size();
		boolean expected = false;
		assertTrue("We expected " + expected + " but got " + actual + ". Size before remove was " 
				+ sizeBeforeRemoveAttempt + " and size after was " + sizeAfterRemoveAttempt, 
				expected==actual && sizeBeforeRemoveAttempt==sizeAfterRemoveAttempt);
	}
	
	@Test
	public void removePlayerNotOnTile(){
		AbstractTile at = new FixedTile();
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		at.addPlayer(p1);
		boolean actual = at.removePlayer(p2);
		boolean expected = false;
		assertTrue("We expected " + expected + " but we got " + actual, expected == actual);
	}
	
	@Test
	public void removeOnePlayerOnTileWithOnePlayer() {
		AbstractTile at = new FixedTile();
		Player p1 = new Player("Red");
		at.addPlayer(p1);
		boolean actual = at.removePlayer(p1);
		boolean expected = true;
		assertTrue("We expected " + expected + " but we got " + actual, expected == actual);
	}
	
	@Test
	public void removeOneWithMoreThanOnePlayerOnTile() {
		AbstractTile at = new FixedTile();
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		at.addPlayer(p1);
		at.addPlayer(p2);
		boolean actual = at.removePlayer(p2);
		boolean expected = true;
		assertTrue("We expected " + expected + " but we got " + actual, expected == actual);
	}
	
	@Test
	public void removeTwoPlayersBackToBack() {
		AbstractTile at = new FixedTile();
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		at.addPlayer(p1);
		at.addPlayer(p2);
		boolean actual1 = at.removePlayer(p1);
		boolean actual2 = at.removePlayer(p2);
		boolean expected = true;
		assertTrue("We expected " + expected + " in both cases but we got " + actual1 + " and " 
				+ actual2, expected == actual1 && expected == actual2);
	}

}
