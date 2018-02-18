package tests.gameboard;

import code.model.GameBoard;
import code.model.Player;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GetPlayersTests {
	
	//test that players on GameBoard at starting player positions 
	//are same players returned by getPlayers method, which
	//returns an array of type Player
	@Test public void test00(){
		GameBoard gb = new GameBoard(4);
		gb.populateRandomMoveableTileArray();
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.createAndPlacePlayers();
		Player[] players = gb.getPlayers();
		
		int expectedSize = 4;
		int actualSize = players.length;
		
		Player b1 = players[0];
		Player b2 = players[1];
		Player b3 = players[2];
		Player b4 = players[3];
		
		Player a1 = gb.getBoard()[2][2].getPlayers().get(0);
		Player a2 = gb.getBoard()[2][4].getPlayers().get(0);
		Player a3 = gb.getBoard()[4][2].getPlayers().get(0);
		Player a4 = gb.getBoard()[4][4].getPlayers().get(0);
		
		assertTrue("", expectedSize==actualSize && b1==a1 && b2==a2 && b3==a3 && b4==a4);	
	}

}
