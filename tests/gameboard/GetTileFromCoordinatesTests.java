package tests.gameboard;

import code.model.AbstractTile;
import code.model.GameBoard;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GetTileFromCoordinatesTests {
	
	@Test public void testValidCoordinates(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = gb.getTileFromTileNumber(10);
		int[] coord = new int[] {1,3};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testValidCoordinatesButBoardNotPopulated(){
		GameBoard gb = new GameBoard(1);
		AbstractTile expected = null;
		int[] coord = new int[] {1,3};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testInvalidValidRowOfCoordinates1(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {100,3};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testInvalidValidRowOfCoordinates2(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {-100,3};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testInvalidValidColOfCoordinates1(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {3,100};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}

	@Test public void testInvalidValidColOfCoordinates2(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {3,-100};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testInvalidValidCoordinates1(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {-100,-100};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}
	
	@Test public void testInvalidValidCoordinates2(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		AbstractTile expected = null;
		int[] coord = new int[] {100,100};
		AbstractTile actual = gb.getTileFromCoordinates(coord[0], coord[1]);
		assertTrue("",expected==actual);	
	}

}
