package tests.gameboard;

import static org.junit.Assert.assertTrue;
import code.model.GameBoard;
import org.junit.Test;

public class GetMoveableTileArrayTests {
	
	@Test public void getShiftableTileFromMoveableTileArray(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		int expected = 1;
		int actual = gb.getMoveableTileArray().size();
		assertTrue("",expected==actual);	
	}

	@Test public void getMoveableTileArrayWhenItIsEmpty(){
		GameBoard gb = new GameBoard(1);		
		int expected = 0;
		int actual = gb.getMoveableTileArray().size();
		assertTrue("",expected==actual);	
	}


}
