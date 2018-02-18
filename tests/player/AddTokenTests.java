package tests.player;

import static org.junit.Assert.*;
import code.model.*;

import org.junit.Test;

public class AddTokenTests {

	@Test
	public void test01() {
	  Player player = new Player("josh");
	  Token token = new Token(6,"garlic");
	  player.addToken(token);
	  Token expected = token;
	  Token actual = player.getTokens().get(0);
	  assertTrue("",expected == actual);
	}
	
	@Test
	public void test02() {
	  Player player = new Player("josh");
	  player.addToken(null);
	  Token expected = null;
	  Token actual = player.getTokens().get(0);
	  assertTrue("",expected == actual);
	}
	
	@Test
	public void test03() {
	  Player player = new Player("josh");
	  Token token = new Token(10, "Skull");
	  player.addToken(token);
	  Token expected = token;
	  Token actual = player.getTokens().get(0);
	  assertTrue("",expected == actual);
	}

}
