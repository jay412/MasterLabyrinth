package tests.abstracttile;

import code.model.AbstractTile;
import code.model.MoveableTile;
import static org.junit.Assert.*;
import org.junit.Test;

public class GetRightTests {

	public void commonCode(String s, int degrees, int expected){
		AbstractTile at = new MoveableTile(s);
		at.rotate(degrees);
		int actual = at.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected==actual);
	}
	
	@Test public void TTile_test00(){commonCode("T",0,1);}
	@Test public void TTile_test01(){commonCode("T",90,0);}
	@Test public void TTile_test02(){commonCode("T",-90,1);}
	@Test public void TTile_test03(){commonCode("T",180,1);}
	@Test public void TTile_test04(){commonCode("T",-180,1);}
	@Test public void TTile_test05(){commonCode("T",360,1);}
	@Test public void TTile_test06(){commonCode("T",-360,1);}
	@Test public void TTile_test07(){commonCode("T",270,1);}
	@Test public void TTile_test08(){commonCode("T",-270,0);}
	@Test public void TTile_test09(){commonCode("T",720,1);}
	@Test public void TTile_test10(){commonCode("T",-720,1);}

	@Test public void LTile_test00(){commonCode("L",0,1);}
	@Test public void LTile_test01(){commonCode("L",90,0);}
	@Test public void LTile_test02(){commonCode("L",-90,1);}
	@Test public void LTile_test03(){commonCode("L",180,0);}
	@Test public void LTile_test04(){commonCode("L",-180,0);}
	@Test public void LTile_test05(){commonCode("L",360,1);}
	@Test public void LTile_test06(){commonCode("L",-360,1);}
	@Test public void LTile_test07(){commonCode("L",270,1);}
	@Test public void LTile_test08(){commonCode("L",-270,0);}
	@Test public void LTile_test09(){commonCode("L",720,1);}
	@Test public void LTile_test10(){commonCode("L",-720,1);}
	
	@Test public void ITile_test00(){commonCode("I",0,1);}
	@Test public void ITile_test01(){commonCode("I",90,0);}
	@Test public void ITile_test02(){commonCode("I",-90,0);}
	@Test public void ITile_test03(){commonCode("I",180,1);}
	@Test public void ITile_test04(){commonCode("I",-180,1);}
	@Test public void ITile_test05(){commonCode("I",360,1);}
	@Test public void ITile_test06(){commonCode("I",-360,1);}
	@Test public void ITile_test07(){commonCode("I",270,0);}
	@Test public void ITile_test08(){commonCode("I",-270,0);}
	@Test public void ITile_test09(){commonCode("I",720,1);}
	@Test public void ITile_test10(){commonCode("I",-720,1);}

}
