package tests.gameboard;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.AbstractTile;
import code.model.GameBoard;

public class PopulateBoardWithTokensRandomly {

	@Test public void test00(){
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
		gb.populateBoardWithTokensRandomly();
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
	
}
