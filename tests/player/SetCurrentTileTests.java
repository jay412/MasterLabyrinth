package tests.player;

import static org.junit.Assert.*;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.Player;

public class SetCurrentTileTests {
	
	@Test public void testNullCase(){
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		p.setCurrentTile(null);
		AbstractTile actual = p.getCurrentTile();
		AbstractTile expected = null;
		assertTrue("",expected==actual);
		
	}
	
	@Test public void test00(){
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		p.setCurrentTile(gb.getTileFromTileNumber(35));
		AbstractTile actual = p.getCurrentTile();
		AbstractTile expected = gb.getTileFromTileNumber(35);
		assertTrue("",expected==actual);
	}

}
