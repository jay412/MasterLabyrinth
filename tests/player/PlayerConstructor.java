package tests.player;

import static org.junit.Assert.*;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.Player;

public class PlayerConstructor {

	@Test
	public void test00() {
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		boolean actual = p.insertShiftableTile(3);
		boolean expected = true;
		assertTrue("",expected==actual);
	}
	
	@Test
	public void test01() {
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		String actual = p.getColor();
		String expected = "Tan";
		assertTrue("",expected==actual);	
	}
	
	@Test
	public void test02() {
		Player p = new Player("Blue");
		String actual = p.getColor();
		String expected = "Blue";
		assertTrue("",expected==actual);		
	}
	
	@Test
	public void test03() {
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		p.setCurrentTile(gb.getTileFromTileNumber(30));
		AbstractTile actual = p.getCurrentTile();
		AbstractTile expected = gb.getTileFromTileNumber(30);
		assertTrue("",expected==actual);
	}


}
