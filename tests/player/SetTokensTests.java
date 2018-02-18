package tests.player;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.model.Player;
import code.model.Token;

public class SetTokensTests {

	@Test
	public void test01() {
		 Player player = new Player("Satya");
		 ArrayList<Token> tokens = new ArrayList<Token>();
		 Token t1 = new Token(6,"garlic");
		 Token t2 = new Token(5, "Four-leaf Clover");
		 tokens.add(t1);
		 tokens.add(t2);
		player.setTokens(tokens);
		 ArrayList<Token> expected = tokens;
		 ArrayList<Token> actual = player.getTokens();
		 assertTrue("",expected == actual);
	}
     
	@Test
	public void test02(){
	 Player player = new Player("Satya");
	 ArrayList<Token> tokens = new ArrayList<Token>();
	 Token t1 = new Token(3, "Oak Leaf");
	 Token t2 = new Token(2, "Pine Cone");
	 tokens.add(t1);
	 tokens.add(t2);
	player.setTokens(tokens);
	 ArrayList<Token> expected = tokens;
	 ArrayList<Token> actual = player.getTokens();
	 assertTrue("",expected == actual);
	}
	
	@Test
	public void test03(){
	Player player = new Player("Satya");
	ArrayList<Token> tokens = new ArrayList<Token>();
	Token t1 = new Token(1, "Crab Apple");
	Token t2 = new Token(10, "Skull");
	tokens.add(t1);
	tokens.add(t2);
	player.setTokens(tokens);
	ArrayList<Token> expected = tokens;
	ArrayList<Token> actual = player.getTokens();
	assertTrue("",expected == actual);
	}

}
