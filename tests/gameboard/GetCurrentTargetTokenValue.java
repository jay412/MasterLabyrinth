package tests.gameboard;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.GameBoard;

public class GetCurrentTargetTokenValue {

	@Test
	public void test01() {
		 GameBoard gb = new GameBoard(2);
		 gb.populateTokenArray();
		 int expected = 1;
		 int actual = gb.getCurrentTargetTokenValue();
		 assertTrue("", expected == actual);
	}

	@Test
	public void test02() {
		 GameBoard gb = new GameBoard(2);
		 gb.populateTokenArray();
		 int expected = 2;
		 int actual = gb.getCurrentTargetTokenValue();
		 assertTrue("", expected != actual);
	}
}
