package tests.player;

import static org.junit.Assert.*;

import org.junit.Test;

import code.model.Player;

public class SetScoreTests {

	@Test
	public void test01() {
		 Player player = new Player("Satya");
		player.setScore(10);
		 int expected = 10;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}

	public void test02() {
		 Player player = new Player("Satya");
		player.setScore(7);
		 int expected = 7;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}
	
	public void test03() {
		 Player player = new Player("Satya");
		player.setScore(6);
		 int expected = 6;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}

}
