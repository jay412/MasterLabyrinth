package tests.gameboard;

import static org.junit.Assert.*;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.FixedTile;
import code.model.GameBoard;
import code.model.MoveableTile;

public class GetTileNumberFromTileReferenceTests {
	
	public void commonCode(int row, int col, int expected){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		AbstractTile at = gb.getTileFromCoordinates(row,col);
		int actual = gb.getTileNumFromTileReference(at);
		assertTrue("",expected==actual);
	}
	
	@Test public void test0(){commonCode(0,0,0);}
	@Test public void test1(){commonCode(0,1,1);}
	@Test public void test2(){commonCode(0,2,2);}
	@Test public void test3(){commonCode(0,3,3);}
	@Test public void test4(){commonCode(0,4,4);}
	@Test public void test5(){commonCode(0,5,5);}
	@Test public void test6(){commonCode(0,6,6);}
	@Test public void test7(){commonCode(1,0,7);}
	@Test public void test8(){commonCode(1,1,8);}
	@Test public void test9(){commonCode(1,2,9);}
	@Test public void test10(){commonCode(1,3,10);}
	@Test public void test11(){commonCode(1,4,11);}
	@Test public void test12(){commonCode(1,5,12);}
	@Test public void test13(){commonCode(1,6,13);}
	@Test public void test14(){commonCode(2,0,14);}
	@Test public void test15(){commonCode(2,1,15);}
	@Test public void test16(){commonCode(2,2,16);}
	@Test public void test17(){commonCode(2,3,17);}
	@Test public void test18(){commonCode(2,4,18);}
	@Test public void test19(){commonCode(2,5,19);}
	@Test public void test20(){commonCode(2,6,20);}
	@Test public void test21(){commonCode(3,0,21);}
	@Test public void test22(){commonCode(3,1,22);}
	@Test public void test23(){commonCode(3,2,23);}
	@Test public void test24(){commonCode(3,3,24);}
	@Test public void test25(){commonCode(3,4,25);}
	@Test public void test26(){commonCode(3,5,26);}
	@Test public void test27(){commonCode(3,6,27);}
	@Test public void test28(){commonCode(4,0,28);}
	@Test public void test29(){commonCode(4,1,29);}
	@Test public void test30(){commonCode(4,2,30);}
	@Test public void test31(){commonCode(4,3,31);}
	@Test public void test32(){commonCode(4,4,32);}
	@Test public void test33(){commonCode(4,5,33);}
	@Test public void test34(){commonCode(4,6,34);}
	@Test public void test35(){commonCode(5,0,35);}
	@Test public void test36(){commonCode(5,1,36);}
	@Test public void test37(){commonCode(5,2,37);}
	@Test public void test38(){commonCode(5,3,38);}
	@Test public void test39(){commonCode(5,4,39);}
	@Test public void test40(){commonCode(5,5,40);}
	@Test public void test41(){commonCode(5,6,41);}
	@Test public void test42(){commonCode(6,0,42);}
	@Test public void test43(){commonCode(6,1,43);}
	@Test public void test44(){commonCode(6,2,44);}
	@Test public void test45(){commonCode(6,3,45);}
	@Test public void test46(){commonCode(6,4,46);}
	@Test public void test47(){commonCode(6,5,47);}
	@Test public void test48(){commonCode(6,6,48);}
	
	//cases outside of legal tile coordinates
	@Test public void test49(){commonCode(-100,5,-2);} 
	@Test public void test50(){commonCode(100,5,-2);}
	@Test public void test51(){commonCode(5,-100,-2);}
	@Test public void test52(){commonCode(5,100,-2);}
	
	@Test public void testTileNumberofNull(){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		int expected = -2;
		int actual = gb.getTileNumFromTileReference(null);
		assertTrue("",expected==actual);
	}
	
	@Test public void testTileNumberofMoveableTileNotOnBoard(){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		AbstractTile at = new MoveableTile();
		int expected = -1;
		int actual = gb.getTileNumFromTileReference(at);
		assertTrue("",expected==actual);
	}
	
	@Test public void testTileNumberofFixedTileNotOnBoard(){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		AbstractTile at = new FixedTile();
		int expected = -1;
		int actual = gb.getTileNumFromTileReference(at);
		assertTrue("",expected==actual);
	}
	


}
