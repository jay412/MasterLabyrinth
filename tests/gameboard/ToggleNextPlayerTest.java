package tests.gameboard;

import static org.junit.Assert.*;
import org.junit.Test;

import code.model.GameBoard;

public class ToggleNextPlayerTest {
	@Test
	public void test00(){
	GameBoard gb = new GameBoard(4);
	gb.setupRandomBoard();
	int before = GameBoard.currentPlayerIndex;
	int expectedVal = before + 1;
	gb.toggleNextPlayer();
	int actual = GameBoard.currentPlayerIndex;
	assertTrue("", actual == expectedVal && before==0);
	
	}
}
