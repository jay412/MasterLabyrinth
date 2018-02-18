package tests.gameboard;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.GameBoard;

public class GetNonInsertableTests {
	
	private void generic(int insertAt, int expected){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		gb.checkIfInsertShiftableTileLegal(insertAt);
		int actual = gb.getNonInsertable();
		assertTrue("The expected value was "+expected+" but "+actual+" was returned", expected==actual);
	}
	
	@Test public void test1(){ generic(1,9); }
	@Test public void test3(){ generic(3,8); }
	@Test public void test5(){ generic(5,7); }
	@Test public void test13(){ generic(13,12); }
	
	@Test public void test27(){ generic(27,11); }
	@Test public void test41(){ generic(41,10); }
	@Test public void test47(){ generic(47,3); }
	@Test public void test45(){ generic(45,2); }
	
	@Test public void test43(){ generic(43,1); }
	@Test public void test35(){ generic(35,6); }
	@Test public void test21(){ generic(21,5); }
	@Test public void test7(){ generic(7,4); }
	

}
