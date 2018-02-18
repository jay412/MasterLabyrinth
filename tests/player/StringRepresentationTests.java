package tests.player;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.model.Player;
import code.model.Token;

public class StringRepresentationTests {
	
	/**
	 * Verify that the functionality of Player.toString works as expected. 
	 * @param name The name to be used for the player.
	 * @param color The color that the player's pawn should have.
	 * @param wands The number of wands that the player should have (0, 1, 2, or 3).
	 * @param tokens The numbers on the tokens that the player should have.
	 * @author Stephen
	 */
	private void testStringRepresentation(String name, String color, int wands, int[] tokens) {
		Player player = new Player(color);
		player.setName(name);
		
		while (wands < player.getMagicWandNum()) {
			player.useMagicWand();
		}
		
		// Fabricate a static formula card
		ArrayList<Integer> formulaCardIndices = player.getFormulaCardIndices();
		formulaCardIndices.set(0, 0);
		formulaCardIndices.set(1, 12);
		formulaCardIndices.set(2, 20);
		
		// Apply tokens
		for (int token : tokens) {
			player.addToken(new Token(token, null));
		}
		
		String expected = "[";
		expected += name + "," + color.toUpperCase() + "," + wands + ",";
		expected += "[1,13,25],";  // formula cards
		expected += java.util.Arrays.toString(tokens).replaceAll(" ", "");  // tokens
		expected += "]";
		
		String actual = player.toString();
		
		assertTrue(
			"Expected " + expected + ", but got " + actual,
			expected.equals(actual)
		);
	}
	
	@Test
	public void test1() {
		int[] tokens = {1,2,3,4};
		testStringRepresentation("JUnit", "Red", 3, tokens);
	}
	
	@Test
	public void test2() {
		int[] tokens = {};
		testStringRepresentation("JUnit 4", "Blue", 2, tokens);
	}
	
	@Test
	public void test3() {
		int[] tokens = {11,19};
		testStringRepresentation("Java", "Black", 1, tokens);
	}
	
	@Test
	public void test4() {
		int[] tokens = {25};
		testStringRepresentation("Nameless", "Green", 0, tokens);
	}
	
	@Test
	public void test5() {
		int[] tokens = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25};
		testStringRepresentation("Master Labyrinth", "Blue", 1, tokens);
	}

}
