package tests.gameboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.Player;

public class RestoreTests {
	
	// TODO: consider loading with varying numbers of players
	
	private GameBoard _expected;
	private GameBoard _actual;
	
	@Before
	public void setUp() {
		_expected = SaveTests.getGameBoard();
		_actual = GameBoard.load("src/tests/gameboard/staticboard.mls");
	}
	
	@Test
	public void verifyPlayers() {
		Player[] expected = _expected.getPlayers();
		Player[] actual = _actual.getPlayers();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void verifyTiles() {
		AbstractTile[][] expected = _expected.getBoard();
		AbstractTile[][] actual = _actual.getBoard();
		for (int i = 0; i < expected.length; i++) {
			for (int j = 0; j < expected[i].length; j++) {
				assertTrue("Not equal at index ["+i+"]["+j+"]",expected[i][j].equals2(actual[i][j]));
			}
		}
	}
	
	@Test
	public void verifyNonInsertionLocation() {
		int expected = _expected.getNonInsertable();
		int actual = _actual.getNonInsertable();
		assertEquals(expected, actual);
	}
	
	@Test
	public void verifyCurrentTargetToken() {
		int expected = _expected.getCurrentTargetTokenValue();
		int actual = _actual.getCurrentTargetTokenValue();
		assertEquals(expected, actual);
	}

}
