package tests.player;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetNameTests {

	@Test
	public void test0() {
		Player p = new Player("Blue");
		p.setName("Test");
		String expected = "Test";
		String actual = p.getName();
		assertTrue("",expected.equals(actual));
	}
	
	@Test
	public void test1() {
		Player p = new Player("Blue");
		String expected = null;
		String actual = p.getName();
		assertTrue("",expected==actual);
	}
	

}
