package tests.player;

import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.MoveableTile;
import code.model.Player;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class InsertShiftableTileTest {

	
	public void commonCode(int insertionTile){
		GameBoard gb = new GameBoard(1);
		gb.setupRandomBoard();
		Player p = gb.getBoard()[2][2].getPlayers().get(0);
		boolean expected = gb.checkIfInsertShiftableTileLegal(insertionTile);
		boolean actual = p.insertShiftableTile(insertionTile);
		assertTrue("",actual==expected);
	}
	
	@Test public void test_board1_0(){commonCode(0);}
	@Test public void test_board1_1(){commonCode(1);}
	@Test public void test_board1_2(){commonCode(2);}
	@Test public void test_board1_3(){commonCode(3);}
	@Test public void test_board1_4(){commonCode(4);}
	@Test public void test_board1_5(){commonCode(5);}
	@Test public void test_board1_6(){commonCode(6);}
	@Test public void test_board1_7(){commonCode(7);}
	@Test public void test_board1_8(){commonCode(8);}
	@Test public void test_board1_9(){commonCode(9);}
	@Test public void test_board1_10(){commonCode(10);}
	@Test public void test_board1_11(){commonCode(11);}
	@Test public void test_board1_12(){commonCode(12);}
	@Test public void test_board1_13(){commonCode(13);}
	@Test public void test_board1_14(){commonCode(14);}
	@Test public void test_board1_15(){commonCode(15);}
	@Test public void test_board1_16(){commonCode(16);}
	@Test public void test_board1_17(){commonCode(17);}
	@Test public void test_board1_18(){commonCode(18);}
	@Test public void test_board1_19(){commonCode(19);}
	@Test public void test_board1_20(){commonCode(20);}
	@Test public void test_board1_21(){commonCode(21);}
	@Test public void test_board1_22(){commonCode(22);}
	@Test public void test_board1_23(){commonCode(23);}
	@Test public void test_board1_24(){commonCode(24);}
	@Test public void test_board1_25(){commonCode(25);}
	@Test public void test_board1_26(){commonCode(26);}
	@Test public void test_board1_27(){commonCode(27);}
	@Test public void test_board1_28(){commonCode(28);}
	@Test public void test_board1_29(){commonCode(29);}
	@Test public void test_board1_30(){commonCode(30);}
	@Test public void test_board1_31(){commonCode(31);}
	@Test public void test_board1_32(){commonCode(32);}
	@Test public void test_board1_33(){commonCode(33);}
	@Test public void test_board1_34(){commonCode(34);}
	@Test public void test_board1_35(){commonCode(35);}
	@Test public void test_board1_36(){commonCode(36);}
	@Test public void test_board1_37(){commonCode(37);}
	@Test public void test_board1_38(){commonCode(38);}
	@Test public void test_board1_39(){commonCode(39);}
	@Test public void test_board1_40(){commonCode(40);}
	@Test public void test_board1_41(){commonCode(41);}
	@Test public void test_board1_42(){commonCode(42);}
	@Test public void test_board1_43(){commonCode(43);}
	@Test public void test_board1_44(){commonCode(44);}
	@Test public void test_board1_45(){commonCode(45);}
	@Test public void test_board1_46(){commonCode(46);}
	@Test public void test_board1_47(){commonCode(47);}
	@Test public void test_board1_48(){commonCode(48);}
	
	@Test public void test_board1_a2(){commonCode(-1000);}
	@Test public void test_board1_b2(){commonCode(1000);}
	@Test public void test_board1_c2(){commonCode(49);}
	@Test public void test_board1_d2(){commonCode(-1);}
	
	
	//test to see that a row of tiles actually shifts after an insertion at
		//a legal insertion point
		@Test public void test_that_a_row_of_tiles_actually_shifts(){
			GameBoard gb = new GameBoard(1);
			gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
			gb.populateBoardWithFixedTiles();
			gb.populateBoardWithMoveableTiles();
			gb.createAndPlacePlayers();
			Player p = gb.getBoard()[2][2].getPlayers().get(0);
			p.moveToTile(26);
			
			AbstractTile aShiftable = gb.getMoveableTileArray().get(0);
			AbstractTile a27 = gb.getTileFromTileNumber(27);
			AbstractTile a26 = gb.getTileFromTileNumber(26);
			AbstractTile a25 = gb.getTileFromTileNumber(25);
			AbstractTile a24 = gb.getTileFromTileNumber(24);
			AbstractTile a23 = gb.getTileFromTileNumber(23);
			AbstractTile a22 = gb.getTileFromTileNumber(22);
			AbstractTile a21 = gb.getTileFromTileNumber(21);
			
			boolean before1 = a26.hasPlayer();
			boolean before2 = a25.hasPlayer();
			
			//gb.checkIfInsertShiftableTileLegal(27);
			p.insertShiftableTile(27);
			
			AbstractTile bShiftable = gb.getMoveableTileArray().get(0);
			AbstractTile b27 = gb.getTileFromTileNumber(27);
			AbstractTile b26 = gb.getTileFromTileNumber(26);
			AbstractTile b25 = gb.getTileFromTileNumber(25);
			AbstractTile b24 = gb.getTileFromTileNumber(24);
			AbstractTile b23 = gb.getTileFromTileNumber(23);
			AbstractTile b22 = gb.getTileFromTileNumber(22);
			AbstractTile b21 = gb.getTileFromTileNumber(21);
			
			boolean after1 = b26.hasPlayer();
			boolean after2 = b25.hasPlayer();
			
			//if all of the compound boolean expression within the assertTrue call evaluates to
			//true, this means that the entire row shifted.
			assertTrue("",aShiftable==b27 && a27==b26 && a26==b25 && a25==b24 && a24==b23
			&& a23==b22 && a22==b21 && a21==bShiftable && before1 && !before2 && !after1 && after2);
		}
		
		@Test public void testThatYouCannotShiftBeforePopulatingBoardWithMoveableTiles(){
			GameBoard gb = new GameBoard(1);
			gb.populateBoardWithFixedTiles();
			gb.createAndPlacePlayers();
			Player p = gb.getBoard()[2][2].getPlayers().get(0);
			boolean expectedB = false;
			gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
			boolean actualB = p.insertShiftableTile(3);
			gb.populateBoardWithMoveableTiles();
			boolean expectedA = true;
			boolean actualA = p.insertShiftableTile(3);
			assertTrue("",expectedB==actualB && expectedA==actualA);
		}
		
		@Test
		public void testPlayerShift(){
			GameBoard gb = new GameBoard(4);
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
			
			gb.populateStaticMoveableTileArray(al);
			gb.setupStaticBoard();
			gb.getMoveableTileArray().get(0).rotate(90);
			
			Player p1 = gb.getBoard()[2][2].getPlayers().get(0);
			Player p2 = gb.getBoard()[2][4].getPlayers().get(0);
			Player p3 = gb.getBoard()[4][2].getPlayers().get(0);
			Player p4 = gb.getBoard()[4][4].getPlayers().get(0);
			
			boolean a1 = p1.insertShiftableTile(21);
			boolean a2 = p2.insertShiftableTile(43);
	
			gb.getMoveableTileArray().get(0).rotate(-270);
			
			boolean a3 = p3.insertShiftableTile(13);
			boolean a4 = p4.insertShiftableTile(3);
			boolean a5 = p1.insertShiftableTile(45);
			boolean a6 = p2.insertShiftableTile(44);
			
			boolean e1 = true;
			boolean e2 = false;
			
		    assertTrue("We expected "+ e1+e1+e1+e1+e2+e2 +" and actual is "+ a1+a2+a3+a4+a5+a6, (a1==e1 && a2==e1 && a3==e1 && a4==e1 && a5==e2 && a6==e2));
			
		}
		
		//static MoveableTiles #1 for Static Board #1
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
