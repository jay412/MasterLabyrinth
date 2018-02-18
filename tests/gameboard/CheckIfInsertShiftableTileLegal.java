package tests.gameboard;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.MoveableTile;
import code.model.Player;

/**
 * 
 * @author Josh, Ian 03-21-16 3-7pm
 *
 */
public class CheckIfInsertShiftableTileLegal {
	
	//test that all 12 insertion points allowed for first insertion 
	//made during game  (and make sure that 49-12 = 37 tiles
	//are NOT valid insertion points)
	//This commonCode1 corresponds to static board 1 and tests test_board1_00-test_board1_49
	public void commonCode1(int insertionTile, boolean expected){
		GameBoard gb = new GameBoard(1);
		gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		boolean actual = gb.checkIfInsertShiftableTileLegal(insertionTile);
		assertTrue("We expected "+expected+" but got "+actual, expected==actual);
	}
	
	/* THE FOLLOWING MAIN METHOD WAS USED TO GENERATE THE EXPECTED VALUES AND 
	 * @Test STRINGS FOR USE IN THE TEST CASES THAT CALL COMMONCODE1 ABOVE
	 * 	public static void main(String[] args){
		GameBoard gb = new GameBoard(4);
		ArrayList<MoveableTile> al = staticMoveableTileArray1();
		gb.populateStaticMoveableTileArray(al);
		gb.setupStaticBoard();
		
		String path = "C:\\output\\output.txt";
		FileWriter w;
		try {
			w = new FileWriter(path,false);
			PrintWriter print_l = new PrintWriter(w);
			int count = 0; 
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(1);
			a.add(3);
			a.add(5);
			a.add(7);
			a.add(13);
			a.add(21);
			a.add(27);
			a.add(35);
			a.add(41);
			a.add(43);
			a.add(45);
			a.add(47);   
			boolean expected;
			for(int i = 0; i < 49; i++){
				
				if(a.contains(i)){
					expected = true;
				}
				else {
					expected = false;
				}
				String s = "@Test public void test_board1_"+count+"(){commonCode1("+i + "," + expected + ");}" ;
				print_l.printf("%s" + "%n", s);
				count++;
			}
			print_l.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 */
	
	
	//test that only 11 insertion points allowed for 2nd, 3rd, ..., nth
	//insertions made during the game, and that the last tilenumber 
	//associated with the shiftable tile is NOT allowed as an 
	//insertion point & check that 49-11 = 38 = 1 + 37 tiles are NOT valid
	//insertion points.
	//firstInsertionTile is restricted to all int values for which an insertion is allowed
	//that is, the set of tileNumbers {1,3,5,7,13,21,27,35,41,43,45,47}
	public void commonCode2(int firstInsertionTile, int secondInsertionTile, boolean expected){
		GameBoard gb = new GameBoard(1);
		gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		gb.checkIfInsertShiftableTileLegal(firstInsertionTile);
		boolean actual = gb.checkIfInsertShiftableTileLegal(secondInsertionTile);
		assertTrue("We expected "+expected+" but got "+actual, expected==actual);
	}

	/* THE FOLLOWING MAIN METHOD WAS USED TO GENERATE THE EXPECTED VALUES AND 
	 * @Test STRINGS FOR USE IN THE TEST CASES THAT CALL COMMONCODE2 ABOVE
	 * public static void main(String[] args){
		GameBoard gb = new GameBoard(4);
		ArrayList<MoveableTile> al = staticMoveableTileArray1();
		gb.populateStaticMoveableTileArray(al);
		gb.setupStaticBoard();
		
		String path = "C:\\output\\output5.txt";
		FileWriter w;
		try {
			w = new FileWriter(path,false);
			PrintWriter print_l = new PrintWriter(w);
			int count = 49; 
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(1);
			a.add(3);
			a.add(5);
			a.add(7);
			a.add(13);
			a.add(21);
			a.add(27);
			a.add(35);
			a.add(41);
			a.add(43);
			a.add(45);
			a.add(47);    
			
			for(int j = 0; j < a.size(); j++){
				for(int i = 0; i < 49; i++){
					boolean expected = false;
					int q = a.get(j);
					if(a.contains(i)) expected = true;
					if(q == 1 && i == 43) expected = false;
					if(q == 3 && i == 45) expected = false;
					if(q == 5 && i == 47) expected = false;
					if(q == 7 && i == 13) expected = false;
					if(q == 21 && i == 27) expected = false;
					if(q == 35 && i == 41) expected = false;
					if(q == 13 && i == 7) expected = false;
					if(q == 27 && i == 21) expected = false;
					if(q == 41 && i == 35) expected = false;
					if(q == 43 && i == 1) expected = false;
					if(q == 45 && i == 3) expected = false;
					if(q == 47 && i == 5) expected = false;
					
				
					String s = "@Test public void test_board1_"+count+"(){commonCode2("+a.get(j)+","+i+","+expected+");}";
					print_l.printf("%s" + "%n", s);
					count++;
				}
			}
		print_l.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 */
	
	
	//test if player on edge opposite from insertion point, gets
	//transported to insertion point
	public void commonCode3(int startingPosition, int shiftPosition){
		GameBoard gb = new GameBoard(0);
		gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
		gb.populateBoardWithFixedTiles();
		gb.populateBoardWithMoveableTiles();
		Player p = new Player("Blue");
		p.setGameBoard(gb);
		p.setCurrentTile(gb.getTileFromTileNumber(startingPosition));
		int[] coord = gb.getCoordinates(gb.getTileFromTileNumber(startingPosition));
		gb.getBoard()[coord[0]][coord[1]].addPlayer(p);
		int expected = shiftPosition;
		gb.checkIfInsertShiftableTileLegal(shiftPosition);
		int actual = gb.getTileNumFromTileReference(p.getCurrentTile());
		assertTrue("We expected "+expected+" but got "+actual, expected==actual);	
	}
	
	@Test public void test_commonCode3_0(){commonCode3(1,43);}
	@Test public void test_commonCode3_1(){commonCode3(3,45);}
	@Test public void test_commonCode3_2(){commonCode3(5,47);}
	@Test public void test_commonCode3_3(){commonCode3(7,13);}
	@Test public void test_commonCode3_4(){commonCode3(21,27);}
	@Test public void test_commonCode3_5(){commonCode3(35,41);}
	@Test public void test_commonCode3_6(){commonCode3(13,7);}
	@Test public void test_commonCode3_7(){commonCode3(27,21);}
	@Test public void test_commonCode3_8(){commonCode3(41,35);}
	@Test public void test_commonCode3_9(){commonCode3(43,1);}
	@Test public void test_commonCode3_10(){commonCode3(45,3);}
	@Test public void test_commonCode3_12(){commonCode3(47,5);}
	
