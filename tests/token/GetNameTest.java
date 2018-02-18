package tests.token;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.model.GameBoard;
import code.model.Player;

public class GetNameTest {
	@Test public void test00(){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		Player[] players = gb.getPlayers();
		players[0].setName("Ken");
		players[1].setName("");
		
		String actual0 = players[0].getName();
		String expected0 = "Ken";
		String actual1 = players[1].getName();
		String expected1 = "";
		assertTrue("", expected0==actual0 && expected1==actual1);
	}
}
