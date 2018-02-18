package tests.gameboard;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.model.GameBoard;
import code.model.Token;

public class ToggleNextTokenTest {
	
	//Test the functionality of (_currentTargetToken + 1)
	@Test public void test00(){
	GameBoard gb = new GameBoard(4);
	gb.setupRandomBoard();
	Token t1 = gb.getCurrentTargetToken();
	int before = t1.getValue();
	int expectedVal = before + 1;
	gb.toggleNextToken();
	Token t2 = gb.getCurrentTargetToken();
	int actual = t2.getValue();
	assertTrue("", actual == expectedVal && before == 1);
	}

}
