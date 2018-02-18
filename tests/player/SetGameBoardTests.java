package tests.player;

import code.model.GameBoard;
import code.model.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class SetGameBoardTests {

	@Test public void test00(){
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		p.setGameBoard(gb);
		//if gameboard has been set then we can call methods on gb from player
		//insertShiftableTile calls gb.checkIfInsertShiftableTileLegal in 
		//GameBoard class from player using _gb instance variable
		boolean actual = p.insertShiftableTile(1); 
		boolean expected = true;
		assertTrue("",expected==actual);
	}
	
	@Test public void test01(){
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		p.setGameBoard(null);
		boolean expected = false;
		boolean actual;
		try{
			actual = p.insertShiftableTile(1);
		}
		catch(NullPointerException e){ //_gb was not initialized, so NullPointerException thrown
									   // by call within insertShiftableTile
			actual = false;
		}
		assertTrue("", expected==actual);
	}
}
