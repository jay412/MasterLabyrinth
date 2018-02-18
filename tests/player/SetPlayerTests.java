package tests.player;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.Player;
import code.model.Token;

public class SetPlayerTests {

	@Test
	public void tes01() {
		Token token = new Token(5, "Four-leaf Clover");
		Player player = new Player("Josh");
		token.setPlayer(player);
		Player expected = player;
		Player actual = token.getPlayer();
		assertTrue("", expected == actual);
		
	}
	
	public void tes02() {
		Token token = new Token(3, "Oak Leaf");
		Player player = new Player("Satya");
		token.setPlayer(player);
		Player expected = player;
		Player actual = token.getPlayer();
		assertTrue("", expected == actual);
		
	}

}
