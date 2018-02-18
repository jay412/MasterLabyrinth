package tests.abstracttile;

import code.model.MoveableTile;
import static org.junit.Assert.*;
import org.junit.Test;

//Satya, Josh, Ian 03-16-16

public class RotateTests {

	
	//Tests for T Tile Type
	//Starting configuration for T type is:
	//			1
	//		1		1
	//			0
	
	@Test
	public void Test_Ttype_0_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(0);
		//string is of the form "tblr"
		String expected = "1011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_invalidNumberOf_PositiveDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(333);
		//string is of the form "tblr"
		String expected = "1011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_invalidNumberOf_NegativeDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(-333);
		//string is of the form "tblr"
		String expected = "1011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_360_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(360);
		//string is of the form "tblr"
		String expected = "1011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_720_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(720);
		//string is of the form "tblr"
		String expected = "1011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(90);
		//string is of the form "tblr"
		String expected = "1110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_negative270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(-270);
		//string is of the form "tblr"
		String expected = "1110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(450);
		//string is of the form "tblr"
		String expected = "1110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_negative90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(-90);
		//string is of the form "tblr"
		String expected = "1101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(270);
		//string is of the form "tblr"
		String expected = "1101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_negative450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(-450);
		//string is of the form "tblr"
		String expected = "1101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(180);
		//string is of the form "tblr"
		String expected = "0111";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_negative180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(-180);
		//string is of the form "tblr"
		String expected = "0111";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_Ttype_540_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 1, 1);
		mT.rotate(540);
		//string is of the form "tblr"
		String expected = "0111";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	
	
	//Tests for Corner Tile Type
	//Starting configuration for L type is:
		//			1
		//		0		1
		//			0
	
	@Test
	public void Test_CornerType_0_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(0);
		//string is of the form "tblr"
		String expected = "1001";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_invalidNumberOf_PositiveDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(333);
		//string is of the form "tblr"
		String expected = "1001";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_invalidNumberOf_NegativeDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(-333);
		//string is of the form "tblr"
		String expected = "1001";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_360_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(360);
		//string is of the form "tblr"
		String expected = "1001";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_720_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(720);
		//string is of the form "tblr"
		String expected = "1001";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(90);
		//string is of the form "tblr"
		String expected = "1010";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_negative270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(-270);
		//string is of the form "tblr"
		String expected = "1010";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(450);
		//string is of the form "tblr"
		String expected = "1010";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_negative90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(-90);
		//string is of the form "tblr"
		String expected = "0101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(270);
		//string is of the form "tblr"
		String expected = "0101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_negative450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(-450);
		//string is of the form "tblr"
		String expected = "0101";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(180);
		//string is of the form "tblr"
		String expected = "0110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_negative180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(-180);
		//string is of the form "tblr"
		String expected = "0110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_CornerType_540_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(1, 0, 0, 1);
		mT.rotate(540);
		//string is of the form "tblr"
		String expected = "0110";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	
	//Tests for Straight Tile Type
		//Starting configuration for I type is:
			//			0
			//		1		1
			//			0
	
	@Test
	public void Test_StraightType_0_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(0);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_invalidNumberOf_PositiveDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(333);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_invalidNumberOf_NegativeDegrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(-333);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_360_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(360);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_720_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(720);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(90);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_negative270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(-270);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(450);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_negative90_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(-90);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_270_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(270);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_negative450_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(-450);
		//string is of the form "tblr"
		String expected = "1100";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(180);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_negative180_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(-180);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
	@Test
	public void Test_StraightType_540_Degrees(){
		MoveableTile mT = new MoveableTile();
		mT.setDirections(0, 0, 1, 1);
		mT.rotate(540);
		//string is of the form "tblr"
		String expected = "0011";
		String actual = "" + mT.getTop() + mT.getBottom() + mT.getLeft() + mT.getRight();
		assertTrue("We expected " + expected + " but got " + actual, expected.equals(actual));
		
	}
	
}
