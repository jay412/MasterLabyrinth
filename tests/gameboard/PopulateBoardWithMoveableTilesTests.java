package tests.gameboard;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.GameBoard;


public class PopulateBoardWithMoveableTilesTests {
	
	@Test public void test00(){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		boolean allTilesAreNullExpectedBefore = true; //all references set to null initially <==> no tiles on board
		boolean allTilesAreNullActualBefore = false;
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				AbstractTile at = gb.getBoard()[i][j];
				allTilesAreNullActualBefore = false;
				if(at == null){
					allTilesAreNullActualBefore = true; //there is a null reference
				}
			}
		}
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean noTilesAreNullExpectedAfter = true; 
		boolean noTilesAreNullActualAfter = false;
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				AbstractTile at = gb.getBoard()[i][j];
				noTilesAreNullActualAfter = false;
				if(at != null){
					noTilesAreNullActualAfter = true;
				}
			}
		}
		assertTrue("",allTilesAreNullExpectedBefore==allTilesAreNullActualBefore && 
				noTilesAreNullActualAfter==noTilesAreNullExpectedAfter);
	}

}
