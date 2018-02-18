package tests.player;

import static org.junit.Assert.*;
import code.model.*;

import org.junit.Test;

public class GetScoreTests {

	@Test
	public void test01() {
		 Player player = new Player("Josh");
		player.setScore(5);
		 int expected = 5;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}

	public void test02() {
		 Player player = new Player("Josh");
		player.setScore(4);
		 int expected = 4;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}
	
	public void test03() {
		 Player player = new Player("Josh");
		player.setScore(0);
		 int expected = 0;
		 int actual = player.getScore();
		 assertTrue("",expected == actual);
	}
	
}
