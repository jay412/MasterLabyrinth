package tests.token;
import code.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetTokenPickedUpStatusTests {

	@Test
	public void test0() {
		Token t = new Token(2, "Token Tester");
		t.setTokenPickedUpStatus();
		boolean expected = true;
		boolean actual = t.getTokenPickedUpStatus();
		assertTrue("",expected==actual);
	}
	
	@Test
	public void test1() {
		Token t = new Token(2, "Token Tester");
		boolean expected = false;
		boolean actual = t.getTokenPickedUpStatus();
		assertTrue("",expected==actual);
	}

}
