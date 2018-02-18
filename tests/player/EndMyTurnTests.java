package tests.player;
import code.gui.GameBoardGUI;
import code.model.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EndMyTurnTests {

	@Test
	public void test01(){
	GameBoard gb = new GameBoard(4);
	ArrayList<MoveableTile> al = staticMoveableTileArray1();
	gb.populateStaticMoveableTileArray(al);
	gb.setupStaticBoard();
	GameBoardGUI gbGUI = new GameBoardGUI(gb); 
	gbGUI.run();
	Player p = gb.getPlayers()[0];	
	boolean expected1 = true;
	boolean expected2 = true;
	p.insertShiftableTile(41);
	p.moveToTile(17);
	boolean actual1 = p.getHasInsertedThisTurn();
	boolean actual2 = p.getHasMovedThisTurn();
	p.endMyTurn();
	boolean expected3 = false;
	boolean expected4 = false;
	boolean actual3 = p.getHasInsertedThisTurn();
	boolean actual4 = p.getHasMovedThisTurn();
	assertTrue("", expected1 == actual1 && expected2 == actual2 && expected3 == actual3 && expected4 == actual4);
	}
	
	public ArrayList<MoveableTile> staticMoveableTileArray1(){
		ArrayList<MoveableTile> al = new ArrayList<MoveableTile>();
		//MOveableCol1
		MoveableTile m1 = new MoveableTile("I");
		al.add(m1);
		MoveableTile m2 = new MoveableTile("I");
		al.add(m2);
		MoveableTile m3 = new MoveableTile("I");
		m3.rotate(90);
		al.add(m3);
		MoveableTile m4 = new MoveableTile("I");
		m4.rotate(90);
		al.add(m4);
		MoveableTile m5 = new MoveableTile("L");
		m5.rotate(90);
		al.add(m5);
		MoveableTile m6 = new MoveableTile("I");
		m6.rotate(90);
		al.add(m6);
		MoveableTile m7 = new MoveableTile("I");
		al.add(m7);
		
		//MoveableCol2
		MoveableTile m8 = new MoveableTile("L");
		m8.rotate(180);
		al.add(m8);
		MoveableTile m9 = new MoveableTile("I");
		m9.rotate(90);
		al.add(m9);
		MoveableTile m10 = new MoveableTile("T");
		al.add(m10);
		MoveableTile m11 = new MoveableTile("I");
		m11.rotate(0);
		al.add(m11);
		MoveableTile m12 = new MoveableTile("L");
		m12.rotate(0);
		al.add(m12);
		MoveableTile m13 = new MoveableTile("T");
		m13.rotate(0);
		al.add(m13);
		MoveableTile m14 = new MoveableTile("L");
		m14.rotate(0);
		al.add(m14);
		
		//MoveableCol3
		MoveableTile m15 = new MoveableTile("L");
		al.add(m15);
		MoveableTile m16 = new MoveableTile("T");
		m16.rotate(0);
		al.add(m16);
		MoveableTile m17 = new MoveableTile("L");
		al.add(m17);
		MoveableTile m18 = new MoveableTile("L");
		m18.rotate(180);
		al.add(m18);
		MoveableTile m19 = new MoveableTile("T");
		m19.rotate(90);
		al.add(m19);
		MoveableTile m20 = new MoveableTile("L");
		m20.rotate(180);
		al.add(m20);
		MoveableTile m21 = new MoveableTile("T");
		m21.rotate(90);
		al.add(m21);
		
		//MoveableRow1
		MoveableTile m22 = new MoveableTile("T");
		m22.rotate(0);
		al.add(m22);
		MoveableTile m23 = new MoveableTile("L");
		m23.rotate(90);
		al.add(m23);
		MoveableTile m24 = new MoveableTile("I");
		m24.rotate(0);
		al.add(m24);
		MoveableTile m25 = new MoveableTile("L");
		m25.rotate(90);
		al.add(m25);
		
		//MoveableRow2
		MoveableTile m26 = new MoveableTile("L");
		m26.rotate(90);
		al.add(m26);
		MoveableTile m27 = new MoveableTile("I");
		m27.rotate(90);
		al.add(m27);
		MoveableTile m28 = new MoveableTile("L");
		m28.rotate(0);
		al.add(m28);
		MoveableTile m29 = new MoveableTile("L");
		m29.rotate(90);
		al.add(m29);
		
		//MoveableRow3
		MoveableTile m30 = new MoveableTile("L");
		m30.rotate(0);
		al.add(m30);
		MoveableTile m31 = new MoveableTile("I");
		m31.rotate(0);
		al.add(m31);
		MoveableTile m32 = new MoveableTile("I");
		m32.rotate(90);
		al.add(m32);
		MoveableTile m33 = new MoveableTile("I");
		m33.rotate(90);
		al.add(m33);
		
		MoveableTile m34 = new MoveableTile("L");
		al.add(m34);
		
		return al;
	}
}
