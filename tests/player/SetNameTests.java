package tests.player;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetNameTests {

	@Test
	public void test0() {
		Player p = new Player("Red");
		p.setName("TestName");
		String expected = "TestName";
		String actual = p.getName();
		assertTrue("",expected.equals(actual));
	}
	
	@Test
	public void test1() {
		Player p = new Player("Red");
		String expected = null;
		String actual = p.getName();
		assertTrue("",expected==actual);
	}

}
