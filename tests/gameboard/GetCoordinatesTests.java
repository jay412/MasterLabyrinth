package tests.gameboard;

import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.MoveableTile;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GetCoordinatesTests {
	
	@Test public void getCoordinatesTileOnBoard(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		int[] expCoord = new int[] {2,2};
		AbstractTile at = gb.getTileFromTileNumber(16);
		int[] actCoord = gb.getCoordinates(at);
		
		int expected1 = expCoord[0];
		int actual1 = actCoord[0];
		int expected2 = expCoord[1];
		int actual2 = actCoord[1];
		
		assertTrue("",expected1==actual1 && expected2==actual2);	
	}
	
	@Test public void getCoordinatesTileNotOnBoard_ShiftableTile(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		int[] expCoord = new int[] {-1,-1};
		MoveableTile at = gb.getMoveableTileArray().get(0);
		int[] actCoord = gb.getCoordinates(at);
		
		int expected1 = expCoord[0];
		int actual1 = actCoord[0];
		int expected2 = expCoord[1];
		int actual2 = actCoord[1];
		
		assertTrue("",expected1==actual1 && expected2==actual2);	
	}
	
	@Test public void getCoordinatesOfNull(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		int[] expCoord = new int[] {-1,-1};
		MoveableTile at = null;
		int[] actCoord = gb.getCoordinates(at);
		
		int expected1 = expCoord[0];
		int actual1 = actCoord[0];
		int expected2 = expCoord[1];
		int actual2 = actCoord[1];
		
		assertTrue("",expected1==actual1 && expected2==actual2);	
	}

}
