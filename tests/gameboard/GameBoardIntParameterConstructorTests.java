package tests.gameboard;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import code.model.GameBoard;

public class GameBoardIntParameterConstructorTests {
	
	@Test public void isAPlayerCreatedAndPlaced(){
		GameBoard gb = new GameBoard(1);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean expected1 = false;
		boolean actual1 = gb.getBoard()[2][2].hasPlayer();
		gb.createAndPlacePlayers();
		boolean expected2 = true;
		boolean actual2 = gb.getBoard()[2][2].hasPlayer();
		assertTrue("",expected1==actual1 && expected2==actual2);	
	}
	
	@Test public void doesConstructorIntEqualNumberPlayersCreatedTest2Players(){
		GameBoard gb = new GameBoard(2);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean expectedBefore1 = false;
		boolean actualBefore1 = gb.getBoard()[2][2].hasPlayer();
		boolean expectedBefore2 = false;
		boolean actualBefore2 = gb.getBoard()[2][4].hasPlayer();
		gb.createAndPlacePlayers();
		boolean expectedAfter1 = true;
		boolean expectedAfter2 = true;
		boolean actualAfter1 = gb.getBoard()[2][2].hasPlayer();
		boolean actualAfter2 = gb.getBoard()[2][4].hasPlayer();
		assertTrue("",expectedBefore1==actualBefore1 && expectedBefore2==actualBefore2
				&& expectedAfter1==actualAfter1 && expectedAfter2==actualAfter2);	
	}
	
	@Test public void doesConstructorIntEqualNumberPlayersCreatedTest3Players(){
		GameBoard gb = new GameBoard(3);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean eb1 = false;
		boolean ab1 = gb.getBoard()[2][2].hasPlayer();
		boolean eb2 = false;
		boolean ab2 = gb.getBoard()[2][4].hasPlayer();
		boolean eb3 = false;
		boolean ab3 = gb.getBoard()[4][2].hasPlayer();
		gb.createAndPlacePlayers();
		boolean ea1 = true;
		boolean ea2 = true;
		boolean aa1 = gb.getBoard()[2][2].hasPlayer();
		boolean aa2 = gb.getBoard()[2][4].hasPlayer();
		boolean ea3 = true;
		
		boolean aa3 = gb.getBoard()[4][2].hasPlayer();
		
		assertTrue("",eb1==ab1 && eb2==ab2 && eb3==ab3 &&  ea1==aa1 && ea2==aa2 && ea3==aa3 );	
	}
	
	@Test public void doesConstructorIntEqualNumberPlayersCreatedTest4Players(){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean eb1 = false;
		boolean ab1 = gb.getBoard()[2][2].hasPlayer();
		boolean eb2 = false;
		boolean ab2 = gb.getBoard()[2][4].hasPlayer();
		boolean eb3 = false;
		boolean ab3 = gb.getBoard()[4][2].hasPlayer();
		boolean eb4 = false;
		boolean ab4 = gb.getBoard()[4][4].hasPlayer();
		gb.createAndPlacePlayers();
		boolean ea1 = true;
		boolean ea2 = true;
		boolean aa1 = gb.getBoard()[2][2].hasPlayer();
		boolean aa2 = gb.getBoard()[2][4].hasPlayer();
		boolean ea3 = true;
		boolean ea4 = true;
		boolean aa3 = gb.getBoard()[4][2].hasPlayer();
		boolean aa4 = gb.getBoard()[4][4].hasPlayer();
		assertTrue("",eb1==ab1 && eb2==ab2 && eb3==ab3 && eb4==ab4 && ea1==aa1 && ea2==aa2 && ea3==aa3 && ea4==aa4);	
	}
	
	@Test public void doesConstructorIntEqualNumberPlayersCreatedTest5Players(){
		GameBoard gb = new GameBoard(5);
		int actual = gb.getPlayers().length;
		int expected = 4;
		assertTrue("",expected==actual);	
	}


}
