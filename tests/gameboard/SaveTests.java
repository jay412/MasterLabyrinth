package tests.gameboard;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import code.model.GameBoard;
import code.model.Player;
import code.model.Token;

public class SaveTests {
	private static final String ERROR_MESSAGE = "The expected and actual save-game files are not identical." ;
	
	public static GameBoard getGameBoard() {
		GameBoard gb = new GameBoard(4);
		
		gb.populateStaticMoveableTileArray(SetupStaticBoardTests.staticMoveableTileArray1());
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.createAndPlacePlayers();
		gb.populateTokenArray();
		
		Player[] players = gb.getPlayers();
		
		// Assign player names
		players[0].setName("River");
		players[1].setName("Kaylee");
		players[2].setName("Jayne");
		players[3].setName("Zoë");
		
		// Fabricate formula card indices
		ArrayList<Integer> fci;
		fci = players[0].getFormulaCardIndices();
		fci.set(0, 9);
		fci.set(1, 12);
		fci.set(2, 8);
		fci = players[1].getFormulaCardIndices();
		fci.set(0, 8);
		fci.set(1, 10);
		fci.set(2, 9);
		fci = players[2].getFormulaCardIndices();
		fci.set(0, 20);
		fci.set(1, 10);
		fci.set(2, 4);
		fci = players[3].getFormulaCardIndices();
		fci.set(0, 8);
		fci.set(1, 0);
		fci.set(2, 2);
		
		// Fabricate tokens
		players[1].addToken(new Token(1, null));
		players[2].addToken(new Token(3, null));
		players[2].addToken(new Token(4, null));
		players[2].addToken(new Token(8, null));
		players[2].addToken(new Token(11, null));
		players[3].addToken(new Token(20, null));
		
		for(int i=0; i < 20; i++){
			gb.toggleNextToken();
		}
		
		return gb;
	}
	
	/**
	 * Shifts each player to the index one more than it's current index.
	 * The last player is shifted to index 0.
	 * @param players
	 */
	private void shiftPlayers(Player[] players) {
		Player temp = players[3];
		players[3] = players[2];
		players[2] = players[1];
		players[1] = players[0];
		players[0] = temp;
	}
	
	private void testSave(int playerOffset) {
		GameBoard gb = getGameBoard();
		
		for (int i = 0; i < playerOffset; i++) {
			shiftPlayers(gb.getPlayers());
		}
		for (int i = 0; i < playerOffset; i++) {
			gb.toggleNextPlayer();
		}
		
		GameBoard.TESTING = true;  // skip System.exit
		gb.save();
		
		// Compare the expected and actual files
		Scanner expected = null;
		Scanner actual = null;
		try {
			expected = new Scanner(new File("src/tests/gameboard/staticboard.mls"));
			actual = new Scanner(new File("masterlabyrinth.mls"));
			
			// Each line should have the same text
			while (expected.hasNextLine() && actual.hasNextLine()) {
				assertEquals(ERROR_MESSAGE, expected.nextLine(), actual.nextLine());
			}
			
			// They should have the same number of lines
			if (expected.hasNextLine() || actual.hasNextLine()) {
				fail(ERROR_MESSAGE);
			}
		} catch (FileNotFoundException e) {
			fail(e.getMessage());
		} finally {
			if (expected != null) {
				expected.close();
			}
			if (actual != null) {
				actual.close();
			}
		}
	}
	
	@Test
	public void testSaveP0() {
		testSave(0);
	}
	
	@Test
	public void testSaveP1() {
		testSave(1);
	}
	
	@Test
	public void testSaveP2() {
		testSave(2);
	}
	
	@Test
	public void testSaveP3() {
		testSave(3);
	}

}
