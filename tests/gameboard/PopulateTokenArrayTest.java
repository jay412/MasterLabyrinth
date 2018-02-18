package tests.gameboard;

import static org.junit.Assert.*;

import org.junit.Test;
import code.model.GameBoard;
import code.model.Token;

public class PopulateTokenArrayTest {
	public void commonCode1(int i, int expected){
		GameBoard gb = new GameBoard(4);
		gb.populateTokenArray();
		Token token = gb.getToken(i);
		int actual = token.getValue();
		assertTrue ("",actual == expected);
	}
	
	@Test public void test_commonCode1_00(){commonCode1(0,1);}
	@Test public void test_commonCode1_01(){commonCode1(1,2);}
	@Test public void test_commonCode1_02(){commonCode1(2,3);}
	@Test public void test_commonCode1_03(){commonCode1(3,4);}
	@Test public void test_commonCode1_04(){commonCode1(4,5);}
	@Test public void test_commonCode1_05(){commonCode1(5,6);}
	@Test public void test_commonCode1_06(){commonCode1(6,7);}
	@Test public void test_commonCode1_07(){commonCode1(7,8);}
	@Test public void test_commonCode1_08(){commonCode1(8,9);}
	@Test public void test_commonCode1_09(){commonCode1(9,10);}
	@Test public void test_commonCode1_10(){commonCode1(10,11);}
	@Test public void test_commonCode1_11(){commonCode1(11,12);}
	@Test public void test_commonCode1_12(){commonCode1(12,13);}
	@Test public void test_commonCode1_13(){commonCode1(13,14);}
	@Test public void test_commonCode1_14(){commonCode1(14,15);}
	@Test public void test_commonCode1_15(){commonCode1(15,16);}
	@Test public void test_commonCode1_16(){commonCode1(16,17);}
	@Test public void test_commonCode1_17(){commonCode1(17,18);}
	@Test public void test_commonCode1_18(){commonCode1(18,19);}
	@Test public void test_commonCode1_19(){commonCode1(19,20);}
	@Test public void test_commonCode1_20(){commonCode1(20,25);}
}