	@Test public void testThatYouCannotShiftBeforePopulatingBoardWithMoveableTiles(){
		GameBoard gb = new GameBoard(1);
		boolean expectedB = false;
		gb.populateStaticMoveableTileArray(staticMoveableTileArray1());
		boolean actualB = gb.checkIfInsertShiftableTileLegal(3);
		gb.populateBoardWithMoveableTiles();
		boolean expectedA = true;
		boolean actualA = gb.checkIfInsertShiftableTileLegal(3);
		assertTrue("",expectedB==actualB && expectedA==actualA);
	}
	
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
		
		gb.checkIfInsertShiftableTileLegal(27);
		
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
	
	@Test
	public void testPlayerShift(){
		GameBoard gb = new GameBoard(1);
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
		
//		System.out.println("Original Board at Beginning:\n");
//		gb.printBoard();
//		System.out.print("\n\n");
		
		
		gb.getMoveableTileArray().get(0).rotate(90);
//		System.out.println("Rotate shiftable by 90:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
//		System.out.println("Insert Tile at 21:\n");
		boolean a1 = gb.checkIfInsertShiftableTileLegal(21);
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		
		boolean a2 = gb.checkIfInsertShiftableTileLegal(43);
//		System.out.println("Insert Tile at 43:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		
//		System.out.println("Rotated shiftable -270 degrees:\n");
		gb.getMoveableTileArray().get(0).rotate(-270);
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		boolean a3 = gb.checkIfInsertShiftableTileLegal(13);
//		System.out.println("Insert Tile at 13:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		
		boolean a4 = gb.checkIfInsertShiftableTileLegal(3);
//		System.out.println("Insert Tile at 3:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		
//		gb.getMoveableTileArray().get(0).rotate(-90);
//		System.out.println("Rotated shiftable -90:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		boolean a5 = gb.checkIfInsertShiftableTileLegal(45);
//		System.out.println("Insert Tile at 45:\n");
//		gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		
		boolean a6 = gb.checkIfInsertShiftableTileLegal(44);
//		System.out.println("Insert Tile at 44:\n");
//		//gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
//		
//		//gb.printBoard();
//		System.out.println("\nShiftable's Last TileNum is: " + gb.getMoveableTileArray().get(0).getLastTileNum());
//		System.out.print("\n\n");
		
		boolean e1 = true;
		boolean e2 = false;
		
	    assertTrue("We expected "+ e1+e1+e1+e1+e2+e2 +" and actual is "+ a1+a2+a3+a4+a5+a6, (a1==e1 && a2==e1 && a3==e1 && a4==e1 && a5==e2 && a6==e2));
		
	}
	
	@Test public void test_board1_a(){commonCode1(-1000,false);}
	@Test public void test_board1_b(){commonCode1(1000,false);}
	@Test public void test_board1_c(){commonCode1(49,false);}
	@Test public void test_board1_d(){commonCode1(-1,false);}
		
	@Test public void test_board1_0(){commonCode1(0,false);}
	@Test public void test_board1_1(){commonCode1(1,true);}
	@Test public void test_board1_2(){commonCode1(2,false);}
	@Test public void test_board1_3(){commonCode1(3,true);}
	@Test public void test_board1_4(){commonCode1(4,false);}
	@Test public void test_board1_5(){commonCode1(5,true);}
	@Test public void test_board1_6(){commonCode1(6,false);}
	@Test public void test_board1_7(){commonCode1(7,true);}
	@Test public void test_board1_8(){commonCode1(8,false);}
	@Test public void test_board1_9(){commonCode1(9,false);}
	@Test public void test_board1_10(){commonCode1(10,false);}
	@Test public void test_board1_11(){commonCode1(11,false);}
	@Test public void test_board1_12(){commonCode1(12,false);}
	@Test public void test_board1_13(){commonCode1(13,true);}
	@Test public void test_board1_14(){commonCode1(14,false);}
	@Test public void test_board1_15(){commonCode1(15,false);}
	@Test public void test_board1_16(){commonCode1(16,false);}
	@Test public void test_board1_17(){commonCode1(17,false);}
	@Test public void test_board1_18(){commonCode1(18,false);}
	@Test public void test_board1_19(){commonCode1(19,false);}
	@Test public void test_board1_20(){commonCode1(20,false);}
	@Test public void test_board1_21(){commonCode1(21,true);}
	@Test public void test_board1_22(){commonCode1(22,false);}
	@Test public void test_board1_23(){commonCode1(23,false);}
	@Test public void test_board1_24(){commonCode1(24,false);}
	@Test public void test_board1_25(){commonCode1(25,false);}
	@Test public void test_board1_26(){commonCode1(26,false);}
	@Test public void test_board1_27(){commonCode1(27,true);}
	@Test public void test_board1_28(){commonCode1(28,false);}
	@Test public void test_board1_29(){commonCode1(29,false);}
	@Test public void test_board1_30(){commonCode1(30,false);}
	@Test public void test_board1_31(){commonCode1(31,false);}
	@Test public void test_board1_32(){commonCode1(32,false);}
	@Test public void test_board1_33(){commonCode1(33,false);}
	@Test public void test_board1_34(){commonCode1(34,false);}
	@Test public void test_board1_35(){commonCode1(35,true);}
	@Test public void test_board1_36(){commonCode1(36,false);}
	@Test public void test_board1_37(){commonCode1(37,false);}
	@Test public void test_board1_38(){commonCode1(38,false);}
	@Test public void test_board1_39(){commonCode1(39,false);}
	@Test public void test_board1_40(){commonCode1(40,false);}
	@Test public void test_board1_41(){commonCode1(41,true);}
	@Test public void test_board1_42(){commonCode1(42,false);}
	@Test public void test_board1_43(){commonCode1(43,true);}
	@Test public void test_board1_44(){commonCode1(44,false);}
	@Test public void test_board1_45(){commonCode1(45,true);}
	@Test public void test_board1_46(){commonCode1(46,false);}
	@Test public void test_board1_47(){commonCode1(47,true);}
	@Test public void test_board1_48(){commonCode1(48,false);}
	
	@Test public void test_board1_a2(){commonCode2(1,-1000,false);}
	@Test public void test_board1_b2(){commonCode2(1,1000,false);}
	@Test public void test_board1_c2(){commonCode2(1,49,false);}
	@Test public void test_board1_d2(){commonCode2(1,-1,false);}
	
