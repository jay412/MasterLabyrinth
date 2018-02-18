package tests.gameboard;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.model.AbstractTile;
import code.model.GameBoard;

public class PopulateStaticBoardWithTokensTest {
	@Test public void TestThePopulation(){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.createAndPlacePlayers();
		gb.populateTokenArray();
		boolean allTokensAreNullExpectedBefore = true;
		boolean allTokensAreNullActualBefore = false;

		for(int i =1; i<=5; i= i+2 ){
			 for(int j =1; j<=5; j++){
				 AbstractTile at = gb.getBoard()[i][j];
					allTokensAreNullActualBefore = false;
					if(at.hasToken() == false){
						allTokensAreNullActualBefore = true;
					}
			 }
		 }
		for(int i = 2; i<=4; i= i+2 ){
			 for(int j =1; j<=5; j= j+2){
				AbstractTile at = gb.getBoard()[i][j];
				allTokensAreNullActualBefore = false;
				if(at.hasToken() == false){
					allTokensAreNullActualBefore = true;
				}
			}
		}
		
		//this is after method call.
		gb.populateStaticBoardWithTokens();
		boolean noTokensAreNullExpectedAfter = true; 
		boolean noTokensAreNullActualAfter = false;
		for(int i =1; i<=5; i= i+2 ){
			 for(int j =1; j<=5; j++){
				 AbstractTile at = gb.getBoard()[i][j];
				 noTokensAreNullActualAfter = false;
					if(at.hasToken() == true){
						noTokensAreNullActualAfter = true;
					}
			 }
		 }
		for(int i = 2; i<=4; i= i+2 ){
			 for(int j =1; j<=5; j= j+2){
				AbstractTile at = gb.getBoard()[i][j];
				noTokensAreNullActualAfter = false;
				if(at.hasToken() == true){
					noTokensAreNullActualAfter = true;
				}
			}
		}
		
		assertTrue("", allTokensAreNullExpectedBefore = allTokensAreNullActualBefore && 
				noTokensAreNullActualAfter==noTokensAreNullExpectedAfter);
	}
	
	public void TestIfStatic(int i, int j, int expected){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.createAndPlacePlayers();
		gb.populateTokenArray();
		gb.populateStaticBoardWithTokens();
		
		AbstractTile at = gb.getBoard()[i][j];
		int actual = at.getToken().getValue();
		assertTrue("", actual == expected);
	}
	@Test public void Test00(){TestIfStatic(1, 1, 1);}
	@Test public void Test01(){TestIfStatic(1, 2, 2);}
	@Test public void Test02(){TestIfStatic(1, 3, 3);}
	@Test public void Test03(){TestIfStatic(1, 4, 4);}
	@Test public void Test04(){TestIfStatic(1, 5, 5);}
	@Test public void Test05(){TestIfStatic(3, 1, 6);}
	@Test public void Test06(){TestIfStatic(3, 2, 7);}
	@Test public void Test07(){TestIfStatic(3, 3, 8);}
	@Test public void Test08(){TestIfStatic(3, 4, 9);}
	@Test public void Test09(){TestIfStatic(3, 5, 10);}
}
