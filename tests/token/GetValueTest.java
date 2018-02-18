package tests.token;

import code.model.Token;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class GetValueTest {

	public void commonCode1(int i, int expected){
		ArrayList<Token> _tokens = new ArrayList<Token>();
		_tokens.add(new Token(1, "Crab Apple"));
		_tokens.add(new Token(2, "Pine Cone"));
		_tokens.add(new Token(3, "Oak Leaf"));
		_tokens.add(new Token(4, "Oil of Black Slugs"));
		_tokens.add(new Token(5, "Four-leaf Clover"));
		_tokens.add(new Token(6, "Garlic"));
		_tokens.add(new Token(7, "Raven's Feather"));
		_tokens.add(new Token(8, "Henbane"));
		_tokens.add(new Token(9, "Spider"));
		_tokens.add(new Token(10, "Skull"));
		_tokens.add(new Token(11, "Magic Wand Made of Blindworm"));
		_tokens.add(new Token(12, "Quartz"));
		_tokens.add(new Token(13, "Toad"));
		_tokens.add(new Token(14, "Fire Salamander"));
		_tokens.add(new Token(15, "Weasel Spit"));
		_tokens.add(new Token(16, "Silver Thistle"));
		_tokens.add(new Token(17, "Snake"));
		_tokens.add(new Token(18, "Emerald"));
		_tokens.add(new Token(19, "Root of Mandrake"));
		_tokens.add(new Token(20, "Black Rooster"));
		_tokens.add(new Token(25, "Berries of Mistletoe"));
		int actual = _tokens.get(i).getValue();
		assertTrue("",expected == actual);
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
