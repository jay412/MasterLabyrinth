package tests.abstracttile;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.Token;
import tests.gameboard.SetupStaticBoardTests;

public class GetEncodedTileTests {
	
	private void genericTest1(int num, String expected){
		GameBoard gb = new GameBoard(4);
		gb.populateStaticMoveableTileArray(SetupStaticBoardTests.staticMoveableTileArray1());
		gb.setupStaticBoard();
		AbstractTile t = gb.getTileFromTileNumber(num);
		String actual = t.getEncodedTile();
		assertTrue("The expected value was "+expected+" but "+actual+"was returned", expected.equals(actual));
	}
	
	private void genericTest2(int num, int tokenNum, String expected){
		GameBoard gb = new GameBoard(4);
		gb.populateStaticMoveableTileArray(SetupStaticBoardTests.staticMoveableTileArray1());
		gb.setupStaticBoard();
		AbstractTile t = gb.getTileFromTileNumber(num);
		t.removeToken();
		t.setToken(new Token(tokenNum, ""));
		String actual = t.getEncodedTile();
		assertTrue("The expected value was "+expected+" but "+actual+"was returned", expected.equals(actual));
	}

	@Test public void test0(){ genericTest1(0,"[L0,0,[]]"); }
	@Test public void test1(){ genericTest1(1,"[I1,0,[]]"); }
	@Test public void test2(){ genericTest1(2,"[T0,0,[]]"); }
	@Test public void test3(){ genericTest1(3,"[L1,0,[]]"); }
	
	@Test public void test15(){ genericTest2(15,7,"[I0,7,[]]"); }
	@Test public void test16(){ genericTest2(16,9,"[T3,9,[GREEN]]"); }
	@Test public void test18(){ genericTest2(18,20,"[T0,20,[BLUE]]"); }
	@Test public void test30(){ genericTest2(30,15,"[T2,15,[RED]]"); }
}
