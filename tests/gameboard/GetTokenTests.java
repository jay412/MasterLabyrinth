package tests.gameboard;

import static org.junit.Assert.*;
import code.model.*;

import org.junit.Test;

public class GetTokenTests {

	@Test
	public void test01() {
		 GameBoard gb = new GameBoard(2);
		 gb.populateTokenArray();
		 int expected = 1;
		 int actual = gb.getToken(0).getValue();
		 assertTrue("",expected == actual);
	}
	
	@Test
	public void test02() {
		 GameBoard gb = new GameBoard(2);
		 gb.populateTokenArray();
		 int expected = 2;
		 int actual = gb.getToken(1).getValue();
		 assertTrue("",expected == actual);
	}
	
	@Test
	public void test03() {
		 GameBoard gb = new GameBoard(2);
		 gb.populateTokenArray();
		 int expected = 3;
		 int actual = gb.getToken(2).getValue();
		 assertTrue("",expected == actual);
	}

}