	@Test public void test_board1_49(){commonCode2(1,0,false);}
	@Test public void test_board1_50(){commonCode2(1,1,true);}
	@Test public void test_board1_51(){commonCode2(1,2,false);}
	@Test public void test_board1_52(){commonCode2(1,3,true);}
	@Test public void test_board1_53(){commonCode2(1,4,false);}
	@Test public void test_board1_54(){commonCode2(1,5,true);}
	@Test public void test_board1_55(){commonCode2(1,6,false);}
	@Test public void test_board1_56(){commonCode2(1,7,true);}
	@Test public void test_board1_57(){commonCode2(1,8,false);}
	@Test public void test_board1_58(){commonCode2(1,9,false);}
	@Test public void test_board1_59(){commonCode2(1,10,false);}
	@Test public void test_board1_60(){commonCode2(1,11,false);}
	@Test public void test_board1_61(){commonCode2(1,12,false);}
	@Test public void test_board1_62(){commonCode2(1,13,true);}
	@Test public void test_board1_63(){commonCode2(1,14,false);}
	@Test public void test_board1_64(){commonCode2(1,15,false);}
	@Test public void test_board1_65(){commonCode2(1,16,false);}
	@Test public void test_board1_66(){commonCode2(1,17,false);}
	@Test public void test_board1_67(){commonCode2(1,18,false);}
	@Test public void test_board1_68(){commonCode2(1,19,false);}
	@Test public void test_board1_69(){commonCode2(1,20,false);}
	@Test public void test_board1_70(){commonCode2(1,21,true);}
	@Test public void test_board1_71(){commonCode2(1,22,false);}
	@Test public void test_board1_72(){commonCode2(1,23,false);}
	@Test public void test_board1_73(){commonCode2(1,24,false);}
	@Test public void test_board1_74(){commonCode2(1,25,false);}
	@Test public void test_board1_75(){commonCode2(1,26,false);}
	@Test public void test_board1_76(){commonCode2(1,27,true);}
	@Test public void test_board1_77(){commonCode2(1,28,false);}
	@Test public void test_board1_78(){commonCode2(1,29,false);}
	@Test public void test_board1_79(){commonCode2(1,30,false);}
	@Test public void test_board1_80(){commonCode2(1,31,false);}
	@Test public void test_board1_81(){commonCode2(1,32,false);}
	@Test public void test_board1_82(){commonCode2(1,33,false);}
	@Test public void test_board1_83(){commonCode2(1,34,false);}
	@Test public void test_board1_84(){commonCode2(1,35,true);}
	@Test public void test_board1_85(){commonCode2(1,36,false);}
	@Test public void test_board1_86(){commonCode2(1,37,false);}
	@Test public void test_board1_87(){commonCode2(1,38,false);}
	@Test public void test_board1_88(){commonCode2(1,39,false);}
	@Test public void test_board1_89(){commonCode2(1,40,false);}
	@Test public void test_board1_90(){commonCode2(1,41,true);}
	@Test public void test_board1_91(){commonCode2(1,42,false);}
	@Test public void test_board1_92(){commonCode2(1,43,false);}
	@Test public void test_board1_93(){commonCode2(1,44,false);}
	@Test public void test_board1_94(){commonCode2(1,45,true);}
	@Test public void test_board1_95(){commonCode2(1,46,false);}
	@Test public void test_board1_96(){commonCode2(1,47,true);}
	@Test public void test_board1_97(){commonCode2(1,48,false);}
	@Test public void test_board1_98(){commonCode2(3,0,false);}
	@Test public void test_board1_99(){commonCode2(3,1,true);}
	@Test public void test_board1_100(){commonCode2(3,2,false);}
	@Test public void test_board1_101(){commonCode2(3,3,true);}
	@Test public void test_board1_102(){commonCode2(3,4,false);}
	@Test public void test_board1_103(){commonCode2(3,5,true);}
	@Test public void test_board1_104(){commonCode2(3,6,false);}
	@Test public void test_board1_105(){commonCode2(3,7,true);}
	@Test public void test_board1_106(){commonCode2(3,8,false);}
	@Test public void test_board1_107(){commonCode2(3,9,false);}
	@Test public void test_board1_108(){commonCode2(3,10,false);}
	@Test public void test_board1_109(){commonCode2(3,11,false);}
	@Test public void test_board1_110(){commonCode2(3,12,false);}
	@Test public void test_board1_111(){commonCode2(3,13,true);}
	@Test public void test_board1_112(){commonCode2(3,14,false);}
	@Test public void test_board1_113(){commonCode2(3,15,false);}
	@Test public void test_board1_114(){commonCode2(3,16,false);}
	@Test public void test_board1_115(){commonCode2(3,17,false);}
	@Test public void test_board1_116(){commonCode2(3,18,false);}
	@Test public void test_board1_117(){commonCode2(3,19,false);}
	@Test public void test_board1_118(){commonCode2(3,20,false);}
	@Test public void test_board1_119(){commonCode2(3,21,true);}
	@Test public void test_board1_120(){commonCode2(3,22,false);}
	@Test public void test_board1_121(){commonCode2(3,23,false);}
	@Test public void test_board1_122(){commonCode2(3,24,false);}
	@Test public void test_board1_123(){commonCode2(3,25,false);}
	@Test public void test_board1_124(){commonCode2(3,26,false);}
	@Test public void test_board1_125(){commonCode2(3,27,true);}
	@Test public void test_board1_126(){commonCode2(3,28,false);}
	@Test public void test_board1_127(){commonCode2(3,29,false);}
	@Test public void test_board1_128(){commonCode2(3,30,false);}
	@Test public void test_board1_129(){commonCode2(3,31,false);}
	@Test public void test_board1_130(){commonCode2(3,32,false);}
	@Test public void test_board1_131(){commonCode2(3,33,false);}
	@Test public void test_board1_132(){commonCode2(3,34,false);}
	@Test public void test_board1_133(){commonCode2(3,35,true);}
	@Test public void test_board1_134(){commonCode2(3,36,false);}
	@Test public void test_board1_135(){commonCode2(3,37,false);}
	@Test public void test_board1_136(){commonCode2(3,38,false);}
	@Test public void test_board1_137(){commonCode2(3,39,false);}
	@Test public void test_board1_138(){commonCode2(3,40,false);}
	@Test public void test_board1_139(){commonCode2(3,41,true);}
	@Test public void test_board1_140(){commonCode2(3,42,false);}
	@Test public void test_board1_141(){commonCode2(3,43,true);}
	@Test public void test_board1_142(){commonCode2(3,44,false);}
	@Test public void test_board1_143(){commonCode2(3,45,false);}
	@Test public void test_board1_144(){commonCode2(3,46,false);}
	@Test public void test_board1_145(){commonCode2(3,47,true);}
	@Test public void test_board1_146(){commonCode2(3,48,false);}
	@Test public void test_board1_147(){commonCode2(5,0,false);}
	@Test public void test_board1_148(){commonCode2(5,1,true);}
	@Test public void test_board1_149(){commonCode2(5,2,false);}
	@Test public void test_board1_150(){commonCode2(5,3,true);}
	@Test public void test_board1_151(){commonCode2(5,4,false);}
	@Test public void test_board1_152(){commonCode2(5,5,true);}
	@Test public void test_board1_153(){commonCode2(5,6,false);}
	@Test public void test_board1_154(){commonCode2(5,7,true);}
	@Test public void test_board1_155(){commonCode2(5,8,false);}
	@Test public void test_board1_156(){commonCode2(5,9,false);}
	@Test public void test_board1_157(){commonCode2(5,10,false);}
	@Test public void test_board1_158(){commonCode2(5,11,false);}
	@Test public void test_board1_159(){commonCode2(5,12,false);}
	@Test public void test_board1_160(){commonCode2(5,13,true);}
	@Test public void test_board1_161(){commonCode2(5,14,false);}
	@Test public void test_board1_162(){commonCode2(5,15,false);}
	@Test public void test_board1_163(){commonCode2(5,16,false);}
	@Test public void test_board1_164(){commonCode2(5,17,false);}
	@Test public void test_board1_165(){commonCode2(5,18,false);}
	@Test public void test_board1_166(){commonCode2(5,19,false);}
	@Test public void test_board1_167(){commonCode2(5,20,false);}
	@Test public void test_board1_168(){commonCode2(5,21,true);}
	@Test public void test_board1_169(){commonCode2(5,22,false);}
	@Test public void test_board1_170(){commonCode2(5,23,false);}
	@Test public void test_board1_171(){commonCode2(5,24,false);}
	@Test public void test_board1_172(){commonCode2(5,25,false);}
	@Test public void test_board1_173(){commonCode2(5,26,false);}
	@Test public void test_board1_174(){commonCode2(5,27,true);}
	@Test public void test_board1_175(){commonCode2(5,28,false);}
	@Test public void test_board1_176(){commonCode2(5,29,false);}
	@Test public void test_board1_177(){commonCode2(5,30,false);}
	@Test public void test_board1_178(){commonCode2(5,31,false);}
	@Test public void test_board1_179(){commonCode2(5,32,false);}
	@Test public void test_board1_180(){commonCode2(5,33,false);}
	@Test public void test_board1_181(){commonCode2(5,34,false);}
	@Test public void test_board1_182(){commonCode2(5,35,true);}
	@Test public void test_board1_183(){commonCode2(5,36,false);}
	@Test public void test_board1_184(){commonCode2(5,37,false);}
	@Test public void test_board1_185(){commonCode2(5,38,false);}
	@Test public void test_board1_186(){commonCode2(5,39,false);}
	@Test public void test_board1_187(){commonCode2(5,40,false);}
	@Test public void test_board1_188(){commonCode2(5,41,true);}
	@Test public void test_board1_189(){commonCode2(5,42,false);}
	@Test public void test_board1_190(){commonCode2(5,43,true);}
	@Test public void test_board1_191(){commonCode2(5,44,false);}
	@Test public void test_board1_192(){commonCode2(5,45,true);}
	@Test public void test_board1_193(){commonCode2(5,46,false);}
	@Test public void test_board1_194(){commonCode2(5,47,false);}
	@Test public void test_board1_195(){commonCode2(5,48,false);}
	@Test public void test_board1_196(){commonCode2(7,0,false);}
	@Test public void test_board1_197(){commonCode2(7,1,true);}
	@Test public void test_board1_198(){commonCode2(7,2,false);}
	@Test public void test_board1_199(){commonCode2(7,3,true);}
	@Test public void test_board1_200(){commonCode2(7,4,false);}
	@Test public void test_board1_201(){commonCode2(7,5,true);}
	@Test public void test_board1_202(){commonCode2(7,6,false);}
	@Test public void test_board1_203(){commonCode2(7,7,true);}
	@Test public void test_board1_204(){commonCode2(7,8,false);}
	@Test public void test_board1_205(){commonCode2(7,9,false);}
	@Test public void test_board1_206(){commonCode2(7,10,false);}
	@Test public void test_board1_207(){commonCode2(7,11,false);}
	@Test public void test_board1_208(){commonCode2(7,12,false);}
	@Test public void test_board1_209(){commonCode2(7,13,false);}
	@Test public void test_board1_210(){commonCode2(7,14,false);}
	@Test public void test_board1_211(){commonCode2(7,15,false);}
	@Test public void test_board1_212(){commonCode2(7,16,false);}
	@Test public void test_board1_213(){commonCode2(7,17,false);}
	@Test public void test_board1_214(){commonCode2(7,18,false);}
	@Test public void test_board1_215(){commonCode2(7,19,false);}
	@Test public void test_board1_216(){commonCode2(7,20,false);}
	@Test public void test_board1_217(){commonCode2(7,21,true);}
	@Test public void test_board1_218(){commonCode2(7,22,false);}
	@Test public void test_board1_219(){commonCode2(7,23,false);}
	@Test public void test_board1_220(){commonCode2(7,24,false);}
	@Test public void test_board1_221(){commonCode2(7,25,false);}
	@Test public void test_board1_222(){commonCode2(7,26,false);}
	@Test public void test_board1_223(){commonCode2(7,27,true);}
	@Test public void test_board1_224(){commonCode2(7,28,false);}
	@Test public void test_board1_225(){commonCode2(7,29,false);}
	@Test public void test_board1_226(){commonCode2(7,30,false);}
	@Test public void test_board1_227(){commonCode2(7,31,false);}
	@Test public void test_board1_228(){commonCode2(7,32,false);}
	@Test public void test_board1_229(){commonCode2(7,33,false);}
	@Test public void test_board1_230(){commonCode2(7,34,false);}
	@Test public void test_board1_231(){commonCode2(7,35,true);}
	@Test public void test_board1_232(){commonCode2(7,36,false);}
	@Test public void test_board1_233(){commonCode2(7,37,false);}
	@Test public void test_board1_234(){commonCode2(7,38,false);}
	@Test public void test_board1_235(){commonCode2(7,39,false);}
	@Test public void test_board1_236(){commonCode2(7,40,false);}
	@Test public void test_board1_237(){commonCode2(7,41,true);}
	@Test public void test_board1_238(){commonCode2(7,42,false);}
	@Test public void test_board1_239(){commonCode2(7,43,true);}
	@Test public void test_board1_240(){commonCode2(7,44,false);}
	@Test public void test_board1_241(){commonCode2(7,45,true);}
	@Test public void test_board1_242(){commonCode2(7,46,false);}
	@Test public void test_board1_243(){commonCode2(7,47,true);}
	@Test public void test_board1_244(){commonCode2(7,48,false);}
	@Test public void test_board1_245(){commonCode2(13,0,false);}
	@Test public void test_board1_246(){commonCode2(13,1,true);}
	@Test public void test_board1_247(){commonCode2(13,2,false);}
	@Test public void test_board1_248(){commonCode2(13,3,true);}
	@Test public void test_board1_249(){commonCode2(13,4,false);}
	@Test public void test_board1_250(){commonCode2(13,5,true);}
	@Test public void test_board1_251(){commonCode2(13,6,false);}
	@Test public void test_board1_252(){commonCode2(13,7,false);}
	@Test public void test_board1_253(){commonCode2(13,8,false);}
	@Test public void test_board1_254(){commonCode2(13,9,false);}
	@Test public void test_board1_255(){commonCode2(13,10,false);}
	@Test public void test_board1_256(){commonCode2(13,11,false);}
	@Test public void test_board1_257(){commonCode2(13,12,false);}
	@Test public void test_board1_258(){commonCode2(13,13,true);}
	@Test public void test_board1_259(){commonCode2(13,14,false);}
	@Test public void test_board1_260(){commonCode2(13,15,false);}
	@Test public void test_board1_261(){commonCode2(13,16,false);}
	@Test public void test_board1_262(){commonCode2(13,17,false);}
	@Test public void test_board1_263(){commonCode2(13,18,false);}
	@Test public void test_board1_264(){commonCode2(13,19,false);}
	@Test public void test_board1_265(){commonCode2(13,20,false);}
	@Test public void test_board1_266(){commonCode2(13,21,true);}
	@Test public void test_board1_267(){commonCode2(13,22,false);}
	@Test public void test_board1_268(){commonCode2(13,23,false);}
	@Test public void test_board1_269(){commonCode2(13,24,false);}
	@Test public void test_board1_270(){commonCode2(13,25,false);}
	@Test public void test_board1_271(){commonCode2(13,26,false);}
	@Test public void test_board1_272(){commonCode2(13,27,true);}
	@Test public void test_board1_273(){commonCode2(13,28,false);}
	@Test public void test_board1_274(){commonCode2(13,29,false);}
	@Test public void test_board1_275(){commonCode2(13,30,false);}
	@Test public void test_board1_276(){commonCode2(13,31,false);}
	@Test public void test_board1_277(){commonCode2(13,32,false);}
	@Test public void test_board1_278(){commonCode2(13,33,false);}
	@Test public void test_board1_279(){commonCode2(13,34,false);}
	@Test public void test_board1_280(){commonCode2(13,35,true);}
	@Test public void test_board1_281(){commonCode2(13,36,false);}
	@Test public void test_board1_282(){commonCode2(13,37,false);}
	@Test public void test_board1_283(){commonCode2(13,38,false);}
	@Test public void test_board1_284(){commonCode2(13,39,false);}
	@Test public void test_board1_285(){commonCode2(13,40,false);}
	@Test public void test_board1_286(){commonCode2(13,41,true);}
	@Test public void test_board1_287(){commonCode2(13,42,false);}
	@Test public void test_board1_288(){commonCode2(13,43,true);}
	@Test public void test_board1_289(){commonCode2(13,44,false);}
	@Test public void test_board1_290(){commonCode2(13,45,true);}
	@Test public void test_board1_291(){commonCode2(13,46,false);}
	@Test public void test_board1_292(){commonCode2(13,47,true);}
	@Test public void test_board1_293(){commonCode2(13,48,false);}
	@Test public void test_board1_294(){commonCode2(21,0,false);}
	@Test public void test_board1_295(){commonCode2(21,1,true);}
	@Test public void test_board1_296(){commonCode2(21,2,false);}
	@Test public void test_board1_297(){commonCode2(21,3,true);}
	@Test public void test_board1_298(){commonCode2(21,4,false);}
	@Test public void test_board1_299(){commonCode2(21,5,true);}
	@Test public void test_board1_300(){commonCode2(21,6,false);}
	@Test public void test_board1_301(){commonCode2(21,7,true);}
	@Test public void test_board1_302(){commonCode2(21,8,false);}
	@Test public void test_board1_303(){commonCode2(21,9,false);}
	@Test public void test_board1_304(){commonCode2(21,10,false);}
	@Test public void test_board1_305(){commonCode2(21,11,false);}
	@Test public void test_board1_306(){commonCode2(21,12,false);}
	@Test public void test_board1_307(){commonCode2(21,13,true);}
	@Test public void test_board1_308(){commonCode2(21,14,false);}
	@Test public void test_board1_309(){commonCode2(21,15,false);}
	@Test public void test_board1_310(){commonCode2(21,16,false);}
	@Test public void test_board1_311(){commonCode2(21,17,false);}
	@Test public void test_board1_312(){commonCode2(21,18,false);}
	@Test public void test_board1_313(){commonCode2(21,19,false);}
	@Test public void test_board1_314(){commonCode2(21,20,false);}
	@Test public void test_board1_315(){commonCode2(21,21,true);}
	@Test public void test_board1_316(){commonCode2(21,22,false);}
	@Test public void test_board1_317(){commonCode2(21,23,false);}
	@Test public void test_board1_318(){commonCode2(21,24,false);}
	@Test public void test_board1_319(){commonCode2(21,25,false);}
	@Test public void test_board1_320(){commonCode2(21,26,false);}
	@Test public void test_board1_321(){commonCode2(21,27,false);}
	@Test public void test_board1_322(){commonCode2(21,28,false);}
	@Test public void test_board1_323(){commonCode2(21,29,false);}
	@Test public void test_board1_324(){commonCode2(21,30,false);}
	@Test public void test_board1_325(){commonCode2(21,31,false);}
	@Test public void test_board1_326(){commonCode2(21,32,false);}
	@Test public void test_board1_327(){commonCode2(21,33,false);}
	@Test public void test_board1_328(){commonCode2(21,34,false);}
	@Test public void test_board1_329(){commonCode2(21,35,true);}
	@Test public void test_board1_330(){commonCode2(21,36,false);}
	@Test public void test_board1_331(){commonCode2(21,37,false);}
	@Test public void test_board1_332(){commonCode2(21,38,false);}
	@Test public void test_board1_333(){commonCode2(21,39,false);}
	@Test public void test_board1_334(){commonCode2(21,40,false);}
	@Test public void test_board1_335(){commonCode2(21,41,true);}
	@Test public void test_board1_336(){commonCode2(21,42,false);}
	@Test public void test_board1_337(){commonCode2(21,43,true);}
	@Test public void test_board1_338(){commonCode2(21,44,false);}
	@Test public void test_board1_339(){commonCode2(21,45,true);}
	@Test public void test_board1_340(){commonCode2(21,46,false);}
	@Test public void test_board1_341(){commonCode2(21,47,true);}
	@Test public void test_board1_342(){commonCode2(21,48,false);}
	@Test public void test_board1_343(){commonCode2(27,0,false);}
	@Test public void test_board1_344(){commonCode2(27,1,true);}
	@Test public void test_board1_345(){commonCode2(27,2,false);}
	@Test public void test_board1_346(){commonCode2(27,3,true);}
	@Test public void test_board1_347(){commonCode2(27,4,false);}
	@Test public void test_board1_348(){commonCode2(27,5,true);}
	@Test public void test_board1_349(){commonCode2(27,6,false);}
	@Test public void test_board1_350(){commonCode2(27,7,true);}
	@Test public void test_board1_351(){commonCode2(27,8,false);}
	@Test public void test_board1_352(){commonCode2(27,9,false);}
	@Test public void test_board1_353(){commonCode2(27,10,false);}
	@Test public void test_board1_354(){commonCode2(27,11,false);}
	@Test public void test_board1_355(){commonCode2(27,12,false);}
	@Test public void test_board1_356(){commonCode2(27,13,true);}
	@Test public void test_board1_357(){commonCode2(27,14,false);}
	@Test public void test_board1_358(){commonCode2(27,15,false);}
	@Test public void test_board1_359(){commonCode2(27,16,false);}
	@Test public void test_board1_360(){commonCode2(27,17,false);}
	@Test public void test_board1_361(){commonCode2(27,18,false);}
	@Test public void test_board1_362(){commonCode2(27,19,false);}
	@Test public void test_board1_363(){commonCode2(27,20,false);}
	@Test public void test_board1_364(){commonCode2(27,21,false);}
	@Test public void test_board1_365(){commonCode2(27,22,false);}
	@Test public void test_board1_366(){commonCode2(27,23,false);}
	@Test public void test_board1_367(){commonCode2(27,24,false);}
	@Test public void test_board1_368(){commonCode2(27,25,false);}
	@Test public void test_board1_369(){commonCode2(27,26,false);}
	@Test public void test_board1_370(){commonCode2(27,27,true);}
	@Test public void test_board1_371(){commonCode2(27,28,false);}
	@Test public void test_board1_372(){commonCode2(27,29,false);}
	@Test public void test_board1_373(){commonCode2(27,30,false);}
	@Test public void test_board1_374(){commonCode2(27,31,false);}
	@Test public void test_board1_375(){commonCode2(27,32,false);}
	@Test public void test_board1_376(){commonCode2(27,33,false);}
	@Test public void test_board1_377(){commonCode2(27,34,false);}
	@Test public void test_board1_378(){commonCode2(27,35,true);}
	@Test public void test_board1_379(){commonCode2(27,36,false);}
	@Test public void test_board1_380(){commonCode2(27,37,false);}
	@Test public void test_board1_381(){commonCode2(27,38,false);}
	@Test public void test_board1_382(){commonCode2(27,39,false);}
	@Test public void test_board1_383(){commonCode2(27,40,false);}
	@Test public void test_board1_384(){commonCode2(27,41,true);}
	@Test public void test_board1_385(){commonCode2(27,42,false);}
	@Test public void test_board1_386(){commonCode2(27,43,true);}
	@Test public void test_board1_387(){commonCode2(27,44,false);}
	@Test public void test_board1_388(){commonCode2(27,45,true);}
	@Test public void test_board1_389(){commonCode2(27,46,false);}
	@Test public void test_board1_390(){commonCode2(27,47,true);}
	@Test public void test_board1_391(){commonCode2(27,48,false);}
	@Test public void test_board1_392(){commonCode2(35,0,false);}
	@Test public void test_board1_393(){commonCode2(35,1,true);}
	@Test public void test_board1_394(){commonCode2(35,2,false);}
	@Test public void test_board1_395(){commonCode2(35,3,true);}
	@Test public void test_board1_396(){commonCode2(35,4,false);}
	@Test public void test_board1_397(){commonCode2(35,5,true);}
	@Test public void test_board1_398(){commonCode2(35,6,false);}
	@Test public void test_board1_399(){commonCode2(35,7,true);}
	@Test public void test_board1_400(){commonCode2(35,8,false);}
	@Test public void test_board1_401(){commonCode2(35,9,false);}
	@Test public void test_board1_402(){commonCode2(35,10,false);}
	@Test public void test_board1_403(){commonCode2(35,11,false);}
	@Test public void test_board1_404(){commonCode2(35,12,false);}
	@Test public void test_board1_405(){commonCode2(35,13,true);}
	@Test public void test_board1_406(){commonCode2(35,14,false);}
	@Test public void test_board1_407(){commonCode2(35,15,false);}
	@Test public void test_board1_408(){commonCode2(35,16,false);}
	@Test public void test_board1_409(){commonCode2(35,17,false);}
	@Test public void test_board1_410(){commonCode2(35,18,false);}
	@Test public void test_board1_411(){commonCode2(35,19,false);}
	@Test public void test_board1_412(){commonCode2(35,20,false);}
	@Test public void test_board1_413(){commonCode2(35,21,true);}
	@Test public void test_board1_414(){commonCode2(35,22,false);}
	@Test public void test_board1_415(){commonCode2(35,23,false);}
	@Test public void test_board1_416(){commonCode2(35,24,false);}
	@Test public void test_board1_417(){commonCode2(35,25,false);}
	@Test public void test_board1_418(){commonCode2(35,26,false);}
	@Test public void test_board1_419(){commonCode2(35,27,true);}
	@Test public void test_board1_420(){commonCode2(35,28,false);}
	@Test public void test_board1_421(){commonCode2(35,29,false);}
	@Test public void test_board1_422(){commonCode2(35,30,false);}
	@Test public void test_board1_423(){commonCode2(35,31,false);}
	@Test public void test_board1_424(){commonCode2(35,32,false);}
	@Test public void test_board1_425(){commonCode2(35,33,false);}
	@Test public void test_board1_426(){commonCode2(35,34,false);}
	@Test public void test_board1_427(){commonCode2(35,35,true);}
	@Test public void test_board1_428(){commonCode2(35,36,false);}
	@Test public void test_board1_429(){commonCode2(35,37,false);}
	@Test public void test_board1_430(){commonCode2(35,38,false);}
	@Test public void test_board1_431(){commonCode2(35,39,false);}
	@Test public void test_board1_432(){commonCode2(35,40,false);}
	@Test public void test_board1_433(){commonCode2(35,41,false);}
	@Test public void test_board1_434(){commonCode2(35,42,false);}
	@Test public void test_board1_435(){commonCode2(35,43,true);}
	@Test public void test_board1_436(){commonCode2(35,44,false);}
	@Test public void test_board1_437(){commonCode2(35,45,true);}
	@Test public void test_board1_438(){commonCode2(35,46,false);}
	@Test public void test_board1_439(){commonCode2(35,47,true);}
	@Test public void test_board1_440(){commonCode2(35,48,false);}
	@Test public void test_board1_441(){commonCode2(41,0,false);}
	@Test public void test_board1_442(){commonCode2(41,1,true);}
	@Test public void test_board1_443(){commonCode2(41,2,false);}
	@Test public void test_board1_444(){commonCode2(41,3,true);}
	@Test public void test_board1_445(){commonCode2(41,4,false);}
	@Test public void test_board1_446(){commonCode2(41,5,true);}
	@Test public void test_board1_447(){commonCode2(41,6,false);}
	@Test public void test_board1_448(){commonCode2(41,7,true);}
	@Test public void test_board1_449(){commonCode2(41,8,false);}
	@Test public void test_board1_450(){commonCode2(41,9,false);}
	@Test public void test_board1_451(){commonCode2(41,10,false);}
	@Test public void test_board1_452(){commonCode2(41,11,false);}
	@Test public void test_board1_453(){commonCode2(41,12,false);}
	@Test public void test_board1_454(){commonCode2(41,13,true);}
	@Test public void test_board1_455(){commonCode2(41,14,false);}
	@Test public void test_board1_456(){commonCode2(41,15,false);}
	@Test public void test_board1_457(){commonCode2(41,16,false);}
	@Test public void test_board1_458(){commonCode2(41,17,false);}
	@Test public void test_board1_459(){commonCode2(41,18,false);}
	@Test public void test_board1_460(){commonCode2(41,19,false);}
	@Test public void test_board1_461(){commonCode2(41,20,false);}
	@Test public void test_board1_462(){commonCode2(41,21,true);}
	@Test public void test_board1_463(){commonCode2(41,22,false);}
	@Test public void test_board1_464(){commonCode2(41,23,false);}
	@Test public void test_board1_465(){commonCode2(41,24,false);}
	@Test public void test_board1_466(){commonCode2(41,25,false);}
	@Test public void test_board1_467(){commonCode2(41,26,false);}
	@Test public void test_board1_468(){commonCode2(41,27,true);}
	@Test public void test_board1_469(){commonCode2(41,28,false);}
	@Test public void test_board1_470(){commonCode2(41,29,false);}
	@Test public void test_board1_471(){commonCode2(41,30,false);}
	@Test public void test_board1_472(){commonCode2(41,31,false);}
	@Test public void test_board1_473(){commonCode2(41,32,false);}
	@Test public void test_board1_474(){commonCode2(41,33,false);}
	@Test public void test_board1_475(){commonCode2(41,34,false);}
	@Test public void test_board1_476(){commonCode2(41,35,false);}
	@Test public void test_board1_477(){commonCode2(41,36,false);}
	@Test public void test_board1_478(){commonCode2(41,37,false);}
	@Test public void test_board1_479(){commonCode2(41,38,false);}
	@Test public void test_board1_480(){commonCode2(41,39,false);}
	@Test public void test_board1_481(){commonCode2(41,40,false);}
	@Test public void test_board1_482(){commonCode2(41,41,true);}
	@Test public void test_board1_483(){commonCode2(41,42,false);}
	@Test public void test_board1_484(){commonCode2(41,43,true);}
	@Test public void test_board1_485(){commonCode2(41,44,false);}
	@Test public void test_board1_486(){commonCode2(41,45,true);}
	@Test public void test_board1_487(){commonCode2(41,46,false);}
	@Test public void test_board1_488(){commonCode2(41,47,true);}
	@Test public void test_board1_489(){commonCode2(41,48,false);}
	@Test public void test_board1_490(){commonCode2(43,0,false);}
	@Test public void test_board1_491(){commonCode2(43,1,false);}
	@Test public void test_board1_492(){commonCode2(43,2,false);}
	@Test public void test_board1_493(){commonCode2(43,3,true);}
	@Test public void test_board1_494(){commonCode2(43,4,false);}
	@Test public void test_board1_495(){commonCode2(43,5,true);}
	@Test public void test_board1_496(){commonCode2(43,6,false);}
	@Test public void test_board1_497(){commonCode2(43,7,true);}
	@Test public void test_board1_498(){commonCode2(43,8,false);}
	@Test public void test_board1_499(){commonCode2(43,9,false);}
	@Test public void test_board1_500(){commonCode2(43,10,false);}
	@Test public void test_board1_501(){commonCode2(43,11,false);}
	@Test public void test_board1_502(){commonCode2(43,12,false);}
	@Test public void test_board1_503(){commonCode2(43,13,true);}
	@Test public void test_board1_504(){commonCode2(43,14,false);}
	@Test public void test_board1_505(){commonCode2(43,15,false);}
	@Test public void test_board1_506(){commonCode2(43,16,false);}
	@Test public void test_board1_507(){commonCode2(43,17,false);}
	@Test public void test_board1_508(){commonCode2(43,18,false);}
	@Test public void test_board1_509(){commonCode2(43,19,false);}
	@Test public void test_board1_510(){commonCode2(43,20,false);}
	@Test public void test_board1_511(){commonCode2(43,21,true);}
	@Test public void test_board1_512(){commonCode2(43,22,false);}
	@Test public void test_board1_513(){commonCode2(43,23,false);}
	@Test public void test_board1_514(){commonCode2(43,24,false);}
	@Test public void test_board1_515(){commonCode2(43,25,false);}
	@Test public void test_board1_516(){commonCode2(43,26,false);}
	@Test public void test_board1_517(){commonCode2(43,27,true);}
	@Test public void test_board1_518(){commonCode2(43,28,false);}
	@Test public void test_board1_519(){commonCode2(43,29,false);}
	@Test public void test_board1_520(){commonCode2(43,30,false);}
	@Test public void test_board1_521(){commonCode2(43,31,false);}
	@Test public void test_board1_522(){commonCode2(43,32,false);}
	@Test public void test_board1_523(){commonCode2(43,33,false);}
	@Test public void test_board1_524(){commonCode2(43,34,false);}
	@Test public void test_board1_525(){commonCode2(43,35,true);}
	@Test public void test_board1_526(){commonCode2(43,36,false);}
	@Test public void test_board1_527(){commonCode2(43,37,false);}
	@Test public void test_board1_528(){commonCode2(43,38,false);}
	@Test public void test_board1_529(){commonCode2(43,39,false);}
	@Test public void test_board1_530(){commonCode2(43,40,false);}
	@Test public void test_board1_531(){commonCode2(43,41,true);}
	@Test public void test_board1_532(){commonCode2(43,42,false);}
	@Test public void test_board1_533(){commonCode2(43,43,true);}
	@Test public void test_board1_534(){commonCode2(43,44,false);}
	@Test public void test_board1_535(){commonCode2(43,45,true);}
	@Test public void test_board1_536(){commonCode2(43,46,false);}
	@Test public void test_board1_537(){commonCode2(43,47,true);}
	@Test public void test_board1_538(){commonCode2(43,48,false);}
	@Test public void test_board1_539(){commonCode2(45,0,false);}
	@Test public void test_board1_540(){commonCode2(45,1,true);}
	@Test public void test_board1_541(){commonCode2(45,2,false);}
	@Test public void test_board1_542(){commonCode2(45,3,false);}
	@Test public void test_board1_543(){commonCode2(45,4,false);}
	@Test public void test_board1_544(){commonCode2(45,5,true);}
	@Test public void test_board1_545(){commonCode2(45,6,false);}
	@Test public void test_board1_546(){commonCode2(45,7,true);}
	@Test public void test_board1_547(){commonCode2(45,8,false);}
	@Test public void test_board1_548(){commonCode2(45,9,false);}
	@Test public void test_board1_549(){commonCode2(45,10,false);}
	@Test public void test_board1_550(){commonCode2(45,11,false);}
	@Test public void test_board1_551(){commonCode2(45,12,false);}
	@Test public void test_board1_552(){commonCode2(45,13,true);}
	@Test public void test_board1_553(){commonCode2(45,14,false);}
	@Test public void test_board1_554(){commonCode2(45,15,false);}
	@Test public void test_board1_555(){commonCode2(45,16,false);}
	@Test public void test_board1_556(){commonCode2(45,17,false);}
	@Test public void test_board1_557(){commonCode2(45,18,false);}
	@Test public void test_board1_558(){commonCode2(45,19,false);}
	@Test public void test_board1_559(){commonCode2(45,20,false);}
	@Test public void test_board1_560(){commonCode2(45,21,true);}
	@Test public void test_board1_561(){commonCode2(45,22,false);}
	@Test public void test_board1_562(){commonCode2(45,23,false);}
	@Test public void test_board1_563(){commonCode2(45,24,false);}
	@Test public void test_board1_564(){commonCode2(45,25,false);}
	@Test public void test_board1_565(){commonCode2(45,26,false);}
	@Test public void test_board1_566(){commonCode2(45,27,true);}
	@Test public void test_board1_567(){commonCode2(45,28,false);}
	@Test public void test_board1_568(){commonCode2(45,29,false);}
	@Test public void test_board1_569(){commonCode2(45,30,false);}
	@Test public void test_board1_570(){commonCode2(45,31,false);}
	@Test public void test_board1_571(){commonCode2(45,32,false);}
	@Test public void test_board1_572(){commonCode2(45,33,false);}
	@Test public void test_board1_573(){commonCode2(45,34,false);}
	@Test public void test_board1_574(){commonCode2(45,35,true);}
	@Test public void test_board1_575(){commonCode2(45,36,false);}
	@Test public void test_board1_576(){commonCode2(45,37,false);}
	@Test public void test_board1_577(){commonCode2(45,38,false);}
	@Test public void test_board1_578(){commonCode2(45,39,false);}
	@Test public void test_board1_579(){commonCode2(45,40,false);}
	@Test public void test_board1_580(){commonCode2(45,41,true);}
	@Test public void test_board1_581(){commonCode2(45,42,false);}
	@Test public void test_board1_582(){commonCode2(45,43,true);}
	@Test public void test_board1_583(){commonCode2(45,44,false);}
	@Test public void test_board1_584(){commonCode2(45,45,true);}
	@Test public void test_board1_585(){commonCode2(45,46,false);}
	@Test public void test_board1_586(){commonCode2(45,47,true);}
	@Test public void test_board1_587(){commonCode2(45,48,false);}
	@Test public void test_board1_588(){commonCode2(47,0,false);}
	@Test public void test_board1_589(){commonCode2(47,1,true);}
	@Test public void test_board1_590(){commonCode2(47,2,false);}
	@Test public void test_board1_591(){commonCode2(47,3,true);}
	@Test public void test_board1_592(){commonCode2(47,4,false);}
	@Test public void test_board1_593(){commonCode2(47,5,false);}
	@Test public void test_board1_594(){commonCode2(47,6,false);}
	@Test public void test_board1_595(){commonCode2(47,7,true);}
	@Test public void test_board1_596(){commonCode2(47,8,false);}
	@Test public void test_board1_597(){commonCode2(47,9,false);}
	@Test public void test_board1_598(){commonCode2(47,10,false);}
	@Test public void test_board1_599(){commonCode2(47,11,false);}
	@Test public void test_board1_600(){commonCode2(47,12,false);}
	@Test public void test_board1_601(){commonCode2(47,13,true);}
	@Test public void test_board1_602(){commonCode2(47,14,false);}
	@Test public void test_board1_603(){commonCode2(47,15,false);}
	@Test public void test_board1_604(){commonCode2(47,16,false);}
	@Test public void test_board1_605(){commonCode2(47,17,false);}
	@Test public void test_board1_606(){commonCode2(47,18,false);}
	@Test public void test_board1_607(){commonCode2(47,19,false);}
	@Test public void test_board1_608(){commonCode2(47,20,false);}
	@Test public void test_board1_609(){commonCode2(47,21,true);}
	@Test public void test_board1_610(){commonCode2(47,22,false);}
	@Test public void test_board1_611(){commonCode2(47,23,false);}
	@Test public void test_board1_612(){commonCode2(47,24,false);}
	@Test public void test_board1_613(){commonCode2(47,25,false);}
	@Test public void test_board1_614(){commonCode2(47,26,false);}
	@Test public void test_board1_615(){commonCode2(47,27,true);}
	@Test public void test_board1_616(){commonCode2(47,28,false);}
	@Test public void test_board1_617(){commonCode2(47,29,false);}
	@Test public void test_board1_618(){commonCode2(47,30,false);}
	@Test public void test_board1_619(){commonCode2(47,31,false);}
	@Test public void test_board1_620(){commonCode2(47,32,false);}
	@Test public void test_board1_621(){commonCode2(47,33,false);}
	@Test public void test_board1_622(){commonCode2(47,34,false);}
	@Test public void test_board1_623(){commonCode2(47,35,true);}
	@Test public void test_board1_624(){commonCode2(47,36,false);}
	@Test public void test_board1_625(){commonCode2(47,37,false);}
	@Test public void test_board1_626(){commonCode2(47,38,false);}
	@Test public void test_board1_627(){commonCode2(47,39,false);}
	@Test public void test_board1_628(){commonCode2(47,40,false);}
	@Test public void test_board1_629(){commonCode2(47,41,true);}
	@Test public void test_board1_630(){commonCode2(47,42,false);}
	@Test public void test_board1_631(){commonCode2(47,43,true);}
	@Test public void test_board1_632(){commonCode2(47,44,false);}
	@Test public void test_board1_633(){commonCode2(47,45,true);}
	@Test public void test_board1_634(){commonCode2(47,46,false);}
	@Test public void test_board1_635(){commonCode2(47,47,true);}
	@Test public void test_board1_636(){commonCode2(47,48,false);}
}

