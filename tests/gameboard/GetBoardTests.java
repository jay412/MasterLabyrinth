package tests.gameboard;

import code.model.AbstractTile;
import code.model.GameBoard;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GetBoardTests {
	
	@Test public void test00(){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.createAndPlacePlayers();
		//the calls to getBoard will not function if getBoard is NOT working
		boolean a1 = gb.getBoard()[2][2].hasPlayer();
		boolean a2 = gb.getBoard()[2][4].hasPlayer();
		boolean a3 = gb.getBoard()[4][2].hasPlayer();
		boolean a4 = gb.getBoard()[4][4].hasPlayer();
		
		AbstractTile [][] board = gb.getBoard();
		boolean allEqualToSeven = false;
		int l1 = board.length;
		if(l1==7){
			allEqualToSeven = true;
		}
		for(int i = 0; i < 7; i++){
			int x = board[i].length;
			if(x!=7){
				allEqualToSeven = false;
			}
		}
		assertTrue("",a1&&a2&&a3&&a4&&allEqualToSeven);	
	}

}
