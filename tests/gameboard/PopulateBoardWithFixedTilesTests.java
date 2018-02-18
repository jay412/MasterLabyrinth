package tests.gameboard;

import code.model.AbstractTile;
import code.model.GameBoard;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PopulateBoardWithFixedTilesTests {

	@Test public void test00(){
		GameBoard gb = new GameBoard(4);
		gb.populateBoardWithFixedTiles();
		//We know that the tile at [2][2] is a TTile with rotation -90 degrees
		int etop = 1; int eright = 1; int eleft = 0; int ebottom = 1;
		AbstractTile at2 = gb.getBoard()[2][2];
		int atop = at2.getTop();
		int aright = at2.getRight();
		int aleft = at2.getLeft();
		int abottom = at2.getBottom();
		assertTrue("",etop==atop && eright==aright && eleft==aleft &&
				ebottom==abottom);
		
	}
	
	@Test public void test01(){
		GameBoard gb = new GameBoard(4);
		gb.populateBoardWithFixedTiles();
		//We know that the tile at [2][4] is a T tile with rotation 180 degrees
		int etop = 0; int eright = 1; int eleft = 1; int ebottom = 1;
		AbstractTile at2 = gb.getBoard()[2][4];
		int atop = at2.getTop();
		int aright = at2.getRight();
		int aleft = at2.getLeft();
		int abottom = at2.getBottom();
		assertTrue("",etop==atop && eright==aright && eleft==aleft &&
				ebottom==abottom);
		
	}
	
}
