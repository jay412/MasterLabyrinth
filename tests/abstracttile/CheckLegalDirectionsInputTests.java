package tests.abstracttile;

import code.model.AbstractTile;
import code.model.MoveableTile;
import static org.junit.Assert.*;
import org.junit.Test;

public class CheckLegalDirectionsInputTests {

	public void commonCode(int t, int b, int l, int r, boolean expected){
		AbstractTile aT = new MoveableTile();
		boolean actual = aT.checkLegalDirectionsInput(t, b, l, r);
		assertTrue("We expected " + expected + " but got " + actual, expected==actual);
	}

	@Test public void test05(){commonCode(0,0,1,1,true);}
	@Test public void test06(){commonCode(0,1,1,0,true);}
	@Test public void test07(){commonCode(1,1,0,0,true);}
	@Test public void test08(){commonCode(1,0,0,1,true);}
	@Test public void test09(){commonCode(1,0,1,0,true);}
	@Test public void test10(){commonCode(0,1,0,1,true);}
	
	@Test public void test11(){commonCode(0,1,1,1,true);}
	@Test public void test12(){commonCode(1,1,0,1,true);}
	@Test public void test13(){commonCode(1,1,1,0,true);}
	@Test public void test14(){commonCode(1,0,1,1,true);}
	
	@Test public void test00(){commonCode(0,0,0,0,false);}
	
	@Test public void test01(){commonCode(0,0,0,1,false);}
	@Test public void test02(){commonCode(0,0,1,0,false);}
	@Test public void test03(){commonCode(0,1,0,0,false);}
	@Test public void test04(){commonCode(1,0,0,0,false);}
	
	@Test public void test15(){commonCode(1,1,1,1,false);}
	
	@Test public void test16(){commonCode(1,1,2,0,false);}
	@Test public void test17(){commonCode(1,2,1,0,false);}
	@Test public void test18(){commonCode(2,1,1,0,false);}
	@Test public void test19(){commonCode(0,1,1,2,false);}
	@Test public void test20(){commonCode(0,2,1,1,false);}
	@Test public void test21(){commonCode(1,1,0,2,false);}
	@Test public void test22(){commonCode(2,0,1,1,false);}
	@Test public void test23(){commonCode(0,1,2,1,false);}
	
	@Test public void test25(){commonCode(0,0,0,2,false);}
	@Test public void test26(){commonCode(0,0,2,0,false);}
	@Test public void test27(){commonCode(0,2,0,0,false);}
	@Test public void test28(){commonCode(2,0,0,0,false);}
	
	@Test public void test29(){commonCode(0,0,2,2,false);}
	@Test public void test30(){commonCode(0,2,2,0,false);}
	@Test public void test31(){commonCode(2,2,0,0,false);}
	@Test public void test32(){commonCode(0,2,0,2,false);}
	@Test public void test33(){commonCode(2,0,2,0,false);}
	@Test public void test34(){commonCode(2,0,0,2,false);}
	
	@Test public void test35(){commonCode(0,0,0,-2,false);}
	@Test public void test36(){commonCode(0,0,-2,0,false);}
	@Test public void test37(){commonCode(0,-2,0,0,false);}
	@Test public void test38(){commonCode(-2,0,0,0,false);}
	
	@Test public void test39(){commonCode(0,0,-2,-2,false);}
	@Test public void test40(){commonCode(0,-2,-2,0,false);}
	@Test public void test41(){commonCode(-2,-2,0,0,false);}
	@Test public void test42(){commonCode(0,-2,0,-2,false);}
	@Test public void test43(){commonCode(-2,0,-2,0,false);}
	@Test public void test44(){commonCode(-2,0,0,-2,false);}
	
	@Test public void test45(){commonCode(0,0,2,1,false);}
	@Test public void test46(){commonCode(0,2,1,0,false);}
	@Test public void test47(){commonCode(2,1,0,0,false);}
	@Test public void test48(){commonCode(0,2,0,1,false);}
	@Test public void test49(){commonCode(2,0,1,0,false);}
	@Test public void test50(){commonCode(2,0,0,1,false);}
	@Test public void test51(){commonCode(0,0,1,2,false);}
	@Test public void test52(){commonCode(0,1,2,0,false);}
	@Test public void test53(){commonCode(1,2,0,0,false);}
	@Test public void test54(){commonCode(0,1,0,2,false);}
	@Test public void test55(){commonCode(1,0,2,0,false);}
	@Test public void test56(){commonCode(1,0,0,2,false);}
	
	@Test public void test57(){commonCode(1,1,1,2,false);}
	@Test public void test58(){commonCode(1,1,2,1,false);}
	@Test public void test59(){commonCode(2,1,1,1,false);}
	
	@Test public void test60(){commonCode(100,2,69,2,false);}
	@Test public void test61(){commonCode(2,50,2,90,false);}
	@Test public void test62(){commonCode(-1000,1000,30,67,false);}
	
}
	
	
