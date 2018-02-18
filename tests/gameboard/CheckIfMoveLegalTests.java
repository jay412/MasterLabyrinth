package tests.gameboard;

import static org.junit.Assert.*;
import java.util.ArrayList;
import code.model.AbstractTile;
import code.model.GameBoard;
import code.model.MoveableTile;
import org.junit.Test;

/**
 * @author satya,Ken
 * @author Ken, Ian
 * @author Ian, Satya 04-10-16
 */

//**NOTE:**
//STATIC BOARD 1 TESTING COMPLETELY DONE (2401/2401 TESTS PASS -- GREEN BAR)

public class CheckIfMoveLegalTests {
	
	//Testing Static Board #1
	public void commonTestCode1(int origin, int destination, boolean expected){
		GameBoard gb = new GameBoard(4);
		ArrayList<MoveableTile> al = staticMoveableTileArray1();
		gb.populateStaticMoveableTileArray(al);
		gb.setupStaticBoard();
		System.out.println("The starting static board looks like\n");
		gb.printBoard();
	    AbstractTile originTile = gb.getTileFromTileNumber(origin);
	    AbstractTile destinationTile = gb.getTileFromTileNumber(destination);
	    boolean actual = gb.checkIfMoveLegal(originTile, destinationTile);
	    assertTrue("We expected "+ expected +" and actual is "+ actual, expected==actual);
	}
	
	/* THE FOLLOWING MAIN METHOD WAS USED TO GENERATE THE 
	 * @Test STRINGS FOR USE IN THE TEST CASES THAT CALL COMMONTESTCODE1 ABOVE
	 * public static void main(String[] args){
		GameBoard gb = new GameBoard(4);
		ArrayList<MoveableTile> al = staticMoveableTileArray1();
		gb.populateStaticMoveableTileArray(al);
		gb.setupStaticBoard();
		
		String path = "C:\\output\\output7.txt";
		FileWriter w;
		try {
			w = new FileWriter(path,false);
			PrintWriter print_l = new PrintWriter(w);
			int count = 0; 
			for(int i = 0; i < 49; i++){
				for(int j = 0; j < 49; j++){
					String s = "@Test public void test_board1_"+count+"(){commonTestCode1("+i+","+j+",isDInSetOfReachableTilesFromO_StaticBoard1("+i+","+j+"));}";
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
		
//	//Testing Static Board #2
//	public void commonTestCode2(int origin, int destination, boolean expected){
//		GameBoard gb = new GameBoard(4);
//		//Static Board #1
//		ArrayList<MoveableTile> al = staticMoveableTileArray2();
//		gb.populateStaticMoveableTileArray(al);
//		gb.setupStaticBoard();
////			System.out.println("The starting static board looks like\n");
////		    gb.printBoard();
//	    AbstractTile originTile = gb.getTileFromTileNumber(origin);
//	    AbstractTile destinationTile = gb.getTileFromTileNumber(destination);
//	    boolean actual = gb.checkIfMoveLegal(originTile, destinationTile);
//	    assertTrue("We expected "+ expected +" and actual is "+ actual, expected==actual);
//	}
	
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
	
//	//static MoveableTiles #2 for Static Board #2
//	public ArrayList<MoveableTile> staticMoveableTileArray2(){
//		ArrayList<MoveableTile> al = new ArrayList<MoveableTile>();
//		//MOveableCol1
//		MoveableTile m1 = new MoveableTile("I");
//		m1.rotate(90);
//		al.add(m1);
//		MoveableTile m2 = new MoveableTile("I");
//		m2.rotate(90);
//		al.add(m2);
//		MoveableTile m3 = new MoveableTile("I");
//		m3.rotate(90);
//		al.add(m3);
//		MoveableTile m4 = new MoveableTile("I");
//		m4.rotate(0);
//		al.add(m4);
//		MoveableTile m5 = new MoveableTile("L");
//		m5.rotate(0);
//		al.add(m5);
//		MoveableTile m6 = new MoveableTile("I");
//		m6.rotate(0);
//		al.add(m6);
//		MoveableTile m7 = new MoveableTile("I");
//		al.add(m7);
//		
//		//MoveableCol2
//		MoveableTile m8 = new MoveableTile("L");
//		m8.rotate(180);
//		al.add(m8);
//		MoveableTile m9 = new MoveableTile("I");
//		m9.rotate(0);
//		al.add(m9);
//		MoveableTile m10 = new MoveableTile("T");
//		al.add(m10);
//		MoveableTile m11 = new MoveableTile("I");
//		m11.rotate(0);
//		al.add(m11);
//		MoveableTile m12 = new MoveableTile("L");
//		m12.rotate(0);
//		al.add(m12);
//		MoveableTile m13 = new MoveableTile("T");
//		m13.rotate(0);
//		al.add(m13);
//		MoveableTile m14 = new MoveableTile("L");
//		m14.rotate(0);
//		al.add(m14);
//		
//		//MoveableCol3
//		MoveableTile m15 = new MoveableTile("L");
//		al.add(m15);
//		MoveableTile m16 = new MoveableTile("T");
//		m16.rotate(180);
//		al.add(m16);
//		MoveableTile m17 = new MoveableTile("L");
//		m17.rotate(90);
//		al.add(m17);
//		MoveableTile m18 = new MoveableTile("L");
//		m18.rotate(180);
//		al.add(m18);
//		MoveableTile m19 = new MoveableTile("T");
//		m19.rotate(-90);
//		al.add(m19);
//		MoveableTile m20 = new MoveableTile("L");
//		m20.rotate(180);
//		al.add(m20);
//		MoveableTile m21 = new MoveableTile("T");
//		m21.rotate(90);
//		al.add(m21);
//		
//		//MoveableRow1
//		MoveableTile m22 = new MoveableTile("T");
//		m22.rotate(0);
//		al.add(m22);
//		MoveableTile m23 = new MoveableTile("L");
//		m23.rotate(90);
//		al.add(m23);
//		MoveableTile m24 = new MoveableTile("I");
//		m24.rotate(0);
//		al.add(m24);
//		MoveableTile m25 = new MoveableTile("L");
//		m25.rotate(90);
//		al.add(m25);
//		
//		//MoveableRow2
//		MoveableTile m26 = new MoveableTile("L");
//		m26.rotate(90);
//		al.add(m26);
//		MoveableTile m27 = new MoveableTile("I");
//		m27.rotate(90);
//		al.add(m27);
//		MoveableTile m28 = new MoveableTile("L");
//		m28.rotate(0);
//		al.add(m28);
//		MoveableTile m29 = new MoveableTile("L");
//		m29.rotate(90);
//		al.add(m29);
//		
//		//MoveableRow3
//		MoveableTile m30 = new MoveableTile("L");
//		m30.rotate(0);
//		al.add(m30);
//		MoveableTile m31 = new MoveableTile("I");
//		m31.rotate(0);
//		al.add(m31);
//		MoveableTile m32 = new MoveableTile("I");
//		m32.rotate(90);
//		al.add(m32);
//		MoveableTile m33 = new MoveableTile("I");
//		m33.rotate(90);
//		al.add(m33);
//		
//		MoveableTile m34 = new MoveableTile("L");
//		al.add(m34);
//		
//		return al;
//	}
	
	//Edited by Satya, Ian 04-10-16
	public boolean isDInSetOfReachableTilesFromO_StaticBoard1(int origin, int destination){
		ArrayList<ArrayList<Integer>> reachableTiles = new ArrayList<ArrayList<Integer>>();
		//This array is populated with reachableTile numbers by a human looking
		//at the static game board of tiles as drawn on paper.  Each starting (origin)
		//tile is considered (a total of 49) and then a set of all possible destination
		//tile numbers (of type Integer) are added to the ArrayList<ArrayList<Integer>>.
		//The boolean returned by this function corresponds to the expected boolean
		//for a JUnit test of this staticboard1 for the corresponding origin and
		//destination tile pair being tested.
		
		//reachableTiles.get(0) corresponds to the inner ArrayList<Integer> that holds the 
		//reachable tiles from origin tilNum 0.
		//populate arrays with known good destination tile numbers, determined by inspection
		//by a human of the actual staticboard1

		//origin tiles 0,1,2,3,7,8,9,10,16,17,23,25,26,30,33 are all connected to tile so all are reachable by one another
		ArrayList<Integer> a0 = new ArrayList<Integer>();
		a0.add(0); a0.add(1); a0.add(2); a0.add(3); a0.add(7); a0.add(8); a0.add(9); a0.add(10); a0.add(16);
		a0.add(17); a0.add(18); a0.add(23); a0.add(30); a0.add(25); a0.add(26); a0.add(33);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(0); a1.add(1); a1.add(2); a1.add(3); a1.add(7); a1.add(8); a1.add(9); a1.add(10); a1.add(16);
		a1.add(17); a1.add(18); a1.add(23); a1.add(30); a1.add(25); a1.add(26); a1.add(33);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(0); a2.add(1); a2.add(2); a2.add(3); a2.add(7); a2.add(8); a2.add(9); a2.add(10); a2.add(16);
		a2.add(17); a2.add(18); a2.add(23); a2.add(30); a2.add(25); a2.add(26); a2.add(33);
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(0); a3.add(1); a3.add(2); a3.add(3); a3.add(7); a3.add(8); a3.add(9); a3.add(10); a3.add(16);
		a3.add(17); a3.add(18); a3.add(23); a3.add(30); a3.add(25); a3.add(26); a3.add(33);
		
		ArrayList<Integer> a7 = new ArrayList<Integer>();
		a7.add(0); a7.add(1); a7.add(2); a7.add(3); a7.add(7); a7.add(8); a7.add(9); a7.add(10); a7.add(16);
		a7.add(17); a7.add(18); a7.add(23); a7.add(30); a7.add(25); a7.add(26); a7.add(33);
		
		ArrayList<Integer> a8 = new ArrayList<Integer>();
		a8.add(0); a8.add(1); a8.add(2); a8.add(3); a8.add(7); a8.add(8); a8.add(9); a8.add(10); a8.add(16);
		a8.add(17); a8.add(18); a8.add(23); a8.add(30); a8.add(25); a8.add(26); a8.add(33);
		
		ArrayList<Integer> a9 = new ArrayList<Integer>();
		a9.add(0); a9.add(1); a9.add(2); a9.add(3); a9.add(7); a9.add(8); a9.add(9); a9.add(10); a9.add(16);
		a9.add(17); a9.add(18); a9.add(23); a9.add(30); a9.add(25); a9.add(26); a9.add(33);
		
		ArrayList<Integer> a10 = new ArrayList<Integer>();
		a10.add(0); a10.add(1); a10.add(2); a10.add(3); a10.add(7); a10.add(8); a10.add(9); a10.add(10); a10.add(16);
		a10.add(17); a10.add(18); a10.add(23); a10.add(30); a10.add(25); a10.add(26); a10.add(33);
		
		ArrayList<Integer> a16 = new ArrayList<Integer>();
		a16.add(0); a16.add(1); a16.add(2); a16.add(3); a16.add(7); a16.add(8); a16.add(9); a16.add(10); a16.add(16);
		a16.add(17); a16.add(18); a16.add(23); a16.add(30); a16.add(25); a16.add(26); a16.add(33);
		
		ArrayList<Integer> a17 = new ArrayList<Integer>();
		a17.add(0); a17.add(1); a17.add(2); a17.add(3); a17.add(7); a17.add(8); a17.add(9); a17.add(10); a17.add(16);
		a17.add(17); a17.add(18); a17.add(23); a17.add(30); a17.add(25); a17.add(26); a17.add(33);
		
		ArrayList<Integer> a18 = new ArrayList<Integer>();
		a18.add(0); a18.add(1); a18.add(2); a18.add(3); a18.add(7); a18.add(8); a18.add(9); a18.add(10); a18.add(16);
		a18.add(17); a18.add(18); a18.add(23); a18.add(30); a18.add(25); a18.add(26); a18.add(33);
		
		ArrayList<Integer> a23 = new ArrayList<Integer>();
		a23.add(0); a23.add(1); a23.add(2); a23.add(3); a23.add(7); a23.add(8); a23.add(9); a23.add(10); a23.add(16);
		a23.add(17); a23.add(18); a23.add(23); a23.add(30); a23.add(25); a23.add(26); a23.add(33);
		
		ArrayList<Integer> a30 = new ArrayList<Integer>();
		a30.add(0); a30.add(1); a30.add(2); a30.add(3); a30.add(7); a30.add(8); a30.add(9); a30.add(10); a30.add(16);
		a30.add(17); a30.add(18); a30.add(23); a30.add(30); a30.add(25); a30.add(26); a30.add(33);
		
		ArrayList<Integer> a25 = new ArrayList<Integer>();
		a25.add(0); a25.add(1); a25.add(2); a25.add(3); a25.add(7); a25.add(8); a25.add(9); a25.add(10); a25.add(16);
		a25.add(17); a25.add(18); a25.add(23); a25.add(30); a25.add(25); a25.add(26); a25.add(33);
		
		ArrayList<Integer> a26 = new ArrayList<Integer>();
		a26.add(0); a26.add(1); a26.add(2); a26.add(3); a26.add(7); a26.add(8); a26.add(9); a26.add(10); a26.add(16);
		a26.add(17); a26.add(18); a26.add(23); a26.add(30); a26.add(25); a26.add(26); a26.add(33);
		
		ArrayList<Integer> a33 = new ArrayList<Integer>();
		a33.add(0); a33.add(1); a33.add(2); a33.add(3); a33.add(7); a33.add(8); a33.add(9); a33.add(10); a33.add(16);
		a33.add(17); a33.add(18); a33.add(23); a33.add(30); a33.add(25); a33.add(26); a33.add(33);
		
		//origin tile 4
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(4);
		
		//origin tiles 5,6,11,12,13 all connected 
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(5); a5.add(6); a5.add(11); a5.add(12); a5.add(13);
		
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		a6.add(5); a6.add(6); a6.add(11); a6.add(12); a6.add(13);
		
		ArrayList<Integer> a11 = new ArrayList<Integer>();
		a11.add(5); a11.add(6); a11.add(11); a11.add(12); a11.add(13);
		
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		a12.add(5); a12.add(6); a12.add(11); a12.add(12); a12.add(13);
		
		ArrayList<Integer> a13 = new ArrayList<Integer>();
		a13.add(5); a13.add(6); a13.add(11); a13.add(12); a13.add(13);
		
		//origin tiles 14,21 connected
		ArrayList<Integer> a14 = new ArrayList<Integer>();
		a14.add(14); a14.add(21);
		
		ArrayList<Integer> a21 = new ArrayList<Integer>();
		a21.add(14); a21.add(21);
	
		//origin tiles 15,22,28,29,35 connected
		ArrayList<Integer> a15 = new ArrayList<Integer>();
		a15.add(15); a15.add(22); a15.add(28); a15.add(29); a15.add(35);
		
		ArrayList<Integer> a22 = new ArrayList<Integer>();
		a22.add(15); a22.add(22); a22.add(28); a22.add(29); a22.add(35);
		
		ArrayList<Integer> a28 = new ArrayList<Integer>();
		a28.add(15); a28.add(22); a28.add(28); a28.add(29); a28.add(35);
		
		ArrayList<Integer> a29 = new ArrayList<Integer>();
		a29.add(15); a29.add(22); a29.add(28); a29.add(29); a29.add(35);
		
		ArrayList<Integer> a35 = new ArrayList<Integer>();
		a35.add(15); a35.add(22); a35.add(28); a35.add(29); a35.add(35);
			
		//origin tiles 19,20,27 connected
		ArrayList<Integer> a19 = new ArrayList<Integer>();
		a19.add(19); a19.add(20); a19.add(27);
		
		ArrayList<Integer> a20 = new ArrayList<Integer>();
		a20.add(19); a20.add(20); a20.add(27);
		
		ArrayList<Integer> a27 = new ArrayList<Integer>();
		a27.add(19); a27.add(20); a27.add(27);
		
 		//origin tile 24
 		ArrayList<Integer> a24 = new ArrayList<Integer>();
 		a24.add(24);
 		
 		//origin tiles 31,32,39,40,45,46,47 connected
		ArrayList<Integer> a31 = new ArrayList<Integer>();
		a31.add(31); a31.add(32); a31.add(39); a31.add(40); a31.add(45); a31.add(46); a31.add(47); 
		
		ArrayList<Integer> a32 = new ArrayList<Integer>();
		a32.add(31); a32.add(32); a32.add(39); a32.add(40); a32.add(45); a32.add(46); a32.add(47); 
		
		ArrayList<Integer> a39 = new ArrayList<Integer>();
		a39.add(31); a39.add(32); a39.add(39); a39.add(40); a39.add(45); a39.add(46); a39.add(47); 
		
		ArrayList<Integer> a40 = new ArrayList<Integer>();
		a40.add(31); a40.add(32); a40.add(39); a40.add(40); a40.add(45); a40.add(46); a40.add(47); 
		
		ArrayList<Integer> a45 = new ArrayList<Integer>();
		a45.add(31); a45.add(32); a45.add(39); a45.add(40); a45.add(45); a45.add(46); a45.add(47); 
		
		ArrayList<Integer> a46 = new ArrayList<Integer>();
		a46.add(31); a46.add(32); a46.add(39); a46.add(40); a46.add(45); a46.add(46); a46.add(47); 
		
		ArrayList<Integer> a47 = new ArrayList<Integer>();
		a47.add(31); a47.add(32); a47.add(39); a47.add(40); a47.add(45); a47.add(46); a47.add(47); 
		
		//origin tile 34
 		ArrayList<Integer> a34 = new ArrayList<Integer>();
 		a34.add(34); a34.add(41); a34.add(48);
 		
 		//origin tile 36
 		ArrayList<Integer> a36 = new ArrayList<Integer>();
 		a36.add(36);
 		
 		//origin tiles 37,38 connected
		ArrayList<Integer> a37 = new ArrayList<Integer>();
		a37.add(37); a37.add(38);
		
		ArrayList<Integer> a38 = new ArrayList<Integer>();
		a38.add(37); a38.add(38);
 		
 		//origin tiles 41,48 connected
		ArrayList<Integer> a41 = new ArrayList<Integer>();
		a41.add(41); a41.add(48); a41.add(34);
		
		ArrayList<Integer> a48 = new ArrayList<Integer>();
		a48.add(41); a48.add(48); a48.add(34);
 		
 		//origin tiles 42,43,44 connected
		ArrayList<Integer> a42 = new ArrayList<Integer>();
		a42.add(42); a42.add(43); a42.add(44);
		
		ArrayList<Integer> a43 = new ArrayList<Integer>();
		a43.add(42); a43.add(43); a43.add(44);
		
		ArrayList<Integer> a44 = new ArrayList<Integer>();
		a44.add(42); a44.add(43); a44.add(44);
		
		reachableTiles.add(a0);
		reachableTiles.add(a1);
		reachableTiles.add(a2);
		reachableTiles.add(a3);
		reachableTiles.add(a4);
		reachableTiles.add(a5);
		reachableTiles.add(a6);
		reachableTiles.add(a7);
		reachableTiles.add(a8);
		reachableTiles.add(a9);
		reachableTiles.add(a10);
		reachableTiles.add(a11);
		reachableTiles.add(a12);
		reachableTiles.add(a13);
		reachableTiles.add(a14);
		reachableTiles.add(a15);
		reachableTiles.add(a16);
		reachableTiles.add(a17);
		reachableTiles.add(a18);
		reachableTiles.add(a19);
		reachableTiles.add(a20);
		reachableTiles.add(a21);
		reachableTiles.add(a22);
		reachableTiles.add(a23);
		reachableTiles.add(a24);
		reachableTiles.add(a25);
		reachableTiles.add(a26);
		reachableTiles.add(a27);
		reachableTiles.add(a28);
		reachableTiles.add(a29);
		reachableTiles.add(a30);
		reachableTiles.add(a31);
		reachableTiles.add(a32);
		reachableTiles.add(a33);
		reachableTiles.add(a34);
		reachableTiles.add(a35);
		reachableTiles.add(a36);
		reachableTiles.add(a37);
		reachableTiles.add(a38);
		reachableTiles.add(a39);
		reachableTiles.add(a40);
		reachableTiles.add(a41);
		reachableTiles.add(a42);
		reachableTiles.add(a43);
		reachableTiles.add(a44);
		reachableTiles.add(a45);
		reachableTiles.add(a46);
		reachableTiles.add(a47);
		reachableTiles.add(a48);
		
		if(origin==destination){return false;}
 		return reachableTiles.get(origin).contains(destination);
	}
	
	//Testing Static Board #1
	@Test public void test_board1_0(){commonTestCode1(0,0,isDInSetOfReachableTilesFromO_StaticBoard1(0,0));}
	@Test public void test_board1_1(){commonTestCode1(0,1,isDInSetOfReachableTilesFromO_StaticBoard1(0,1));}
	@Test public void test_board1_2(){commonTestCode1(0,2,isDInSetOfReachableTilesFromO_StaticBoard1(0,2));}
	@Test public void test_board1_3(){commonTestCode1(0,3,isDInSetOfReachableTilesFromO_StaticBoard1(0,3));}
	@Test public void test_board1_4(){commonTestCode1(0,4,isDInSetOfReachableTilesFromO_StaticBoard1(0,4));}
	@Test public void test_board1_5(){commonTestCode1(0,5,isDInSetOfReachableTilesFromO_StaticBoard1(0,5));}
	@Test public void test_board1_6(){commonTestCode1(0,6,isDInSetOfReachableTilesFromO_StaticBoard1(0,6));}
	@Test public void test_board1_7(){commonTestCode1(0,7,isDInSetOfReachableTilesFromO_StaticBoard1(0,7));}
	@Test public void test_board1_8(){commonTestCode1(0,8,isDInSetOfReachableTilesFromO_StaticBoard1(0,8));}
	@Test public void test_board1_9(){commonTestCode1(0,9,isDInSetOfReachableTilesFromO_StaticBoard1(0,9));}
	@Test public void test_board1_10(){commonTestCode1(0,10,isDInSetOfReachableTilesFromO_StaticBoard1(0,10));}
	@Test public void test_board1_11(){commonTestCode1(0,11,isDInSetOfReachableTilesFromO_StaticBoard1(0,11));}
	@Test public void test_board1_12(){commonTestCode1(0,12,isDInSetOfReachableTilesFromO_StaticBoard1(0,12));}
	@Test public void test_board1_13(){commonTestCode1(0,13,isDInSetOfReachableTilesFromO_StaticBoard1(0,13));}
	@Test public void test_board1_14(){commonTestCode1(0,14,isDInSetOfReachableTilesFromO_StaticBoard1(0,14));}
	@Test public void test_board1_15(){commonTestCode1(0,15,isDInSetOfReachableTilesFromO_StaticBoard1(0,15));}
	@Test public void test_board1_16(){commonTestCode1(0,16,isDInSetOfReachableTilesFromO_StaticBoard1(0,16));}
	@Test public void test_board1_17(){commonTestCode1(0,17,isDInSetOfReachableTilesFromO_StaticBoard1(0,17));}
	@Test public void test_board1_18(){commonTestCode1(0,18,isDInSetOfReachableTilesFromO_StaticBoard1(0,18));}
	@Test public void test_board1_19(){commonTestCode1(0,19,isDInSetOfReachableTilesFromO_StaticBoard1(0,19));}
	@Test public void test_board1_20(){commonTestCode1(0,20,isDInSetOfReachableTilesFromO_StaticBoard1(0,20));}
	@Test public void test_board1_21(){commonTestCode1(0,21,isDInSetOfReachableTilesFromO_StaticBoard1(0,21));}
	@Test public void test_board1_22(){commonTestCode1(0,22,isDInSetOfReachableTilesFromO_StaticBoard1(0,22));}
	@Test public void test_board1_23(){commonTestCode1(0,23,isDInSetOfReachableTilesFromO_StaticBoard1(0,23));}
	@Test public void test_board1_24(){commonTestCode1(0,24,isDInSetOfReachableTilesFromO_StaticBoard1(0,24));}
	@Test public void test_board1_25(){commonTestCode1(0,25,isDInSetOfReachableTilesFromO_StaticBoard1(0,25));}
	@Test public void test_board1_26(){commonTestCode1(0,26,isDInSetOfReachableTilesFromO_StaticBoard1(0,26));}
	@Test public void test_board1_27(){commonTestCode1(0,27,isDInSetOfReachableTilesFromO_StaticBoard1(0,27));}
	@Test public void test_board1_28(){commonTestCode1(0,28,isDInSetOfReachableTilesFromO_StaticBoard1(0,28));}
	@Test public void test_board1_29(){commonTestCode1(0,29,isDInSetOfReachableTilesFromO_StaticBoard1(0,29));}
	@Test public void test_board1_30(){commonTestCode1(0,30,isDInSetOfReachableTilesFromO_StaticBoard1(0,30));}
	@Test public void test_board1_31(){commonTestCode1(0,31,isDInSetOfReachableTilesFromO_StaticBoard1(0,31));}
	@Test public void test_board1_32(){commonTestCode1(0,32,isDInSetOfReachableTilesFromO_StaticBoard1(0,32));}
	@Test public void test_board1_33(){commonTestCode1(0,33,isDInSetOfReachableTilesFromO_StaticBoard1(0,33));}
	@Test public void test_board1_34(){commonTestCode1(0,34,isDInSetOfReachableTilesFromO_StaticBoard1(0,34));}
	@Test public void test_board1_35(){commonTestCode1(0,35,isDInSetOfReachableTilesFromO_StaticBoard1(0,35));}
	@Test public void test_board1_36(){commonTestCode1(0,36,isDInSetOfReachableTilesFromO_StaticBoard1(0,36));}
	@Test public void test_board1_37(){commonTestCode1(0,37,isDInSetOfReachableTilesFromO_StaticBoard1(0,37));}
	@Test public void test_board1_38(){commonTestCode1(0,38,isDInSetOfReachableTilesFromO_StaticBoard1(0,38));}
	@Test public void test_board1_39(){commonTestCode1(0,39,isDInSetOfReachableTilesFromO_StaticBoard1(0,39));}
	@Test public void test_board1_40(){commonTestCode1(0,40,isDInSetOfReachableTilesFromO_StaticBoard1(0,40));}
	@Test public void test_board1_41(){commonTestCode1(0,41,isDInSetOfReachableTilesFromO_StaticBoard1(0,41));}
	@Test public void test_board1_42(){commonTestCode1(0,42,isDInSetOfReachableTilesFromO_StaticBoard1(0,42));}
	@Test public void test_board1_43(){commonTestCode1(0,43,isDInSetOfReachableTilesFromO_StaticBoard1(0,43));}
	@Test public void test_board1_44(){commonTestCode1(0,44,isDInSetOfReachableTilesFromO_StaticBoard1(0,44));}
	@Test public void test_board1_45(){commonTestCode1(0,45,isDInSetOfReachableTilesFromO_StaticBoard1(0,45));}
	@Test public void test_board1_46(){commonTestCode1(0,46,isDInSetOfReachableTilesFromO_StaticBoard1(0,46));}
	@Test public void test_board1_47(){commonTestCode1(0,47,isDInSetOfReachableTilesFromO_StaticBoard1(0,47));}
	@Test public void test_board1_48(){commonTestCode1(0,48,isDInSetOfReachableTilesFromO_StaticBoard1(0,48));}
	@Test public void test_board1_49(){commonTestCode1(1,0,isDInSetOfReachableTilesFromO_StaticBoard1(1,0));}
	@Test public void test_board1_50(){commonTestCode1(1,1,isDInSetOfReachableTilesFromO_StaticBoard1(1,1));}
	@Test public void test_board1_51(){commonTestCode1(1,2,isDInSetOfReachableTilesFromO_StaticBoard1(1,2));}
	@Test public void test_board1_52(){commonTestCode1(1,3,isDInSetOfReachableTilesFromO_StaticBoard1(1,3));}
	@Test public void test_board1_53(){commonTestCode1(1,4,isDInSetOfReachableTilesFromO_StaticBoard1(1,4));}
	@Test public void test_board1_54(){commonTestCode1(1,5,isDInSetOfReachableTilesFromO_StaticBoard1(1,5));}
	@Test public void test_board1_55(){commonTestCode1(1,6,isDInSetOfReachableTilesFromO_StaticBoard1(1,6));}
	@Test public void test_board1_56(){commonTestCode1(1,7,isDInSetOfReachableTilesFromO_StaticBoard1(1,7));}
	@Test public void test_board1_57(){commonTestCode1(1,8,isDInSetOfReachableTilesFromO_StaticBoard1(1,8));}
	@Test public void test_board1_58(){commonTestCode1(1,9,isDInSetOfReachableTilesFromO_StaticBoard1(1,9));}
	@Test public void test_board1_59(){commonTestCode1(1,10,isDInSetOfReachableTilesFromO_StaticBoard1(1,10));}
	@Test public void test_board1_60(){commonTestCode1(1,11,isDInSetOfReachableTilesFromO_StaticBoard1(1,11));}
	@Test public void test_board1_61(){commonTestCode1(1,12,isDInSetOfReachableTilesFromO_StaticBoard1(1,12));}
	@Test public void test_board1_62(){commonTestCode1(1,13,isDInSetOfReachableTilesFromO_StaticBoard1(1,13));}
	@Test public void test_board1_63(){commonTestCode1(1,14,isDInSetOfReachableTilesFromO_StaticBoard1(1,14));}
	@Test public void test_board1_64(){commonTestCode1(1,15,isDInSetOfReachableTilesFromO_StaticBoard1(1,15));}
	@Test public void test_board1_65(){commonTestCode1(1,16,isDInSetOfReachableTilesFromO_StaticBoard1(1,16));}
	@Test public void test_board1_66(){commonTestCode1(1,17,isDInSetOfReachableTilesFromO_StaticBoard1(1,17));}
	@Test public void test_board1_67(){commonTestCode1(1,18,isDInSetOfReachableTilesFromO_StaticBoard1(1,18));}
	@Test public void test_board1_68(){commonTestCode1(1,19,isDInSetOfReachableTilesFromO_StaticBoard1(1,19));}
	@Test public void test_board1_69(){commonTestCode1(1,20,isDInSetOfReachableTilesFromO_StaticBoard1(1,20));}
	@Test public void test_board1_70(){commonTestCode1(1,21,isDInSetOfReachableTilesFromO_StaticBoard1(1,21));}
	@Test public void test_board1_71(){commonTestCode1(1,22,isDInSetOfReachableTilesFromO_StaticBoard1(1,22));}
	@Test public void test_board1_72(){commonTestCode1(1,23,isDInSetOfReachableTilesFromO_StaticBoard1(1,23));}
	@Test public void test_board1_73(){commonTestCode1(1,24,isDInSetOfReachableTilesFromO_StaticBoard1(1,24));}
	@Test public void test_board1_74(){commonTestCode1(1,25,isDInSetOfReachableTilesFromO_StaticBoard1(1,25));}
	@Test public void test_board1_75(){commonTestCode1(1,26,isDInSetOfReachableTilesFromO_StaticBoard1(1,26));}
	@Test public void test_board1_76(){commonTestCode1(1,27,isDInSetOfReachableTilesFromO_StaticBoard1(1,27));}
	@Test public void test_board1_77(){commonTestCode1(1,28,isDInSetOfReachableTilesFromO_StaticBoard1(1,28));}
	@Test public void test_board1_78(){commonTestCode1(1,29,isDInSetOfReachableTilesFromO_StaticBoard1(1,29));}
	@Test public void test_board1_79(){commonTestCode1(1,30,isDInSetOfReachableTilesFromO_StaticBoard1(1,30));}
	@Test public void test_board1_80(){commonTestCode1(1,31,isDInSetOfReachableTilesFromO_StaticBoard1(1,31));}
	@Test public void test_board1_81(){commonTestCode1(1,32,isDInSetOfReachableTilesFromO_StaticBoard1(1,32));}
	@Test public void test_board1_82(){commonTestCode1(1,33,isDInSetOfReachableTilesFromO_StaticBoard1(1,33));}
	@Test public void test_board1_83(){commonTestCode1(1,34,isDInSetOfReachableTilesFromO_StaticBoard1(1,34));}
	@Test public void test_board1_84(){commonTestCode1(1,35,isDInSetOfReachableTilesFromO_StaticBoard1(1,35));}
	@Test public void test_board1_85(){commonTestCode1(1,36,isDInSetOfReachableTilesFromO_StaticBoard1(1,36));}
	@Test public void test_board1_86(){commonTestCode1(1,37,isDInSetOfReachableTilesFromO_StaticBoard1(1,37));}
	@Test public void test_board1_87(){commonTestCode1(1,38,isDInSetOfReachableTilesFromO_StaticBoard1(1,38));}
	@Test public void test_board1_88(){commonTestCode1(1,39,isDInSetOfReachableTilesFromO_StaticBoard1(1,39));}
	@Test public void test_board1_89(){commonTestCode1(1,40,isDInSetOfReachableTilesFromO_StaticBoard1(1,40));}
	@Test public void test_board1_90(){commonTestCode1(1,41,isDInSetOfReachableTilesFromO_StaticBoard1(1,41));}
	@Test public void test_board1_91(){commonTestCode1(1,42,isDInSetOfReachableTilesFromO_StaticBoard1(1,42));}
	@Test public void test_board1_92(){commonTestCode1(1,43,isDInSetOfReachableTilesFromO_StaticBoard1(1,43));}
	@Test public void test_board1_93(){commonTestCode1(1,44,isDInSetOfReachableTilesFromO_StaticBoard1(1,44));}
	@Test public void test_board1_94(){commonTestCode1(1,45,isDInSetOfReachableTilesFromO_StaticBoard1(1,45));}
	@Test public void test_board1_95(){commonTestCode1(1,46,isDInSetOfReachableTilesFromO_StaticBoard1(1,46));}
	@Test public void test_board1_96(){commonTestCode1(1,47,isDInSetOfReachableTilesFromO_StaticBoard1(1,47));}
	@Test public void test_board1_97(){commonTestCode1(1,48,isDInSetOfReachableTilesFromO_StaticBoard1(1,48));}
	@Test public void test_board1_98(){commonTestCode1(2,0,isDInSetOfReachableTilesFromO_StaticBoard1(2,0));}
	@Test public void test_board1_99(){commonTestCode1(2,1,isDInSetOfReachableTilesFromO_StaticBoard1(2,1));}
	@Test public void test_board1_100(){commonTestCode1(2,2,isDInSetOfReachableTilesFromO_StaticBoard1(2,2));}
	@Test public void test_board1_101(){commonTestCode1(2,3,isDInSetOfReachableTilesFromO_StaticBoard1(2,3));}
	@Test public void test_board1_102(){commonTestCode1(2,4,isDInSetOfReachableTilesFromO_StaticBoard1(2,4));}
	@Test public void test_board1_103(){commonTestCode1(2,5,isDInSetOfReachableTilesFromO_StaticBoard1(2,5));}
	@Test public void test_board1_104(){commonTestCode1(2,6,isDInSetOfReachableTilesFromO_StaticBoard1(2,6));}
	@Test public void test_board1_105(){commonTestCode1(2,7,isDInSetOfReachableTilesFromO_StaticBoard1(2,7));}
	@Test public void test_board1_106(){commonTestCode1(2,8,isDInSetOfReachableTilesFromO_StaticBoard1(2,8));}
	@Test public void test_board1_107(){commonTestCode1(2,9,isDInSetOfReachableTilesFromO_StaticBoard1(2,9));}
	@Test public void test_board1_108(){commonTestCode1(2,10,isDInSetOfReachableTilesFromO_StaticBoard1(2,10));}
	@Test public void test_board1_109(){commonTestCode1(2,11,isDInSetOfReachableTilesFromO_StaticBoard1(2,11));}
	@Test public void test_board1_110(){commonTestCode1(2,12,isDInSetOfReachableTilesFromO_StaticBoard1(2,12));}
	@Test public void test_board1_111(){commonTestCode1(2,13,isDInSetOfReachableTilesFromO_StaticBoard1(2,13));}
	@Test public void test_board1_112(){commonTestCode1(2,14,isDInSetOfReachableTilesFromO_StaticBoard1(2,14));}
	@Test public void test_board1_113(){commonTestCode1(2,15,isDInSetOfReachableTilesFromO_StaticBoard1(2,15));}
	@Test public void test_board1_114(){commonTestCode1(2,16,isDInSetOfReachableTilesFromO_StaticBoard1(2,16));}
	@Test public void test_board1_115(){commonTestCode1(2,17,isDInSetOfReachableTilesFromO_StaticBoard1(2,17));}
	@Test public void test_board1_116(){commonTestCode1(2,18,isDInSetOfReachableTilesFromO_StaticBoard1(2,18));}
	@Test public void test_board1_117(){commonTestCode1(2,19,isDInSetOfReachableTilesFromO_StaticBoard1(2,19));}
	@Test public void test_board1_118(){commonTestCode1(2,20,isDInSetOfReachableTilesFromO_StaticBoard1(2,20));}
	@Test public void test_board1_119(){commonTestCode1(2,21,isDInSetOfReachableTilesFromO_StaticBoard1(2,21));}
	@Test public void test_board1_120(){commonTestCode1(2,22,isDInSetOfReachableTilesFromO_StaticBoard1(2,22));}
	@Test public void test_board1_121(){commonTestCode1(2,23,isDInSetOfReachableTilesFromO_StaticBoard1(2,23));}
	@Test public void test_board1_122(){commonTestCode1(2,24,isDInSetOfReachableTilesFromO_StaticBoard1(2,24));}
	@Test public void test_board1_123(){commonTestCode1(2,25,isDInSetOfReachableTilesFromO_StaticBoard1(2,25));}
	@Test public void test_board1_124(){commonTestCode1(2,26,isDInSetOfReachableTilesFromO_StaticBoard1(2,26));}
	@Test public void test_board1_125(){commonTestCode1(2,27,isDInSetOfReachableTilesFromO_StaticBoard1(2,27));}
	@Test public void test_board1_126(){commonTestCode1(2,28,isDInSetOfReachableTilesFromO_StaticBoard1(2,28));}
	@Test public void test_board1_127(){commonTestCode1(2,29,isDInSetOfReachableTilesFromO_StaticBoard1(2,29));}
	@Test public void test_board1_128(){commonTestCode1(2,30,isDInSetOfReachableTilesFromO_StaticBoard1(2,30));}
	@Test public void test_board1_129(){commonTestCode1(2,31,isDInSetOfReachableTilesFromO_StaticBoard1(2,31));}
	@Test public void test_board1_130(){commonTestCode1(2,32,isDInSetOfReachableTilesFromO_StaticBoard1(2,32));}
	@Test public void test_board1_131(){commonTestCode1(2,33,isDInSetOfReachableTilesFromO_StaticBoard1(2,33));}
	@Test public void test_board1_132(){commonTestCode1(2,34,isDInSetOfReachableTilesFromO_StaticBoard1(2,34));}
	@Test public void test_board1_133(){commonTestCode1(2,35,isDInSetOfReachableTilesFromO_StaticBoard1(2,35));}
	@Test public void test_board1_134(){commonTestCode1(2,36,isDInSetOfReachableTilesFromO_StaticBoard1(2,36));}
	@Test public void test_board1_135(){commonTestCode1(2,37,isDInSetOfReachableTilesFromO_StaticBoard1(2,37));}
	@Test public void test_board1_136(){commonTestCode1(2,38,isDInSetOfReachableTilesFromO_StaticBoard1(2,38));}
	@Test public void test_board1_137(){commonTestCode1(2,39,isDInSetOfReachableTilesFromO_StaticBoard1(2,39));}
	@Test public void test_board1_138(){commonTestCode1(2,40,isDInSetOfReachableTilesFromO_StaticBoard1(2,40));}
	@Test public void test_board1_139(){commonTestCode1(2,41,isDInSetOfReachableTilesFromO_StaticBoard1(2,41));}
	@Test public void test_board1_140(){commonTestCode1(2,42,isDInSetOfReachableTilesFromO_StaticBoard1(2,42));}
	@Test public void test_board1_141(){commonTestCode1(2,43,isDInSetOfReachableTilesFromO_StaticBoard1(2,43));}
	@Test public void test_board1_142(){commonTestCode1(2,44,isDInSetOfReachableTilesFromO_StaticBoard1(2,44));}
	@Test public void test_board1_143(){commonTestCode1(2,45,isDInSetOfReachableTilesFromO_StaticBoard1(2,45));}
	@Test public void test_board1_144(){commonTestCode1(2,46,isDInSetOfReachableTilesFromO_StaticBoard1(2,46));}
	@Test public void test_board1_145(){commonTestCode1(2,47,isDInSetOfReachableTilesFromO_StaticBoard1(2,47));}
	@Test public void test_board1_146(){commonTestCode1(2,48,isDInSetOfReachableTilesFromO_StaticBoard1(2,48));}
	@Test public void test_board1_147(){commonTestCode1(3,0,isDInSetOfReachableTilesFromO_StaticBoard1(3,0));}
	@Test public void test_board1_148(){commonTestCode1(3,1,isDInSetOfReachableTilesFromO_StaticBoard1(3,1));}
	@Test public void test_board1_149(){commonTestCode1(3,2,isDInSetOfReachableTilesFromO_StaticBoard1(3,2));}
	@Test public void test_board1_150(){commonTestCode1(3,3,isDInSetOfReachableTilesFromO_StaticBoard1(3,3));}
	@Test public void test_board1_151(){commonTestCode1(3,4,isDInSetOfReachableTilesFromO_StaticBoard1(3,4));}
	@Test public void test_board1_152(){commonTestCode1(3,5,isDInSetOfReachableTilesFromO_StaticBoard1(3,5));}
	@Test public void test_board1_153(){commonTestCode1(3,6,isDInSetOfReachableTilesFromO_StaticBoard1(3,6));}
	@Test public void test_board1_154(){commonTestCode1(3,7,isDInSetOfReachableTilesFromO_StaticBoard1(3,7));}
	@Test public void test_board1_155(){commonTestCode1(3,8,isDInSetOfReachableTilesFromO_StaticBoard1(3,8));}
	@Test public void test_board1_156(){commonTestCode1(3,9,isDInSetOfReachableTilesFromO_StaticBoard1(3,9));}
	@Test public void test_board1_157(){commonTestCode1(3,10,isDInSetOfReachableTilesFromO_StaticBoard1(3,10));}
	@Test public void test_board1_158(){commonTestCode1(3,11,isDInSetOfReachableTilesFromO_StaticBoard1(3,11));}
	@Test public void test_board1_159(){commonTestCode1(3,12,isDInSetOfReachableTilesFromO_StaticBoard1(3,12));}
	@Test public void test_board1_160(){commonTestCode1(3,13,isDInSetOfReachableTilesFromO_StaticBoard1(3,13));}
	@Test public void test_board1_161(){commonTestCode1(3,14,isDInSetOfReachableTilesFromO_StaticBoard1(3,14));}
	@Test public void test_board1_162(){commonTestCode1(3,15,isDInSetOfReachableTilesFromO_StaticBoard1(3,15));}
	@Test public void test_board1_163(){commonTestCode1(3,16,isDInSetOfReachableTilesFromO_StaticBoard1(3,16));}
	@Test public void test_board1_164(){commonTestCode1(3,17,isDInSetOfReachableTilesFromO_StaticBoard1(3,17));}
	@Test public void test_board1_165(){commonTestCode1(3,18,isDInSetOfReachableTilesFromO_StaticBoard1(3,18));}
	@Test public void test_board1_166(){commonTestCode1(3,19,isDInSetOfReachableTilesFromO_StaticBoard1(3,19));}
	@Test public void test_board1_167(){commonTestCode1(3,20,isDInSetOfReachableTilesFromO_StaticBoard1(3,20));}
	@Test public void test_board1_168(){commonTestCode1(3,21,isDInSetOfReachableTilesFromO_StaticBoard1(3,21));}
	@Test public void test_board1_169(){commonTestCode1(3,22,isDInSetOfReachableTilesFromO_StaticBoard1(3,22));}
	@Test public void test_board1_170(){commonTestCode1(3,23,isDInSetOfReachableTilesFromO_StaticBoard1(3,23));}
	@Test public void test_board1_171(){commonTestCode1(3,24,isDInSetOfReachableTilesFromO_StaticBoard1(3,24));}
	@Test public void test_board1_172(){commonTestCode1(3,25,isDInSetOfReachableTilesFromO_StaticBoard1(3,25));}
	@Test public void test_board1_173(){commonTestCode1(3,26,isDInSetOfReachableTilesFromO_StaticBoard1(3,26));}
	@Test public void test_board1_174(){commonTestCode1(3,27,isDInSetOfReachableTilesFromO_StaticBoard1(3,27));}
	@Test public void test_board1_175(){commonTestCode1(3,28,isDInSetOfReachableTilesFromO_StaticBoard1(3,28));}
	@Test public void test_board1_176(){commonTestCode1(3,29,isDInSetOfReachableTilesFromO_StaticBoard1(3,29));}
	@Test public void test_board1_177(){commonTestCode1(3,30,isDInSetOfReachableTilesFromO_StaticBoard1(3,30));}
	@Test public void test_board1_178(){commonTestCode1(3,31,isDInSetOfReachableTilesFromO_StaticBoard1(3,31));}
	@Test public void test_board1_179(){commonTestCode1(3,32,isDInSetOfReachableTilesFromO_StaticBoard1(3,32));}
	@Test public void test_board1_180(){commonTestCode1(3,33,isDInSetOfReachableTilesFromO_StaticBoard1(3,33));}
	@Test public void test_board1_181(){commonTestCode1(3,34,isDInSetOfReachableTilesFromO_StaticBoard1(3,34));}
	@Test public void test_board1_182(){commonTestCode1(3,35,isDInSetOfReachableTilesFromO_StaticBoard1(3,35));}
	@Test public void test_board1_183(){commonTestCode1(3,36,isDInSetOfReachableTilesFromO_StaticBoard1(3,36));}
	@Test public void test_board1_184(){commonTestCode1(3,37,isDInSetOfReachableTilesFromO_StaticBoard1(3,37));}
	@Test public void test_board1_185(){commonTestCode1(3,38,isDInSetOfReachableTilesFromO_StaticBoard1(3,38));}
	@Test public void test_board1_186(){commonTestCode1(3,39,isDInSetOfReachableTilesFromO_StaticBoard1(3,39));}
	@Test public void test_board1_187(){commonTestCode1(3,40,isDInSetOfReachableTilesFromO_StaticBoard1(3,40));}
	@Test public void test_board1_188(){commonTestCode1(3,41,isDInSetOfReachableTilesFromO_StaticBoard1(3,41));}
	@Test public void test_board1_189(){commonTestCode1(3,42,isDInSetOfReachableTilesFromO_StaticBoard1(3,42));}
	@Test public void test_board1_190(){commonTestCode1(3,43,isDInSetOfReachableTilesFromO_StaticBoard1(3,43));}
	@Test public void test_board1_191(){commonTestCode1(3,44,isDInSetOfReachableTilesFromO_StaticBoard1(3,44));}
	@Test public void test_board1_192(){commonTestCode1(3,45,isDInSetOfReachableTilesFromO_StaticBoard1(3,45));}
	@Test public void test_board1_193(){commonTestCode1(3,46,isDInSetOfReachableTilesFromO_StaticBoard1(3,46));}
	@Test public void test_board1_194(){commonTestCode1(3,47,isDInSetOfReachableTilesFromO_StaticBoard1(3,47));}
	@Test public void test_board1_195(){commonTestCode1(3,48,isDInSetOfReachableTilesFromO_StaticBoard1(3,48));}
	@Test public void test_board1_196(){commonTestCode1(4,0,isDInSetOfReachableTilesFromO_StaticBoard1(4,0));}
	@Test public void test_board1_197(){commonTestCode1(4,1,isDInSetOfReachableTilesFromO_StaticBoard1(4,1));}
	@Test public void test_board1_198(){commonTestCode1(4,2,isDInSetOfReachableTilesFromO_StaticBoard1(4,2));}
	@Test public void test_board1_199(){commonTestCode1(4,3,isDInSetOfReachableTilesFromO_StaticBoard1(4,3));}
	@Test public void test_board1_200(){commonTestCode1(4,4,isDInSetOfReachableTilesFromO_StaticBoard1(4,4));}
	@Test public void test_board1_201(){commonTestCode1(4,5,isDInSetOfReachableTilesFromO_StaticBoard1(4,5));}
	@Test public void test_board1_202(){commonTestCode1(4,6,isDInSetOfReachableTilesFromO_StaticBoard1(4,6));}
	@Test public void test_board1_203(){commonTestCode1(4,7,isDInSetOfReachableTilesFromO_StaticBoard1(4,7));}
	@Test public void test_board1_204(){commonTestCode1(4,8,isDInSetOfReachableTilesFromO_StaticBoard1(4,8));}
	@Test public void test_board1_205(){commonTestCode1(4,9,isDInSetOfReachableTilesFromO_StaticBoard1(4,9));}
	@Test public void test_board1_206(){commonTestCode1(4,10,isDInSetOfReachableTilesFromO_StaticBoard1(4,10));}
	@Test public void test_board1_207(){commonTestCode1(4,11,isDInSetOfReachableTilesFromO_StaticBoard1(4,11));}
	@Test public void test_board1_208(){commonTestCode1(4,12,isDInSetOfReachableTilesFromO_StaticBoard1(4,12));}
	@Test public void test_board1_209(){commonTestCode1(4,13,isDInSetOfReachableTilesFromO_StaticBoard1(4,13));}
	@Test public void test_board1_210(){commonTestCode1(4,14,isDInSetOfReachableTilesFromO_StaticBoard1(4,14));}
	@Test public void test_board1_211(){commonTestCode1(4,15,isDInSetOfReachableTilesFromO_StaticBoard1(4,15));}
	@Test public void test_board1_212(){commonTestCode1(4,16,isDInSetOfReachableTilesFromO_StaticBoard1(4,16));}
	@Test public void test_board1_213(){commonTestCode1(4,17,isDInSetOfReachableTilesFromO_StaticBoard1(4,17));}
	@Test public void test_board1_214(){commonTestCode1(4,18,isDInSetOfReachableTilesFromO_StaticBoard1(4,18));}
	@Test public void test_board1_215(){commonTestCode1(4,19,isDInSetOfReachableTilesFromO_StaticBoard1(4,19));}
	@Test public void test_board1_216(){commonTestCode1(4,20,isDInSetOfReachableTilesFromO_StaticBoard1(4,20));}
	@Test public void test_board1_217(){commonTestCode1(4,21,isDInSetOfReachableTilesFromO_StaticBoard1(4,21));}
	@Test public void test_board1_218(){commonTestCode1(4,22,isDInSetOfReachableTilesFromO_StaticBoard1(4,22));}
	@Test public void test_board1_219(){commonTestCode1(4,23,isDInSetOfReachableTilesFromO_StaticBoard1(4,23));}
	@Test public void test_board1_220(){commonTestCode1(4,24,isDInSetOfReachableTilesFromO_StaticBoard1(4,24));}
	@Test public void test_board1_221(){commonTestCode1(4,25,isDInSetOfReachableTilesFromO_StaticBoard1(4,25));}
	@Test public void test_board1_222(){commonTestCode1(4,26,isDInSetOfReachableTilesFromO_StaticBoard1(4,26));}
	@Test public void test_board1_223(){commonTestCode1(4,27,isDInSetOfReachableTilesFromO_StaticBoard1(4,27));}
	@Test public void test_board1_224(){commonTestCode1(4,28,isDInSetOfReachableTilesFromO_StaticBoard1(4,28));}
	@Test public void test_board1_225(){commonTestCode1(4,29,isDInSetOfReachableTilesFromO_StaticBoard1(4,29));}
	@Test public void test_board1_226(){commonTestCode1(4,30,isDInSetOfReachableTilesFromO_StaticBoard1(4,30));}
	@Test public void test_board1_227(){commonTestCode1(4,31,isDInSetOfReachableTilesFromO_StaticBoard1(4,31));}
	@Test public void test_board1_228(){commonTestCode1(4,32,isDInSetOfReachableTilesFromO_StaticBoard1(4,32));}
	@Test public void test_board1_229(){commonTestCode1(4,33,isDInSetOfReachableTilesFromO_StaticBoard1(4,33));}
	@Test public void test_board1_230(){commonTestCode1(4,34,isDInSetOfReachableTilesFromO_StaticBoard1(4,34));}
	@Test public void test_board1_231(){commonTestCode1(4,35,isDInSetOfReachableTilesFromO_StaticBoard1(4,35));}
	@Test public void test_board1_232(){commonTestCode1(4,36,isDInSetOfReachableTilesFromO_StaticBoard1(4,36));}
	@Test public void test_board1_233(){commonTestCode1(4,37,isDInSetOfReachableTilesFromO_StaticBoard1(4,37));}
	@Test public void test_board1_234(){commonTestCode1(4,38,isDInSetOfReachableTilesFromO_StaticBoard1(4,38));}
	@Test public void test_board1_235(){commonTestCode1(4,39,isDInSetOfReachableTilesFromO_StaticBoard1(4,39));}
	@Test public void test_board1_236(){commonTestCode1(4,40,isDInSetOfReachableTilesFromO_StaticBoard1(4,40));}
	@Test public void test_board1_237(){commonTestCode1(4,41,isDInSetOfReachableTilesFromO_StaticBoard1(4,41));}
	@Test public void test_board1_238(){commonTestCode1(4,42,isDInSetOfReachableTilesFromO_StaticBoard1(4,42));}
	@Test public void test_board1_239(){commonTestCode1(4,43,isDInSetOfReachableTilesFromO_StaticBoard1(4,43));}
	@Test public void test_board1_240(){commonTestCode1(4,44,isDInSetOfReachableTilesFromO_StaticBoard1(4,44));}
	@Test public void test_board1_241(){commonTestCode1(4,45,isDInSetOfReachableTilesFromO_StaticBoard1(4,45));}
	@Test public void test_board1_242(){commonTestCode1(4,46,isDInSetOfReachableTilesFromO_StaticBoard1(4,46));}
	@Test public void test_board1_243(){commonTestCode1(4,47,isDInSetOfReachableTilesFromO_StaticBoard1(4,47));}
	@Test public void test_board1_244(){commonTestCode1(4,48,isDInSetOfReachableTilesFromO_StaticBoard1(4,48));}
	@Test public void test_board1_245(){commonTestCode1(5,0,isDInSetOfReachableTilesFromO_StaticBoard1(5,0));}
	@Test public void test_board1_246(){commonTestCode1(5,1,isDInSetOfReachableTilesFromO_StaticBoard1(5,1));}
	@Test public void test_board1_247(){commonTestCode1(5,2,isDInSetOfReachableTilesFromO_StaticBoard1(5,2));}
	@Test public void test_board1_248(){commonTestCode1(5,3,isDInSetOfReachableTilesFromO_StaticBoard1(5,3));}
	@Test public void test_board1_249(){commonTestCode1(5,4,isDInSetOfReachableTilesFromO_StaticBoard1(5,4));}
	@Test public void test_board1_250(){commonTestCode1(5,5,isDInSetOfReachableTilesFromO_StaticBoard1(5,5));}
	@Test public void test_board1_251(){commonTestCode1(5,6,isDInSetOfReachableTilesFromO_StaticBoard1(5,6));}
	@Test public void test_board1_252(){commonTestCode1(5,7,isDInSetOfReachableTilesFromO_StaticBoard1(5,7));}
	@Test public void test_board1_253(){commonTestCode1(5,8,isDInSetOfReachableTilesFromO_StaticBoard1(5,8));}
	@Test public void test_board1_254(){commonTestCode1(5,9,isDInSetOfReachableTilesFromO_StaticBoard1(5,9));}
	@Test public void test_board1_255(){commonTestCode1(5,10,isDInSetOfReachableTilesFromO_StaticBoard1(5,10));}
	@Test public void test_board1_256(){commonTestCode1(5,11,isDInSetOfReachableTilesFromO_StaticBoard1(5,11));}
	@Test public void test_board1_257(){commonTestCode1(5,12,isDInSetOfReachableTilesFromO_StaticBoard1(5,12));}
	@Test public void test_board1_258(){commonTestCode1(5,13,isDInSetOfReachableTilesFromO_StaticBoard1(5,13));}
	@Test public void test_board1_259(){commonTestCode1(5,14,isDInSetOfReachableTilesFromO_StaticBoard1(5,14));}
	@Test public void test_board1_260(){commonTestCode1(5,15,isDInSetOfReachableTilesFromO_StaticBoard1(5,15));}
	@Test public void test_board1_261(){commonTestCode1(5,16,isDInSetOfReachableTilesFromO_StaticBoard1(5,16));}
	@Test public void test_board1_262(){commonTestCode1(5,17,isDInSetOfReachableTilesFromO_StaticBoard1(5,17));}
	@Test public void test_board1_263(){commonTestCode1(5,18,isDInSetOfReachableTilesFromO_StaticBoard1(5,18));}
	@Test public void test_board1_264(){commonTestCode1(5,19,isDInSetOfReachableTilesFromO_StaticBoard1(5,19));}
	@Test public void test_board1_265(){commonTestCode1(5,20,isDInSetOfReachableTilesFromO_StaticBoard1(5,20));}
	@Test public void test_board1_266(){commonTestCode1(5,21,isDInSetOfReachableTilesFromO_StaticBoard1(5,21));}
	@Test public void test_board1_267(){commonTestCode1(5,22,isDInSetOfReachableTilesFromO_StaticBoard1(5,22));}
	@Test public void test_board1_268(){commonTestCode1(5,23,isDInSetOfReachableTilesFromO_StaticBoard1(5,23));}
	@Test public void test_board1_269(){commonTestCode1(5,24,isDInSetOfReachableTilesFromO_StaticBoard1(5,24));}
	@Test public void test_board1_270(){commonTestCode1(5,25,isDInSetOfReachableTilesFromO_StaticBoard1(5,25));}
	@Test public void test_board1_271(){commonTestCode1(5,26,isDInSetOfReachableTilesFromO_StaticBoard1(5,26));}
	@Test public void test_board1_272(){commonTestCode1(5,27,isDInSetOfReachableTilesFromO_StaticBoard1(5,27));}
	@Test public void test_board1_273(){commonTestCode1(5,28,isDInSetOfReachableTilesFromO_StaticBoard1(5,28));}
	@Test public void test_board1_274(){commonTestCode1(5,29,isDInSetOfReachableTilesFromO_StaticBoard1(5,29));}
	@Test public void test_board1_275(){commonTestCode1(5,30,isDInSetOfReachableTilesFromO_StaticBoard1(5,30));}
	@Test public void test_board1_276(){commonTestCode1(5,31,isDInSetOfReachableTilesFromO_StaticBoard1(5,31));}
	@Test public void test_board1_277(){commonTestCode1(5,32,isDInSetOfReachableTilesFromO_StaticBoard1(5,32));}
	@Test public void test_board1_278(){commonTestCode1(5,33,isDInSetOfReachableTilesFromO_StaticBoard1(5,33));}
	@Test public void test_board1_279(){commonTestCode1(5,34,isDInSetOfReachableTilesFromO_StaticBoard1(5,34));}
	@Test public void test_board1_280(){commonTestCode1(5,35,isDInSetOfReachableTilesFromO_StaticBoard1(5,35));}
	@Test public void test_board1_281(){commonTestCode1(5,36,isDInSetOfReachableTilesFromO_StaticBoard1(5,36));}
	@Test public void test_board1_282(){commonTestCode1(5,37,isDInSetOfReachableTilesFromO_StaticBoard1(5,37));}
	@Test public void test_board1_283(){commonTestCode1(5,38,isDInSetOfReachableTilesFromO_StaticBoard1(5,38));}
	@Test public void test_board1_284(){commonTestCode1(5,39,isDInSetOfReachableTilesFromO_StaticBoard1(5,39));}
	@Test public void test_board1_285(){commonTestCode1(5,40,isDInSetOfReachableTilesFromO_StaticBoard1(5,40));}
	@Test public void test_board1_286(){commonTestCode1(5,41,isDInSetOfReachableTilesFromO_StaticBoard1(5,41));}
	@Test public void test_board1_287(){commonTestCode1(5,42,isDInSetOfReachableTilesFromO_StaticBoard1(5,42));}
	@Test public void test_board1_288(){commonTestCode1(5,43,isDInSetOfReachableTilesFromO_StaticBoard1(5,43));}
	@Test public void test_board1_289(){commonTestCode1(5,44,isDInSetOfReachableTilesFromO_StaticBoard1(5,44));}
	@Test public void test_board1_290(){commonTestCode1(5,45,isDInSetOfReachableTilesFromO_StaticBoard1(5,45));}
	@Test public void test_board1_291(){commonTestCode1(5,46,isDInSetOfReachableTilesFromO_StaticBoard1(5,46));}
	@Test public void test_board1_292(){commonTestCode1(5,47,isDInSetOfReachableTilesFromO_StaticBoard1(5,47));}
	@Test public void test_board1_293(){commonTestCode1(5,48,isDInSetOfReachableTilesFromO_StaticBoard1(5,48));}
	@Test public void test_board1_294(){commonTestCode1(6,0,isDInSetOfReachableTilesFromO_StaticBoard1(6,0));}
	@Test public void test_board1_295(){commonTestCode1(6,1,isDInSetOfReachableTilesFromO_StaticBoard1(6,1));}
	@Test public void test_board1_296(){commonTestCode1(6,2,isDInSetOfReachableTilesFromO_StaticBoard1(6,2));}
	@Test public void test_board1_297(){commonTestCode1(6,3,isDInSetOfReachableTilesFromO_StaticBoard1(6,3));}
	@Test public void test_board1_298(){commonTestCode1(6,4,isDInSetOfReachableTilesFromO_StaticBoard1(6,4));}
	@Test public void test_board1_299(){commonTestCode1(6,5,isDInSetOfReachableTilesFromO_StaticBoard1(6,5));}
	@Test public void test_board1_300(){commonTestCode1(6,6,isDInSetOfReachableTilesFromO_StaticBoard1(6,6));}
	@Test public void test_board1_301(){commonTestCode1(6,7,isDInSetOfReachableTilesFromO_StaticBoard1(6,7));}
	@Test public void test_board1_302(){commonTestCode1(6,8,isDInSetOfReachableTilesFromO_StaticBoard1(6,8));}
	@Test public void test_board1_303(){commonTestCode1(6,9,isDInSetOfReachableTilesFromO_StaticBoard1(6,9));}
	@Test public void test_board1_304(){commonTestCode1(6,10,isDInSetOfReachableTilesFromO_StaticBoard1(6,10));}
	@Test public void test_board1_305(){commonTestCode1(6,11,isDInSetOfReachableTilesFromO_StaticBoard1(6,11));}
	@Test public void test_board1_306(){commonTestCode1(6,12,isDInSetOfReachableTilesFromO_StaticBoard1(6,12));}
	@Test public void test_board1_307(){commonTestCode1(6,13,isDInSetOfReachableTilesFromO_StaticBoard1(6,13));}
	@Test public void test_board1_308(){commonTestCode1(6,14,isDInSetOfReachableTilesFromO_StaticBoard1(6,14));}
	@Test public void test_board1_309(){commonTestCode1(6,15,isDInSetOfReachableTilesFromO_StaticBoard1(6,15));}
	@Test public void test_board1_310(){commonTestCode1(6,16,isDInSetOfReachableTilesFromO_StaticBoard1(6,16));}
	@Test public void test_board1_311(){commonTestCode1(6,17,isDInSetOfReachableTilesFromO_StaticBoard1(6,17));}
	@Test public void test_board1_312(){commonTestCode1(6,18,isDInSetOfReachableTilesFromO_StaticBoard1(6,18));}
	@Test public void test_board1_313(){commonTestCode1(6,19,isDInSetOfReachableTilesFromO_StaticBoard1(6,19));}
	@Test public void test_board1_314(){commonTestCode1(6,20,isDInSetOfReachableTilesFromO_StaticBoard1(6,20));}
	@Test public void test_board1_315(){commonTestCode1(6,21,isDInSetOfReachableTilesFromO_StaticBoard1(6,21));}
	@Test public void test_board1_316(){commonTestCode1(6,22,isDInSetOfReachableTilesFromO_StaticBoard1(6,22));}
	@Test public void test_board1_317(){commonTestCode1(6,23,isDInSetOfReachableTilesFromO_StaticBoard1(6,23));}
	@Test public void test_board1_318(){commonTestCode1(6,24,isDInSetOfReachableTilesFromO_StaticBoard1(6,24));}
	@Test public void test_board1_319(){commonTestCode1(6,25,isDInSetOfReachableTilesFromO_StaticBoard1(6,25));}
	@Test public void test_board1_320(){commonTestCode1(6,26,isDInSetOfReachableTilesFromO_StaticBoard1(6,26));}
	@Test public void test_board1_321(){commonTestCode1(6,27,isDInSetOfReachableTilesFromO_StaticBoard1(6,27));}
	@Test public void test_board1_322(){commonTestCode1(6,28,isDInSetOfReachableTilesFromO_StaticBoard1(6,28));}
	@Test public void test_board1_323(){commonTestCode1(6,29,isDInSetOfReachableTilesFromO_StaticBoard1(6,29));}
	@Test public void test_board1_324(){commonTestCode1(6,30,isDInSetOfReachableTilesFromO_StaticBoard1(6,30));}
	@Test public void test_board1_325(){commonTestCode1(6,31,isDInSetOfReachableTilesFromO_StaticBoard1(6,31));}
	@Test public void test_board1_326(){commonTestCode1(6,32,isDInSetOfReachableTilesFromO_StaticBoard1(6,32));}
	@Test public void test_board1_327(){commonTestCode1(6,33,isDInSetOfReachableTilesFromO_StaticBoard1(6,33));}
	@Test public void test_board1_328(){commonTestCode1(6,34,isDInSetOfReachableTilesFromO_StaticBoard1(6,34));}
	@Test public void test_board1_329(){commonTestCode1(6,35,isDInSetOfReachableTilesFromO_StaticBoard1(6,35));}
	@Test public void test_board1_330(){commonTestCode1(6,36,isDInSetOfReachableTilesFromO_StaticBoard1(6,36));}
	@Test public void test_board1_331(){commonTestCode1(6,37,isDInSetOfReachableTilesFromO_StaticBoard1(6,37));}
	@Test public void test_board1_332(){commonTestCode1(6,38,isDInSetOfReachableTilesFromO_StaticBoard1(6,38));}
	@Test public void test_board1_333(){commonTestCode1(6,39,isDInSetOfReachableTilesFromO_StaticBoard1(6,39));}
	@Test public void test_board1_334(){commonTestCode1(6,40,isDInSetOfReachableTilesFromO_StaticBoard1(6,40));}
	@Test public void test_board1_335(){commonTestCode1(6,41,isDInSetOfReachableTilesFromO_StaticBoard1(6,41));}
	@Test public void test_board1_336(){commonTestCode1(6,42,isDInSetOfReachableTilesFromO_StaticBoard1(6,42));}
	@Test public void test_board1_337(){commonTestCode1(6,43,isDInSetOfReachableTilesFromO_StaticBoard1(6,43));}
	@Test public void test_board1_338(){commonTestCode1(6,44,isDInSetOfReachableTilesFromO_StaticBoard1(6,44));}
	@Test public void test_board1_339(){commonTestCode1(6,45,isDInSetOfReachableTilesFromO_StaticBoard1(6,45));}
	@Test public void test_board1_340(){commonTestCode1(6,46,isDInSetOfReachableTilesFromO_StaticBoard1(6,46));}
	@Test public void test_board1_341(){commonTestCode1(6,47,isDInSetOfReachableTilesFromO_StaticBoard1(6,47));}
	@Test public void test_board1_342(){commonTestCode1(6,48,isDInSetOfReachableTilesFromO_StaticBoard1(6,48));}
	@Test public void test_board1_343(){commonTestCode1(7,0,isDInSetOfReachableTilesFromO_StaticBoard1(7,0));}
	@Test public void test_board1_344(){commonTestCode1(7,1,isDInSetOfReachableTilesFromO_StaticBoard1(7,1));}
	@Test public void test_board1_345(){commonTestCode1(7,2,isDInSetOfReachableTilesFromO_StaticBoard1(7,2));}
	@Test public void test_board1_346(){commonTestCode1(7,3,isDInSetOfReachableTilesFromO_StaticBoard1(7,3));}
	@Test public void test_board1_347(){commonTestCode1(7,4,isDInSetOfReachableTilesFromO_StaticBoard1(7,4));}
	@Test public void test_board1_348(){commonTestCode1(7,5,isDInSetOfReachableTilesFromO_StaticBoard1(7,5));}
	@Test public void test_board1_349(){commonTestCode1(7,6,isDInSetOfReachableTilesFromO_StaticBoard1(7,6));}
	@Test public void test_board1_350(){commonTestCode1(7,7,isDInSetOfReachableTilesFromO_StaticBoard1(7,7));}
	@Test public void test_board1_351(){commonTestCode1(7,8,isDInSetOfReachableTilesFromO_StaticBoard1(7,8));}
	@Test public void test_board1_352(){commonTestCode1(7,9,isDInSetOfReachableTilesFromO_StaticBoard1(7,9));}
	@Test public void test_board1_353(){commonTestCode1(7,10,isDInSetOfReachableTilesFromO_StaticBoard1(7,10));}
	@Test public void test_board1_354(){commonTestCode1(7,11,isDInSetOfReachableTilesFromO_StaticBoard1(7,11));}
	@Test public void test_board1_355(){commonTestCode1(7,12,isDInSetOfReachableTilesFromO_StaticBoard1(7,12));}
	@Test public void test_board1_356(){commonTestCode1(7,13,isDInSetOfReachableTilesFromO_StaticBoard1(7,13));}
	@Test public void test_board1_357(){commonTestCode1(7,14,isDInSetOfReachableTilesFromO_StaticBoard1(7,14));}
	@Test public void test_board1_358(){commonTestCode1(7,15,isDInSetOfReachableTilesFromO_StaticBoard1(7,15));}
	@Test public void test_board1_359(){commonTestCode1(7,16,isDInSetOfReachableTilesFromO_StaticBoard1(7,16));}
	@Test public void test_board1_360(){commonTestCode1(7,17,isDInSetOfReachableTilesFromO_StaticBoard1(7,17));}
	@Test public void test_board1_361(){commonTestCode1(7,18,isDInSetOfReachableTilesFromO_StaticBoard1(7,18));}
	@Test public void test_board1_362(){commonTestCode1(7,19,isDInSetOfReachableTilesFromO_StaticBoard1(7,19));}
	@Test public void test_board1_363(){commonTestCode1(7,20,isDInSetOfReachableTilesFromO_StaticBoard1(7,20));}
	@Test public void test_board1_364(){commonTestCode1(7,21,isDInSetOfReachableTilesFromO_StaticBoard1(7,21));}
	@Test public void test_board1_365(){commonTestCode1(7,22,isDInSetOfReachableTilesFromO_StaticBoard1(7,22));}
	@Test public void test_board1_366(){commonTestCode1(7,23,isDInSetOfReachableTilesFromO_StaticBoard1(7,23));}
	@Test public void test_board1_367(){commonTestCode1(7,24,isDInSetOfReachableTilesFromO_StaticBoard1(7,24));}
	@Test public void test_board1_368(){commonTestCode1(7,25,isDInSetOfReachableTilesFromO_StaticBoard1(7,25));}
	@Test public void test_board1_369(){commonTestCode1(7,26,isDInSetOfReachableTilesFromO_StaticBoard1(7,26));}
	@Test public void test_board1_370(){commonTestCode1(7,27,isDInSetOfReachableTilesFromO_StaticBoard1(7,27));}
	@Test public void test_board1_371(){commonTestCode1(7,28,isDInSetOfReachableTilesFromO_StaticBoard1(7,28));}
	@Test public void test_board1_372(){commonTestCode1(7,29,isDInSetOfReachableTilesFromO_StaticBoard1(7,29));}
	@Test public void test_board1_373(){commonTestCode1(7,30,isDInSetOfReachableTilesFromO_StaticBoard1(7,30));}
	@Test public void test_board1_374(){commonTestCode1(7,31,isDInSetOfReachableTilesFromO_StaticBoard1(7,31));}
	@Test public void test_board1_375(){commonTestCode1(7,32,isDInSetOfReachableTilesFromO_StaticBoard1(7,32));}
	@Test public void test_board1_376(){commonTestCode1(7,33,isDInSetOfReachableTilesFromO_StaticBoard1(7,33));}
	@Test public void test_board1_377(){commonTestCode1(7,34,isDInSetOfReachableTilesFromO_StaticBoard1(7,34));}
	@Test public void test_board1_378(){commonTestCode1(7,35,isDInSetOfReachableTilesFromO_StaticBoard1(7,35));}
	@Test public void test_board1_379(){commonTestCode1(7,36,isDInSetOfReachableTilesFromO_StaticBoard1(7,36));}
	@Test public void test_board1_380(){commonTestCode1(7,37,isDInSetOfReachableTilesFromO_StaticBoard1(7,37));}
	@Test public void test_board1_381(){commonTestCode1(7,38,isDInSetOfReachableTilesFromO_StaticBoard1(7,38));}
	@Test public void test_board1_382(){commonTestCode1(7,39,isDInSetOfReachableTilesFromO_StaticBoard1(7,39));}
	@Test public void test_board1_383(){commonTestCode1(7,40,isDInSetOfReachableTilesFromO_StaticBoard1(7,40));}
	@Test public void test_board1_384(){commonTestCode1(7,41,isDInSetOfReachableTilesFromO_StaticBoard1(7,41));}
	@Test public void test_board1_385(){commonTestCode1(7,42,isDInSetOfReachableTilesFromO_StaticBoard1(7,42));}
	@Test public void test_board1_386(){commonTestCode1(7,43,isDInSetOfReachableTilesFromO_StaticBoard1(7,43));}
	@Test public void test_board1_387(){commonTestCode1(7,44,isDInSetOfReachableTilesFromO_StaticBoard1(7,44));}
	@Test public void test_board1_388(){commonTestCode1(7,45,isDInSetOfReachableTilesFromO_StaticBoard1(7,45));}
	@Test public void test_board1_389(){commonTestCode1(7,46,isDInSetOfReachableTilesFromO_StaticBoard1(7,46));}
	@Test public void test_board1_390(){commonTestCode1(7,47,isDInSetOfReachableTilesFromO_StaticBoard1(7,47));}
	@Test public void test_board1_391(){commonTestCode1(7,48,isDInSetOfReachableTilesFromO_StaticBoard1(7,48));}
	@Test public void test_board1_392(){commonTestCode1(8,0,isDInSetOfReachableTilesFromO_StaticBoard1(8,0));}
	@Test public void test_board1_393(){commonTestCode1(8,1,isDInSetOfReachableTilesFromO_StaticBoard1(8,1));}
	@Test public void test_board1_394(){commonTestCode1(8,2,isDInSetOfReachableTilesFromO_StaticBoard1(8,2));}
	@Test public void test_board1_395(){commonTestCode1(8,3,isDInSetOfReachableTilesFromO_StaticBoard1(8,3));}
	@Test public void test_board1_396(){commonTestCode1(8,4,isDInSetOfReachableTilesFromO_StaticBoard1(8,4));}
	@Test public void test_board1_397(){commonTestCode1(8,5,isDInSetOfReachableTilesFromO_StaticBoard1(8,5));}
	@Test public void test_board1_398(){commonTestCode1(8,6,isDInSetOfReachableTilesFromO_StaticBoard1(8,6));}
	@Test public void test_board1_399(){commonTestCode1(8,7,isDInSetOfReachableTilesFromO_StaticBoard1(8,7));}
	@Test public void test_board1_400(){commonTestCode1(8,8,isDInSetOfReachableTilesFromO_StaticBoard1(8,8));}
	@Test public void test_board1_401(){commonTestCode1(8,9,isDInSetOfReachableTilesFromO_StaticBoard1(8,9));}
	@Test public void test_board1_402(){commonTestCode1(8,10,isDInSetOfReachableTilesFromO_StaticBoard1(8,10));}
	@Test public void test_board1_403(){commonTestCode1(8,11,isDInSetOfReachableTilesFromO_StaticBoard1(8,11));}
	@Test public void test_board1_404(){commonTestCode1(8,12,isDInSetOfReachableTilesFromO_StaticBoard1(8,12));}
	@Test public void test_board1_405(){commonTestCode1(8,13,isDInSetOfReachableTilesFromO_StaticBoard1(8,13));}
	@Test public void test_board1_406(){commonTestCode1(8,14,isDInSetOfReachableTilesFromO_StaticBoard1(8,14));}
	@Test public void test_board1_407(){commonTestCode1(8,15,isDInSetOfReachableTilesFromO_StaticBoard1(8,15));}
	@Test public void test_board1_408(){commonTestCode1(8,16,isDInSetOfReachableTilesFromO_StaticBoard1(8,16));}
	@Test public void test_board1_409(){commonTestCode1(8,17,isDInSetOfReachableTilesFromO_StaticBoard1(8,17));}
	@Test public void test_board1_410(){commonTestCode1(8,18,isDInSetOfReachableTilesFromO_StaticBoard1(8,18));}
	@Test public void test_board1_411(){commonTestCode1(8,19,isDInSetOfReachableTilesFromO_StaticBoard1(8,19));}
	@Test public void test_board1_412(){commonTestCode1(8,20,isDInSetOfReachableTilesFromO_StaticBoard1(8,20));}
	@Test public void test_board1_413(){commonTestCode1(8,21,isDInSetOfReachableTilesFromO_StaticBoard1(8,21));}
	@Test public void test_board1_414(){commonTestCode1(8,22,isDInSetOfReachableTilesFromO_StaticBoard1(8,22));}
	@Test public void test_board1_415(){commonTestCode1(8,23,isDInSetOfReachableTilesFromO_StaticBoard1(8,23));}
	@Test public void test_board1_416(){commonTestCode1(8,24,isDInSetOfReachableTilesFromO_StaticBoard1(8,24));}
	@Test public void test_board1_417(){commonTestCode1(8,25,isDInSetOfReachableTilesFromO_StaticBoard1(8,25));}
	@Test public void test_board1_418(){commonTestCode1(8,26,isDInSetOfReachableTilesFromO_StaticBoard1(8,26));}
	@Test public void test_board1_419(){commonTestCode1(8,27,isDInSetOfReachableTilesFromO_StaticBoard1(8,27));}
	@Test public void test_board1_420(){commonTestCode1(8,28,isDInSetOfReachableTilesFromO_StaticBoard1(8,28));}
	@Test public void test_board1_421(){commonTestCode1(8,29,isDInSetOfReachableTilesFromO_StaticBoard1(8,29));}
	@Test public void test_board1_422(){commonTestCode1(8,30,isDInSetOfReachableTilesFromO_StaticBoard1(8,30));}
	@Test public void test_board1_423(){commonTestCode1(8,31,isDInSetOfReachableTilesFromO_StaticBoard1(8,31));}
	@Test public void test_board1_424(){commonTestCode1(8,32,isDInSetOfReachableTilesFromO_StaticBoard1(8,32));}
	@Test public void test_board1_425(){commonTestCode1(8,33,isDInSetOfReachableTilesFromO_StaticBoard1(8,33));}
	@Test public void test_board1_426(){commonTestCode1(8,34,isDInSetOfReachableTilesFromO_StaticBoard1(8,34));}
	@Test public void test_board1_427(){commonTestCode1(8,35,isDInSetOfReachableTilesFromO_StaticBoard1(8,35));}
	@Test public void test_board1_428(){commonTestCode1(8,36,isDInSetOfReachableTilesFromO_StaticBoard1(8,36));}
	@Test public void test_board1_429(){commonTestCode1(8,37,isDInSetOfReachableTilesFromO_StaticBoard1(8,37));}
	@Test public void test_board1_430(){commonTestCode1(8,38,isDInSetOfReachableTilesFromO_StaticBoard1(8,38));}
	@Test public void test_board1_431(){commonTestCode1(8,39,isDInSetOfReachableTilesFromO_StaticBoard1(8,39));}
	@Test public void test_board1_432(){commonTestCode1(8,40,isDInSetOfReachableTilesFromO_StaticBoard1(8,40));}
	@Test public void test_board1_433(){commonTestCode1(8,41,isDInSetOfReachableTilesFromO_StaticBoard1(8,41));}
	@Test public void test_board1_434(){commonTestCode1(8,42,isDInSetOfReachableTilesFromO_StaticBoard1(8,42));}
	@Test public void test_board1_435(){commonTestCode1(8,43,isDInSetOfReachableTilesFromO_StaticBoard1(8,43));}
	@Test public void test_board1_436(){commonTestCode1(8,44,isDInSetOfReachableTilesFromO_StaticBoard1(8,44));}
	@Test public void test_board1_437(){commonTestCode1(8,45,isDInSetOfReachableTilesFromO_StaticBoard1(8,45));}
	@Test public void test_board1_438(){commonTestCode1(8,46,isDInSetOfReachableTilesFromO_StaticBoard1(8,46));}
	@Test public void test_board1_439(){commonTestCode1(8,47,isDInSetOfReachableTilesFromO_StaticBoard1(8,47));}
	@Test public void test_board1_440(){commonTestCode1(8,48,isDInSetOfReachableTilesFromO_StaticBoard1(8,48));}
	@Test public void test_board1_441(){commonTestCode1(9,0,isDInSetOfReachableTilesFromO_StaticBoard1(9,0));}
	@Test public void test_board1_442(){commonTestCode1(9,1,isDInSetOfReachableTilesFromO_StaticBoard1(9,1));}
	@Test public void test_board1_443(){commonTestCode1(9,2,isDInSetOfReachableTilesFromO_StaticBoard1(9,2));}
	@Test public void test_board1_444(){commonTestCode1(9,3,isDInSetOfReachableTilesFromO_StaticBoard1(9,3));}
	@Test public void test_board1_445(){commonTestCode1(9,4,isDInSetOfReachableTilesFromO_StaticBoard1(9,4));}
	@Test public void test_board1_446(){commonTestCode1(9,5,isDInSetOfReachableTilesFromO_StaticBoard1(9,5));}
	@Test public void test_board1_447(){commonTestCode1(9,6,isDInSetOfReachableTilesFromO_StaticBoard1(9,6));}
	@Test public void test_board1_448(){commonTestCode1(9,7,isDInSetOfReachableTilesFromO_StaticBoard1(9,7));}
	@Test public void test_board1_449(){commonTestCode1(9,8,isDInSetOfReachableTilesFromO_StaticBoard1(9,8));}
	@Test public void test_board1_450(){commonTestCode1(9,9,isDInSetOfReachableTilesFromO_StaticBoard1(9,9));}
	@Test public void test_board1_451(){commonTestCode1(9,10,isDInSetOfReachableTilesFromO_StaticBoard1(9,10));}
	@Test public void test_board1_452(){commonTestCode1(9,11,isDInSetOfReachableTilesFromO_StaticBoard1(9,11));}
	@Test public void test_board1_453(){commonTestCode1(9,12,isDInSetOfReachableTilesFromO_StaticBoard1(9,12));}
	@Test public void test_board1_454(){commonTestCode1(9,13,isDInSetOfReachableTilesFromO_StaticBoard1(9,13));}
	@Test public void test_board1_455(){commonTestCode1(9,14,isDInSetOfReachableTilesFromO_StaticBoard1(9,14));}
	@Test public void test_board1_456(){commonTestCode1(9,15,isDInSetOfReachableTilesFromO_StaticBoard1(9,15));}
	@Test public void test_board1_457(){commonTestCode1(9,16,isDInSetOfReachableTilesFromO_StaticBoard1(9,16));}
	@Test public void test_board1_458(){commonTestCode1(9,17,isDInSetOfReachableTilesFromO_StaticBoard1(9,17));}
	@Test public void test_board1_459(){commonTestCode1(9,18,isDInSetOfReachableTilesFromO_StaticBoard1(9,18));}
	@Test public void test_board1_460(){commonTestCode1(9,19,isDInSetOfReachableTilesFromO_StaticBoard1(9,19));}
	@Test public void test_board1_461(){commonTestCode1(9,20,isDInSetOfReachableTilesFromO_StaticBoard1(9,20));}
	@Test public void test_board1_462(){commonTestCode1(9,21,isDInSetOfReachableTilesFromO_StaticBoard1(9,21));}
	@Test public void test_board1_463(){commonTestCode1(9,22,isDInSetOfReachableTilesFromO_StaticBoard1(9,22));}
	@Test public void test_board1_464(){commonTestCode1(9,23,isDInSetOfReachableTilesFromO_StaticBoard1(9,23));}
	@Test public void test_board1_465(){commonTestCode1(9,24,isDInSetOfReachableTilesFromO_StaticBoard1(9,24));}
	@Test public void test_board1_466(){commonTestCode1(9,25,isDInSetOfReachableTilesFromO_StaticBoard1(9,25));}
	@Test public void test_board1_467(){commonTestCode1(9,26,isDInSetOfReachableTilesFromO_StaticBoard1(9,26));}
	@Test public void test_board1_468(){commonTestCode1(9,27,isDInSetOfReachableTilesFromO_StaticBoard1(9,27));}
	@Test public void test_board1_469(){commonTestCode1(9,28,isDInSetOfReachableTilesFromO_StaticBoard1(9,28));}
	@Test public void test_board1_470(){commonTestCode1(9,29,isDInSetOfReachableTilesFromO_StaticBoard1(9,29));}
	@Test public void test_board1_471(){commonTestCode1(9,30,isDInSetOfReachableTilesFromO_StaticBoard1(9,30));}
	@Test public void test_board1_472(){commonTestCode1(9,31,isDInSetOfReachableTilesFromO_StaticBoard1(9,31));}
	@Test public void test_board1_473(){commonTestCode1(9,32,isDInSetOfReachableTilesFromO_StaticBoard1(9,32));}
	@Test public void test_board1_474(){commonTestCode1(9,33,isDInSetOfReachableTilesFromO_StaticBoard1(9,33));}
	@Test public void test_board1_475(){commonTestCode1(9,34,isDInSetOfReachableTilesFromO_StaticBoard1(9,34));}
	@Test public void test_board1_476(){commonTestCode1(9,35,isDInSetOfReachableTilesFromO_StaticBoard1(9,35));}
	@Test public void test_board1_477(){commonTestCode1(9,36,isDInSetOfReachableTilesFromO_StaticBoard1(9,36));}
	@Test public void test_board1_478(){commonTestCode1(9,37,isDInSetOfReachableTilesFromO_StaticBoard1(9,37));}
	@Test public void test_board1_479(){commonTestCode1(9,38,isDInSetOfReachableTilesFromO_StaticBoard1(9,38));}
	@Test public void test_board1_480(){commonTestCode1(9,39,isDInSetOfReachableTilesFromO_StaticBoard1(9,39));}
	@Test public void test_board1_481(){commonTestCode1(9,40,isDInSetOfReachableTilesFromO_StaticBoard1(9,40));}
	@Test public void test_board1_482(){commonTestCode1(9,41,isDInSetOfReachableTilesFromO_StaticBoard1(9,41));}
	@Test public void test_board1_483(){commonTestCode1(9,42,isDInSetOfReachableTilesFromO_StaticBoard1(9,42));}
	@Test public void test_board1_484(){commonTestCode1(9,43,isDInSetOfReachableTilesFromO_StaticBoard1(9,43));}
	@Test public void test_board1_485(){commonTestCode1(9,44,isDInSetOfReachableTilesFromO_StaticBoard1(9,44));}
	@Test public void test_board1_486(){commonTestCode1(9,45,isDInSetOfReachableTilesFromO_StaticBoard1(9,45));}
	@Test public void test_board1_487(){commonTestCode1(9,46,isDInSetOfReachableTilesFromO_StaticBoard1(9,46));}
	@Test public void test_board1_488(){commonTestCode1(9,47,isDInSetOfReachableTilesFromO_StaticBoard1(9,47));}
	@Test public void test_board1_489(){commonTestCode1(9,48,isDInSetOfReachableTilesFromO_StaticBoard1(9,48));}
	@Test public void test_board1_490(){commonTestCode1(10,0,isDInSetOfReachableTilesFromO_StaticBoard1(10,0));}
	@Test public void test_board1_491(){commonTestCode1(10,1,isDInSetOfReachableTilesFromO_StaticBoard1(10,1));}
	@Test public void test_board1_492(){commonTestCode1(10,2,isDInSetOfReachableTilesFromO_StaticBoard1(10,2));}
	@Test public void test_board1_493(){commonTestCode1(10,3,isDInSetOfReachableTilesFromO_StaticBoard1(10,3));}
	@Test public void test_board1_494(){commonTestCode1(10,4,isDInSetOfReachableTilesFromO_StaticBoard1(10,4));}
	@Test public void test_board1_495(){commonTestCode1(10,5,isDInSetOfReachableTilesFromO_StaticBoard1(10,5));}
	@Test public void test_board1_496(){commonTestCode1(10,6,isDInSetOfReachableTilesFromO_StaticBoard1(10,6));}
	@Test public void test_board1_497(){commonTestCode1(10,7,isDInSetOfReachableTilesFromO_StaticBoard1(10,7));}
	@Test public void test_board1_498(){commonTestCode1(10,8,isDInSetOfReachableTilesFromO_StaticBoard1(10,8));}
	@Test public void test_board1_499(){commonTestCode1(10,9,isDInSetOfReachableTilesFromO_StaticBoard1(10,9));}
	@Test public void test_board1_500(){commonTestCode1(10,10,isDInSetOfReachableTilesFromO_StaticBoard1(10,10));}
	@Test public void test_board1_501(){commonTestCode1(10,11,isDInSetOfReachableTilesFromO_StaticBoard1(10,11));}
	@Test public void test_board1_502(){commonTestCode1(10,12,isDInSetOfReachableTilesFromO_StaticBoard1(10,12));}
	@Test public void test_board1_503(){commonTestCode1(10,13,isDInSetOfReachableTilesFromO_StaticBoard1(10,13));}
	@Test public void test_board1_504(){commonTestCode1(10,14,isDInSetOfReachableTilesFromO_StaticBoard1(10,14));}
	@Test public void test_board1_505(){commonTestCode1(10,15,isDInSetOfReachableTilesFromO_StaticBoard1(10,15));}
	@Test public void test_board1_506(){commonTestCode1(10,16,isDInSetOfReachableTilesFromO_StaticBoard1(10,16));}
	@Test public void test_board1_507(){commonTestCode1(10,17,isDInSetOfReachableTilesFromO_StaticBoard1(10,17));}
	@Test public void test_board1_508(){commonTestCode1(10,18,isDInSetOfReachableTilesFromO_StaticBoard1(10,18));}
	@Test public void test_board1_509(){commonTestCode1(10,19,isDInSetOfReachableTilesFromO_StaticBoard1(10,19));}
	@Test public void test_board1_510(){commonTestCode1(10,20,isDInSetOfReachableTilesFromO_StaticBoard1(10,20));}
	@Test public void test_board1_511(){commonTestCode1(10,21,isDInSetOfReachableTilesFromO_StaticBoard1(10,21));}
	@Test public void test_board1_512(){commonTestCode1(10,22,isDInSetOfReachableTilesFromO_StaticBoard1(10,22));}
	@Test public void test_board1_513(){commonTestCode1(10,23,isDInSetOfReachableTilesFromO_StaticBoard1(10,23));}
	@Test public void test_board1_514(){commonTestCode1(10,24,isDInSetOfReachableTilesFromO_StaticBoard1(10,24));}
	@Test public void test_board1_515(){commonTestCode1(10,25,isDInSetOfReachableTilesFromO_StaticBoard1(10,25));}
	@Test public void test_board1_516(){commonTestCode1(10,26,isDInSetOfReachableTilesFromO_StaticBoard1(10,26));}
	@Test public void test_board1_517(){commonTestCode1(10,27,isDInSetOfReachableTilesFromO_StaticBoard1(10,27));}
	@Test public void test_board1_518(){commonTestCode1(10,28,isDInSetOfReachableTilesFromO_StaticBoard1(10,28));}
	@Test public void test_board1_519(){commonTestCode1(10,29,isDInSetOfReachableTilesFromO_StaticBoard1(10,29));}
	@Test public void test_board1_520(){commonTestCode1(10,30,isDInSetOfReachableTilesFromO_StaticBoard1(10,30));}
	@Test public void test_board1_521(){commonTestCode1(10,31,isDInSetOfReachableTilesFromO_StaticBoard1(10,31));}
	@Test public void test_board1_522(){commonTestCode1(10,32,isDInSetOfReachableTilesFromO_StaticBoard1(10,32));}
	@Test public void test_board1_523(){commonTestCode1(10,33,isDInSetOfReachableTilesFromO_StaticBoard1(10,33));}
	@Test public void test_board1_524(){commonTestCode1(10,34,isDInSetOfReachableTilesFromO_StaticBoard1(10,34));}
	@Test public void test_board1_525(){commonTestCode1(10,35,isDInSetOfReachableTilesFromO_StaticBoard1(10,35));}
	@Test public void test_board1_526(){commonTestCode1(10,36,isDInSetOfReachableTilesFromO_StaticBoard1(10,36));}
	@Test public void test_board1_527(){commonTestCode1(10,37,isDInSetOfReachableTilesFromO_StaticBoard1(10,37));}
	@Test public void test_board1_528(){commonTestCode1(10,38,isDInSetOfReachableTilesFromO_StaticBoard1(10,38));}
	@Test public void test_board1_529(){commonTestCode1(10,39,isDInSetOfReachableTilesFromO_StaticBoard1(10,39));}
	@Test public void test_board1_530(){commonTestCode1(10,40,isDInSetOfReachableTilesFromO_StaticBoard1(10,40));}
	@Test public void test_board1_531(){commonTestCode1(10,41,isDInSetOfReachableTilesFromO_StaticBoard1(10,41));}
	@Test public void test_board1_532(){commonTestCode1(10,42,isDInSetOfReachableTilesFromO_StaticBoard1(10,42));}
	@Test public void test_board1_533(){commonTestCode1(10,43,isDInSetOfReachableTilesFromO_StaticBoard1(10,43));}
	@Test public void test_board1_534(){commonTestCode1(10,44,isDInSetOfReachableTilesFromO_StaticBoard1(10,44));}
	@Test public void test_board1_535(){commonTestCode1(10,45,isDInSetOfReachableTilesFromO_StaticBoard1(10,45));}
	@Test public void test_board1_536(){commonTestCode1(10,46,isDInSetOfReachableTilesFromO_StaticBoard1(10,46));}
	@Test public void test_board1_537(){commonTestCode1(10,47,isDInSetOfReachableTilesFromO_StaticBoard1(10,47));}
	@Test public void test_board1_538(){commonTestCode1(10,48,isDInSetOfReachableTilesFromO_StaticBoard1(10,48));}
	@Test public void test_board1_539(){commonTestCode1(11,0,isDInSetOfReachableTilesFromO_StaticBoard1(11,0));}
	@Test public void test_board1_540(){commonTestCode1(11,1,isDInSetOfReachableTilesFromO_StaticBoard1(11,1));}
	@Test public void test_board1_541(){commonTestCode1(11,2,isDInSetOfReachableTilesFromO_StaticBoard1(11,2));}
	@Test public void test_board1_542(){commonTestCode1(11,3,isDInSetOfReachableTilesFromO_StaticBoard1(11,3));}
	@Test public void test_board1_543(){commonTestCode1(11,4,isDInSetOfReachableTilesFromO_StaticBoard1(11,4));}
	@Test public void test_board1_544(){commonTestCode1(11,5,isDInSetOfReachableTilesFromO_StaticBoard1(11,5));}
	@Test public void test_board1_545(){commonTestCode1(11,6,isDInSetOfReachableTilesFromO_StaticBoard1(11,6));}
	@Test public void test_board1_546(){commonTestCode1(11,7,isDInSetOfReachableTilesFromO_StaticBoard1(11,7));}
	@Test public void test_board1_547(){commonTestCode1(11,8,isDInSetOfReachableTilesFromO_StaticBoard1(11,8));}
	@Test public void test_board1_548(){commonTestCode1(11,9,isDInSetOfReachableTilesFromO_StaticBoard1(11,9));}
	@Test public void test_board1_549(){commonTestCode1(11,10,isDInSetOfReachableTilesFromO_StaticBoard1(11,10));}
	@Test public void test_board1_550(){commonTestCode1(11,11,isDInSetOfReachableTilesFromO_StaticBoard1(11,11));}
	@Test public void test_board1_551(){commonTestCode1(11,12,isDInSetOfReachableTilesFromO_StaticBoard1(11,12));}
	@Test public void test_board1_552(){commonTestCode1(11,13,isDInSetOfReachableTilesFromO_StaticBoard1(11,13));}
	@Test public void test_board1_553(){commonTestCode1(11,14,isDInSetOfReachableTilesFromO_StaticBoard1(11,14));}
	@Test public void test_board1_554(){commonTestCode1(11,15,isDInSetOfReachableTilesFromO_StaticBoard1(11,15));}
	@Test public void test_board1_555(){commonTestCode1(11,16,isDInSetOfReachableTilesFromO_StaticBoard1(11,16));}
	@Test public void test_board1_556(){commonTestCode1(11,17,isDInSetOfReachableTilesFromO_StaticBoard1(11,17));}
	@Test public void test_board1_557(){commonTestCode1(11,18,isDInSetOfReachableTilesFromO_StaticBoard1(11,18));}
	@Test public void test_board1_558(){commonTestCode1(11,19,isDInSetOfReachableTilesFromO_StaticBoard1(11,19));}
	@Test public void test_board1_559(){commonTestCode1(11,20,isDInSetOfReachableTilesFromO_StaticBoard1(11,20));}
	@Test public void test_board1_560(){commonTestCode1(11,21,isDInSetOfReachableTilesFromO_StaticBoard1(11,21));}
	@Test public void test_board1_561(){commonTestCode1(11,22,isDInSetOfReachableTilesFromO_StaticBoard1(11,22));}
	@Test public void test_board1_562(){commonTestCode1(11,23,isDInSetOfReachableTilesFromO_StaticBoard1(11,23));}
	@Test public void test_board1_563(){commonTestCode1(11,24,isDInSetOfReachableTilesFromO_StaticBoard1(11,24));}
	@Test public void test_board1_564(){commonTestCode1(11,25,isDInSetOfReachableTilesFromO_StaticBoard1(11,25));}
	@Test public void test_board1_565(){commonTestCode1(11,26,isDInSetOfReachableTilesFromO_StaticBoard1(11,26));}
	@Test public void test_board1_566(){commonTestCode1(11,27,isDInSetOfReachableTilesFromO_StaticBoard1(11,27));}
	@Test public void test_board1_567(){commonTestCode1(11,28,isDInSetOfReachableTilesFromO_StaticBoard1(11,28));}
	@Test public void test_board1_568(){commonTestCode1(11,29,isDInSetOfReachableTilesFromO_StaticBoard1(11,29));}
	@Test public void test_board1_569(){commonTestCode1(11,30,isDInSetOfReachableTilesFromO_StaticBoard1(11,30));}
	@Test public void test_board1_570(){commonTestCode1(11,31,isDInSetOfReachableTilesFromO_StaticBoard1(11,31));}
	@Test public void test_board1_571(){commonTestCode1(11,32,isDInSetOfReachableTilesFromO_StaticBoard1(11,32));}
	@Test public void test_board1_572(){commonTestCode1(11,33,isDInSetOfReachableTilesFromO_StaticBoard1(11,33));}
	@Test public void test_board1_573(){commonTestCode1(11,34,isDInSetOfReachableTilesFromO_StaticBoard1(11,34));}
	@Test public void test_board1_574(){commonTestCode1(11,35,isDInSetOfReachableTilesFromO_StaticBoard1(11,35));}
	@Test public void test_board1_575(){commonTestCode1(11,36,isDInSetOfReachableTilesFromO_StaticBoard1(11,36));}
	@Test public void test_board1_576(){commonTestCode1(11,37,isDInSetOfReachableTilesFromO_StaticBoard1(11,37));}
	@Test public void test_board1_577(){commonTestCode1(11,38,isDInSetOfReachableTilesFromO_StaticBoard1(11,38));}
	@Test public void test_board1_578(){commonTestCode1(11,39,isDInSetOfReachableTilesFromO_StaticBoard1(11,39));}
	@Test public void test_board1_579(){commonTestCode1(11,40,isDInSetOfReachableTilesFromO_StaticBoard1(11,40));}
	@Test public void test_board1_580(){commonTestCode1(11,41,isDInSetOfReachableTilesFromO_StaticBoard1(11,41));}
	@Test public void test_board1_581(){commonTestCode1(11,42,isDInSetOfReachableTilesFromO_StaticBoard1(11,42));}
	@Test public void test_board1_582(){commonTestCode1(11,43,isDInSetOfReachableTilesFromO_StaticBoard1(11,43));}
	@Test public void test_board1_583(){commonTestCode1(11,44,isDInSetOfReachableTilesFromO_StaticBoard1(11,44));}
	@Test public void test_board1_584(){commonTestCode1(11,45,isDInSetOfReachableTilesFromO_StaticBoard1(11,45));}
	@Test public void test_board1_585(){commonTestCode1(11,46,isDInSetOfReachableTilesFromO_StaticBoard1(11,46));}
	@Test public void test_board1_586(){commonTestCode1(11,47,isDInSetOfReachableTilesFromO_StaticBoard1(11,47));}
	@Test public void test_board1_587(){commonTestCode1(11,48,isDInSetOfReachableTilesFromO_StaticBoard1(11,48));}
	@Test public void test_board1_588(){commonTestCode1(12,0,isDInSetOfReachableTilesFromO_StaticBoard1(12,0));}
	@Test public void test_board1_589(){commonTestCode1(12,1,isDInSetOfReachableTilesFromO_StaticBoard1(12,1));}
	@Test public void test_board1_590(){commonTestCode1(12,2,isDInSetOfReachableTilesFromO_StaticBoard1(12,2));}
	@Test public void test_board1_591(){commonTestCode1(12,3,isDInSetOfReachableTilesFromO_StaticBoard1(12,3));}
	@Test public void test_board1_592(){commonTestCode1(12,4,isDInSetOfReachableTilesFromO_StaticBoard1(12,4));}
	@Test public void test_board1_593(){commonTestCode1(12,5,isDInSetOfReachableTilesFromO_StaticBoard1(12,5));}
	@Test public void test_board1_594(){commonTestCode1(12,6,isDInSetOfReachableTilesFromO_StaticBoard1(12,6));}
	@Test public void test_board1_595(){commonTestCode1(12,7,isDInSetOfReachableTilesFromO_StaticBoard1(12,7));}
	@Test public void test_board1_596(){commonTestCode1(12,8,isDInSetOfReachableTilesFromO_StaticBoard1(12,8));}
	@Test public void test_board1_597(){commonTestCode1(12,9,isDInSetOfReachableTilesFromO_StaticBoard1(12,9));}
	@Test public void test_board1_598(){commonTestCode1(12,10,isDInSetOfReachableTilesFromO_StaticBoard1(12,10));}
	@Test public void test_board1_599(){commonTestCode1(12,11,isDInSetOfReachableTilesFromO_StaticBoard1(12,11));}
	@Test public void test_board1_600(){commonTestCode1(12,12,isDInSetOfReachableTilesFromO_StaticBoard1(12,12));}
	@Test public void test_board1_601(){commonTestCode1(12,13,isDInSetOfReachableTilesFromO_StaticBoard1(12,13));}
	@Test public void test_board1_602(){commonTestCode1(12,14,isDInSetOfReachableTilesFromO_StaticBoard1(12,14));}
	@Test public void test_board1_603(){commonTestCode1(12,15,isDInSetOfReachableTilesFromO_StaticBoard1(12,15));}
	@Test public void test_board1_604(){commonTestCode1(12,16,isDInSetOfReachableTilesFromO_StaticBoard1(12,16));}
	@Test public void test_board1_605(){commonTestCode1(12,17,isDInSetOfReachableTilesFromO_StaticBoard1(12,17));}
	@Test public void test_board1_606(){commonTestCode1(12,18,isDInSetOfReachableTilesFromO_StaticBoard1(12,18));}
	@Test public void test_board1_607(){commonTestCode1(12,19,isDInSetOfReachableTilesFromO_StaticBoard1(12,19));}
	@Test public void test_board1_608(){commonTestCode1(12,20,isDInSetOfReachableTilesFromO_StaticBoard1(12,20));}
	@Test public void test_board1_609(){commonTestCode1(12,21,isDInSetOfReachableTilesFromO_StaticBoard1(12,21));}
	@Test public void test_board1_610(){commonTestCode1(12,22,isDInSetOfReachableTilesFromO_StaticBoard1(12,22));}
	@Test public void test_board1_611(){commonTestCode1(12,23,isDInSetOfReachableTilesFromO_StaticBoard1(12,23));}
	@Test public void test_board1_612(){commonTestCode1(12,24,isDInSetOfReachableTilesFromO_StaticBoard1(12,24));}
	@Test public void test_board1_613(){commonTestCode1(12,25,isDInSetOfReachableTilesFromO_StaticBoard1(12,25));}
	@Test public void test_board1_614(){commonTestCode1(12,26,isDInSetOfReachableTilesFromO_StaticBoard1(12,26));}
	@Test public void test_board1_615(){commonTestCode1(12,27,isDInSetOfReachableTilesFromO_StaticBoard1(12,27));}
	@Test public void test_board1_616(){commonTestCode1(12,28,isDInSetOfReachableTilesFromO_StaticBoard1(12,28));}
	@Test public void test_board1_617(){commonTestCode1(12,29,isDInSetOfReachableTilesFromO_StaticBoard1(12,29));}
	@Test public void test_board1_618(){commonTestCode1(12,30,isDInSetOfReachableTilesFromO_StaticBoard1(12,30));}
	@Test public void test_board1_619(){commonTestCode1(12,31,isDInSetOfReachableTilesFromO_StaticBoard1(12,31));}
	@Test public void test_board1_620(){commonTestCode1(12,32,isDInSetOfReachableTilesFromO_StaticBoard1(12,32));}
	@Test public void test_board1_621(){commonTestCode1(12,33,isDInSetOfReachableTilesFromO_StaticBoard1(12,33));}
	@Test public void test_board1_622(){commonTestCode1(12,34,isDInSetOfReachableTilesFromO_StaticBoard1(12,34));}
	@Test public void test_board1_623(){commonTestCode1(12,35,isDInSetOfReachableTilesFromO_StaticBoard1(12,35));}
	@Test public void test_board1_624(){commonTestCode1(12,36,isDInSetOfReachableTilesFromO_StaticBoard1(12,36));}
	@Test public void test_board1_625(){commonTestCode1(12,37,isDInSetOfReachableTilesFromO_StaticBoard1(12,37));}
	@Test public void test_board1_626(){commonTestCode1(12,38,isDInSetOfReachableTilesFromO_StaticBoard1(12,38));}
	@Test public void test_board1_627(){commonTestCode1(12,39,isDInSetOfReachableTilesFromO_StaticBoard1(12,39));}
	@Test public void test_board1_628(){commonTestCode1(12,40,isDInSetOfReachableTilesFromO_StaticBoard1(12,40));}
	@Test public void test_board1_629(){commonTestCode1(12,41,isDInSetOfReachableTilesFromO_StaticBoard1(12,41));}
	@Test public void test_board1_630(){commonTestCode1(12,42,isDInSetOfReachableTilesFromO_StaticBoard1(12,42));}
	@Test public void test_board1_631(){commonTestCode1(12,43,isDInSetOfReachableTilesFromO_StaticBoard1(12,43));}
	@Test public void test_board1_632(){commonTestCode1(12,44,isDInSetOfReachableTilesFromO_StaticBoard1(12,44));}
	@Test public void test_board1_633(){commonTestCode1(12,45,isDInSetOfReachableTilesFromO_StaticBoard1(12,45));}
	@Test public void test_board1_634(){commonTestCode1(12,46,isDInSetOfReachableTilesFromO_StaticBoard1(12,46));}
	@Test public void test_board1_635(){commonTestCode1(12,47,isDInSetOfReachableTilesFromO_StaticBoard1(12,47));}
	@Test public void test_board1_636(){commonTestCode1(12,48,isDInSetOfReachableTilesFromO_StaticBoard1(12,48));}
	@Test public void test_board1_637(){commonTestCode1(13,0,isDInSetOfReachableTilesFromO_StaticBoard1(13,0));}
	@Test public void test_board1_638(){commonTestCode1(13,1,isDInSetOfReachableTilesFromO_StaticBoard1(13,1));}
	@Test public void test_board1_639(){commonTestCode1(13,2,isDInSetOfReachableTilesFromO_StaticBoard1(13,2));}
	@Test public void test_board1_640(){commonTestCode1(13,3,isDInSetOfReachableTilesFromO_StaticBoard1(13,3));}
	@Test public void test_board1_641(){commonTestCode1(13,4,isDInSetOfReachableTilesFromO_StaticBoard1(13,4));}
	@Test public void test_board1_642(){commonTestCode1(13,5,isDInSetOfReachableTilesFromO_StaticBoard1(13,5));}
	@Test public void test_board1_643(){commonTestCode1(13,6,isDInSetOfReachableTilesFromO_StaticBoard1(13,6));}
	@Test public void test_board1_644(){commonTestCode1(13,7,isDInSetOfReachableTilesFromO_StaticBoard1(13,7));}
	@Test public void test_board1_645(){commonTestCode1(13,8,isDInSetOfReachableTilesFromO_StaticBoard1(13,8));}
	@Test public void test_board1_646(){commonTestCode1(13,9,isDInSetOfReachableTilesFromO_StaticBoard1(13,9));}
	@Test public void test_board1_647(){commonTestCode1(13,10,isDInSetOfReachableTilesFromO_StaticBoard1(13,10));}
	@Test public void test_board1_648(){commonTestCode1(13,11,isDInSetOfReachableTilesFromO_StaticBoard1(13,11));}
	@Test public void test_board1_649(){commonTestCode1(13,12,isDInSetOfReachableTilesFromO_StaticBoard1(13,12));}
	@Test public void test_board1_650(){commonTestCode1(13,13,isDInSetOfReachableTilesFromO_StaticBoard1(13,13));}
	@Test public void test_board1_651(){commonTestCode1(13,14,isDInSetOfReachableTilesFromO_StaticBoard1(13,14));}
	@Test public void test_board1_652(){commonTestCode1(13,15,isDInSetOfReachableTilesFromO_StaticBoard1(13,15));}
	@Test public void test_board1_653(){commonTestCode1(13,16,isDInSetOfReachableTilesFromO_StaticBoard1(13,16));}
	@Test public void test_board1_654(){commonTestCode1(13,17,isDInSetOfReachableTilesFromO_StaticBoard1(13,17));}
	@Test public void test_board1_655(){commonTestCode1(13,18,isDInSetOfReachableTilesFromO_StaticBoard1(13,18));}
	@Test public void test_board1_656(){commonTestCode1(13,19,isDInSetOfReachableTilesFromO_StaticBoard1(13,19));}
	@Test public void test_board1_657(){commonTestCode1(13,20,isDInSetOfReachableTilesFromO_StaticBoard1(13,20));}
	@Test public void test_board1_658(){commonTestCode1(13,21,isDInSetOfReachableTilesFromO_StaticBoard1(13,21));}
	@Test public void test_board1_659(){commonTestCode1(13,22,isDInSetOfReachableTilesFromO_StaticBoard1(13,22));}
	@Test public void test_board1_660(){commonTestCode1(13,23,isDInSetOfReachableTilesFromO_StaticBoard1(13,23));}
	@Test public void test_board1_661(){commonTestCode1(13,24,isDInSetOfReachableTilesFromO_StaticBoard1(13,24));}
	@Test public void test_board1_662(){commonTestCode1(13,25,isDInSetOfReachableTilesFromO_StaticBoard1(13,25));}
	@Test public void test_board1_663(){commonTestCode1(13,26,isDInSetOfReachableTilesFromO_StaticBoard1(13,26));}
	@Test public void test_board1_664(){commonTestCode1(13,27,isDInSetOfReachableTilesFromO_StaticBoard1(13,27));}
	@Test public void test_board1_665(){commonTestCode1(13,28,isDInSetOfReachableTilesFromO_StaticBoard1(13,28));}
	@Test public void test_board1_666(){commonTestCode1(13,29,isDInSetOfReachableTilesFromO_StaticBoard1(13,29));}
	@Test public void test_board1_667(){commonTestCode1(13,30,isDInSetOfReachableTilesFromO_StaticBoard1(13,30));}
	@Test public void test_board1_668(){commonTestCode1(13,31,isDInSetOfReachableTilesFromO_StaticBoard1(13,31));}
	@Test public void test_board1_669(){commonTestCode1(13,32,isDInSetOfReachableTilesFromO_StaticBoard1(13,32));}
	@Test public void test_board1_670(){commonTestCode1(13,33,isDInSetOfReachableTilesFromO_StaticBoard1(13,33));}
	@Test public void test_board1_671(){commonTestCode1(13,34,isDInSetOfReachableTilesFromO_StaticBoard1(13,34));}
	@Test public void test_board1_672(){commonTestCode1(13,35,isDInSetOfReachableTilesFromO_StaticBoard1(13,35));}
	@Test public void test_board1_673(){commonTestCode1(13,36,isDInSetOfReachableTilesFromO_StaticBoard1(13,36));}
	@Test public void test_board1_674(){commonTestCode1(13,37,isDInSetOfReachableTilesFromO_StaticBoard1(13,37));}
	@Test public void test_board1_675(){commonTestCode1(13,38,isDInSetOfReachableTilesFromO_StaticBoard1(13,38));}
	@Test public void test_board1_676(){commonTestCode1(13,39,isDInSetOfReachableTilesFromO_StaticBoard1(13,39));}
	@Test public void test_board1_677(){commonTestCode1(13,40,isDInSetOfReachableTilesFromO_StaticBoard1(13,40));}
	@Test public void test_board1_678(){commonTestCode1(13,41,isDInSetOfReachableTilesFromO_StaticBoard1(13,41));}
	@Test public void test_board1_679(){commonTestCode1(13,42,isDInSetOfReachableTilesFromO_StaticBoard1(13,42));}
	@Test public void test_board1_680(){commonTestCode1(13,43,isDInSetOfReachableTilesFromO_StaticBoard1(13,43));}
	@Test public void test_board1_681(){commonTestCode1(13,44,isDInSetOfReachableTilesFromO_StaticBoard1(13,44));}
	@Test public void test_board1_682(){commonTestCode1(13,45,isDInSetOfReachableTilesFromO_StaticBoard1(13,45));}
	@Test public void test_board1_683(){commonTestCode1(13,46,isDInSetOfReachableTilesFromO_StaticBoard1(13,46));}
	@Test public void test_board1_684(){commonTestCode1(13,47,isDInSetOfReachableTilesFromO_StaticBoard1(13,47));}
	@Test public void test_board1_685(){commonTestCode1(13,48,isDInSetOfReachableTilesFromO_StaticBoard1(13,48));}
	@Test public void test_board1_686(){commonTestCode1(14,0,isDInSetOfReachableTilesFromO_StaticBoard1(14,0));}
	@Test public void test_board1_687(){commonTestCode1(14,1,isDInSetOfReachableTilesFromO_StaticBoard1(14,1));}
	@Test public void test_board1_688(){commonTestCode1(14,2,isDInSetOfReachableTilesFromO_StaticBoard1(14,2));}
	@Test public void test_board1_689(){commonTestCode1(14,3,isDInSetOfReachableTilesFromO_StaticBoard1(14,3));}
	@Test public void test_board1_690(){commonTestCode1(14,4,isDInSetOfReachableTilesFromO_StaticBoard1(14,4));}
	@Test public void test_board1_691(){commonTestCode1(14,5,isDInSetOfReachableTilesFromO_StaticBoard1(14,5));}
	@Test public void test_board1_692(){commonTestCode1(14,6,isDInSetOfReachableTilesFromO_StaticBoard1(14,6));}
	@Test public void test_board1_693(){commonTestCode1(14,7,isDInSetOfReachableTilesFromO_StaticBoard1(14,7));}
	@Test public void test_board1_694(){commonTestCode1(14,8,isDInSetOfReachableTilesFromO_StaticBoard1(14,8));}
	@Test public void test_board1_695(){commonTestCode1(14,9,isDInSetOfReachableTilesFromO_StaticBoard1(14,9));}
	@Test public void test_board1_696(){commonTestCode1(14,10,isDInSetOfReachableTilesFromO_StaticBoard1(14,10));}
	@Test public void test_board1_697(){commonTestCode1(14,11,isDInSetOfReachableTilesFromO_StaticBoard1(14,11));}
	@Test public void test_board1_698(){commonTestCode1(14,12,isDInSetOfReachableTilesFromO_StaticBoard1(14,12));}
	@Test public void test_board1_699(){commonTestCode1(14,13,isDInSetOfReachableTilesFromO_StaticBoard1(14,13));}
	@Test public void test_board1_700(){commonTestCode1(14,14,isDInSetOfReachableTilesFromO_StaticBoard1(14,14));}
	@Test public void test_board1_701(){commonTestCode1(14,15,isDInSetOfReachableTilesFromO_StaticBoard1(14,15));}
	@Test public void test_board1_702(){commonTestCode1(14,16,isDInSetOfReachableTilesFromO_StaticBoard1(14,16));}
	@Test public void test_board1_703(){commonTestCode1(14,17,isDInSetOfReachableTilesFromO_StaticBoard1(14,17));}
	@Test public void test_board1_704(){commonTestCode1(14,18,isDInSetOfReachableTilesFromO_StaticBoard1(14,18));}
	@Test public void test_board1_705(){commonTestCode1(14,19,isDInSetOfReachableTilesFromO_StaticBoard1(14,19));}
	@Test public void test_board1_706(){commonTestCode1(14,20,isDInSetOfReachableTilesFromO_StaticBoard1(14,20));}
	@Test public void test_board1_707(){commonTestCode1(14,21,isDInSetOfReachableTilesFromO_StaticBoard1(14,21));}
	@Test public void test_board1_708(){commonTestCode1(14,22,isDInSetOfReachableTilesFromO_StaticBoard1(14,22));}
	@Test public void test_board1_709(){commonTestCode1(14,23,isDInSetOfReachableTilesFromO_StaticBoard1(14,23));}
	@Test public void test_board1_710(){commonTestCode1(14,24,isDInSetOfReachableTilesFromO_StaticBoard1(14,24));}
	@Test public void test_board1_711(){commonTestCode1(14,25,isDInSetOfReachableTilesFromO_StaticBoard1(14,25));}
	@Test public void test_board1_712(){commonTestCode1(14,26,isDInSetOfReachableTilesFromO_StaticBoard1(14,26));}
	@Test public void test_board1_713(){commonTestCode1(14,27,isDInSetOfReachableTilesFromO_StaticBoard1(14,27));}
	@Test public void test_board1_714(){commonTestCode1(14,28,isDInSetOfReachableTilesFromO_StaticBoard1(14,28));}
	@Test public void test_board1_715(){commonTestCode1(14,29,isDInSetOfReachableTilesFromO_StaticBoard1(14,29));}
	@Test public void test_board1_716(){commonTestCode1(14,30,isDInSetOfReachableTilesFromO_StaticBoard1(14,30));}
	@Test public void test_board1_717(){commonTestCode1(14,31,isDInSetOfReachableTilesFromO_StaticBoard1(14,31));}
	@Test public void test_board1_718(){commonTestCode1(14,32,isDInSetOfReachableTilesFromO_StaticBoard1(14,32));}
	@Test public void test_board1_719(){commonTestCode1(14,33,isDInSetOfReachableTilesFromO_StaticBoard1(14,33));}
	@Test public void test_board1_720(){commonTestCode1(14,34,isDInSetOfReachableTilesFromO_StaticBoard1(14,34));}
	@Test public void test_board1_721(){commonTestCode1(14,35,isDInSetOfReachableTilesFromO_StaticBoard1(14,35));}
	@Test public void test_board1_722(){commonTestCode1(14,36,isDInSetOfReachableTilesFromO_StaticBoard1(14,36));}
	@Test public void test_board1_723(){commonTestCode1(14,37,isDInSetOfReachableTilesFromO_StaticBoard1(14,37));}
	@Test public void test_board1_724(){commonTestCode1(14,38,isDInSetOfReachableTilesFromO_StaticBoard1(14,38));}
	@Test public void test_board1_725(){commonTestCode1(14,39,isDInSetOfReachableTilesFromO_StaticBoard1(14,39));}
	@Test public void test_board1_726(){commonTestCode1(14,40,isDInSetOfReachableTilesFromO_StaticBoard1(14,40));}
	@Test public void test_board1_727(){commonTestCode1(14,41,isDInSetOfReachableTilesFromO_StaticBoard1(14,41));}
	@Test public void test_board1_728(){commonTestCode1(14,42,isDInSetOfReachableTilesFromO_StaticBoard1(14,42));}
	@Test public void test_board1_729(){commonTestCode1(14,43,isDInSetOfReachableTilesFromO_StaticBoard1(14,43));}
	@Test public void test_board1_730(){commonTestCode1(14,44,isDInSetOfReachableTilesFromO_StaticBoard1(14,44));}
	@Test public void test_board1_731(){commonTestCode1(14,45,isDInSetOfReachableTilesFromO_StaticBoard1(14,45));}
	@Test public void test_board1_732(){commonTestCode1(14,46,isDInSetOfReachableTilesFromO_StaticBoard1(14,46));}
	@Test public void test_board1_733(){commonTestCode1(14,47,isDInSetOfReachableTilesFromO_StaticBoard1(14,47));}
	@Test public void test_board1_734(){commonTestCode1(14,48,isDInSetOfReachableTilesFromO_StaticBoard1(14,48));}
	@Test public void test_board1_735(){commonTestCode1(15,0,isDInSetOfReachableTilesFromO_StaticBoard1(15,0));}
	@Test public void test_board1_736(){commonTestCode1(15,1,isDInSetOfReachableTilesFromO_StaticBoard1(15,1));}
	@Test public void test_board1_737(){commonTestCode1(15,2,isDInSetOfReachableTilesFromO_StaticBoard1(15,2));}
	@Test public void test_board1_738(){commonTestCode1(15,3,isDInSetOfReachableTilesFromO_StaticBoard1(15,3));}
	@Test public void test_board1_739(){commonTestCode1(15,4,isDInSetOfReachableTilesFromO_StaticBoard1(15,4));}
	@Test public void test_board1_740(){commonTestCode1(15,5,isDInSetOfReachableTilesFromO_StaticBoard1(15,5));}
	@Test public void test_board1_741(){commonTestCode1(15,6,isDInSetOfReachableTilesFromO_StaticBoard1(15,6));}
	@Test public void test_board1_742(){commonTestCode1(15,7,isDInSetOfReachableTilesFromO_StaticBoard1(15,7));}
	@Test public void test_board1_743(){commonTestCode1(15,8,isDInSetOfReachableTilesFromO_StaticBoard1(15,8));}
	@Test public void test_board1_744(){commonTestCode1(15,9,isDInSetOfReachableTilesFromO_StaticBoard1(15,9));}
	@Test public void test_board1_745(){commonTestCode1(15,10,isDInSetOfReachableTilesFromO_StaticBoard1(15,10));}
	@Test public void test_board1_746(){commonTestCode1(15,11,isDInSetOfReachableTilesFromO_StaticBoard1(15,11));}
	@Test public void test_board1_747(){commonTestCode1(15,12,isDInSetOfReachableTilesFromO_StaticBoard1(15,12));}
	@Test public void test_board1_748(){commonTestCode1(15,13,isDInSetOfReachableTilesFromO_StaticBoard1(15,13));}
	@Test public void test_board1_749(){commonTestCode1(15,14,isDInSetOfReachableTilesFromO_StaticBoard1(15,14));}
	@Test public void test_board1_750(){commonTestCode1(15,15,isDInSetOfReachableTilesFromO_StaticBoard1(15,15));}
	@Test public void test_board1_751(){commonTestCode1(15,16,isDInSetOfReachableTilesFromO_StaticBoard1(15,16));}
	@Test public void test_board1_752(){commonTestCode1(15,17,isDInSetOfReachableTilesFromO_StaticBoard1(15,17));}
	@Test public void test_board1_753(){commonTestCode1(15,18,isDInSetOfReachableTilesFromO_StaticBoard1(15,18));}
	@Test public void test_board1_754(){commonTestCode1(15,19,isDInSetOfReachableTilesFromO_StaticBoard1(15,19));}
	@Test public void test_board1_755(){commonTestCode1(15,20,isDInSetOfReachableTilesFromO_StaticBoard1(15,20));}
	@Test public void test_board1_756(){commonTestCode1(15,21,isDInSetOfReachableTilesFromO_StaticBoard1(15,21));}
	@Test public void test_board1_757(){commonTestCode1(15,22,isDInSetOfReachableTilesFromO_StaticBoard1(15,22));}
	@Test public void test_board1_758(){commonTestCode1(15,23,isDInSetOfReachableTilesFromO_StaticBoard1(15,23));}
	@Test public void test_board1_759(){commonTestCode1(15,24,isDInSetOfReachableTilesFromO_StaticBoard1(15,24));}
	@Test public void test_board1_760(){commonTestCode1(15,25,isDInSetOfReachableTilesFromO_StaticBoard1(15,25));}
	@Test public void test_board1_761(){commonTestCode1(15,26,isDInSetOfReachableTilesFromO_StaticBoard1(15,26));}
	@Test public void test_board1_762(){commonTestCode1(15,27,isDInSetOfReachableTilesFromO_StaticBoard1(15,27));}
	@Test public void test_board1_763(){commonTestCode1(15,28,isDInSetOfReachableTilesFromO_StaticBoard1(15,28));}
	@Test public void test_board1_764(){commonTestCode1(15,29,isDInSetOfReachableTilesFromO_StaticBoard1(15,29));}
	@Test public void test_board1_765(){commonTestCode1(15,30,isDInSetOfReachableTilesFromO_StaticBoard1(15,30));}
	@Test public void test_board1_766(){commonTestCode1(15,31,isDInSetOfReachableTilesFromO_StaticBoard1(15,31));}
	@Test public void test_board1_767(){commonTestCode1(15,32,isDInSetOfReachableTilesFromO_StaticBoard1(15,32));}
	@Test public void test_board1_768(){commonTestCode1(15,33,isDInSetOfReachableTilesFromO_StaticBoard1(15,33));}
	@Test public void test_board1_769(){commonTestCode1(15,34,isDInSetOfReachableTilesFromO_StaticBoard1(15,34));}
	@Test public void test_board1_770(){commonTestCode1(15,35,isDInSetOfReachableTilesFromO_StaticBoard1(15,35));}
	@Test public void test_board1_771(){commonTestCode1(15,36,isDInSetOfReachableTilesFromO_StaticBoard1(15,36));}
	@Test public void test_board1_772(){commonTestCode1(15,37,isDInSetOfReachableTilesFromO_StaticBoard1(15,37));}
	@Test public void test_board1_773(){commonTestCode1(15,38,isDInSetOfReachableTilesFromO_StaticBoard1(15,38));}
	@Test public void test_board1_774(){commonTestCode1(15,39,isDInSetOfReachableTilesFromO_StaticBoard1(15,39));}
	@Test public void test_board1_775(){commonTestCode1(15,40,isDInSetOfReachableTilesFromO_StaticBoard1(15,40));}
	@Test public void test_board1_776(){commonTestCode1(15,41,isDInSetOfReachableTilesFromO_StaticBoard1(15,41));}
	@Test public void test_board1_777(){commonTestCode1(15,42,isDInSetOfReachableTilesFromO_StaticBoard1(15,42));}
	@Test public void test_board1_778(){commonTestCode1(15,43,isDInSetOfReachableTilesFromO_StaticBoard1(15,43));}
	@Test public void test_board1_779(){commonTestCode1(15,44,isDInSetOfReachableTilesFromO_StaticBoard1(15,44));}
	@Test public void test_board1_780(){commonTestCode1(15,45,isDInSetOfReachableTilesFromO_StaticBoard1(15,45));}
	@Test public void test_board1_781(){commonTestCode1(15,46,isDInSetOfReachableTilesFromO_StaticBoard1(15,46));}
	@Test public void test_board1_782(){commonTestCode1(15,47,isDInSetOfReachableTilesFromO_StaticBoard1(15,47));}
	@Test public void test_board1_783(){commonTestCode1(15,48,isDInSetOfReachableTilesFromO_StaticBoard1(15,48));}
	@Test public void test_board1_784(){commonTestCode1(16,0,isDInSetOfReachableTilesFromO_StaticBoard1(16,0));}
	@Test public void test_board1_785(){commonTestCode1(16,1,isDInSetOfReachableTilesFromO_StaticBoard1(16,1));}
	@Test public void test_board1_786(){commonTestCode1(16,2,isDInSetOfReachableTilesFromO_StaticBoard1(16,2));}
	@Test public void test_board1_787(){commonTestCode1(16,3,isDInSetOfReachableTilesFromO_StaticBoard1(16,3));}
	@Test public void test_board1_788(){commonTestCode1(16,4,isDInSetOfReachableTilesFromO_StaticBoard1(16,4));}
	@Test public void test_board1_789(){commonTestCode1(16,5,isDInSetOfReachableTilesFromO_StaticBoard1(16,5));}
	@Test public void test_board1_790(){commonTestCode1(16,6,isDInSetOfReachableTilesFromO_StaticBoard1(16,6));}
	@Test public void test_board1_791(){commonTestCode1(16,7,isDInSetOfReachableTilesFromO_StaticBoard1(16,7));}
	@Test public void test_board1_792(){commonTestCode1(16,8,isDInSetOfReachableTilesFromO_StaticBoard1(16,8));}
	@Test public void test_board1_793(){commonTestCode1(16,9,isDInSetOfReachableTilesFromO_StaticBoard1(16,9));}
	@Test public void test_board1_794(){commonTestCode1(16,10,isDInSetOfReachableTilesFromO_StaticBoard1(16,10));}
	@Test public void test_board1_795(){commonTestCode1(16,11,isDInSetOfReachableTilesFromO_StaticBoard1(16,11));}
	@Test public void test_board1_796(){commonTestCode1(16,12,isDInSetOfReachableTilesFromO_StaticBoard1(16,12));}
	@Test public void test_board1_797(){commonTestCode1(16,13,isDInSetOfReachableTilesFromO_StaticBoard1(16,13));}
	@Test public void test_board1_798(){commonTestCode1(16,14,isDInSetOfReachableTilesFromO_StaticBoard1(16,14));}
	@Test public void test_board1_799(){commonTestCode1(16,15,isDInSetOfReachableTilesFromO_StaticBoard1(16,15));}
	@Test public void test_board1_800(){commonTestCode1(16,16,isDInSetOfReachableTilesFromO_StaticBoard1(16,16));}
	@Test public void test_board1_801(){commonTestCode1(16,17,isDInSetOfReachableTilesFromO_StaticBoard1(16,17));}
	@Test public void test_board1_802(){commonTestCode1(16,18,isDInSetOfReachableTilesFromO_StaticBoard1(16,18));}
	@Test public void test_board1_803(){commonTestCode1(16,19,isDInSetOfReachableTilesFromO_StaticBoard1(16,19));}
	@Test public void test_board1_804(){commonTestCode1(16,20,isDInSetOfReachableTilesFromO_StaticBoard1(16,20));}
	@Test public void test_board1_805(){commonTestCode1(16,21,isDInSetOfReachableTilesFromO_StaticBoard1(16,21));}
	@Test public void test_board1_806(){commonTestCode1(16,22,isDInSetOfReachableTilesFromO_StaticBoard1(16,22));}
	@Test public void test_board1_807(){commonTestCode1(16,23,isDInSetOfReachableTilesFromO_StaticBoard1(16,23));}
	@Test public void test_board1_808(){commonTestCode1(16,24,isDInSetOfReachableTilesFromO_StaticBoard1(16,24));}
	@Test public void test_board1_809(){commonTestCode1(16,25,isDInSetOfReachableTilesFromO_StaticBoard1(16,25));}
	@Test public void test_board1_810(){commonTestCode1(16,26,isDInSetOfReachableTilesFromO_StaticBoard1(16,26));}
	@Test public void test_board1_811(){commonTestCode1(16,27,isDInSetOfReachableTilesFromO_StaticBoard1(16,27));}
	@Test public void test_board1_812(){commonTestCode1(16,28,isDInSetOfReachableTilesFromO_StaticBoard1(16,28));}
	@Test public void test_board1_813(){commonTestCode1(16,29,isDInSetOfReachableTilesFromO_StaticBoard1(16,29));}
	@Test public void test_board1_814(){commonTestCode1(16,30,isDInSetOfReachableTilesFromO_StaticBoard1(16,30));}
	@Test public void test_board1_815(){commonTestCode1(16,31,isDInSetOfReachableTilesFromO_StaticBoard1(16,31));}
	@Test public void test_board1_816(){commonTestCode1(16,32,isDInSetOfReachableTilesFromO_StaticBoard1(16,32));}
	@Test public void test_board1_817(){commonTestCode1(16,33,isDInSetOfReachableTilesFromO_StaticBoard1(16,33));}
	@Test public void test_board1_818(){commonTestCode1(16,34,isDInSetOfReachableTilesFromO_StaticBoard1(16,34));}
	@Test public void test_board1_819(){commonTestCode1(16,35,isDInSetOfReachableTilesFromO_StaticBoard1(16,35));}
	@Test public void test_board1_820(){commonTestCode1(16,36,isDInSetOfReachableTilesFromO_StaticBoard1(16,36));}
	@Test public void test_board1_821(){commonTestCode1(16,37,isDInSetOfReachableTilesFromO_StaticBoard1(16,37));}
	@Test public void test_board1_822(){commonTestCode1(16,38,isDInSetOfReachableTilesFromO_StaticBoard1(16,38));}
	@Test public void test_board1_823(){commonTestCode1(16,39,isDInSetOfReachableTilesFromO_StaticBoard1(16,39));}
	@Test public void test_board1_824(){commonTestCode1(16,40,isDInSetOfReachableTilesFromO_StaticBoard1(16,40));}
	@Test public void test_board1_825(){commonTestCode1(16,41,isDInSetOfReachableTilesFromO_StaticBoard1(16,41));}
	@Test public void test_board1_826(){commonTestCode1(16,42,isDInSetOfReachableTilesFromO_StaticBoard1(16,42));}
	@Test public void test_board1_827(){commonTestCode1(16,43,isDInSetOfReachableTilesFromO_StaticBoard1(16,43));}
	@Test public void test_board1_828(){commonTestCode1(16,44,isDInSetOfReachableTilesFromO_StaticBoard1(16,44));}
	@Test public void test_board1_829(){commonTestCode1(16,45,isDInSetOfReachableTilesFromO_StaticBoard1(16,45));}
	@Test public void test_board1_830(){commonTestCode1(16,46,isDInSetOfReachableTilesFromO_StaticBoard1(16,46));}
	@Test public void test_board1_831(){commonTestCode1(16,47,isDInSetOfReachableTilesFromO_StaticBoard1(16,47));}
	@Test public void test_board1_832(){commonTestCode1(16,48,isDInSetOfReachableTilesFromO_StaticBoard1(16,48));}
	@Test public void test_board1_833(){commonTestCode1(17,0,isDInSetOfReachableTilesFromO_StaticBoard1(17,0));}
	@Test public void test_board1_834(){commonTestCode1(17,1,isDInSetOfReachableTilesFromO_StaticBoard1(17,1));}
	@Test public void test_board1_835(){commonTestCode1(17,2,isDInSetOfReachableTilesFromO_StaticBoard1(17,2));}
	@Test public void test_board1_836(){commonTestCode1(17,3,isDInSetOfReachableTilesFromO_StaticBoard1(17,3));}
	@Test public void test_board1_837(){commonTestCode1(17,4,isDInSetOfReachableTilesFromO_StaticBoard1(17,4));}
	@Test public void test_board1_838(){commonTestCode1(17,5,isDInSetOfReachableTilesFromO_StaticBoard1(17,5));}
	@Test public void test_board1_839(){commonTestCode1(17,6,isDInSetOfReachableTilesFromO_StaticBoard1(17,6));}
	@Test public void test_board1_840(){commonTestCode1(17,7,isDInSetOfReachableTilesFromO_StaticBoard1(17,7));}
	@Test public void test_board1_841(){commonTestCode1(17,8,isDInSetOfReachableTilesFromO_StaticBoard1(17,8));}
	@Test public void test_board1_842(){commonTestCode1(17,9,isDInSetOfReachableTilesFromO_StaticBoard1(17,9));}
	@Test public void test_board1_843(){commonTestCode1(17,10,isDInSetOfReachableTilesFromO_StaticBoard1(17,10));}
	@Test public void test_board1_844(){commonTestCode1(17,11,isDInSetOfReachableTilesFromO_StaticBoard1(17,11));}
	@Test public void test_board1_845(){commonTestCode1(17,12,isDInSetOfReachableTilesFromO_StaticBoard1(17,12));}
	@Test public void test_board1_846(){commonTestCode1(17,13,isDInSetOfReachableTilesFromO_StaticBoard1(17,13));}
	@Test public void test_board1_847(){commonTestCode1(17,14,isDInSetOfReachableTilesFromO_StaticBoard1(17,14));}
	@Test public void test_board1_848(){commonTestCode1(17,15,isDInSetOfReachableTilesFromO_StaticBoard1(17,15));}
	@Test public void test_board1_849(){commonTestCode1(17,16,isDInSetOfReachableTilesFromO_StaticBoard1(17,16));}
	@Test public void test_board1_850(){commonTestCode1(17,17,isDInSetOfReachableTilesFromO_StaticBoard1(17,17));}
	@Test public void test_board1_851(){commonTestCode1(17,18,isDInSetOfReachableTilesFromO_StaticBoard1(17,18));}
	@Test public void test_board1_852(){commonTestCode1(17,19,isDInSetOfReachableTilesFromO_StaticBoard1(17,19));}
	@Test public void test_board1_853(){commonTestCode1(17,20,isDInSetOfReachableTilesFromO_StaticBoard1(17,20));}
	@Test public void test_board1_854(){commonTestCode1(17,21,isDInSetOfReachableTilesFromO_StaticBoard1(17,21));}
	@Test public void test_board1_855(){commonTestCode1(17,22,isDInSetOfReachableTilesFromO_StaticBoard1(17,22));}
	@Test public void test_board1_856(){commonTestCode1(17,23,isDInSetOfReachableTilesFromO_StaticBoard1(17,23));}
	@Test public void test_board1_857(){commonTestCode1(17,24,isDInSetOfReachableTilesFromO_StaticBoard1(17,24));}
	@Test public void test_board1_858(){commonTestCode1(17,25,isDInSetOfReachableTilesFromO_StaticBoard1(17,25));}
	@Test public void test_board1_859(){commonTestCode1(17,26,isDInSetOfReachableTilesFromO_StaticBoard1(17,26));}
	@Test public void test_board1_860(){commonTestCode1(17,27,isDInSetOfReachableTilesFromO_StaticBoard1(17,27));}
	@Test public void test_board1_861(){commonTestCode1(17,28,isDInSetOfReachableTilesFromO_StaticBoard1(17,28));}
	@Test public void test_board1_862(){commonTestCode1(17,29,isDInSetOfReachableTilesFromO_StaticBoard1(17,29));}
	@Test public void test_board1_863(){commonTestCode1(17,30,isDInSetOfReachableTilesFromO_StaticBoard1(17,30));}
	@Test public void test_board1_864(){commonTestCode1(17,31,isDInSetOfReachableTilesFromO_StaticBoard1(17,31));}
	@Test public void test_board1_865(){commonTestCode1(17,32,isDInSetOfReachableTilesFromO_StaticBoard1(17,32));}
	@Test public void test_board1_866(){commonTestCode1(17,33,isDInSetOfReachableTilesFromO_StaticBoard1(17,33));}
	@Test public void test_board1_867(){commonTestCode1(17,34,isDInSetOfReachableTilesFromO_StaticBoard1(17,34));}
	@Test public void test_board1_868(){commonTestCode1(17,35,isDInSetOfReachableTilesFromO_StaticBoard1(17,35));}
	@Test public void test_board1_869(){commonTestCode1(17,36,isDInSetOfReachableTilesFromO_StaticBoard1(17,36));}
	@Test public void test_board1_870(){commonTestCode1(17,37,isDInSetOfReachableTilesFromO_StaticBoard1(17,37));}
	@Test public void test_board1_871(){commonTestCode1(17,38,isDInSetOfReachableTilesFromO_StaticBoard1(17,38));}
	@Test public void test_board1_872(){commonTestCode1(17,39,isDInSetOfReachableTilesFromO_StaticBoard1(17,39));}
	@Test public void test_board1_873(){commonTestCode1(17,40,isDInSetOfReachableTilesFromO_StaticBoard1(17,40));}
	@Test public void test_board1_874(){commonTestCode1(17,41,isDInSetOfReachableTilesFromO_StaticBoard1(17,41));}
	@Test public void test_board1_875(){commonTestCode1(17,42,isDInSetOfReachableTilesFromO_StaticBoard1(17,42));}
	@Test public void test_board1_876(){commonTestCode1(17,43,isDInSetOfReachableTilesFromO_StaticBoard1(17,43));}
	@Test public void test_board1_877(){commonTestCode1(17,44,isDInSetOfReachableTilesFromO_StaticBoard1(17,44));}
	@Test public void test_board1_878(){commonTestCode1(17,45,isDInSetOfReachableTilesFromO_StaticBoard1(17,45));}
	@Test public void test_board1_879(){commonTestCode1(17,46,isDInSetOfReachableTilesFromO_StaticBoard1(17,46));}
	@Test public void test_board1_880(){commonTestCode1(17,47,isDInSetOfReachableTilesFromO_StaticBoard1(17,47));}
	@Test public void test_board1_881(){commonTestCode1(17,48,isDInSetOfReachableTilesFromO_StaticBoard1(17,48));}
	@Test public void test_board1_882(){commonTestCode1(18,0,isDInSetOfReachableTilesFromO_StaticBoard1(18,0));}
	@Test public void test_board1_883(){commonTestCode1(18,1,isDInSetOfReachableTilesFromO_StaticBoard1(18,1));}
	@Test public void test_board1_884(){commonTestCode1(18,2,isDInSetOfReachableTilesFromO_StaticBoard1(18,2));}
	@Test public void test_board1_885(){commonTestCode1(18,3,isDInSetOfReachableTilesFromO_StaticBoard1(18,3));}
	@Test public void test_board1_886(){commonTestCode1(18,4,isDInSetOfReachableTilesFromO_StaticBoard1(18,4));}
	@Test public void test_board1_887(){commonTestCode1(18,5,isDInSetOfReachableTilesFromO_StaticBoard1(18,5));}
	@Test public void test_board1_888(){commonTestCode1(18,6,isDInSetOfReachableTilesFromO_StaticBoard1(18,6));}
	@Test public void test_board1_889(){commonTestCode1(18,7,isDInSetOfReachableTilesFromO_StaticBoard1(18,7));}
	@Test public void test_board1_890(){commonTestCode1(18,8,isDInSetOfReachableTilesFromO_StaticBoard1(18,8));}
	@Test public void test_board1_891(){commonTestCode1(18,9,isDInSetOfReachableTilesFromO_StaticBoard1(18,9));}
	@Test public void test_board1_892(){commonTestCode1(18,10,isDInSetOfReachableTilesFromO_StaticBoard1(18,10));}
	@Test public void test_board1_893(){commonTestCode1(18,11,isDInSetOfReachableTilesFromO_StaticBoard1(18,11));}
	@Test public void test_board1_894(){commonTestCode1(18,12,isDInSetOfReachableTilesFromO_StaticBoard1(18,12));}
	@Test public void test_board1_895(){commonTestCode1(18,13,isDInSetOfReachableTilesFromO_StaticBoard1(18,13));}
	@Test public void test_board1_896(){commonTestCode1(18,14,isDInSetOfReachableTilesFromO_StaticBoard1(18,14));}
	@Test public void test_board1_897(){commonTestCode1(18,15,isDInSetOfReachableTilesFromO_StaticBoard1(18,15));}
	@Test public void test_board1_898(){commonTestCode1(18,16,isDInSetOfReachableTilesFromO_StaticBoard1(18,16));}
	@Test public void test_board1_899(){commonTestCode1(18,17,isDInSetOfReachableTilesFromO_StaticBoard1(18,17));}
	@Test public void test_board1_900(){commonTestCode1(18,18,isDInSetOfReachableTilesFromO_StaticBoard1(18,18));}
	@Test public void test_board1_901(){commonTestCode1(18,19,isDInSetOfReachableTilesFromO_StaticBoard1(18,19));}
	@Test public void test_board1_902(){commonTestCode1(18,20,isDInSetOfReachableTilesFromO_StaticBoard1(18,20));}
	@Test public void test_board1_903(){commonTestCode1(18,21,isDInSetOfReachableTilesFromO_StaticBoard1(18,21));}
	@Test public void test_board1_904(){commonTestCode1(18,22,isDInSetOfReachableTilesFromO_StaticBoard1(18,22));}
	@Test public void test_board1_905(){commonTestCode1(18,23,isDInSetOfReachableTilesFromO_StaticBoard1(18,23));}
	@Test public void test_board1_906(){commonTestCode1(18,24,isDInSetOfReachableTilesFromO_StaticBoard1(18,24));}
	@Test public void test_board1_907(){commonTestCode1(18,25,isDInSetOfReachableTilesFromO_StaticBoard1(18,25));}
	@Test public void test_board1_908(){commonTestCode1(18,26,isDInSetOfReachableTilesFromO_StaticBoard1(18,26));}
	@Test public void test_board1_909(){commonTestCode1(18,27,isDInSetOfReachableTilesFromO_StaticBoard1(18,27));}
	@Test public void test_board1_910(){commonTestCode1(18,28,isDInSetOfReachableTilesFromO_StaticBoard1(18,28));}
	@Test public void test_board1_911(){commonTestCode1(18,29,isDInSetOfReachableTilesFromO_StaticBoard1(18,29));}
	@Test public void test_board1_912(){commonTestCode1(18,30,isDInSetOfReachableTilesFromO_StaticBoard1(18,30));}
	@Test public void test_board1_913(){commonTestCode1(18,31,isDInSetOfReachableTilesFromO_StaticBoard1(18,31));}
	@Test public void test_board1_914(){commonTestCode1(18,32,isDInSetOfReachableTilesFromO_StaticBoard1(18,32));}
	@Test public void test_board1_915(){commonTestCode1(18,33,isDInSetOfReachableTilesFromO_StaticBoard1(18,33));}
	@Test public void test_board1_916(){commonTestCode1(18,34,isDInSetOfReachableTilesFromO_StaticBoard1(18,34));}
	@Test public void test_board1_917(){commonTestCode1(18,35,isDInSetOfReachableTilesFromO_StaticBoard1(18,35));}
	@Test public void test_board1_918(){commonTestCode1(18,36,isDInSetOfReachableTilesFromO_StaticBoard1(18,36));}
	@Test public void test_board1_919(){commonTestCode1(18,37,isDInSetOfReachableTilesFromO_StaticBoard1(18,37));}
	@Test public void test_board1_920(){commonTestCode1(18,38,isDInSetOfReachableTilesFromO_StaticBoard1(18,38));}
	@Test public void test_board1_921(){commonTestCode1(18,39,isDInSetOfReachableTilesFromO_StaticBoard1(18,39));}
	@Test public void test_board1_922(){commonTestCode1(18,40,isDInSetOfReachableTilesFromO_StaticBoard1(18,40));}
	@Test public void test_board1_923(){commonTestCode1(18,41,isDInSetOfReachableTilesFromO_StaticBoard1(18,41));}
	@Test public void test_board1_924(){commonTestCode1(18,42,isDInSetOfReachableTilesFromO_StaticBoard1(18,42));}
	@Test public void test_board1_925(){commonTestCode1(18,43,isDInSetOfReachableTilesFromO_StaticBoard1(18,43));}
	@Test public void test_board1_926(){commonTestCode1(18,44,isDInSetOfReachableTilesFromO_StaticBoard1(18,44));}
	@Test public void test_board1_927(){commonTestCode1(18,45,isDInSetOfReachableTilesFromO_StaticBoard1(18,45));}
	@Test public void test_board1_928(){commonTestCode1(18,46,isDInSetOfReachableTilesFromO_StaticBoard1(18,46));}
	@Test public void test_board1_929(){commonTestCode1(18,47,isDInSetOfReachableTilesFromO_StaticBoard1(18,47));}
	@Test public void test_board1_930(){commonTestCode1(18,48,isDInSetOfReachableTilesFromO_StaticBoard1(18,48));}
	@Test public void test_board1_931(){commonTestCode1(19,0,isDInSetOfReachableTilesFromO_StaticBoard1(19,0));}
	@Test public void test_board1_932(){commonTestCode1(19,1,isDInSetOfReachableTilesFromO_StaticBoard1(19,1));}
	@Test public void test_board1_933(){commonTestCode1(19,2,isDInSetOfReachableTilesFromO_StaticBoard1(19,2));}
	@Test public void test_board1_934(){commonTestCode1(19,3,isDInSetOfReachableTilesFromO_StaticBoard1(19,3));}
	@Test public void test_board1_935(){commonTestCode1(19,4,isDInSetOfReachableTilesFromO_StaticBoard1(19,4));}
	@Test public void test_board1_936(){commonTestCode1(19,5,isDInSetOfReachableTilesFromO_StaticBoard1(19,5));}
	@Test public void test_board1_937(){commonTestCode1(19,6,isDInSetOfReachableTilesFromO_StaticBoard1(19,6));}
	@Test public void test_board1_938(){commonTestCode1(19,7,isDInSetOfReachableTilesFromO_StaticBoard1(19,7));}
	@Test public void test_board1_939(){commonTestCode1(19,8,isDInSetOfReachableTilesFromO_StaticBoard1(19,8));}
	@Test public void test_board1_940(){commonTestCode1(19,9,isDInSetOfReachableTilesFromO_StaticBoard1(19,9));}
	@Test public void test_board1_941(){commonTestCode1(19,10,isDInSetOfReachableTilesFromO_StaticBoard1(19,10));}
	@Test public void test_board1_942(){commonTestCode1(19,11,isDInSetOfReachableTilesFromO_StaticBoard1(19,11));}
	@Test public void test_board1_943(){commonTestCode1(19,12,isDInSetOfReachableTilesFromO_StaticBoard1(19,12));}
	@Test public void test_board1_944(){commonTestCode1(19,13,isDInSetOfReachableTilesFromO_StaticBoard1(19,13));}
	@Test public void test_board1_945(){commonTestCode1(19,14,isDInSetOfReachableTilesFromO_StaticBoard1(19,14));}
	@Test public void test_board1_946(){commonTestCode1(19,15,isDInSetOfReachableTilesFromO_StaticBoard1(19,15));}
	@Test public void test_board1_947(){commonTestCode1(19,16,isDInSetOfReachableTilesFromO_StaticBoard1(19,16));}
	@Test public void test_board1_948(){commonTestCode1(19,17,isDInSetOfReachableTilesFromO_StaticBoard1(19,17));}
	@Test public void test_board1_949(){commonTestCode1(19,18,isDInSetOfReachableTilesFromO_StaticBoard1(19,18));}
	@Test public void test_board1_950(){commonTestCode1(19,19,isDInSetOfReachableTilesFromO_StaticBoard1(19,19));}
	@Test public void test_board1_951(){commonTestCode1(19,20,isDInSetOfReachableTilesFromO_StaticBoard1(19,20));}
	@Test public void test_board1_952(){commonTestCode1(19,21,isDInSetOfReachableTilesFromO_StaticBoard1(19,21));}
	@Test public void test_board1_953(){commonTestCode1(19,22,isDInSetOfReachableTilesFromO_StaticBoard1(19,22));}
	@Test public void test_board1_954(){commonTestCode1(19,23,isDInSetOfReachableTilesFromO_StaticBoard1(19,23));}
	@Test public void test_board1_955(){commonTestCode1(19,24,isDInSetOfReachableTilesFromO_StaticBoard1(19,24));}
	@Test public void test_board1_956(){commonTestCode1(19,25,isDInSetOfReachableTilesFromO_StaticBoard1(19,25));}
	@Test public void test_board1_957(){commonTestCode1(19,26,isDInSetOfReachableTilesFromO_StaticBoard1(19,26));}
	@Test public void test_board1_958(){commonTestCode1(19,27,isDInSetOfReachableTilesFromO_StaticBoard1(19,27));}
	@Test public void test_board1_959(){commonTestCode1(19,28,isDInSetOfReachableTilesFromO_StaticBoard1(19,28));}
	@Test public void test_board1_960(){commonTestCode1(19,29,isDInSetOfReachableTilesFromO_StaticBoard1(19,29));}
	@Test public void test_board1_961(){commonTestCode1(19,30,isDInSetOfReachableTilesFromO_StaticBoard1(19,30));}
	@Test public void test_board1_962(){commonTestCode1(19,31,isDInSetOfReachableTilesFromO_StaticBoard1(19,31));}
	@Test public void test_board1_963(){commonTestCode1(19,32,isDInSetOfReachableTilesFromO_StaticBoard1(19,32));}
	@Test public void test_board1_964(){commonTestCode1(19,33,isDInSetOfReachableTilesFromO_StaticBoard1(19,33));}
	@Test public void test_board1_965(){commonTestCode1(19,34,isDInSetOfReachableTilesFromO_StaticBoard1(19,34));}
	@Test public void test_board1_966(){commonTestCode1(19,35,isDInSetOfReachableTilesFromO_StaticBoard1(19,35));}
	@Test public void test_board1_967(){commonTestCode1(19,36,isDInSetOfReachableTilesFromO_StaticBoard1(19,36));}
	@Test public void test_board1_968(){commonTestCode1(19,37,isDInSetOfReachableTilesFromO_StaticBoard1(19,37));}
	@Test public void test_board1_969(){commonTestCode1(19,38,isDInSetOfReachableTilesFromO_StaticBoard1(19,38));}
	@Test public void test_board1_970(){commonTestCode1(19,39,isDInSetOfReachableTilesFromO_StaticBoard1(19,39));}
	@Test public void test_board1_971(){commonTestCode1(19,40,isDInSetOfReachableTilesFromO_StaticBoard1(19,40));}
	@Test public void test_board1_972(){commonTestCode1(19,41,isDInSetOfReachableTilesFromO_StaticBoard1(19,41));}
	@Test public void test_board1_973(){commonTestCode1(19,42,isDInSetOfReachableTilesFromO_StaticBoard1(19,42));}
	@Test public void test_board1_974(){commonTestCode1(19,43,isDInSetOfReachableTilesFromO_StaticBoard1(19,43));}
	@Test public void test_board1_975(){commonTestCode1(19,44,isDInSetOfReachableTilesFromO_StaticBoard1(19,44));}
	@Test public void test_board1_976(){commonTestCode1(19,45,isDInSetOfReachableTilesFromO_StaticBoard1(19,45));}
	@Test public void test_board1_977(){commonTestCode1(19,46,isDInSetOfReachableTilesFromO_StaticBoard1(19,46));}
	@Test public void test_board1_978(){commonTestCode1(19,47,isDInSetOfReachableTilesFromO_StaticBoard1(19,47));}
	@Test public void test_board1_979(){commonTestCode1(19,48,isDInSetOfReachableTilesFromO_StaticBoard1(19,48));}
	@Test public void test_board1_980(){commonTestCode1(20,0,isDInSetOfReachableTilesFromO_StaticBoard1(20,0));}
	@Test public void test_board1_981(){commonTestCode1(20,1,isDInSetOfReachableTilesFromO_StaticBoard1(20,1));}
	@Test public void test_board1_982(){commonTestCode1(20,2,isDInSetOfReachableTilesFromO_StaticBoard1(20,2));}
	@Test public void test_board1_983(){commonTestCode1(20,3,isDInSetOfReachableTilesFromO_StaticBoard1(20,3));}
	@Test public void test_board1_984(){commonTestCode1(20,4,isDInSetOfReachableTilesFromO_StaticBoard1(20,4));}
	@Test public void test_board1_985(){commonTestCode1(20,5,isDInSetOfReachableTilesFromO_StaticBoard1(20,5));}
	@Test public void test_board1_986(){commonTestCode1(20,6,isDInSetOfReachableTilesFromO_StaticBoard1(20,6));}
	@Test public void test_board1_987(){commonTestCode1(20,7,isDInSetOfReachableTilesFromO_StaticBoard1(20,7));}
	@Test public void test_board1_988(){commonTestCode1(20,8,isDInSetOfReachableTilesFromO_StaticBoard1(20,8));}
	@Test public void test_board1_989(){commonTestCode1(20,9,isDInSetOfReachableTilesFromO_StaticBoard1(20,9));}
	@Test public void test_board1_990(){commonTestCode1(20,10,isDInSetOfReachableTilesFromO_StaticBoard1(20,10));}
	@Test public void test_board1_991(){commonTestCode1(20,11,isDInSetOfReachableTilesFromO_StaticBoard1(20,11));}
	@Test public void test_board1_992(){commonTestCode1(20,12,isDInSetOfReachableTilesFromO_StaticBoard1(20,12));}
	@Test public void test_board1_993(){commonTestCode1(20,13,isDInSetOfReachableTilesFromO_StaticBoard1(20,13));}
	@Test public void test_board1_994(){commonTestCode1(20,14,isDInSetOfReachableTilesFromO_StaticBoard1(20,14));}
	@Test public void test_board1_995(){commonTestCode1(20,15,isDInSetOfReachableTilesFromO_StaticBoard1(20,15));}
	@Test public void test_board1_996(){commonTestCode1(20,16,isDInSetOfReachableTilesFromO_StaticBoard1(20,16));}
	@Test public void test_board1_997(){commonTestCode1(20,17,isDInSetOfReachableTilesFromO_StaticBoard1(20,17));}
	@Test public void test_board1_998(){commonTestCode1(20,18,isDInSetOfReachableTilesFromO_StaticBoard1(20,18));}
	@Test public void test_board1_999(){commonTestCode1(20,19,isDInSetOfReachableTilesFromO_StaticBoard1(20,19));}
	@Test public void test_board1_1000(){commonTestCode1(20,20,isDInSetOfReachableTilesFromO_StaticBoard1(20,20));}
	@Test public void test_board1_1001(){commonTestCode1(20,21,isDInSetOfReachableTilesFromO_StaticBoard1(20,21));}
	@Test public void test_board1_1002(){commonTestCode1(20,22,isDInSetOfReachableTilesFromO_StaticBoard1(20,22));}
	@Test public void test_board1_1003(){commonTestCode1(20,23,isDInSetOfReachableTilesFromO_StaticBoard1(20,23));}
	@Test public void test_board1_1004(){commonTestCode1(20,24,isDInSetOfReachableTilesFromO_StaticBoard1(20,24));}
	@Test public void test_board1_1005(){commonTestCode1(20,25,isDInSetOfReachableTilesFromO_StaticBoard1(20,25));}
	@Test public void test_board1_1006(){commonTestCode1(20,26,isDInSetOfReachableTilesFromO_StaticBoard1(20,26));}
	@Test public void test_board1_1007(){commonTestCode1(20,27,isDInSetOfReachableTilesFromO_StaticBoard1(20,27));}
	@Test public void test_board1_1008(){commonTestCode1(20,28,isDInSetOfReachableTilesFromO_StaticBoard1(20,28));}
	@Test public void test_board1_1009(){commonTestCode1(20,29,isDInSetOfReachableTilesFromO_StaticBoard1(20,29));}
	@Test public void test_board1_1010(){commonTestCode1(20,30,isDInSetOfReachableTilesFromO_StaticBoard1(20,30));}
	@Test public void test_board1_1011(){commonTestCode1(20,31,isDInSetOfReachableTilesFromO_StaticBoard1(20,31));}
	@Test public void test_board1_1012(){commonTestCode1(20,32,isDInSetOfReachableTilesFromO_StaticBoard1(20,32));}
	@Test public void test_board1_1013(){commonTestCode1(20,33,isDInSetOfReachableTilesFromO_StaticBoard1(20,33));}
	@Test public void test_board1_1014(){commonTestCode1(20,34,isDInSetOfReachableTilesFromO_StaticBoard1(20,34));}
	@Test public void test_board1_1015(){commonTestCode1(20,35,isDInSetOfReachableTilesFromO_StaticBoard1(20,35));}
	@Test public void test_board1_1016(){commonTestCode1(20,36,isDInSetOfReachableTilesFromO_StaticBoard1(20,36));}
	@Test public void test_board1_1017(){commonTestCode1(20,37,isDInSetOfReachableTilesFromO_StaticBoard1(20,37));}
	@Test public void test_board1_1018(){commonTestCode1(20,38,isDInSetOfReachableTilesFromO_StaticBoard1(20,38));}
	@Test public void test_board1_1019(){commonTestCode1(20,39,isDInSetOfReachableTilesFromO_StaticBoard1(20,39));}
	@Test public void test_board1_1020(){commonTestCode1(20,40,isDInSetOfReachableTilesFromO_StaticBoard1(20,40));}
	@Test public void test_board1_1021(){commonTestCode1(20,41,isDInSetOfReachableTilesFromO_StaticBoard1(20,41));}
	@Test public void test_board1_1022(){commonTestCode1(20,42,isDInSetOfReachableTilesFromO_StaticBoard1(20,42));}
	@Test public void test_board1_1023(){commonTestCode1(20,43,isDInSetOfReachableTilesFromO_StaticBoard1(20,43));}
	@Test public void test_board1_1024(){commonTestCode1(20,44,isDInSetOfReachableTilesFromO_StaticBoard1(20,44));}
	@Test public void test_board1_1025(){commonTestCode1(20,45,isDInSetOfReachableTilesFromO_StaticBoard1(20,45));}
	@Test public void test_board1_1026(){commonTestCode1(20,46,isDInSetOfReachableTilesFromO_StaticBoard1(20,46));}
	@Test public void test_board1_1027(){commonTestCode1(20,47,isDInSetOfReachableTilesFromO_StaticBoard1(20,47));}
	@Test public void test_board1_1028(){commonTestCode1(20,48,isDInSetOfReachableTilesFromO_StaticBoard1(20,48));}
	@Test public void test_board1_1029(){commonTestCode1(21,0,isDInSetOfReachableTilesFromO_StaticBoard1(21,0));}
	@Test public void test_board1_1030(){commonTestCode1(21,1,isDInSetOfReachableTilesFromO_StaticBoard1(21,1));}
	@Test public void test_board1_1031(){commonTestCode1(21,2,isDInSetOfReachableTilesFromO_StaticBoard1(21,2));}
	@Test public void test_board1_1032(){commonTestCode1(21,3,isDInSetOfReachableTilesFromO_StaticBoard1(21,3));}
	@Test public void test_board1_1033(){commonTestCode1(21,4,isDInSetOfReachableTilesFromO_StaticBoard1(21,4));}
	@Test public void test_board1_1034(){commonTestCode1(21,5,isDInSetOfReachableTilesFromO_StaticBoard1(21,5));}
	@Test public void test_board1_1035(){commonTestCode1(21,6,isDInSetOfReachableTilesFromO_StaticBoard1(21,6));}
	@Test public void test_board1_1036(){commonTestCode1(21,7,isDInSetOfReachableTilesFromO_StaticBoard1(21,7));}
	@Test public void test_board1_1037(){commonTestCode1(21,8,isDInSetOfReachableTilesFromO_StaticBoard1(21,8));}
	@Test public void test_board1_1038(){commonTestCode1(21,9,isDInSetOfReachableTilesFromO_StaticBoard1(21,9));}
	@Test public void test_board1_1039(){commonTestCode1(21,10,isDInSetOfReachableTilesFromO_StaticBoard1(21,10));}
	@Test public void test_board1_1040(){commonTestCode1(21,11,isDInSetOfReachableTilesFromO_StaticBoard1(21,11));}
	@Test public void test_board1_1041(){commonTestCode1(21,12,isDInSetOfReachableTilesFromO_StaticBoard1(21,12));}
	@Test public void test_board1_1042(){commonTestCode1(21,13,isDInSetOfReachableTilesFromO_StaticBoard1(21,13));}
	@Test public void test_board1_1043(){commonTestCode1(21,14,isDInSetOfReachableTilesFromO_StaticBoard1(21,14));}
	@Test public void test_board1_1044(){commonTestCode1(21,15,isDInSetOfReachableTilesFromO_StaticBoard1(21,15));}
	@Test public void test_board1_1045(){commonTestCode1(21,16,isDInSetOfReachableTilesFromO_StaticBoard1(21,16));}
	@Test public void test_board1_1046(){commonTestCode1(21,17,isDInSetOfReachableTilesFromO_StaticBoard1(21,17));}
	@Test public void test_board1_1047(){commonTestCode1(21,18,isDInSetOfReachableTilesFromO_StaticBoard1(21,18));}
	@Test public void test_board1_1048(){commonTestCode1(21,19,isDInSetOfReachableTilesFromO_StaticBoard1(21,19));}
	@Test public void test_board1_1049(){commonTestCode1(21,20,isDInSetOfReachableTilesFromO_StaticBoard1(21,20));}
	@Test public void test_board1_1050(){commonTestCode1(21,21,isDInSetOfReachableTilesFromO_StaticBoard1(21,21));}
	@Test public void test_board1_1051(){commonTestCode1(21,22,isDInSetOfReachableTilesFromO_StaticBoard1(21,22));}
	@Test public void test_board1_1052(){commonTestCode1(21,23,isDInSetOfReachableTilesFromO_StaticBoard1(21,23));}
	@Test public void test_board1_1053(){commonTestCode1(21,24,isDInSetOfReachableTilesFromO_StaticBoard1(21,24));}
	@Test public void test_board1_1054(){commonTestCode1(21,25,isDInSetOfReachableTilesFromO_StaticBoard1(21,25));}
	@Test public void test_board1_1055(){commonTestCode1(21,26,isDInSetOfReachableTilesFromO_StaticBoard1(21,26));}
	@Test public void test_board1_1056(){commonTestCode1(21,27,isDInSetOfReachableTilesFromO_StaticBoard1(21,27));}
	@Test public void test_board1_1057(){commonTestCode1(21,28,isDInSetOfReachableTilesFromO_StaticBoard1(21,28));}
	@Test public void test_board1_1058(){commonTestCode1(21,29,isDInSetOfReachableTilesFromO_StaticBoard1(21,29));}
	@Test public void test_board1_1059(){commonTestCode1(21,30,isDInSetOfReachableTilesFromO_StaticBoard1(21,30));}
	@Test public void test_board1_1060(){commonTestCode1(21,31,isDInSetOfReachableTilesFromO_StaticBoard1(21,31));}
	@Test public void test_board1_1061(){commonTestCode1(21,32,isDInSetOfReachableTilesFromO_StaticBoard1(21,32));}
	@Test public void test_board1_1062(){commonTestCode1(21,33,isDInSetOfReachableTilesFromO_StaticBoard1(21,33));}
	@Test public void test_board1_1063(){commonTestCode1(21,34,isDInSetOfReachableTilesFromO_StaticBoard1(21,34));}
	@Test public void test_board1_1064(){commonTestCode1(21,35,isDInSetOfReachableTilesFromO_StaticBoard1(21,35));}
	@Test public void test_board1_1065(){commonTestCode1(21,36,isDInSetOfReachableTilesFromO_StaticBoard1(21,36));}
	@Test public void test_board1_1066(){commonTestCode1(21,37,isDInSetOfReachableTilesFromO_StaticBoard1(21,37));}
	@Test public void test_board1_1067(){commonTestCode1(21,38,isDInSetOfReachableTilesFromO_StaticBoard1(21,38));}
	@Test public void test_board1_1068(){commonTestCode1(21,39,isDInSetOfReachableTilesFromO_StaticBoard1(21,39));}
	@Test public void test_board1_1069(){commonTestCode1(21,40,isDInSetOfReachableTilesFromO_StaticBoard1(21,40));}
	@Test public void test_board1_1070(){commonTestCode1(21,41,isDInSetOfReachableTilesFromO_StaticBoard1(21,41));}
	@Test public void test_board1_1071(){commonTestCode1(21,42,isDInSetOfReachableTilesFromO_StaticBoard1(21,42));}
	@Test public void test_board1_1072(){commonTestCode1(21,43,isDInSetOfReachableTilesFromO_StaticBoard1(21,43));}
	@Test public void test_board1_1073(){commonTestCode1(21,44,isDInSetOfReachableTilesFromO_StaticBoard1(21,44));}
	@Test public void test_board1_1074(){commonTestCode1(21,45,isDInSetOfReachableTilesFromO_StaticBoard1(21,45));}
	@Test public void test_board1_1075(){commonTestCode1(21,46,isDInSetOfReachableTilesFromO_StaticBoard1(21,46));}
	@Test public void test_board1_1076(){commonTestCode1(21,47,isDInSetOfReachableTilesFromO_StaticBoard1(21,47));}
	@Test public void test_board1_1077(){commonTestCode1(21,48,isDInSetOfReachableTilesFromO_StaticBoard1(21,48));}
	@Test public void test_board1_1078(){commonTestCode1(22,0,isDInSetOfReachableTilesFromO_StaticBoard1(22,0));}
	@Test public void test_board1_1079(){commonTestCode1(22,1,isDInSetOfReachableTilesFromO_StaticBoard1(22,1));}
	@Test public void test_board1_1080(){commonTestCode1(22,2,isDInSetOfReachableTilesFromO_StaticBoard1(22,2));}
	@Test public void test_board1_1081(){commonTestCode1(22,3,isDInSetOfReachableTilesFromO_StaticBoard1(22,3));}
	@Test public void test_board1_1082(){commonTestCode1(22,4,isDInSetOfReachableTilesFromO_StaticBoard1(22,4));}
	@Test public void test_board1_1083(){commonTestCode1(22,5,isDInSetOfReachableTilesFromO_StaticBoard1(22,5));}
	@Test public void test_board1_1084(){commonTestCode1(22,6,isDInSetOfReachableTilesFromO_StaticBoard1(22,6));}
	@Test public void test_board1_1085(){commonTestCode1(22,7,isDInSetOfReachableTilesFromO_StaticBoard1(22,7));}
	@Test public void test_board1_1086(){commonTestCode1(22,8,isDInSetOfReachableTilesFromO_StaticBoard1(22,8));}
	@Test public void test_board1_1087(){commonTestCode1(22,9,isDInSetOfReachableTilesFromO_StaticBoard1(22,9));}
	@Test public void test_board1_1088(){commonTestCode1(22,10,isDInSetOfReachableTilesFromO_StaticBoard1(22,10));}
	@Test public void test_board1_1089(){commonTestCode1(22,11,isDInSetOfReachableTilesFromO_StaticBoard1(22,11));}
	@Test public void test_board1_1090(){commonTestCode1(22,12,isDInSetOfReachableTilesFromO_StaticBoard1(22,12));}
	@Test public void test_board1_1091(){commonTestCode1(22,13,isDInSetOfReachableTilesFromO_StaticBoard1(22,13));}
	@Test public void test_board1_1092(){commonTestCode1(22,14,isDInSetOfReachableTilesFromO_StaticBoard1(22,14));}
	@Test public void test_board1_1093(){commonTestCode1(22,15,isDInSetOfReachableTilesFromO_StaticBoard1(22,15));}
	@Test public void test_board1_1094(){commonTestCode1(22,16,isDInSetOfReachableTilesFromO_StaticBoard1(22,16));}
	@Test public void test_board1_1095(){commonTestCode1(22,17,isDInSetOfReachableTilesFromO_StaticBoard1(22,17));}
	@Test public void test_board1_1096(){commonTestCode1(22,18,isDInSetOfReachableTilesFromO_StaticBoard1(22,18));}
	@Test public void test_board1_1097(){commonTestCode1(22,19,isDInSetOfReachableTilesFromO_StaticBoard1(22,19));}
	@Test public void test_board1_1098(){commonTestCode1(22,20,isDInSetOfReachableTilesFromO_StaticBoard1(22,20));}
	@Test public void test_board1_1099(){commonTestCode1(22,21,isDInSetOfReachableTilesFromO_StaticBoard1(22,21));}
	@Test public void test_board1_1100(){commonTestCode1(22,22,isDInSetOfReachableTilesFromO_StaticBoard1(22,22));}
	@Test public void test_board1_1101(){commonTestCode1(22,23,isDInSetOfReachableTilesFromO_StaticBoard1(22,23));}
	@Test public void test_board1_1102(){commonTestCode1(22,24,isDInSetOfReachableTilesFromO_StaticBoard1(22,24));}
	@Test public void test_board1_1103(){commonTestCode1(22,25,isDInSetOfReachableTilesFromO_StaticBoard1(22,25));}
	@Test public void test_board1_1104(){commonTestCode1(22,26,isDInSetOfReachableTilesFromO_StaticBoard1(22,26));}
	@Test public void test_board1_1105(){commonTestCode1(22,27,isDInSetOfReachableTilesFromO_StaticBoard1(22,27));}
	@Test public void test_board1_1106(){commonTestCode1(22,28,isDInSetOfReachableTilesFromO_StaticBoard1(22,28));}
	@Test public void test_board1_1107(){commonTestCode1(22,29,isDInSetOfReachableTilesFromO_StaticBoard1(22,29));}
	@Test public void test_board1_1108(){commonTestCode1(22,30,isDInSetOfReachableTilesFromO_StaticBoard1(22,30));}
	@Test public void test_board1_1109(){commonTestCode1(22,31,isDInSetOfReachableTilesFromO_StaticBoard1(22,31));}
	@Test public void test_board1_1110(){commonTestCode1(22,32,isDInSetOfReachableTilesFromO_StaticBoard1(22,32));}
	@Test public void test_board1_1111(){commonTestCode1(22,33,isDInSetOfReachableTilesFromO_StaticBoard1(22,33));}
	@Test public void test_board1_1112(){commonTestCode1(22,34,isDInSetOfReachableTilesFromO_StaticBoard1(22,34));}
	@Test public void test_board1_1113(){commonTestCode1(22,35,isDInSetOfReachableTilesFromO_StaticBoard1(22,35));}
	@Test public void test_board1_1114(){commonTestCode1(22,36,isDInSetOfReachableTilesFromO_StaticBoard1(22,36));}
	@Test public void test_board1_1115(){commonTestCode1(22,37,isDInSetOfReachableTilesFromO_StaticBoard1(22,37));}
	@Test public void test_board1_1116(){commonTestCode1(22,38,isDInSetOfReachableTilesFromO_StaticBoard1(22,38));}
	@Test public void test_board1_1117(){commonTestCode1(22,39,isDInSetOfReachableTilesFromO_StaticBoard1(22,39));}
	@Test public void test_board1_1118(){commonTestCode1(22,40,isDInSetOfReachableTilesFromO_StaticBoard1(22,40));}
	@Test public void test_board1_1119(){commonTestCode1(22,41,isDInSetOfReachableTilesFromO_StaticBoard1(22,41));}
	@Test public void test_board1_1120(){commonTestCode1(22,42,isDInSetOfReachableTilesFromO_StaticBoard1(22,42));}
	@Test public void test_board1_1121(){commonTestCode1(22,43,isDInSetOfReachableTilesFromO_StaticBoard1(22,43));}
	@Test public void test_board1_1122(){commonTestCode1(22,44,isDInSetOfReachableTilesFromO_StaticBoard1(22,44));}
	@Test public void test_board1_1123(){commonTestCode1(22,45,isDInSetOfReachableTilesFromO_StaticBoard1(22,45));}
	@Test public void test_board1_1124(){commonTestCode1(22,46,isDInSetOfReachableTilesFromO_StaticBoard1(22,46));}
	@Test public void test_board1_1125(){commonTestCode1(22,47,isDInSetOfReachableTilesFromO_StaticBoard1(22,47));}
	@Test public void test_board1_1126(){commonTestCode1(22,48,isDInSetOfReachableTilesFromO_StaticBoard1(22,48));}
	@Test public void test_board1_1127(){commonTestCode1(23,0,isDInSetOfReachableTilesFromO_StaticBoard1(23,0));}
	@Test public void test_board1_1128(){commonTestCode1(23,1,isDInSetOfReachableTilesFromO_StaticBoard1(23,1));}
	@Test public void test_board1_1129(){commonTestCode1(23,2,isDInSetOfReachableTilesFromO_StaticBoard1(23,2));}
	@Test public void test_board1_1130(){commonTestCode1(23,3,isDInSetOfReachableTilesFromO_StaticBoard1(23,3));}
	@Test public void test_board1_1131(){commonTestCode1(23,4,isDInSetOfReachableTilesFromO_StaticBoard1(23,4));}
	@Test public void test_board1_1132(){commonTestCode1(23,5,isDInSetOfReachableTilesFromO_StaticBoard1(23,5));}
	@Test public void test_board1_1133(){commonTestCode1(23,6,isDInSetOfReachableTilesFromO_StaticBoard1(23,6));}
	@Test public void test_board1_1134(){commonTestCode1(23,7,isDInSetOfReachableTilesFromO_StaticBoard1(23,7));}
	@Test public void test_board1_1135(){commonTestCode1(23,8,isDInSetOfReachableTilesFromO_StaticBoard1(23,8));}
	@Test public void test_board1_1136(){commonTestCode1(23,9,isDInSetOfReachableTilesFromO_StaticBoard1(23,9));}
	@Test public void test_board1_1137(){commonTestCode1(23,10,isDInSetOfReachableTilesFromO_StaticBoard1(23,10));}
	@Test public void test_board1_1138(){commonTestCode1(23,11,isDInSetOfReachableTilesFromO_StaticBoard1(23,11));}
	@Test public void test_board1_1139(){commonTestCode1(23,12,isDInSetOfReachableTilesFromO_StaticBoard1(23,12));}
	@Test public void test_board1_1140(){commonTestCode1(23,13,isDInSetOfReachableTilesFromO_StaticBoard1(23,13));}
	@Test public void test_board1_1141(){commonTestCode1(23,14,isDInSetOfReachableTilesFromO_StaticBoard1(23,14));}
	@Test public void test_board1_1142(){commonTestCode1(23,15,isDInSetOfReachableTilesFromO_StaticBoard1(23,15));}
	@Test public void test_board1_1143(){commonTestCode1(23,16,isDInSetOfReachableTilesFromO_StaticBoard1(23,16));}
	@Test public void test_board1_1144(){commonTestCode1(23,17,isDInSetOfReachableTilesFromO_StaticBoard1(23,17));}
	@Test public void test_board1_1145(){commonTestCode1(23,18,isDInSetOfReachableTilesFromO_StaticBoard1(23,18));}
	@Test public void test_board1_1146(){commonTestCode1(23,19,isDInSetOfReachableTilesFromO_StaticBoard1(23,19));}
	@Test public void test_board1_1147(){commonTestCode1(23,20,isDInSetOfReachableTilesFromO_StaticBoard1(23,20));}
	@Test public void test_board1_1148(){commonTestCode1(23,21,isDInSetOfReachableTilesFromO_StaticBoard1(23,21));}
	@Test public void test_board1_1149(){commonTestCode1(23,22,isDInSetOfReachableTilesFromO_StaticBoard1(23,22));}
	@Test public void test_board1_1150(){commonTestCode1(23,23,isDInSetOfReachableTilesFromO_StaticBoard1(23,23));}
	@Test public void test_board1_1151(){commonTestCode1(23,24,isDInSetOfReachableTilesFromO_StaticBoard1(23,24));}
	@Test public void test_board1_1152(){commonTestCode1(23,25,isDInSetOfReachableTilesFromO_StaticBoard1(23,25));}
	@Test public void test_board1_1153(){commonTestCode1(23,26,isDInSetOfReachableTilesFromO_StaticBoard1(23,26));}
	@Test public void test_board1_1154(){commonTestCode1(23,27,isDInSetOfReachableTilesFromO_StaticBoard1(23,27));}
	@Test public void test_board1_1155(){commonTestCode1(23,28,isDInSetOfReachableTilesFromO_StaticBoard1(23,28));}
	@Test public void test_board1_1156(){commonTestCode1(23,29,isDInSetOfReachableTilesFromO_StaticBoard1(23,29));}
	@Test public void test_board1_1157(){commonTestCode1(23,30,isDInSetOfReachableTilesFromO_StaticBoard1(23,30));}
	@Test public void test_board1_1158(){commonTestCode1(23,31,isDInSetOfReachableTilesFromO_StaticBoard1(23,31));}
	@Test public void test_board1_1159(){commonTestCode1(23,32,isDInSetOfReachableTilesFromO_StaticBoard1(23,32));}
	@Test public void test_board1_1160(){commonTestCode1(23,33,isDInSetOfReachableTilesFromO_StaticBoard1(23,33));}
	@Test public void test_board1_1161(){commonTestCode1(23,34,isDInSetOfReachableTilesFromO_StaticBoard1(23,34));}
	@Test public void test_board1_1162(){commonTestCode1(23,35,isDInSetOfReachableTilesFromO_StaticBoard1(23,35));}
	@Test public void test_board1_1163(){commonTestCode1(23,36,isDInSetOfReachableTilesFromO_StaticBoard1(23,36));}
	@Test public void test_board1_1164(){commonTestCode1(23,37,isDInSetOfReachableTilesFromO_StaticBoard1(23,37));}
	@Test public void test_board1_1165(){commonTestCode1(23,38,isDInSetOfReachableTilesFromO_StaticBoard1(23,38));}
	@Test public void test_board1_1166(){commonTestCode1(23,39,isDInSetOfReachableTilesFromO_StaticBoard1(23,39));}
	@Test public void test_board1_1167(){commonTestCode1(23,40,isDInSetOfReachableTilesFromO_StaticBoard1(23,40));}
	@Test public void test_board1_1168(){commonTestCode1(23,41,isDInSetOfReachableTilesFromO_StaticBoard1(23,41));}
	@Test public void test_board1_1169(){commonTestCode1(23,42,isDInSetOfReachableTilesFromO_StaticBoard1(23,42));}
	@Test public void test_board1_1170(){commonTestCode1(23,43,isDInSetOfReachableTilesFromO_StaticBoard1(23,43));}
	@Test public void test_board1_1171(){commonTestCode1(23,44,isDInSetOfReachableTilesFromO_StaticBoard1(23,44));}
	@Test public void test_board1_1172(){commonTestCode1(23,45,isDInSetOfReachableTilesFromO_StaticBoard1(23,45));}
	@Test public void test_board1_1173(){commonTestCode1(23,46,isDInSetOfReachableTilesFromO_StaticBoard1(23,46));}
	@Test public void test_board1_1174(){commonTestCode1(23,47,isDInSetOfReachableTilesFromO_StaticBoard1(23,47));}
	@Test public void test_board1_1175(){commonTestCode1(23,48,isDInSetOfReachableTilesFromO_StaticBoard1(23,48));}
	@Test public void test_board1_1176(){commonTestCode1(24,0,isDInSetOfReachableTilesFromO_StaticBoard1(24,0));}
	@Test public void test_board1_1177(){commonTestCode1(24,1,isDInSetOfReachableTilesFromO_StaticBoard1(24,1));}
	@Test public void test_board1_1178(){commonTestCode1(24,2,isDInSetOfReachableTilesFromO_StaticBoard1(24,2));}
	@Test public void test_board1_1179(){commonTestCode1(24,3,isDInSetOfReachableTilesFromO_StaticBoard1(24,3));}
	@Test public void test_board1_1180(){commonTestCode1(24,4,isDInSetOfReachableTilesFromO_StaticBoard1(24,4));}
	@Test public void test_board1_1181(){commonTestCode1(24,5,isDInSetOfReachableTilesFromO_StaticBoard1(24,5));}
	@Test public void test_board1_1182(){commonTestCode1(24,6,isDInSetOfReachableTilesFromO_StaticBoard1(24,6));}
	@Test public void test_board1_1183(){commonTestCode1(24,7,isDInSetOfReachableTilesFromO_StaticBoard1(24,7));}
	@Test public void test_board1_1184(){commonTestCode1(24,8,isDInSetOfReachableTilesFromO_StaticBoard1(24,8));}
	@Test public void test_board1_1185(){commonTestCode1(24,9,isDInSetOfReachableTilesFromO_StaticBoard1(24,9));}
	@Test public void test_board1_1186(){commonTestCode1(24,10,isDInSetOfReachableTilesFromO_StaticBoard1(24,10));}
	@Test public void test_board1_1187(){commonTestCode1(24,11,isDInSetOfReachableTilesFromO_StaticBoard1(24,11));}
	@Test public void test_board1_1188(){commonTestCode1(24,12,isDInSetOfReachableTilesFromO_StaticBoard1(24,12));}
	@Test public void test_board1_1189(){commonTestCode1(24,13,isDInSetOfReachableTilesFromO_StaticBoard1(24,13));}
	@Test public void test_board1_1190(){commonTestCode1(24,14,isDInSetOfReachableTilesFromO_StaticBoard1(24,14));}
	@Test public void test_board1_1191(){commonTestCode1(24,15,isDInSetOfReachableTilesFromO_StaticBoard1(24,15));}
	@Test public void test_board1_1192(){commonTestCode1(24,16,isDInSetOfReachableTilesFromO_StaticBoard1(24,16));}
	@Test public void test_board1_1193(){commonTestCode1(24,17,isDInSetOfReachableTilesFromO_StaticBoard1(24,17));}
	@Test public void test_board1_1194(){commonTestCode1(24,18,isDInSetOfReachableTilesFromO_StaticBoard1(24,18));}
	@Test public void test_board1_1195(){commonTestCode1(24,19,isDInSetOfReachableTilesFromO_StaticBoard1(24,19));}
	@Test public void test_board1_1196(){commonTestCode1(24,20,isDInSetOfReachableTilesFromO_StaticBoard1(24,20));}
	@Test public void test_board1_1197(){commonTestCode1(24,21,isDInSetOfReachableTilesFromO_StaticBoard1(24,21));}
	@Test public void test_board1_1198(){commonTestCode1(24,22,isDInSetOfReachableTilesFromO_StaticBoard1(24,22));}
	@Test public void test_board1_1199(){commonTestCode1(24,23,isDInSetOfReachableTilesFromO_StaticBoard1(24,23));}
	@Test public void test_board1_1200(){commonTestCode1(24,24,isDInSetOfReachableTilesFromO_StaticBoard1(24,24));}
	@Test public void test_board1_1201(){commonTestCode1(24,25,isDInSetOfReachableTilesFromO_StaticBoard1(24,25));}
	@Test public void test_board1_1202(){commonTestCode1(24,26,isDInSetOfReachableTilesFromO_StaticBoard1(24,26));}
	@Test public void test_board1_1203(){commonTestCode1(24,27,isDInSetOfReachableTilesFromO_StaticBoard1(24,27));}
	@Test public void test_board1_1204(){commonTestCode1(24,28,isDInSetOfReachableTilesFromO_StaticBoard1(24,28));}
	@Test public void test_board1_1205(){commonTestCode1(24,29,isDInSetOfReachableTilesFromO_StaticBoard1(24,29));}
	@Test public void test_board1_1206(){commonTestCode1(24,30,isDInSetOfReachableTilesFromO_StaticBoard1(24,30));}
	@Test public void test_board1_1207(){commonTestCode1(24,31,isDInSetOfReachableTilesFromO_StaticBoard1(24,31));}
	@Test public void test_board1_1208(){commonTestCode1(24,32,isDInSetOfReachableTilesFromO_StaticBoard1(24,32));}
	@Test public void test_board1_1209(){commonTestCode1(24,33,isDInSetOfReachableTilesFromO_StaticBoard1(24,33));}
	@Test public void test_board1_1210(){commonTestCode1(24,34,isDInSetOfReachableTilesFromO_StaticBoard1(24,34));}
	@Test public void test_board1_1211(){commonTestCode1(24,35,isDInSetOfReachableTilesFromO_StaticBoard1(24,35));}
	@Test public void test_board1_1212(){commonTestCode1(24,36,isDInSetOfReachableTilesFromO_StaticBoard1(24,36));}
	@Test public void test_board1_1213(){commonTestCode1(24,37,isDInSetOfReachableTilesFromO_StaticBoard1(24,37));}
	@Test public void test_board1_1214(){commonTestCode1(24,38,isDInSetOfReachableTilesFromO_StaticBoard1(24,38));}
	@Test public void test_board1_1215(){commonTestCode1(24,39,isDInSetOfReachableTilesFromO_StaticBoard1(24,39));}
	@Test public void test_board1_1216(){commonTestCode1(24,40,isDInSetOfReachableTilesFromO_StaticBoard1(24,40));}
	@Test public void test_board1_1217(){commonTestCode1(24,41,isDInSetOfReachableTilesFromO_StaticBoard1(24,41));}
	@Test public void test_board1_1218(){commonTestCode1(24,42,isDInSetOfReachableTilesFromO_StaticBoard1(24,42));}
	@Test public void test_board1_1219(){commonTestCode1(24,43,isDInSetOfReachableTilesFromO_StaticBoard1(24,43));}
	@Test public void test_board1_1220(){commonTestCode1(24,44,isDInSetOfReachableTilesFromO_StaticBoard1(24,44));}
	@Test public void test_board1_1221(){commonTestCode1(24,45,isDInSetOfReachableTilesFromO_StaticBoard1(24,45));}
	@Test public void test_board1_1222(){commonTestCode1(24,46,isDInSetOfReachableTilesFromO_StaticBoard1(24,46));}
	@Test public void test_board1_1223(){commonTestCode1(24,47,isDInSetOfReachableTilesFromO_StaticBoard1(24,47));}
	@Test public void test_board1_1224(){commonTestCode1(24,48,isDInSetOfReachableTilesFromO_StaticBoard1(24,48));}
	@Test public void test_board1_1225(){commonTestCode1(25,0,isDInSetOfReachableTilesFromO_StaticBoard1(25,0));}
	@Test public void test_board1_1226(){commonTestCode1(25,1,isDInSetOfReachableTilesFromO_StaticBoard1(25,1));}
	@Test public void test_board1_1227(){commonTestCode1(25,2,isDInSetOfReachableTilesFromO_StaticBoard1(25,2));}
	@Test public void test_board1_1228(){commonTestCode1(25,3,isDInSetOfReachableTilesFromO_StaticBoard1(25,3));}
	@Test public void test_board1_1229(){commonTestCode1(25,4,isDInSetOfReachableTilesFromO_StaticBoard1(25,4));}
	@Test public void test_board1_1230(){commonTestCode1(25,5,isDInSetOfReachableTilesFromO_StaticBoard1(25,5));}
	@Test public void test_board1_1231(){commonTestCode1(25,6,isDInSetOfReachableTilesFromO_StaticBoard1(25,6));}
	@Test public void test_board1_1232(){commonTestCode1(25,7,isDInSetOfReachableTilesFromO_StaticBoard1(25,7));}
	@Test public void test_board1_1233(){commonTestCode1(25,8,isDInSetOfReachableTilesFromO_StaticBoard1(25,8));}
	@Test public void test_board1_1234(){commonTestCode1(25,9,isDInSetOfReachableTilesFromO_StaticBoard1(25,9));}
	@Test public void test_board1_1235(){commonTestCode1(25,10,isDInSetOfReachableTilesFromO_StaticBoard1(25,10));}
	@Test public void test_board1_1236(){commonTestCode1(25,11,isDInSetOfReachableTilesFromO_StaticBoard1(25,11));}
	@Test public void test_board1_1237(){commonTestCode1(25,12,isDInSetOfReachableTilesFromO_StaticBoard1(25,12));}
	@Test public void test_board1_1238(){commonTestCode1(25,13,isDInSetOfReachableTilesFromO_StaticBoard1(25,13));}
	@Test public void test_board1_1239(){commonTestCode1(25,14,isDInSetOfReachableTilesFromO_StaticBoard1(25,14));}
	@Test public void test_board1_1240(){commonTestCode1(25,15,isDInSetOfReachableTilesFromO_StaticBoard1(25,15));}
	@Test public void test_board1_1241(){commonTestCode1(25,16,isDInSetOfReachableTilesFromO_StaticBoard1(25,16));}
	@Test public void test_board1_1242(){commonTestCode1(25,17,isDInSetOfReachableTilesFromO_StaticBoard1(25,17));}
	@Test public void test_board1_1243(){commonTestCode1(25,18,isDInSetOfReachableTilesFromO_StaticBoard1(25,18));}
	@Test public void test_board1_1244(){commonTestCode1(25,19,isDInSetOfReachableTilesFromO_StaticBoard1(25,19));}
	@Test public void test_board1_1245(){commonTestCode1(25,20,isDInSetOfReachableTilesFromO_StaticBoard1(25,20));}
	@Test public void test_board1_1246(){commonTestCode1(25,21,isDInSetOfReachableTilesFromO_StaticBoard1(25,21));}
	@Test public void test_board1_1247(){commonTestCode1(25,22,isDInSetOfReachableTilesFromO_StaticBoard1(25,22));}
	@Test public void test_board1_1248(){commonTestCode1(25,23,isDInSetOfReachableTilesFromO_StaticBoard1(25,23));}
	@Test public void test_board1_1249(){commonTestCode1(25,24,isDInSetOfReachableTilesFromO_StaticBoard1(25,24));}
	@Test public void test_board1_1250(){commonTestCode1(25,25,isDInSetOfReachableTilesFromO_StaticBoard1(25,25));}
	@Test public void test_board1_1251(){commonTestCode1(25,26,isDInSetOfReachableTilesFromO_StaticBoard1(25,26));}
	@Test public void test_board1_1252(){commonTestCode1(25,27,isDInSetOfReachableTilesFromO_StaticBoard1(25,27));}
	@Test public void test_board1_1253(){commonTestCode1(25,28,isDInSetOfReachableTilesFromO_StaticBoard1(25,28));}
	@Test public void test_board1_1254(){commonTestCode1(25,29,isDInSetOfReachableTilesFromO_StaticBoard1(25,29));}
	@Test public void test_board1_1255(){commonTestCode1(25,30,isDInSetOfReachableTilesFromO_StaticBoard1(25,30));}
	@Test public void test_board1_1256(){commonTestCode1(25,31,isDInSetOfReachableTilesFromO_StaticBoard1(25,31));}
	@Test public void test_board1_1257(){commonTestCode1(25,32,isDInSetOfReachableTilesFromO_StaticBoard1(25,32));}
	@Test public void test_board1_1258(){commonTestCode1(25,33,isDInSetOfReachableTilesFromO_StaticBoard1(25,33));}
	@Test public void test_board1_1259(){commonTestCode1(25,34,isDInSetOfReachableTilesFromO_StaticBoard1(25,34));}
	@Test public void test_board1_1260(){commonTestCode1(25,35,isDInSetOfReachableTilesFromO_StaticBoard1(25,35));}
	@Test public void test_board1_1261(){commonTestCode1(25,36,isDInSetOfReachableTilesFromO_StaticBoard1(25,36));}
	@Test public void test_board1_1262(){commonTestCode1(25,37,isDInSetOfReachableTilesFromO_StaticBoard1(25,37));}
	@Test public void test_board1_1263(){commonTestCode1(25,38,isDInSetOfReachableTilesFromO_StaticBoard1(25,38));}
	@Test public void test_board1_1264(){commonTestCode1(25,39,isDInSetOfReachableTilesFromO_StaticBoard1(25,39));}
	@Test public void test_board1_1265(){commonTestCode1(25,40,isDInSetOfReachableTilesFromO_StaticBoard1(25,40));}
	@Test public void test_board1_1266(){commonTestCode1(25,41,isDInSetOfReachableTilesFromO_StaticBoard1(25,41));}
	@Test public void test_board1_1267(){commonTestCode1(25,42,isDInSetOfReachableTilesFromO_StaticBoard1(25,42));}
	@Test public void test_board1_1268(){commonTestCode1(25,43,isDInSetOfReachableTilesFromO_StaticBoard1(25,43));}
	@Test public void test_board1_1269(){commonTestCode1(25,44,isDInSetOfReachableTilesFromO_StaticBoard1(25,44));}
	@Test public void test_board1_1270(){commonTestCode1(25,45,isDInSetOfReachableTilesFromO_StaticBoard1(25,45));}
	@Test public void test_board1_1271(){commonTestCode1(25,46,isDInSetOfReachableTilesFromO_StaticBoard1(25,46));}
	@Test public void test_board1_1272(){commonTestCode1(25,47,isDInSetOfReachableTilesFromO_StaticBoard1(25,47));}
	@Test public void test_board1_1273(){commonTestCode1(25,48,isDInSetOfReachableTilesFromO_StaticBoard1(25,48));}
	@Test public void test_board1_1274(){commonTestCode1(26,0,isDInSetOfReachableTilesFromO_StaticBoard1(26,0));}
	@Test public void test_board1_1275(){commonTestCode1(26,1,isDInSetOfReachableTilesFromO_StaticBoard1(26,1));}
	@Test public void test_board1_1276(){commonTestCode1(26,2,isDInSetOfReachableTilesFromO_StaticBoard1(26,2));}
	@Test public void test_board1_1277(){commonTestCode1(26,3,isDInSetOfReachableTilesFromO_StaticBoard1(26,3));}
	@Test public void test_board1_1278(){commonTestCode1(26,4,isDInSetOfReachableTilesFromO_StaticBoard1(26,4));}
	@Test public void test_board1_1279(){commonTestCode1(26,5,isDInSetOfReachableTilesFromO_StaticBoard1(26,5));}
	@Test public void test_board1_1280(){commonTestCode1(26,6,isDInSetOfReachableTilesFromO_StaticBoard1(26,6));}
	@Test public void test_board1_1281(){commonTestCode1(26,7,isDInSetOfReachableTilesFromO_StaticBoard1(26,7));}
	@Test public void test_board1_1282(){commonTestCode1(26,8,isDInSetOfReachableTilesFromO_StaticBoard1(26,8));}
	@Test public void test_board1_1283(){commonTestCode1(26,9,isDInSetOfReachableTilesFromO_StaticBoard1(26,9));}
	@Test public void test_board1_1284(){commonTestCode1(26,10,isDInSetOfReachableTilesFromO_StaticBoard1(26,10));}
	@Test public void test_board1_1285(){commonTestCode1(26,11,isDInSetOfReachableTilesFromO_StaticBoard1(26,11));}
	@Test public void test_board1_1286(){commonTestCode1(26,12,isDInSetOfReachableTilesFromO_StaticBoard1(26,12));}
	@Test public void test_board1_1287(){commonTestCode1(26,13,isDInSetOfReachableTilesFromO_StaticBoard1(26,13));}
	@Test public void test_board1_1288(){commonTestCode1(26,14,isDInSetOfReachableTilesFromO_StaticBoard1(26,14));}
	@Test public void test_board1_1289(){commonTestCode1(26,15,isDInSetOfReachableTilesFromO_StaticBoard1(26,15));}
	@Test public void test_board1_1290(){commonTestCode1(26,16,isDInSetOfReachableTilesFromO_StaticBoard1(26,16));}
	@Test public void test_board1_1291(){commonTestCode1(26,17,isDInSetOfReachableTilesFromO_StaticBoard1(26,17));}
	@Test public void test_board1_1292(){commonTestCode1(26,18,isDInSetOfReachableTilesFromO_StaticBoard1(26,18));}
	@Test public void test_board1_1293(){commonTestCode1(26,19,isDInSetOfReachableTilesFromO_StaticBoard1(26,19));}
	@Test public void test_board1_1294(){commonTestCode1(26,20,isDInSetOfReachableTilesFromO_StaticBoard1(26,20));}
	@Test public void test_board1_1295(){commonTestCode1(26,21,isDInSetOfReachableTilesFromO_StaticBoard1(26,21));}
	@Test public void test_board1_1296(){commonTestCode1(26,22,isDInSetOfReachableTilesFromO_StaticBoard1(26,22));}
	@Test public void test_board1_1297(){commonTestCode1(26,23,isDInSetOfReachableTilesFromO_StaticBoard1(26,23));}
	@Test public void test_board1_1298(){commonTestCode1(26,24,isDInSetOfReachableTilesFromO_StaticBoard1(26,24));}
	@Test public void test_board1_1299(){commonTestCode1(26,25,isDInSetOfReachableTilesFromO_StaticBoard1(26,25));}
	@Test public void test_board1_1300(){commonTestCode1(26,26,isDInSetOfReachableTilesFromO_StaticBoard1(26,26));}
	@Test public void test_board1_1301(){commonTestCode1(26,27,isDInSetOfReachableTilesFromO_StaticBoard1(26,27));}
	@Test public void test_board1_1302(){commonTestCode1(26,28,isDInSetOfReachableTilesFromO_StaticBoard1(26,28));}
	@Test public void test_board1_1303(){commonTestCode1(26,29,isDInSetOfReachableTilesFromO_StaticBoard1(26,29));}
	@Test public void test_board1_1304(){commonTestCode1(26,30,isDInSetOfReachableTilesFromO_StaticBoard1(26,30));}
	@Test public void test_board1_1305(){commonTestCode1(26,31,isDInSetOfReachableTilesFromO_StaticBoard1(26,31));}
	@Test public void test_board1_1306(){commonTestCode1(26,32,isDInSetOfReachableTilesFromO_StaticBoard1(26,32));}
	@Test public void test_board1_1307(){commonTestCode1(26,33,isDInSetOfReachableTilesFromO_StaticBoard1(26,33));}
	@Test public void test_board1_1308(){commonTestCode1(26,34,isDInSetOfReachableTilesFromO_StaticBoard1(26,34));}
	@Test public void test_board1_1309(){commonTestCode1(26,35,isDInSetOfReachableTilesFromO_StaticBoard1(26,35));}
	@Test public void test_board1_1310(){commonTestCode1(26,36,isDInSetOfReachableTilesFromO_StaticBoard1(26,36));}
	@Test public void test_board1_1311(){commonTestCode1(26,37,isDInSetOfReachableTilesFromO_StaticBoard1(26,37));}
	@Test public void test_board1_1312(){commonTestCode1(26,38,isDInSetOfReachableTilesFromO_StaticBoard1(26,38));}
	@Test public void test_board1_1313(){commonTestCode1(26,39,isDInSetOfReachableTilesFromO_StaticBoard1(26,39));}
	@Test public void test_board1_1314(){commonTestCode1(26,40,isDInSetOfReachableTilesFromO_StaticBoard1(26,40));}
	@Test public void test_board1_1315(){commonTestCode1(26,41,isDInSetOfReachableTilesFromO_StaticBoard1(26,41));}
	@Test public void test_board1_1316(){commonTestCode1(26,42,isDInSetOfReachableTilesFromO_StaticBoard1(26,42));}
	@Test public void test_board1_1317(){commonTestCode1(26,43,isDInSetOfReachableTilesFromO_StaticBoard1(26,43));}
	@Test public void test_board1_1318(){commonTestCode1(26,44,isDInSetOfReachableTilesFromO_StaticBoard1(26,44));}
	@Test public void test_board1_1319(){commonTestCode1(26,45,isDInSetOfReachableTilesFromO_StaticBoard1(26,45));}
	@Test public void test_board1_1320(){commonTestCode1(26,46,isDInSetOfReachableTilesFromO_StaticBoard1(26,46));}
	@Test public void test_board1_1321(){commonTestCode1(26,47,isDInSetOfReachableTilesFromO_StaticBoard1(26,47));}
	@Test public void test_board1_1322(){commonTestCode1(26,48,isDInSetOfReachableTilesFromO_StaticBoard1(26,48));}
	@Test public void test_board1_1323(){commonTestCode1(27,0,isDInSetOfReachableTilesFromO_StaticBoard1(27,0));}
	@Test public void test_board1_1324(){commonTestCode1(27,1,isDInSetOfReachableTilesFromO_StaticBoard1(27,1));}
	@Test public void test_board1_1325(){commonTestCode1(27,2,isDInSetOfReachableTilesFromO_StaticBoard1(27,2));}
	@Test public void test_board1_1326(){commonTestCode1(27,3,isDInSetOfReachableTilesFromO_StaticBoard1(27,3));}
	@Test public void test_board1_1327(){commonTestCode1(27,4,isDInSetOfReachableTilesFromO_StaticBoard1(27,4));}
	@Test public void test_board1_1328(){commonTestCode1(27,5,isDInSetOfReachableTilesFromO_StaticBoard1(27,5));}
	@Test public void test_board1_1329(){commonTestCode1(27,6,isDInSetOfReachableTilesFromO_StaticBoard1(27,6));}
	@Test public void test_board1_1330(){commonTestCode1(27,7,isDInSetOfReachableTilesFromO_StaticBoard1(27,7));}
	@Test public void test_board1_1331(){commonTestCode1(27,8,isDInSetOfReachableTilesFromO_StaticBoard1(27,8));}
	@Test public void test_board1_1332(){commonTestCode1(27,9,isDInSetOfReachableTilesFromO_StaticBoard1(27,9));}
	@Test public void test_board1_1333(){commonTestCode1(27,10,isDInSetOfReachableTilesFromO_StaticBoard1(27,10));}
	@Test public void test_board1_1334(){commonTestCode1(27,11,isDInSetOfReachableTilesFromO_StaticBoard1(27,11));}
	@Test public void test_board1_1335(){commonTestCode1(27,12,isDInSetOfReachableTilesFromO_StaticBoard1(27,12));}
	@Test public void test_board1_1336(){commonTestCode1(27,13,isDInSetOfReachableTilesFromO_StaticBoard1(27,13));}
	@Test public void test_board1_1337(){commonTestCode1(27,14,isDInSetOfReachableTilesFromO_StaticBoard1(27,14));}
	@Test public void test_board1_1338(){commonTestCode1(27,15,isDInSetOfReachableTilesFromO_StaticBoard1(27,15));}
	@Test public void test_board1_1339(){commonTestCode1(27,16,isDInSetOfReachableTilesFromO_StaticBoard1(27,16));}
	@Test public void test_board1_1340(){commonTestCode1(27,17,isDInSetOfReachableTilesFromO_StaticBoard1(27,17));}
	@Test public void test_board1_1341(){commonTestCode1(27,18,isDInSetOfReachableTilesFromO_StaticBoard1(27,18));}
	@Test public void test_board1_1342(){commonTestCode1(27,19,isDInSetOfReachableTilesFromO_StaticBoard1(27,19));}
	@Test public void test_board1_1343(){commonTestCode1(27,20,isDInSetOfReachableTilesFromO_StaticBoard1(27,20));}
	@Test public void test_board1_1344(){commonTestCode1(27,21,isDInSetOfReachableTilesFromO_StaticBoard1(27,21));}
	@Test public void test_board1_1345(){commonTestCode1(27,22,isDInSetOfReachableTilesFromO_StaticBoard1(27,22));}
	@Test public void test_board1_1346(){commonTestCode1(27,23,isDInSetOfReachableTilesFromO_StaticBoard1(27,23));}
	@Test public void test_board1_1347(){commonTestCode1(27,24,isDInSetOfReachableTilesFromO_StaticBoard1(27,24));}
	@Test public void test_board1_1348(){commonTestCode1(27,25,isDInSetOfReachableTilesFromO_StaticBoard1(27,25));}
	@Test public void test_board1_1349(){commonTestCode1(27,26,isDInSetOfReachableTilesFromO_StaticBoard1(27,26));}
	@Test public void test_board1_1350(){commonTestCode1(27,27,isDInSetOfReachableTilesFromO_StaticBoard1(27,27));}
	@Test public void test_board1_1351(){commonTestCode1(27,28,isDInSetOfReachableTilesFromO_StaticBoard1(27,28));}
	@Test public void test_board1_1352(){commonTestCode1(27,29,isDInSetOfReachableTilesFromO_StaticBoard1(27,29));}
	@Test public void test_board1_1353(){commonTestCode1(27,30,isDInSetOfReachableTilesFromO_StaticBoard1(27,30));}
	@Test public void test_board1_1354(){commonTestCode1(27,31,isDInSetOfReachableTilesFromO_StaticBoard1(27,31));}
	@Test public void test_board1_1355(){commonTestCode1(27,32,isDInSetOfReachableTilesFromO_StaticBoard1(27,32));}
	@Test public void test_board1_1356(){commonTestCode1(27,33,isDInSetOfReachableTilesFromO_StaticBoard1(27,33));}
	@Test public void test_board1_1357(){commonTestCode1(27,34,isDInSetOfReachableTilesFromO_StaticBoard1(27,34));}
	@Test public void test_board1_1358(){commonTestCode1(27,35,isDInSetOfReachableTilesFromO_StaticBoard1(27,35));}
	@Test public void test_board1_1359(){commonTestCode1(27,36,isDInSetOfReachableTilesFromO_StaticBoard1(27,36));}
	@Test public void test_board1_1360(){commonTestCode1(27,37,isDInSetOfReachableTilesFromO_StaticBoard1(27,37));}
	@Test public void test_board1_1361(){commonTestCode1(27,38,isDInSetOfReachableTilesFromO_StaticBoard1(27,38));}
	@Test public void test_board1_1362(){commonTestCode1(27,39,isDInSetOfReachableTilesFromO_StaticBoard1(27,39));}
	@Test public void test_board1_1363(){commonTestCode1(27,40,isDInSetOfReachableTilesFromO_StaticBoard1(27,40));}
	@Test public void test_board1_1364(){commonTestCode1(27,41,isDInSetOfReachableTilesFromO_StaticBoard1(27,41));}
	@Test public void test_board1_1365(){commonTestCode1(27,42,isDInSetOfReachableTilesFromO_StaticBoard1(27,42));}
	@Test public void test_board1_1366(){commonTestCode1(27,43,isDInSetOfReachableTilesFromO_StaticBoard1(27,43));}
	@Test public void test_board1_1367(){commonTestCode1(27,44,isDInSetOfReachableTilesFromO_StaticBoard1(27,44));}
	@Test public void test_board1_1368(){commonTestCode1(27,45,isDInSetOfReachableTilesFromO_StaticBoard1(27,45));}
	@Test public void test_board1_1369(){commonTestCode1(27,46,isDInSetOfReachableTilesFromO_StaticBoard1(27,46));}
	@Test public void test_board1_1370(){commonTestCode1(27,47,isDInSetOfReachableTilesFromO_StaticBoard1(27,47));}
	@Test public void test_board1_1371(){commonTestCode1(27,48,isDInSetOfReachableTilesFromO_StaticBoard1(27,48));}
	@Test public void test_board1_1372(){commonTestCode1(28,0,isDInSetOfReachableTilesFromO_StaticBoard1(28,0));}
	@Test public void test_board1_1373(){commonTestCode1(28,1,isDInSetOfReachableTilesFromO_StaticBoard1(28,1));}
	@Test public void test_board1_1374(){commonTestCode1(28,2,isDInSetOfReachableTilesFromO_StaticBoard1(28,2));}
	@Test public void test_board1_1375(){commonTestCode1(28,3,isDInSetOfReachableTilesFromO_StaticBoard1(28,3));}
	@Test public void test_board1_1376(){commonTestCode1(28,4,isDInSetOfReachableTilesFromO_StaticBoard1(28,4));}
	@Test public void test_board1_1377(){commonTestCode1(28,5,isDInSetOfReachableTilesFromO_StaticBoard1(28,5));}
	@Test public void test_board1_1378(){commonTestCode1(28,6,isDInSetOfReachableTilesFromO_StaticBoard1(28,6));}
	@Test public void test_board1_1379(){commonTestCode1(28,7,isDInSetOfReachableTilesFromO_StaticBoard1(28,7));}
	@Test public void test_board1_1380(){commonTestCode1(28,8,isDInSetOfReachableTilesFromO_StaticBoard1(28,8));}
	@Test public void test_board1_1381(){commonTestCode1(28,9,isDInSetOfReachableTilesFromO_StaticBoard1(28,9));}
	@Test public void test_board1_1382(){commonTestCode1(28,10,isDInSetOfReachableTilesFromO_StaticBoard1(28,10));}
	@Test public void test_board1_1383(){commonTestCode1(28,11,isDInSetOfReachableTilesFromO_StaticBoard1(28,11));}
	@Test public void test_board1_1384(){commonTestCode1(28,12,isDInSetOfReachableTilesFromO_StaticBoard1(28,12));}
	@Test public void test_board1_1385(){commonTestCode1(28,13,isDInSetOfReachableTilesFromO_StaticBoard1(28,13));}
	@Test public void test_board1_1386(){commonTestCode1(28,14,isDInSetOfReachableTilesFromO_StaticBoard1(28,14));}
	@Test public void test_board1_1387(){commonTestCode1(28,15,isDInSetOfReachableTilesFromO_StaticBoard1(28,15));}
	@Test public void test_board1_1388(){commonTestCode1(28,16,isDInSetOfReachableTilesFromO_StaticBoard1(28,16));}
	@Test public void test_board1_1389(){commonTestCode1(28,17,isDInSetOfReachableTilesFromO_StaticBoard1(28,17));}
	@Test public void test_board1_1390(){commonTestCode1(28,18,isDInSetOfReachableTilesFromO_StaticBoard1(28,18));}
	@Test public void test_board1_1391(){commonTestCode1(28,19,isDInSetOfReachableTilesFromO_StaticBoard1(28,19));}
	@Test public void test_board1_1392(){commonTestCode1(28,20,isDInSetOfReachableTilesFromO_StaticBoard1(28,20));}
	@Test public void test_board1_1393(){commonTestCode1(28,21,isDInSetOfReachableTilesFromO_StaticBoard1(28,21));}
	@Test public void test_board1_1394(){commonTestCode1(28,22,isDInSetOfReachableTilesFromO_StaticBoard1(28,22));}
	@Test public void test_board1_1395(){commonTestCode1(28,23,isDInSetOfReachableTilesFromO_StaticBoard1(28,23));}
	@Test public void test_board1_1396(){commonTestCode1(28,24,isDInSetOfReachableTilesFromO_StaticBoard1(28,24));}
	@Test public void test_board1_1397(){commonTestCode1(28,25,isDInSetOfReachableTilesFromO_StaticBoard1(28,25));}
	@Test public void test_board1_1398(){commonTestCode1(28,26,isDInSetOfReachableTilesFromO_StaticBoard1(28,26));}
	@Test public void test_board1_1399(){commonTestCode1(28,27,isDInSetOfReachableTilesFromO_StaticBoard1(28,27));}
	@Test public void test_board1_1400(){commonTestCode1(28,28,isDInSetOfReachableTilesFromO_StaticBoard1(28,28));}
	@Test public void test_board1_1401(){commonTestCode1(28,29,isDInSetOfReachableTilesFromO_StaticBoard1(28,29));}
	@Test public void test_board1_1402(){commonTestCode1(28,30,isDInSetOfReachableTilesFromO_StaticBoard1(28,30));}
	@Test public void test_board1_1403(){commonTestCode1(28,31,isDInSetOfReachableTilesFromO_StaticBoard1(28,31));}
	@Test public void test_board1_1404(){commonTestCode1(28,32,isDInSetOfReachableTilesFromO_StaticBoard1(28,32));}
	@Test public void test_board1_1405(){commonTestCode1(28,33,isDInSetOfReachableTilesFromO_StaticBoard1(28,33));}
	@Test public void test_board1_1406(){commonTestCode1(28,34,isDInSetOfReachableTilesFromO_StaticBoard1(28,34));}
	@Test public void test_board1_1407(){commonTestCode1(28,35,isDInSetOfReachableTilesFromO_StaticBoard1(28,35));}
	@Test public void test_board1_1408(){commonTestCode1(28,36,isDInSetOfReachableTilesFromO_StaticBoard1(28,36));}
	@Test public void test_board1_1409(){commonTestCode1(28,37,isDInSetOfReachableTilesFromO_StaticBoard1(28,37));}
	@Test public void test_board1_1410(){commonTestCode1(28,38,isDInSetOfReachableTilesFromO_StaticBoard1(28,38));}
	@Test public void test_board1_1411(){commonTestCode1(28,39,isDInSetOfReachableTilesFromO_StaticBoard1(28,39));}
	@Test public void test_board1_1412(){commonTestCode1(28,40,isDInSetOfReachableTilesFromO_StaticBoard1(28,40));}
	@Test public void test_board1_1413(){commonTestCode1(28,41,isDInSetOfReachableTilesFromO_StaticBoard1(28,41));}
	@Test public void test_board1_1414(){commonTestCode1(28,42,isDInSetOfReachableTilesFromO_StaticBoard1(28,42));}
	@Test public void test_board1_1415(){commonTestCode1(28,43,isDInSetOfReachableTilesFromO_StaticBoard1(28,43));}
	@Test public void test_board1_1416(){commonTestCode1(28,44,isDInSetOfReachableTilesFromO_StaticBoard1(28,44));}
	@Test public void test_board1_1417(){commonTestCode1(28,45,isDInSetOfReachableTilesFromO_StaticBoard1(28,45));}
	@Test public void test_board1_1418(){commonTestCode1(28,46,isDInSetOfReachableTilesFromO_StaticBoard1(28,46));}
	@Test public void test_board1_1419(){commonTestCode1(28,47,isDInSetOfReachableTilesFromO_StaticBoard1(28,47));}
	@Test public void test_board1_1420(){commonTestCode1(28,48,isDInSetOfReachableTilesFromO_StaticBoard1(28,48));}
	@Test public void test_board1_1421(){commonTestCode1(29,0,isDInSetOfReachableTilesFromO_StaticBoard1(29,0));}
	@Test public void test_board1_1422(){commonTestCode1(29,1,isDInSetOfReachableTilesFromO_StaticBoard1(29,1));}
	@Test public void test_board1_1423(){commonTestCode1(29,2,isDInSetOfReachableTilesFromO_StaticBoard1(29,2));}
	@Test public void test_board1_1424(){commonTestCode1(29,3,isDInSetOfReachableTilesFromO_StaticBoard1(29,3));}
	@Test public void test_board1_1425(){commonTestCode1(29,4,isDInSetOfReachableTilesFromO_StaticBoard1(29,4));}
	@Test public void test_board1_1426(){commonTestCode1(29,5,isDInSetOfReachableTilesFromO_StaticBoard1(29,5));}
	@Test public void test_board1_1427(){commonTestCode1(29,6,isDInSetOfReachableTilesFromO_StaticBoard1(29,6));}
	@Test public void test_board1_1428(){commonTestCode1(29,7,isDInSetOfReachableTilesFromO_StaticBoard1(29,7));}
	@Test public void test_board1_1429(){commonTestCode1(29,8,isDInSetOfReachableTilesFromO_StaticBoard1(29,8));}
	@Test public void test_board1_1430(){commonTestCode1(29,9,isDInSetOfReachableTilesFromO_StaticBoard1(29,9));}
	@Test public void test_board1_1431(){commonTestCode1(29,10,isDInSetOfReachableTilesFromO_StaticBoard1(29,10));}
	@Test public void test_board1_1432(){commonTestCode1(29,11,isDInSetOfReachableTilesFromO_StaticBoard1(29,11));}
	@Test public void test_board1_1433(){commonTestCode1(29,12,isDInSetOfReachableTilesFromO_StaticBoard1(29,12));}
	@Test public void test_board1_1434(){commonTestCode1(29,13,isDInSetOfReachableTilesFromO_StaticBoard1(29,13));}
	@Test public void test_board1_1435(){commonTestCode1(29,14,isDInSetOfReachableTilesFromO_StaticBoard1(29,14));}
	@Test public void test_board1_1436(){commonTestCode1(29,15,isDInSetOfReachableTilesFromO_StaticBoard1(29,15));}
	@Test public void test_board1_1437(){commonTestCode1(29,16,isDInSetOfReachableTilesFromO_StaticBoard1(29,16));}
	@Test public void test_board1_1438(){commonTestCode1(29,17,isDInSetOfReachableTilesFromO_StaticBoard1(29,17));}
	@Test public void test_board1_1439(){commonTestCode1(29,18,isDInSetOfReachableTilesFromO_StaticBoard1(29,18));}
	@Test public void test_board1_1440(){commonTestCode1(29,19,isDInSetOfReachableTilesFromO_StaticBoard1(29,19));}
	@Test public void test_board1_1441(){commonTestCode1(29,20,isDInSetOfReachableTilesFromO_StaticBoard1(29,20));}
	@Test public void test_board1_1442(){commonTestCode1(29,21,isDInSetOfReachableTilesFromO_StaticBoard1(29,21));}
	@Test public void test_board1_1443(){commonTestCode1(29,22,isDInSetOfReachableTilesFromO_StaticBoard1(29,22));}
	@Test public void test_board1_1444(){commonTestCode1(29,23,isDInSetOfReachableTilesFromO_StaticBoard1(29,23));}
	@Test public void test_board1_1445(){commonTestCode1(29,24,isDInSetOfReachableTilesFromO_StaticBoard1(29,24));}
	@Test public void test_board1_1446(){commonTestCode1(29,25,isDInSetOfReachableTilesFromO_StaticBoard1(29,25));}
	@Test public void test_board1_1447(){commonTestCode1(29,26,isDInSetOfReachableTilesFromO_StaticBoard1(29,26));}
	@Test public void test_board1_1448(){commonTestCode1(29,27,isDInSetOfReachableTilesFromO_StaticBoard1(29,27));}
	@Test public void test_board1_1449(){commonTestCode1(29,28,isDInSetOfReachableTilesFromO_StaticBoard1(29,28));}
	@Test public void test_board1_1450(){commonTestCode1(29,29,isDInSetOfReachableTilesFromO_StaticBoard1(29,29));}
	@Test public void test_board1_1451(){commonTestCode1(29,30,isDInSetOfReachableTilesFromO_StaticBoard1(29,30));}
	@Test public void test_board1_1452(){commonTestCode1(29,31,isDInSetOfReachableTilesFromO_StaticBoard1(29,31));}
	@Test public void test_board1_1453(){commonTestCode1(29,32,isDInSetOfReachableTilesFromO_StaticBoard1(29,32));}
	@Test public void test_board1_1454(){commonTestCode1(29,33,isDInSetOfReachableTilesFromO_StaticBoard1(29,33));}
	@Test public void test_board1_1455(){commonTestCode1(29,34,isDInSetOfReachableTilesFromO_StaticBoard1(29,34));}
	@Test public void test_board1_1456(){commonTestCode1(29,35,isDInSetOfReachableTilesFromO_StaticBoard1(29,35));}
	@Test public void test_board1_1457(){commonTestCode1(29,36,isDInSetOfReachableTilesFromO_StaticBoard1(29,36));}
	@Test public void test_board1_1458(){commonTestCode1(29,37,isDInSetOfReachableTilesFromO_StaticBoard1(29,37));}
	@Test public void test_board1_1459(){commonTestCode1(29,38,isDInSetOfReachableTilesFromO_StaticBoard1(29,38));}
	@Test public void test_board1_1460(){commonTestCode1(29,39,isDInSetOfReachableTilesFromO_StaticBoard1(29,39));}
	@Test public void test_board1_1461(){commonTestCode1(29,40,isDInSetOfReachableTilesFromO_StaticBoard1(29,40));}
	@Test public void test_board1_1462(){commonTestCode1(29,41,isDInSetOfReachableTilesFromO_StaticBoard1(29,41));}
	@Test public void test_board1_1463(){commonTestCode1(29,42,isDInSetOfReachableTilesFromO_StaticBoard1(29,42));}
	@Test public void test_board1_1464(){commonTestCode1(29,43,isDInSetOfReachableTilesFromO_StaticBoard1(29,43));}
	@Test public void test_board1_1465(){commonTestCode1(29,44,isDInSetOfReachableTilesFromO_StaticBoard1(29,44));}
	@Test public void test_board1_1466(){commonTestCode1(29,45,isDInSetOfReachableTilesFromO_StaticBoard1(29,45));}
	@Test public void test_board1_1467(){commonTestCode1(29,46,isDInSetOfReachableTilesFromO_StaticBoard1(29,46));}
	@Test public void test_board1_1468(){commonTestCode1(29,47,isDInSetOfReachableTilesFromO_StaticBoard1(29,47));}
	@Test public void test_board1_1469(){commonTestCode1(29,48,isDInSetOfReachableTilesFromO_StaticBoard1(29,48));}
	@Test public void test_board1_1470(){commonTestCode1(30,0,isDInSetOfReachableTilesFromO_StaticBoard1(30,0));}
	@Test public void test_board1_1471(){commonTestCode1(30,1,isDInSetOfReachableTilesFromO_StaticBoard1(30,1));}
	@Test public void test_board1_1472(){commonTestCode1(30,2,isDInSetOfReachableTilesFromO_StaticBoard1(30,2));}
	@Test public void test_board1_1473(){commonTestCode1(30,3,isDInSetOfReachableTilesFromO_StaticBoard1(30,3));}
	@Test public void test_board1_1474(){commonTestCode1(30,4,isDInSetOfReachableTilesFromO_StaticBoard1(30,4));}
	@Test public void test_board1_1475(){commonTestCode1(30,5,isDInSetOfReachableTilesFromO_StaticBoard1(30,5));}
	@Test public void test_board1_1476(){commonTestCode1(30,6,isDInSetOfReachableTilesFromO_StaticBoard1(30,6));}
	@Test public void test_board1_1477(){commonTestCode1(30,7,isDInSetOfReachableTilesFromO_StaticBoard1(30,7));}
	@Test public void test_board1_1478(){commonTestCode1(30,8,isDInSetOfReachableTilesFromO_StaticBoard1(30,8));}
	@Test public void test_board1_1479(){commonTestCode1(30,9,isDInSetOfReachableTilesFromO_StaticBoard1(30,9));}
	@Test public void test_board1_1480(){commonTestCode1(30,10,isDInSetOfReachableTilesFromO_StaticBoard1(30,10));}
	@Test public void test_board1_1481(){commonTestCode1(30,11,isDInSetOfReachableTilesFromO_StaticBoard1(30,11));}
	@Test public void test_board1_1482(){commonTestCode1(30,12,isDInSetOfReachableTilesFromO_StaticBoard1(30,12));}
	@Test public void test_board1_1483(){commonTestCode1(30,13,isDInSetOfReachableTilesFromO_StaticBoard1(30,13));}
	@Test public void test_board1_1484(){commonTestCode1(30,14,isDInSetOfReachableTilesFromO_StaticBoard1(30,14));}
	@Test public void test_board1_1485(){commonTestCode1(30,15,isDInSetOfReachableTilesFromO_StaticBoard1(30,15));}
	@Test public void test_board1_1486(){commonTestCode1(30,16,isDInSetOfReachableTilesFromO_StaticBoard1(30,16));}
	@Test public void test_board1_1487(){commonTestCode1(30,17,isDInSetOfReachableTilesFromO_StaticBoard1(30,17));}
	@Test public void test_board1_1488(){commonTestCode1(30,18,isDInSetOfReachableTilesFromO_StaticBoard1(30,18));}
	@Test public void test_board1_1489(){commonTestCode1(30,19,isDInSetOfReachableTilesFromO_StaticBoard1(30,19));}
	@Test public void test_board1_1490(){commonTestCode1(30,20,isDInSetOfReachableTilesFromO_StaticBoard1(30,20));}
	@Test public void test_board1_1491(){commonTestCode1(30,21,isDInSetOfReachableTilesFromO_StaticBoard1(30,21));}
	@Test public void test_board1_1492(){commonTestCode1(30,22,isDInSetOfReachableTilesFromO_StaticBoard1(30,22));}
	@Test public void test_board1_1493(){commonTestCode1(30,23,isDInSetOfReachableTilesFromO_StaticBoard1(30,23));}
	@Test public void test_board1_1494(){commonTestCode1(30,24,isDInSetOfReachableTilesFromO_StaticBoard1(30,24));}
	@Test public void test_board1_1495(){commonTestCode1(30,25,isDInSetOfReachableTilesFromO_StaticBoard1(30,25));}
	@Test public void test_board1_1496(){commonTestCode1(30,26,isDInSetOfReachableTilesFromO_StaticBoard1(30,26));}
	@Test public void test_board1_1497(){commonTestCode1(30,27,isDInSetOfReachableTilesFromO_StaticBoard1(30,27));}
	@Test public void test_board1_1498(){commonTestCode1(30,28,isDInSetOfReachableTilesFromO_StaticBoard1(30,28));}
	@Test public void test_board1_1499(){commonTestCode1(30,29,isDInSetOfReachableTilesFromO_StaticBoard1(30,29));}
	@Test public void test_board1_1500(){commonTestCode1(30,30,isDInSetOfReachableTilesFromO_StaticBoard1(30,30));}
	@Test public void test_board1_1501(){commonTestCode1(30,31,isDInSetOfReachableTilesFromO_StaticBoard1(30,31));}
	@Test public void test_board1_1502(){commonTestCode1(30,32,isDInSetOfReachableTilesFromO_StaticBoard1(30,32));}
	@Test public void test_board1_1503(){commonTestCode1(30,33,isDInSetOfReachableTilesFromO_StaticBoard1(30,33));}
	@Test public void test_board1_1504(){commonTestCode1(30,34,isDInSetOfReachableTilesFromO_StaticBoard1(30,34));}
	@Test public void test_board1_1505(){commonTestCode1(30,35,isDInSetOfReachableTilesFromO_StaticBoard1(30,35));}
	@Test public void test_board1_1506(){commonTestCode1(30,36,isDInSetOfReachableTilesFromO_StaticBoard1(30,36));}
	@Test public void test_board1_1507(){commonTestCode1(30,37,isDInSetOfReachableTilesFromO_StaticBoard1(30,37));}
	@Test public void test_board1_1508(){commonTestCode1(30,38,isDInSetOfReachableTilesFromO_StaticBoard1(30,38));}
	@Test public void test_board1_1509(){commonTestCode1(30,39,isDInSetOfReachableTilesFromO_StaticBoard1(30,39));}
	@Test public void test_board1_1510(){commonTestCode1(30,40,isDInSetOfReachableTilesFromO_StaticBoard1(30,40));}
	@Test public void test_board1_1511(){commonTestCode1(30,41,isDInSetOfReachableTilesFromO_StaticBoard1(30,41));}
	@Test public void test_board1_1512(){commonTestCode1(30,42,isDInSetOfReachableTilesFromO_StaticBoard1(30,42));}
	@Test public void test_board1_1513(){commonTestCode1(30,43,isDInSetOfReachableTilesFromO_StaticBoard1(30,43));}
	@Test public void test_board1_1514(){commonTestCode1(30,44,isDInSetOfReachableTilesFromO_StaticBoard1(30,44));}
	@Test public void test_board1_1515(){commonTestCode1(30,45,isDInSetOfReachableTilesFromO_StaticBoard1(30,45));}
	@Test public void test_board1_1516(){commonTestCode1(30,46,isDInSetOfReachableTilesFromO_StaticBoard1(30,46));}
	@Test public void test_board1_1517(){commonTestCode1(30,47,isDInSetOfReachableTilesFromO_StaticBoard1(30,47));}
	@Test public void test_board1_1518(){commonTestCode1(30,48,isDInSetOfReachableTilesFromO_StaticBoard1(30,48));}
	@Test public void test_board1_1519(){commonTestCode1(31,0,isDInSetOfReachableTilesFromO_StaticBoard1(31,0));}
	@Test public void test_board1_1520(){commonTestCode1(31,1,isDInSetOfReachableTilesFromO_StaticBoard1(31,1));}
	@Test public void test_board1_1521(){commonTestCode1(31,2,isDInSetOfReachableTilesFromO_StaticBoard1(31,2));}
	@Test public void test_board1_1522(){commonTestCode1(31,3,isDInSetOfReachableTilesFromO_StaticBoard1(31,3));}
	@Test public void test_board1_1523(){commonTestCode1(31,4,isDInSetOfReachableTilesFromO_StaticBoard1(31,4));}
	@Test public void test_board1_1524(){commonTestCode1(31,5,isDInSetOfReachableTilesFromO_StaticBoard1(31,5));}
	@Test public void test_board1_1525(){commonTestCode1(31,6,isDInSetOfReachableTilesFromO_StaticBoard1(31,6));}
	@Test public void test_board1_1526(){commonTestCode1(31,7,isDInSetOfReachableTilesFromO_StaticBoard1(31,7));}
	@Test public void test_board1_1527(){commonTestCode1(31,8,isDInSetOfReachableTilesFromO_StaticBoard1(31,8));}
	@Test public void test_board1_1528(){commonTestCode1(31,9,isDInSetOfReachableTilesFromO_StaticBoard1(31,9));}
	@Test public void test_board1_1529(){commonTestCode1(31,10,isDInSetOfReachableTilesFromO_StaticBoard1(31,10));}
	@Test public void test_board1_1530(){commonTestCode1(31,11,isDInSetOfReachableTilesFromO_StaticBoard1(31,11));}
	@Test public void test_board1_1531(){commonTestCode1(31,12,isDInSetOfReachableTilesFromO_StaticBoard1(31,12));}
	@Test public void test_board1_1532(){commonTestCode1(31,13,isDInSetOfReachableTilesFromO_StaticBoard1(31,13));}
	@Test public void test_board1_1533(){commonTestCode1(31,14,isDInSetOfReachableTilesFromO_StaticBoard1(31,14));}
	@Test public void test_board1_1534(){commonTestCode1(31,15,isDInSetOfReachableTilesFromO_StaticBoard1(31,15));}
	@Test public void test_board1_1535(){commonTestCode1(31,16,isDInSetOfReachableTilesFromO_StaticBoard1(31,16));}
	@Test public void test_board1_1536(){commonTestCode1(31,17,isDInSetOfReachableTilesFromO_StaticBoard1(31,17));}
	@Test public void test_board1_1537(){commonTestCode1(31,18,isDInSetOfReachableTilesFromO_StaticBoard1(31,18));}
	@Test public void test_board1_1538(){commonTestCode1(31,19,isDInSetOfReachableTilesFromO_StaticBoard1(31,19));}
	@Test public void test_board1_1539(){commonTestCode1(31,20,isDInSetOfReachableTilesFromO_StaticBoard1(31,20));}
	@Test public void test_board1_1540(){commonTestCode1(31,21,isDInSetOfReachableTilesFromO_StaticBoard1(31,21));}
	@Test public void test_board1_1541(){commonTestCode1(31,22,isDInSetOfReachableTilesFromO_StaticBoard1(31,22));}
	@Test public void test_board1_1542(){commonTestCode1(31,23,isDInSetOfReachableTilesFromO_StaticBoard1(31,23));}
	@Test public void test_board1_1543(){commonTestCode1(31,24,isDInSetOfReachableTilesFromO_StaticBoard1(31,24));}
	@Test public void test_board1_1544(){commonTestCode1(31,25,isDInSetOfReachableTilesFromO_StaticBoard1(31,25));}
	@Test public void test_board1_1545(){commonTestCode1(31,26,isDInSetOfReachableTilesFromO_StaticBoard1(31,26));}
	@Test public void test_board1_1546(){commonTestCode1(31,27,isDInSetOfReachableTilesFromO_StaticBoard1(31,27));}
	@Test public void test_board1_1547(){commonTestCode1(31,28,isDInSetOfReachableTilesFromO_StaticBoard1(31,28));}
	@Test public void test_board1_1548(){commonTestCode1(31,29,isDInSetOfReachableTilesFromO_StaticBoard1(31,29));}
	@Test public void test_board1_1549(){commonTestCode1(31,30,isDInSetOfReachableTilesFromO_StaticBoard1(31,30));}
	@Test public void test_board1_1550(){commonTestCode1(31,31,isDInSetOfReachableTilesFromO_StaticBoard1(31,31));}
	@Test public void test_board1_1551(){commonTestCode1(31,32,isDInSetOfReachableTilesFromO_StaticBoard1(31,32));}
	@Test public void test_board1_1552(){commonTestCode1(31,33,isDInSetOfReachableTilesFromO_StaticBoard1(31,33));}
	@Test public void test_board1_1553(){commonTestCode1(31,34,isDInSetOfReachableTilesFromO_StaticBoard1(31,34));}
	@Test public void test_board1_1554(){commonTestCode1(31,35,isDInSetOfReachableTilesFromO_StaticBoard1(31,35));}
	@Test public void test_board1_1555(){commonTestCode1(31,36,isDInSetOfReachableTilesFromO_StaticBoard1(31,36));}
	@Test public void test_board1_1556(){commonTestCode1(31,37,isDInSetOfReachableTilesFromO_StaticBoard1(31,37));}
	@Test public void test_board1_1557(){commonTestCode1(31,38,isDInSetOfReachableTilesFromO_StaticBoard1(31,38));}
	@Test public void test_board1_1558(){commonTestCode1(31,39,isDInSetOfReachableTilesFromO_StaticBoard1(31,39));}
	@Test public void test_board1_1559(){commonTestCode1(31,40,isDInSetOfReachableTilesFromO_StaticBoard1(31,40));}
	@Test public void test_board1_1560(){commonTestCode1(31,41,isDInSetOfReachableTilesFromO_StaticBoard1(31,41));}
	@Test public void test_board1_1561(){commonTestCode1(31,42,isDInSetOfReachableTilesFromO_StaticBoard1(31,42));}
	@Test public void test_board1_1562(){commonTestCode1(31,43,isDInSetOfReachableTilesFromO_StaticBoard1(31,43));}
	@Test public void test_board1_1563(){commonTestCode1(31,44,isDInSetOfReachableTilesFromO_StaticBoard1(31,44));}
	@Test public void test_board1_1564(){commonTestCode1(31,45,isDInSetOfReachableTilesFromO_StaticBoard1(31,45));}
	@Test public void test_board1_1565(){commonTestCode1(31,46,isDInSetOfReachableTilesFromO_StaticBoard1(31,46));}
	@Test public void test_board1_1566(){commonTestCode1(31,47,isDInSetOfReachableTilesFromO_StaticBoard1(31,47));}
	@Test public void test_board1_1567(){commonTestCode1(31,48,isDInSetOfReachableTilesFromO_StaticBoard1(31,48));}
	@Test public void test_board1_1568(){commonTestCode1(32,0,isDInSetOfReachableTilesFromO_StaticBoard1(32,0));}
	@Test public void test_board1_1569(){commonTestCode1(32,1,isDInSetOfReachableTilesFromO_StaticBoard1(32,1));}
	@Test public void test_board1_1570(){commonTestCode1(32,2,isDInSetOfReachableTilesFromO_StaticBoard1(32,2));}
	@Test public void test_board1_1571(){commonTestCode1(32,3,isDInSetOfReachableTilesFromO_StaticBoard1(32,3));}
	@Test public void test_board1_1572(){commonTestCode1(32,4,isDInSetOfReachableTilesFromO_StaticBoard1(32,4));}
	@Test public void test_board1_1573(){commonTestCode1(32,5,isDInSetOfReachableTilesFromO_StaticBoard1(32,5));}
	@Test public void test_board1_1574(){commonTestCode1(32,6,isDInSetOfReachableTilesFromO_StaticBoard1(32,6));}
	@Test public void test_board1_1575(){commonTestCode1(32,7,isDInSetOfReachableTilesFromO_StaticBoard1(32,7));}
	@Test public void test_board1_1576(){commonTestCode1(32,8,isDInSetOfReachableTilesFromO_StaticBoard1(32,8));}
	@Test public void test_board1_1577(){commonTestCode1(32,9,isDInSetOfReachableTilesFromO_StaticBoard1(32,9));}
	@Test public void test_board1_1578(){commonTestCode1(32,10,isDInSetOfReachableTilesFromO_StaticBoard1(32,10));}
	@Test public void test_board1_1579(){commonTestCode1(32,11,isDInSetOfReachableTilesFromO_StaticBoard1(32,11));}
	@Test public void test_board1_1580(){commonTestCode1(32,12,isDInSetOfReachableTilesFromO_StaticBoard1(32,12));}
	@Test public void test_board1_1581(){commonTestCode1(32,13,isDInSetOfReachableTilesFromO_StaticBoard1(32,13));}
	@Test public void test_board1_1582(){commonTestCode1(32,14,isDInSetOfReachableTilesFromO_StaticBoard1(32,14));}
	@Test public void test_board1_1583(){commonTestCode1(32,15,isDInSetOfReachableTilesFromO_StaticBoard1(32,15));}
	@Test public void test_board1_1584(){commonTestCode1(32,16,isDInSetOfReachableTilesFromO_StaticBoard1(32,16));}
	@Test public void test_board1_1585(){commonTestCode1(32,17,isDInSetOfReachableTilesFromO_StaticBoard1(32,17));}
	@Test public void test_board1_1586(){commonTestCode1(32,18,isDInSetOfReachableTilesFromO_StaticBoard1(32,18));}
	@Test public void test_board1_1587(){commonTestCode1(32,19,isDInSetOfReachableTilesFromO_StaticBoard1(32,19));}
	@Test public void test_board1_1588(){commonTestCode1(32,20,isDInSetOfReachableTilesFromO_StaticBoard1(32,20));}
	@Test public void test_board1_1589(){commonTestCode1(32,21,isDInSetOfReachableTilesFromO_StaticBoard1(32,21));}
	@Test public void test_board1_1590(){commonTestCode1(32,22,isDInSetOfReachableTilesFromO_StaticBoard1(32,22));}
	@Test public void test_board1_1591(){commonTestCode1(32,23,isDInSetOfReachableTilesFromO_StaticBoard1(32,23));}
	@Test public void test_board1_1592(){commonTestCode1(32,24,isDInSetOfReachableTilesFromO_StaticBoard1(32,24));}
	@Test public void test_board1_1593(){commonTestCode1(32,25,isDInSetOfReachableTilesFromO_StaticBoard1(32,25));}
	@Test public void test_board1_1594(){commonTestCode1(32,26,isDInSetOfReachableTilesFromO_StaticBoard1(32,26));}
	@Test public void test_board1_1595(){commonTestCode1(32,27,isDInSetOfReachableTilesFromO_StaticBoard1(32,27));}
	@Test public void test_board1_1596(){commonTestCode1(32,28,isDInSetOfReachableTilesFromO_StaticBoard1(32,28));}
	@Test public void test_board1_1597(){commonTestCode1(32,29,isDInSetOfReachableTilesFromO_StaticBoard1(32,29));}
	@Test public void test_board1_1598(){commonTestCode1(32,30,isDInSetOfReachableTilesFromO_StaticBoard1(32,30));}
	@Test public void test_board1_1599(){commonTestCode1(32,31,isDInSetOfReachableTilesFromO_StaticBoard1(32,31));}
	@Test public void test_board1_1600(){commonTestCode1(32,32,isDInSetOfReachableTilesFromO_StaticBoard1(32,32));}
	@Test public void test_board1_1601(){commonTestCode1(32,33,isDInSetOfReachableTilesFromO_StaticBoard1(32,33));}
	@Test public void test_board1_1602(){commonTestCode1(32,34,isDInSetOfReachableTilesFromO_StaticBoard1(32,34));}
	@Test public void test_board1_1603(){commonTestCode1(32,35,isDInSetOfReachableTilesFromO_StaticBoard1(32,35));}
	@Test public void test_board1_1604(){commonTestCode1(32,36,isDInSetOfReachableTilesFromO_StaticBoard1(32,36));}
	@Test public void test_board1_1605(){commonTestCode1(32,37,isDInSetOfReachableTilesFromO_StaticBoard1(32,37));}
	@Test public void test_board1_1606(){commonTestCode1(32,38,isDInSetOfReachableTilesFromO_StaticBoard1(32,38));}
	@Test public void test_board1_1607(){commonTestCode1(32,39,isDInSetOfReachableTilesFromO_StaticBoard1(32,39));}
	@Test public void test_board1_1608(){commonTestCode1(32,40,isDInSetOfReachableTilesFromO_StaticBoard1(32,40));}
	@Test public void test_board1_1609(){commonTestCode1(32,41,isDInSetOfReachableTilesFromO_StaticBoard1(32,41));}
	@Test public void test_board1_1610(){commonTestCode1(32,42,isDInSetOfReachableTilesFromO_StaticBoard1(32,42));}
	@Test public void test_board1_1611(){commonTestCode1(32,43,isDInSetOfReachableTilesFromO_StaticBoard1(32,43));}
	@Test public void test_board1_1612(){commonTestCode1(32,44,isDInSetOfReachableTilesFromO_StaticBoard1(32,44));}
	@Test public void test_board1_1613(){commonTestCode1(32,45,isDInSetOfReachableTilesFromO_StaticBoard1(32,45));}
	@Test public void test_board1_1614(){commonTestCode1(32,46,isDInSetOfReachableTilesFromO_StaticBoard1(32,46));}
	@Test public void test_board1_1615(){commonTestCode1(32,47,isDInSetOfReachableTilesFromO_StaticBoard1(32,47));}
	@Test public void test_board1_1616(){commonTestCode1(32,48,isDInSetOfReachableTilesFromO_StaticBoard1(32,48));}
	@Test public void test_board1_1617(){commonTestCode1(33,0,isDInSetOfReachableTilesFromO_StaticBoard1(33,0));}
	@Test public void test_board1_1618(){commonTestCode1(33,1,isDInSetOfReachableTilesFromO_StaticBoard1(33,1));}
	@Test public void test_board1_1619(){commonTestCode1(33,2,isDInSetOfReachableTilesFromO_StaticBoard1(33,2));}
	@Test public void test_board1_1620(){commonTestCode1(33,3,isDInSetOfReachableTilesFromO_StaticBoard1(33,3));}
	@Test public void test_board1_1621(){commonTestCode1(33,4,isDInSetOfReachableTilesFromO_StaticBoard1(33,4));}
	@Test public void test_board1_1622(){commonTestCode1(33,5,isDInSetOfReachableTilesFromO_StaticBoard1(33,5));}
	@Test public void test_board1_1623(){commonTestCode1(33,6,isDInSetOfReachableTilesFromO_StaticBoard1(33,6));}
	@Test public void test_board1_1624(){commonTestCode1(33,7,isDInSetOfReachableTilesFromO_StaticBoard1(33,7));}
	@Test public void test_board1_1625(){commonTestCode1(33,8,isDInSetOfReachableTilesFromO_StaticBoard1(33,8));}
	@Test public void test_board1_1626(){commonTestCode1(33,9,isDInSetOfReachableTilesFromO_StaticBoard1(33,9));}
	@Test public void test_board1_1627(){commonTestCode1(33,10,isDInSetOfReachableTilesFromO_StaticBoard1(33,10));}
	@Test public void test_board1_1628(){commonTestCode1(33,11,isDInSetOfReachableTilesFromO_StaticBoard1(33,11));}
	@Test public void test_board1_1629(){commonTestCode1(33,12,isDInSetOfReachableTilesFromO_StaticBoard1(33,12));}
	@Test public void test_board1_1630(){commonTestCode1(33,13,isDInSetOfReachableTilesFromO_StaticBoard1(33,13));}
	@Test public void test_board1_1631(){commonTestCode1(33,14,isDInSetOfReachableTilesFromO_StaticBoard1(33,14));}
	@Test public void test_board1_1632(){commonTestCode1(33,15,isDInSetOfReachableTilesFromO_StaticBoard1(33,15));}
	@Test public void test_board1_1633(){commonTestCode1(33,16,isDInSetOfReachableTilesFromO_StaticBoard1(33,16));}
	@Test public void test_board1_1634(){commonTestCode1(33,17,isDInSetOfReachableTilesFromO_StaticBoard1(33,17));}
	@Test public void test_board1_1635(){commonTestCode1(33,18,isDInSetOfReachableTilesFromO_StaticBoard1(33,18));}
	@Test public void test_board1_1636(){commonTestCode1(33,19,isDInSetOfReachableTilesFromO_StaticBoard1(33,19));}
	@Test public void test_board1_1637(){commonTestCode1(33,20,isDInSetOfReachableTilesFromO_StaticBoard1(33,20));}
	@Test public void test_board1_1638(){commonTestCode1(33,21,isDInSetOfReachableTilesFromO_StaticBoard1(33,21));}
	@Test public void test_board1_1639(){commonTestCode1(33,22,isDInSetOfReachableTilesFromO_StaticBoard1(33,22));}
	@Test public void test_board1_1640(){commonTestCode1(33,23,isDInSetOfReachableTilesFromO_StaticBoard1(33,23));}
	@Test public void test_board1_1641(){commonTestCode1(33,24,isDInSetOfReachableTilesFromO_StaticBoard1(33,24));}
	@Test public void test_board1_1642(){commonTestCode1(33,25,isDInSetOfReachableTilesFromO_StaticBoard1(33,25));}
	@Test public void test_board1_1643(){commonTestCode1(33,26,isDInSetOfReachableTilesFromO_StaticBoard1(33,26));}
	@Test public void test_board1_1644(){commonTestCode1(33,27,isDInSetOfReachableTilesFromO_StaticBoard1(33,27));}
	@Test public void test_board1_1645(){commonTestCode1(33,28,isDInSetOfReachableTilesFromO_StaticBoard1(33,28));}
	@Test public void test_board1_1646(){commonTestCode1(33,29,isDInSetOfReachableTilesFromO_StaticBoard1(33,29));}
	@Test public void test_board1_1647(){commonTestCode1(33,30,isDInSetOfReachableTilesFromO_StaticBoard1(33,30));}
	@Test public void test_board1_1648(){commonTestCode1(33,31,isDInSetOfReachableTilesFromO_StaticBoard1(33,31));}
	@Test public void test_board1_1649(){commonTestCode1(33,32,isDInSetOfReachableTilesFromO_StaticBoard1(33,32));}
	@Test public void test_board1_1650(){commonTestCode1(33,33,isDInSetOfReachableTilesFromO_StaticBoard1(33,33));}
	@Test public void test_board1_1651(){commonTestCode1(33,34,isDInSetOfReachableTilesFromO_StaticBoard1(33,34));}
	@Test public void test_board1_1652(){commonTestCode1(33,35,isDInSetOfReachableTilesFromO_StaticBoard1(33,35));}
	@Test public void test_board1_1653(){commonTestCode1(33,36,isDInSetOfReachableTilesFromO_StaticBoard1(33,36));}
	@Test public void test_board1_1654(){commonTestCode1(33,37,isDInSetOfReachableTilesFromO_StaticBoard1(33,37));}
	@Test public void test_board1_1655(){commonTestCode1(33,38,isDInSetOfReachableTilesFromO_StaticBoard1(33,38));}
	@Test public void test_board1_1656(){commonTestCode1(33,39,isDInSetOfReachableTilesFromO_StaticBoard1(33,39));}
	@Test public void test_board1_1657(){commonTestCode1(33,40,isDInSetOfReachableTilesFromO_StaticBoard1(33,40));}
	@Test public void test_board1_1658(){commonTestCode1(33,41,isDInSetOfReachableTilesFromO_StaticBoard1(33,41));}
	@Test public void test_board1_1659(){commonTestCode1(33,42,isDInSetOfReachableTilesFromO_StaticBoard1(33,42));}
	@Test public void test_board1_1660(){commonTestCode1(33,43,isDInSetOfReachableTilesFromO_StaticBoard1(33,43));}
	@Test public void test_board1_1661(){commonTestCode1(33,44,isDInSetOfReachableTilesFromO_StaticBoard1(33,44));}
	@Test public void test_board1_1662(){commonTestCode1(33,45,isDInSetOfReachableTilesFromO_StaticBoard1(33,45));}
	@Test public void test_board1_1663(){commonTestCode1(33,46,isDInSetOfReachableTilesFromO_StaticBoard1(33,46));}
	@Test public void test_board1_1664(){commonTestCode1(33,47,isDInSetOfReachableTilesFromO_StaticBoard1(33,47));}
	@Test public void test_board1_1665(){commonTestCode1(33,48,isDInSetOfReachableTilesFromO_StaticBoard1(33,48));}
	@Test public void test_board1_1666(){commonTestCode1(34,0,isDInSetOfReachableTilesFromO_StaticBoard1(34,0));}
	@Test public void test_board1_1667(){commonTestCode1(34,1,isDInSetOfReachableTilesFromO_StaticBoard1(34,1));}
	@Test public void test_board1_1668(){commonTestCode1(34,2,isDInSetOfReachableTilesFromO_StaticBoard1(34,2));}
	@Test public void test_board1_1669(){commonTestCode1(34,3,isDInSetOfReachableTilesFromO_StaticBoard1(34,3));}
	@Test public void test_board1_1670(){commonTestCode1(34,4,isDInSetOfReachableTilesFromO_StaticBoard1(34,4));}
	@Test public void test_board1_1671(){commonTestCode1(34,5,isDInSetOfReachableTilesFromO_StaticBoard1(34,5));}
	@Test public void test_board1_1672(){commonTestCode1(34,6,isDInSetOfReachableTilesFromO_StaticBoard1(34,6));}
	@Test public void test_board1_1673(){commonTestCode1(34,7,isDInSetOfReachableTilesFromO_StaticBoard1(34,7));}
	@Test public void test_board1_1674(){commonTestCode1(34,8,isDInSetOfReachableTilesFromO_StaticBoard1(34,8));}
	@Test public void test_board1_1675(){commonTestCode1(34,9,isDInSetOfReachableTilesFromO_StaticBoard1(34,9));}
	@Test public void test_board1_1676(){commonTestCode1(34,10,isDInSetOfReachableTilesFromO_StaticBoard1(34,10));}
	@Test public void test_board1_1677(){commonTestCode1(34,11,isDInSetOfReachableTilesFromO_StaticBoard1(34,11));}
	@Test public void test_board1_1678(){commonTestCode1(34,12,isDInSetOfReachableTilesFromO_StaticBoard1(34,12));}
	@Test public void test_board1_1679(){commonTestCode1(34,13,isDInSetOfReachableTilesFromO_StaticBoard1(34,13));}
	@Test public void test_board1_1680(){commonTestCode1(34,14,isDInSetOfReachableTilesFromO_StaticBoard1(34,14));}
	@Test public void test_board1_1681(){commonTestCode1(34,15,isDInSetOfReachableTilesFromO_StaticBoard1(34,15));}
	@Test public void test_board1_1682(){commonTestCode1(34,16,isDInSetOfReachableTilesFromO_StaticBoard1(34,16));}
	@Test public void test_board1_1683(){commonTestCode1(34,17,isDInSetOfReachableTilesFromO_StaticBoard1(34,17));}
	@Test public void test_board1_1684(){commonTestCode1(34,18,isDInSetOfReachableTilesFromO_StaticBoard1(34,18));}
	@Test public void test_board1_1685(){commonTestCode1(34,19,isDInSetOfReachableTilesFromO_StaticBoard1(34,19));}
	@Test public void test_board1_1686(){commonTestCode1(34,20,isDInSetOfReachableTilesFromO_StaticBoard1(34,20));}
	@Test public void test_board1_1687(){commonTestCode1(34,21,isDInSetOfReachableTilesFromO_StaticBoard1(34,21));}
	@Test public void test_board1_1688(){commonTestCode1(34,22,isDInSetOfReachableTilesFromO_StaticBoard1(34,22));}
	@Test public void test_board1_1689(){commonTestCode1(34,23,isDInSetOfReachableTilesFromO_StaticBoard1(34,23));}
	@Test public void test_board1_1690(){commonTestCode1(34,24,isDInSetOfReachableTilesFromO_StaticBoard1(34,24));}
	@Test public void test_board1_1691(){commonTestCode1(34,25,isDInSetOfReachableTilesFromO_StaticBoard1(34,25));}
	@Test public void test_board1_1692(){commonTestCode1(34,26,isDInSetOfReachableTilesFromO_StaticBoard1(34,26));}
	@Test public void test_board1_1693(){commonTestCode1(34,27,isDInSetOfReachableTilesFromO_StaticBoard1(34,27));}
	@Test public void test_board1_1694(){commonTestCode1(34,28,isDInSetOfReachableTilesFromO_StaticBoard1(34,28));}
	@Test public void test_board1_1695(){commonTestCode1(34,29,isDInSetOfReachableTilesFromO_StaticBoard1(34,29));}
	@Test public void test_board1_1696(){commonTestCode1(34,30,isDInSetOfReachableTilesFromO_StaticBoard1(34,30));}
	@Test public void test_board1_1697(){commonTestCode1(34,31,isDInSetOfReachableTilesFromO_StaticBoard1(34,31));}
	@Test public void test_board1_1698(){commonTestCode1(34,32,isDInSetOfReachableTilesFromO_StaticBoard1(34,32));}
	@Test public void test_board1_1699(){commonTestCode1(34,33,isDInSetOfReachableTilesFromO_StaticBoard1(34,33));}
	@Test public void test_board1_1700(){commonTestCode1(34,34,isDInSetOfReachableTilesFromO_StaticBoard1(34,34));}
	@Test public void test_board1_1701(){commonTestCode1(34,35,isDInSetOfReachableTilesFromO_StaticBoard1(34,35));}
	@Test public void test_board1_1702(){commonTestCode1(34,36,isDInSetOfReachableTilesFromO_StaticBoard1(34,36));}
	@Test public void test_board1_1703(){commonTestCode1(34,37,isDInSetOfReachableTilesFromO_StaticBoard1(34,37));}
	@Test public void test_board1_1704(){commonTestCode1(34,38,isDInSetOfReachableTilesFromO_StaticBoard1(34,38));}
	@Test public void test_board1_1705(){commonTestCode1(34,39,isDInSetOfReachableTilesFromO_StaticBoard1(34,39));}
	@Test public void test_board1_1706(){commonTestCode1(34,40,isDInSetOfReachableTilesFromO_StaticBoard1(34,40));}
	@Test public void test_board1_1707(){commonTestCode1(34,41,isDInSetOfReachableTilesFromO_StaticBoard1(34,41));}
	@Test public void test_board1_1708(){commonTestCode1(34,42,isDInSetOfReachableTilesFromO_StaticBoard1(34,42));}
	@Test public void test_board1_1709(){commonTestCode1(34,43,isDInSetOfReachableTilesFromO_StaticBoard1(34,43));}
	@Test public void test_board1_1710(){commonTestCode1(34,44,isDInSetOfReachableTilesFromO_StaticBoard1(34,44));}
	@Test public void test_board1_1711(){commonTestCode1(34,45,isDInSetOfReachableTilesFromO_StaticBoard1(34,45));}
	@Test public void test_board1_1712(){commonTestCode1(34,46,isDInSetOfReachableTilesFromO_StaticBoard1(34,46));}
	@Test public void test_board1_1713(){commonTestCode1(34,47,isDInSetOfReachableTilesFromO_StaticBoard1(34,47));}
	@Test public void test_board1_1714(){commonTestCode1(34,48,isDInSetOfReachableTilesFromO_StaticBoard1(34,48));}
	@Test public void test_board1_1715(){commonTestCode1(35,0,isDInSetOfReachableTilesFromO_StaticBoard1(35,0));}
	@Test public void test_board1_1716(){commonTestCode1(35,1,isDInSetOfReachableTilesFromO_StaticBoard1(35,1));}
	@Test public void test_board1_1717(){commonTestCode1(35,2,isDInSetOfReachableTilesFromO_StaticBoard1(35,2));}
	@Test public void test_board1_1718(){commonTestCode1(35,3,isDInSetOfReachableTilesFromO_StaticBoard1(35,3));}
	@Test public void test_board1_1719(){commonTestCode1(35,4,isDInSetOfReachableTilesFromO_StaticBoard1(35,4));}
	@Test public void test_board1_1720(){commonTestCode1(35,5,isDInSetOfReachableTilesFromO_StaticBoard1(35,5));}
	@Test public void test_board1_1721(){commonTestCode1(35,6,isDInSetOfReachableTilesFromO_StaticBoard1(35,6));}
	@Test public void test_board1_1722(){commonTestCode1(35,7,isDInSetOfReachableTilesFromO_StaticBoard1(35,7));}
	@Test public void test_board1_1723(){commonTestCode1(35,8,isDInSetOfReachableTilesFromO_StaticBoard1(35,8));}
	@Test public void test_board1_1724(){commonTestCode1(35,9,isDInSetOfReachableTilesFromO_StaticBoard1(35,9));}
	@Test public void test_board1_1725(){commonTestCode1(35,10,isDInSetOfReachableTilesFromO_StaticBoard1(35,10));}
	@Test public void test_board1_1726(){commonTestCode1(35,11,isDInSetOfReachableTilesFromO_StaticBoard1(35,11));}
	@Test public void test_board1_1727(){commonTestCode1(35,12,isDInSetOfReachableTilesFromO_StaticBoard1(35,12));}
	@Test public void test_board1_1728(){commonTestCode1(35,13,isDInSetOfReachableTilesFromO_StaticBoard1(35,13));}
	@Test public void test_board1_1729(){commonTestCode1(35,14,isDInSetOfReachableTilesFromO_StaticBoard1(35,14));}
	@Test public void test_board1_1730(){commonTestCode1(35,15,isDInSetOfReachableTilesFromO_StaticBoard1(35,15));}
	@Test public void test_board1_1731(){commonTestCode1(35,16,isDInSetOfReachableTilesFromO_StaticBoard1(35,16));}
	@Test public void test_board1_1732(){commonTestCode1(35,17,isDInSetOfReachableTilesFromO_StaticBoard1(35,17));}
	@Test public void test_board1_1733(){commonTestCode1(35,18,isDInSetOfReachableTilesFromO_StaticBoard1(35,18));}
	@Test public void test_board1_1734(){commonTestCode1(35,19,isDInSetOfReachableTilesFromO_StaticBoard1(35,19));}
	@Test public void test_board1_1735(){commonTestCode1(35,20,isDInSetOfReachableTilesFromO_StaticBoard1(35,20));}
	@Test public void test_board1_1736(){commonTestCode1(35,21,isDInSetOfReachableTilesFromO_StaticBoard1(35,21));}
	@Test public void test_board1_1737(){commonTestCode1(35,22,isDInSetOfReachableTilesFromO_StaticBoard1(35,22));}
	@Test public void test_board1_1738(){commonTestCode1(35,23,isDInSetOfReachableTilesFromO_StaticBoard1(35,23));}
	@Test public void test_board1_1739(){commonTestCode1(35,24,isDInSetOfReachableTilesFromO_StaticBoard1(35,24));}
	@Test public void test_board1_1740(){commonTestCode1(35,25,isDInSetOfReachableTilesFromO_StaticBoard1(35,25));}
	@Test public void test_board1_1741(){commonTestCode1(35,26,isDInSetOfReachableTilesFromO_StaticBoard1(35,26));}
	@Test public void test_board1_1742(){commonTestCode1(35,27,isDInSetOfReachableTilesFromO_StaticBoard1(35,27));}
	@Test public void test_board1_1743(){commonTestCode1(35,28,isDInSetOfReachableTilesFromO_StaticBoard1(35,28));}
	@Test public void test_board1_1744(){commonTestCode1(35,29,isDInSetOfReachableTilesFromO_StaticBoard1(35,29));}
	@Test public void test_board1_1745(){commonTestCode1(35,30,isDInSetOfReachableTilesFromO_StaticBoard1(35,30));}
	@Test public void test_board1_1746(){commonTestCode1(35,31,isDInSetOfReachableTilesFromO_StaticBoard1(35,31));}
	@Test public void test_board1_1747(){commonTestCode1(35,32,isDInSetOfReachableTilesFromO_StaticBoard1(35,32));}
	@Test public void test_board1_1748(){commonTestCode1(35,33,isDInSetOfReachableTilesFromO_StaticBoard1(35,33));}
	@Test public void test_board1_1749(){commonTestCode1(35,34,isDInSetOfReachableTilesFromO_StaticBoard1(35,34));}
	@Test public void test_board1_1750(){commonTestCode1(35,35,isDInSetOfReachableTilesFromO_StaticBoard1(35,35));}
	@Test public void test_board1_1751(){commonTestCode1(35,36,isDInSetOfReachableTilesFromO_StaticBoard1(35,36));}
	@Test public void test_board1_1752(){commonTestCode1(35,37,isDInSetOfReachableTilesFromO_StaticBoard1(35,37));}
	@Test public void test_board1_1753(){commonTestCode1(35,38,isDInSetOfReachableTilesFromO_StaticBoard1(35,38));}
	@Test public void test_board1_1754(){commonTestCode1(35,39,isDInSetOfReachableTilesFromO_StaticBoard1(35,39));}
	@Test public void test_board1_1755(){commonTestCode1(35,40,isDInSetOfReachableTilesFromO_StaticBoard1(35,40));}
	@Test public void test_board1_1756(){commonTestCode1(35,41,isDInSetOfReachableTilesFromO_StaticBoard1(35,41));}
	@Test public void test_board1_1757(){commonTestCode1(35,42,isDInSetOfReachableTilesFromO_StaticBoard1(35,42));}
	@Test public void test_board1_1758(){commonTestCode1(35,43,isDInSetOfReachableTilesFromO_StaticBoard1(35,43));}
	@Test public void test_board1_1759(){commonTestCode1(35,44,isDInSetOfReachableTilesFromO_StaticBoard1(35,44));}
	@Test public void test_board1_1760(){commonTestCode1(35,45,isDInSetOfReachableTilesFromO_StaticBoard1(35,45));}
	@Test public void test_board1_1761(){commonTestCode1(35,46,isDInSetOfReachableTilesFromO_StaticBoard1(35,46));}
	@Test public void test_board1_1762(){commonTestCode1(35,47,isDInSetOfReachableTilesFromO_StaticBoard1(35,47));}
	@Test public void test_board1_1763(){commonTestCode1(35,48,isDInSetOfReachableTilesFromO_StaticBoard1(35,48));}
	@Test public void test_board1_1764(){commonTestCode1(36,0,isDInSetOfReachableTilesFromO_StaticBoard1(36,0));}
	@Test public void test_board1_1765(){commonTestCode1(36,1,isDInSetOfReachableTilesFromO_StaticBoard1(36,1));}
	@Test public void test_board1_1766(){commonTestCode1(36,2,isDInSetOfReachableTilesFromO_StaticBoard1(36,2));}
	@Test public void test_board1_1767(){commonTestCode1(36,3,isDInSetOfReachableTilesFromO_StaticBoard1(36,3));}
	@Test public void test_board1_1768(){commonTestCode1(36,4,isDInSetOfReachableTilesFromO_StaticBoard1(36,4));}
	@Test public void test_board1_1769(){commonTestCode1(36,5,isDInSetOfReachableTilesFromO_StaticBoard1(36,5));}
	@Test public void test_board1_1770(){commonTestCode1(36,6,isDInSetOfReachableTilesFromO_StaticBoard1(36,6));}
	@Test public void test_board1_1771(){commonTestCode1(36,7,isDInSetOfReachableTilesFromO_StaticBoard1(36,7));}
	@Test public void test_board1_1772(){commonTestCode1(36,8,isDInSetOfReachableTilesFromO_StaticBoard1(36,8));}
	@Test public void test_board1_1773(){commonTestCode1(36,9,isDInSetOfReachableTilesFromO_StaticBoard1(36,9));}
	@Test public void test_board1_1774(){commonTestCode1(36,10,isDInSetOfReachableTilesFromO_StaticBoard1(36,10));}
	@Test public void test_board1_1775(){commonTestCode1(36,11,isDInSetOfReachableTilesFromO_StaticBoard1(36,11));}
	@Test public void test_board1_1776(){commonTestCode1(36,12,isDInSetOfReachableTilesFromO_StaticBoard1(36,12));}
	@Test public void test_board1_1777(){commonTestCode1(36,13,isDInSetOfReachableTilesFromO_StaticBoard1(36,13));}
	@Test public void test_board1_1778(){commonTestCode1(36,14,isDInSetOfReachableTilesFromO_StaticBoard1(36,14));}
	@Test public void test_board1_1779(){commonTestCode1(36,15,isDInSetOfReachableTilesFromO_StaticBoard1(36,15));}
	@Test public void test_board1_1780(){commonTestCode1(36,16,isDInSetOfReachableTilesFromO_StaticBoard1(36,16));}
	@Test public void test_board1_1781(){commonTestCode1(36,17,isDInSetOfReachableTilesFromO_StaticBoard1(36,17));}
	@Test public void test_board1_1782(){commonTestCode1(36,18,isDInSetOfReachableTilesFromO_StaticBoard1(36,18));}
	@Test public void test_board1_1783(){commonTestCode1(36,19,isDInSetOfReachableTilesFromO_StaticBoard1(36,19));}
	@Test public void test_board1_1784(){commonTestCode1(36,20,isDInSetOfReachableTilesFromO_StaticBoard1(36,20));}
	@Test public void test_board1_1785(){commonTestCode1(36,21,isDInSetOfReachableTilesFromO_StaticBoard1(36,21));}
	@Test public void test_board1_1786(){commonTestCode1(36,22,isDInSetOfReachableTilesFromO_StaticBoard1(36,22));}
	@Test public void test_board1_1787(){commonTestCode1(36,23,isDInSetOfReachableTilesFromO_StaticBoard1(36,23));}
	@Test public void test_board1_1788(){commonTestCode1(36,24,isDInSetOfReachableTilesFromO_StaticBoard1(36,24));}
	@Test public void test_board1_1789(){commonTestCode1(36,25,isDInSetOfReachableTilesFromO_StaticBoard1(36,25));}
	@Test public void test_board1_1790(){commonTestCode1(36,26,isDInSetOfReachableTilesFromO_StaticBoard1(36,26));}
	@Test public void test_board1_1791(){commonTestCode1(36,27,isDInSetOfReachableTilesFromO_StaticBoard1(36,27));}
	@Test public void test_board1_1792(){commonTestCode1(36,28,isDInSetOfReachableTilesFromO_StaticBoard1(36,28));}
	@Test public void test_board1_1793(){commonTestCode1(36,29,isDInSetOfReachableTilesFromO_StaticBoard1(36,29));}
	@Test public void test_board1_1794(){commonTestCode1(36,30,isDInSetOfReachableTilesFromO_StaticBoard1(36,30));}
	@Test public void test_board1_1795(){commonTestCode1(36,31,isDInSetOfReachableTilesFromO_StaticBoard1(36,31));}
	@Test public void test_board1_1796(){commonTestCode1(36,32,isDInSetOfReachableTilesFromO_StaticBoard1(36,32));}
	@Test public void test_board1_1797(){commonTestCode1(36,33,isDInSetOfReachableTilesFromO_StaticBoard1(36,33));}
	@Test public void test_board1_1798(){commonTestCode1(36,34,isDInSetOfReachableTilesFromO_StaticBoard1(36,34));}
	@Test public void test_board1_1799(){commonTestCode1(36,35,isDInSetOfReachableTilesFromO_StaticBoard1(36,35));}
	@Test public void test_board1_1800(){commonTestCode1(36,36,isDInSetOfReachableTilesFromO_StaticBoard1(36,36));}
	@Test public void test_board1_1801(){commonTestCode1(36,37,isDInSetOfReachableTilesFromO_StaticBoard1(36,37));}
	@Test public void test_board1_1802(){commonTestCode1(36,38,isDInSetOfReachableTilesFromO_StaticBoard1(36,38));}
	@Test public void test_board1_1803(){commonTestCode1(36,39,isDInSetOfReachableTilesFromO_StaticBoard1(36,39));}
	@Test public void test_board1_1804(){commonTestCode1(36,40,isDInSetOfReachableTilesFromO_StaticBoard1(36,40));}
	@Test public void test_board1_1805(){commonTestCode1(36,41,isDInSetOfReachableTilesFromO_StaticBoard1(36,41));}
	@Test public void test_board1_1806(){commonTestCode1(36,42,isDInSetOfReachableTilesFromO_StaticBoard1(36,42));}
	@Test public void test_board1_1807(){commonTestCode1(36,43,isDInSetOfReachableTilesFromO_StaticBoard1(36,43));}
	@Test public void test_board1_1808(){commonTestCode1(36,44,isDInSetOfReachableTilesFromO_StaticBoard1(36,44));}
	@Test public void test_board1_1809(){commonTestCode1(36,45,isDInSetOfReachableTilesFromO_StaticBoard1(36,45));}
	@Test public void test_board1_1810(){commonTestCode1(36,46,isDInSetOfReachableTilesFromO_StaticBoard1(36,46));}
	@Test public void test_board1_1811(){commonTestCode1(36,47,isDInSetOfReachableTilesFromO_StaticBoard1(36,47));}
	@Test public void test_board1_1812(){commonTestCode1(36,48,isDInSetOfReachableTilesFromO_StaticBoard1(36,48));}
	@Test public void test_board1_1813(){commonTestCode1(37,0,isDInSetOfReachableTilesFromO_StaticBoard1(37,0));}
	@Test public void test_board1_1814(){commonTestCode1(37,1,isDInSetOfReachableTilesFromO_StaticBoard1(37,1));}
	@Test public void test_board1_1815(){commonTestCode1(37,2,isDInSetOfReachableTilesFromO_StaticBoard1(37,2));}
	@Test public void test_board1_1816(){commonTestCode1(37,3,isDInSetOfReachableTilesFromO_StaticBoard1(37,3));}
	@Test public void test_board1_1817(){commonTestCode1(37,4,isDInSetOfReachableTilesFromO_StaticBoard1(37,4));}
	@Test public void test_board1_1818(){commonTestCode1(37,5,isDInSetOfReachableTilesFromO_StaticBoard1(37,5));}
	@Test public void test_board1_1819(){commonTestCode1(37,6,isDInSetOfReachableTilesFromO_StaticBoard1(37,6));}
	@Test public void test_board1_1820(){commonTestCode1(37,7,isDInSetOfReachableTilesFromO_StaticBoard1(37,7));}
	@Test public void test_board1_1821(){commonTestCode1(37,8,isDInSetOfReachableTilesFromO_StaticBoard1(37,8));}
	@Test public void test_board1_1822(){commonTestCode1(37,9,isDInSetOfReachableTilesFromO_StaticBoard1(37,9));}
	@Test public void test_board1_1823(){commonTestCode1(37,10,isDInSetOfReachableTilesFromO_StaticBoard1(37,10));}
	@Test public void test_board1_1824(){commonTestCode1(37,11,isDInSetOfReachableTilesFromO_StaticBoard1(37,11));}
	@Test public void test_board1_1825(){commonTestCode1(37,12,isDInSetOfReachableTilesFromO_StaticBoard1(37,12));}
	@Test public void test_board1_1826(){commonTestCode1(37,13,isDInSetOfReachableTilesFromO_StaticBoard1(37,13));}
	@Test public void test_board1_1827(){commonTestCode1(37,14,isDInSetOfReachableTilesFromO_StaticBoard1(37,14));}
	@Test public void test_board1_1828(){commonTestCode1(37,15,isDInSetOfReachableTilesFromO_StaticBoard1(37,15));}
	@Test public void test_board1_1829(){commonTestCode1(37,16,isDInSetOfReachableTilesFromO_StaticBoard1(37,16));}
	@Test public void test_board1_1830(){commonTestCode1(37,17,isDInSetOfReachableTilesFromO_StaticBoard1(37,17));}
	@Test public void test_board1_1831(){commonTestCode1(37,18,isDInSetOfReachableTilesFromO_StaticBoard1(37,18));}
	@Test public void test_board1_1832(){commonTestCode1(37,19,isDInSetOfReachableTilesFromO_StaticBoard1(37,19));}
	@Test public void test_board1_1833(){commonTestCode1(37,20,isDInSetOfReachableTilesFromO_StaticBoard1(37,20));}
	@Test public void test_board1_1834(){commonTestCode1(37,21,isDInSetOfReachableTilesFromO_StaticBoard1(37,21));}
	@Test public void test_board1_1835(){commonTestCode1(37,22,isDInSetOfReachableTilesFromO_StaticBoard1(37,22));}
	@Test public void test_board1_1836(){commonTestCode1(37,23,isDInSetOfReachableTilesFromO_StaticBoard1(37,23));}
	@Test public void test_board1_1837(){commonTestCode1(37,24,isDInSetOfReachableTilesFromO_StaticBoard1(37,24));}
	@Test public void test_board1_1838(){commonTestCode1(37,25,isDInSetOfReachableTilesFromO_StaticBoard1(37,25));}
	@Test public void test_board1_1839(){commonTestCode1(37,26,isDInSetOfReachableTilesFromO_StaticBoard1(37,26));}
	@Test public void test_board1_1840(){commonTestCode1(37,27,isDInSetOfReachableTilesFromO_StaticBoard1(37,27));}
	@Test public void test_board1_1841(){commonTestCode1(37,28,isDInSetOfReachableTilesFromO_StaticBoard1(37,28));}
	@Test public void test_board1_1842(){commonTestCode1(37,29,isDInSetOfReachableTilesFromO_StaticBoard1(37,29));}
	@Test public void test_board1_1843(){commonTestCode1(37,30,isDInSetOfReachableTilesFromO_StaticBoard1(37,30));}
	@Test public void test_board1_1844(){commonTestCode1(37,31,isDInSetOfReachableTilesFromO_StaticBoard1(37,31));}
	@Test public void test_board1_1845(){commonTestCode1(37,32,isDInSetOfReachableTilesFromO_StaticBoard1(37,32));}
	@Test public void test_board1_1846(){commonTestCode1(37,33,isDInSetOfReachableTilesFromO_StaticBoard1(37,33));}
	@Test public void test_board1_1847(){commonTestCode1(37,34,isDInSetOfReachableTilesFromO_StaticBoard1(37,34));}
	@Test public void test_board1_1848(){commonTestCode1(37,35,isDInSetOfReachableTilesFromO_StaticBoard1(37,35));}
	@Test public void test_board1_1849(){commonTestCode1(37,36,isDInSetOfReachableTilesFromO_StaticBoard1(37,36));}
	@Test public void test_board1_1850(){commonTestCode1(37,37,isDInSetOfReachableTilesFromO_StaticBoard1(37,37));}
	@Test public void test_board1_1851(){commonTestCode1(37,38,isDInSetOfReachableTilesFromO_StaticBoard1(37,38));}
	@Test public void test_board1_1852(){commonTestCode1(37,39,isDInSetOfReachableTilesFromO_StaticBoard1(37,39));}
	@Test public void test_board1_1853(){commonTestCode1(37,40,isDInSetOfReachableTilesFromO_StaticBoard1(37,40));}
	@Test public void test_board1_1854(){commonTestCode1(37,41,isDInSetOfReachableTilesFromO_StaticBoard1(37,41));}
	@Test public void test_board1_1855(){commonTestCode1(37,42,isDInSetOfReachableTilesFromO_StaticBoard1(37,42));}
	@Test public void test_board1_1856(){commonTestCode1(37,43,isDInSetOfReachableTilesFromO_StaticBoard1(37,43));}
	@Test public void test_board1_1857(){commonTestCode1(37,44,isDInSetOfReachableTilesFromO_StaticBoard1(37,44));}
	@Test public void test_board1_1858(){commonTestCode1(37,45,isDInSetOfReachableTilesFromO_StaticBoard1(37,45));}
	@Test public void test_board1_1859(){commonTestCode1(37,46,isDInSetOfReachableTilesFromO_StaticBoard1(37,46));}
	@Test public void test_board1_1860(){commonTestCode1(37,47,isDInSetOfReachableTilesFromO_StaticBoard1(37,47));}
	@Test public void test_board1_1861(){commonTestCode1(37,48,isDInSetOfReachableTilesFromO_StaticBoard1(37,48));}
	@Test public void test_board1_1862(){commonTestCode1(38,0,isDInSetOfReachableTilesFromO_StaticBoard1(38,0));}
	@Test public void test_board1_1863(){commonTestCode1(38,1,isDInSetOfReachableTilesFromO_StaticBoard1(38,1));}
	@Test public void test_board1_1864(){commonTestCode1(38,2,isDInSetOfReachableTilesFromO_StaticBoard1(38,2));}
	@Test public void test_board1_1865(){commonTestCode1(38,3,isDInSetOfReachableTilesFromO_StaticBoard1(38,3));}
	@Test public void test_board1_1866(){commonTestCode1(38,4,isDInSetOfReachableTilesFromO_StaticBoard1(38,4));}
	@Test public void test_board1_1867(){commonTestCode1(38,5,isDInSetOfReachableTilesFromO_StaticBoard1(38,5));}
	@Test public void test_board1_1868(){commonTestCode1(38,6,isDInSetOfReachableTilesFromO_StaticBoard1(38,6));}
	@Test public void test_board1_1869(){commonTestCode1(38,7,isDInSetOfReachableTilesFromO_StaticBoard1(38,7));}
	@Test public void test_board1_1870(){commonTestCode1(38,8,isDInSetOfReachableTilesFromO_StaticBoard1(38,8));}
	@Test public void test_board1_1871(){commonTestCode1(38,9,isDInSetOfReachableTilesFromO_StaticBoard1(38,9));}
	@Test public void test_board1_1872(){commonTestCode1(38,10,isDInSetOfReachableTilesFromO_StaticBoard1(38,10));}
	@Test public void test_board1_1873(){commonTestCode1(38,11,isDInSetOfReachableTilesFromO_StaticBoard1(38,11));}
	@Test public void test_board1_1874(){commonTestCode1(38,12,isDInSetOfReachableTilesFromO_StaticBoard1(38,12));}
	@Test public void test_board1_1875(){commonTestCode1(38,13,isDInSetOfReachableTilesFromO_StaticBoard1(38,13));}
	@Test public void test_board1_1876(){commonTestCode1(38,14,isDInSetOfReachableTilesFromO_StaticBoard1(38,14));}
	@Test public void test_board1_1877(){commonTestCode1(38,15,isDInSetOfReachableTilesFromO_StaticBoard1(38,15));}
	@Test public void test_board1_1878(){commonTestCode1(38,16,isDInSetOfReachableTilesFromO_StaticBoard1(38,16));}
	@Test public void test_board1_1879(){commonTestCode1(38,17,isDInSetOfReachableTilesFromO_StaticBoard1(38,17));}
	@Test public void test_board1_1880(){commonTestCode1(38,18,isDInSetOfReachableTilesFromO_StaticBoard1(38,18));}
	@Test public void test_board1_1881(){commonTestCode1(38,19,isDInSetOfReachableTilesFromO_StaticBoard1(38,19));}
	@Test public void test_board1_1882(){commonTestCode1(38,20,isDInSetOfReachableTilesFromO_StaticBoard1(38,20));}
	@Test public void test_board1_1883(){commonTestCode1(38,21,isDInSetOfReachableTilesFromO_StaticBoard1(38,21));}
	@Test public void test_board1_1884(){commonTestCode1(38,22,isDInSetOfReachableTilesFromO_StaticBoard1(38,22));}
	@Test public void test_board1_1885(){commonTestCode1(38,23,isDInSetOfReachableTilesFromO_StaticBoard1(38,23));}
	@Test public void test_board1_1886(){commonTestCode1(38,24,isDInSetOfReachableTilesFromO_StaticBoard1(38,24));}
	@Test public void test_board1_1887(){commonTestCode1(38,25,isDInSetOfReachableTilesFromO_StaticBoard1(38,25));}
	@Test public void test_board1_1888(){commonTestCode1(38,26,isDInSetOfReachableTilesFromO_StaticBoard1(38,26));}
	@Test public void test_board1_1889(){commonTestCode1(38,27,isDInSetOfReachableTilesFromO_StaticBoard1(38,27));}
	@Test public void test_board1_1890(){commonTestCode1(38,28,isDInSetOfReachableTilesFromO_StaticBoard1(38,28));}
	@Test public void test_board1_1891(){commonTestCode1(38,29,isDInSetOfReachableTilesFromO_StaticBoard1(38,29));}
	@Test public void test_board1_1892(){commonTestCode1(38,30,isDInSetOfReachableTilesFromO_StaticBoard1(38,30));}
	@Test public void test_board1_1893(){commonTestCode1(38,31,isDInSetOfReachableTilesFromO_StaticBoard1(38,31));}
	@Test public void test_board1_1894(){commonTestCode1(38,32,isDInSetOfReachableTilesFromO_StaticBoard1(38,32));}
	@Test public void test_board1_1895(){commonTestCode1(38,33,isDInSetOfReachableTilesFromO_StaticBoard1(38,33));}
	@Test public void test_board1_1896(){commonTestCode1(38,34,isDInSetOfReachableTilesFromO_StaticBoard1(38,34));}
	@Test public void test_board1_1897(){commonTestCode1(38,35,isDInSetOfReachableTilesFromO_StaticBoard1(38,35));}
	@Test public void test_board1_1898(){commonTestCode1(38,36,isDInSetOfReachableTilesFromO_StaticBoard1(38,36));}
	@Test public void test_board1_1899(){commonTestCode1(38,37,isDInSetOfReachableTilesFromO_StaticBoard1(38,37));}
	@Test public void test_board1_1900(){commonTestCode1(38,38,isDInSetOfReachableTilesFromO_StaticBoard1(38,38));}
	@Test public void test_board1_1901(){commonTestCode1(38,39,isDInSetOfReachableTilesFromO_StaticBoard1(38,39));}
	@Test public void test_board1_1902(){commonTestCode1(38,40,isDInSetOfReachableTilesFromO_StaticBoard1(38,40));}
	@Test public void test_board1_1903(){commonTestCode1(38,41,isDInSetOfReachableTilesFromO_StaticBoard1(38,41));}
	@Test public void test_board1_1904(){commonTestCode1(38,42,isDInSetOfReachableTilesFromO_StaticBoard1(38,42));}
	@Test public void test_board1_1905(){commonTestCode1(38,43,isDInSetOfReachableTilesFromO_StaticBoard1(38,43));}
	@Test public void test_board1_1906(){commonTestCode1(38,44,isDInSetOfReachableTilesFromO_StaticBoard1(38,44));}
	@Test public void test_board1_1907(){commonTestCode1(38,45,isDInSetOfReachableTilesFromO_StaticBoard1(38,45));}
	@Test public void test_board1_1908(){commonTestCode1(38,46,isDInSetOfReachableTilesFromO_StaticBoard1(38,46));}
	@Test public void test_board1_1909(){commonTestCode1(38,47,isDInSetOfReachableTilesFromO_StaticBoard1(38,47));}
	@Test public void test_board1_1910(){commonTestCode1(38,48,isDInSetOfReachableTilesFromO_StaticBoard1(38,48));}
	@Test public void test_board1_1911(){commonTestCode1(39,0,isDInSetOfReachableTilesFromO_StaticBoard1(39,0));}
	@Test public void test_board1_1912(){commonTestCode1(39,1,isDInSetOfReachableTilesFromO_StaticBoard1(39,1));}
	@Test public void test_board1_1913(){commonTestCode1(39,2,isDInSetOfReachableTilesFromO_StaticBoard1(39,2));}
	@Test public void test_board1_1914(){commonTestCode1(39,3,isDInSetOfReachableTilesFromO_StaticBoard1(39,3));}
	@Test public void test_board1_1915(){commonTestCode1(39,4,isDInSetOfReachableTilesFromO_StaticBoard1(39,4));}
	@Test public void test_board1_1916(){commonTestCode1(39,5,isDInSetOfReachableTilesFromO_StaticBoard1(39,5));}
	@Test public void test_board1_1917(){commonTestCode1(39,6,isDInSetOfReachableTilesFromO_StaticBoard1(39,6));}
	@Test public void test_board1_1918(){commonTestCode1(39,7,isDInSetOfReachableTilesFromO_StaticBoard1(39,7));}
	@Test public void test_board1_1919(){commonTestCode1(39,8,isDInSetOfReachableTilesFromO_StaticBoard1(39,8));}
	@Test public void test_board1_1920(){commonTestCode1(39,9,isDInSetOfReachableTilesFromO_StaticBoard1(39,9));}
	@Test public void test_board1_1921(){commonTestCode1(39,10,isDInSetOfReachableTilesFromO_StaticBoard1(39,10));}
	@Test public void test_board1_1922(){commonTestCode1(39,11,isDInSetOfReachableTilesFromO_StaticBoard1(39,11));}
	@Test public void test_board1_1923(){commonTestCode1(39,12,isDInSetOfReachableTilesFromO_StaticBoard1(39,12));}
	@Test public void test_board1_1924(){commonTestCode1(39,13,isDInSetOfReachableTilesFromO_StaticBoard1(39,13));}
	@Test public void test_board1_1925(){commonTestCode1(39,14,isDInSetOfReachableTilesFromO_StaticBoard1(39,14));}
	@Test public void test_board1_1926(){commonTestCode1(39,15,isDInSetOfReachableTilesFromO_StaticBoard1(39,15));}
	@Test public void test_board1_1927(){commonTestCode1(39,16,isDInSetOfReachableTilesFromO_StaticBoard1(39,16));}
	@Test public void test_board1_1928(){commonTestCode1(39,17,isDInSetOfReachableTilesFromO_StaticBoard1(39,17));}
	@Test public void test_board1_1929(){commonTestCode1(39,18,isDInSetOfReachableTilesFromO_StaticBoard1(39,18));}
	@Test public void test_board1_1930(){commonTestCode1(39,19,isDInSetOfReachableTilesFromO_StaticBoard1(39,19));}
	@Test public void test_board1_1931(){commonTestCode1(39,20,isDInSetOfReachableTilesFromO_StaticBoard1(39,20));}
	@Test public void test_board1_1932(){commonTestCode1(39,21,isDInSetOfReachableTilesFromO_StaticBoard1(39,21));}
	@Test public void test_board1_1933(){commonTestCode1(39,22,isDInSetOfReachableTilesFromO_StaticBoard1(39,22));}
	@Test public void test_board1_1934(){commonTestCode1(39,23,isDInSetOfReachableTilesFromO_StaticBoard1(39,23));}
	@Test public void test_board1_1935(){commonTestCode1(39,24,isDInSetOfReachableTilesFromO_StaticBoard1(39,24));}
	@Test public void test_board1_1936(){commonTestCode1(39,25,isDInSetOfReachableTilesFromO_StaticBoard1(39,25));}
	@Test public void test_board1_1937(){commonTestCode1(39,26,isDInSetOfReachableTilesFromO_StaticBoard1(39,26));}
	@Test public void test_board1_1938(){commonTestCode1(39,27,isDInSetOfReachableTilesFromO_StaticBoard1(39,27));}
	@Test public void test_board1_1939(){commonTestCode1(39,28,isDInSetOfReachableTilesFromO_StaticBoard1(39,28));}
	@Test public void test_board1_1940(){commonTestCode1(39,29,isDInSetOfReachableTilesFromO_StaticBoard1(39,29));}
	@Test public void test_board1_1941(){commonTestCode1(39,30,isDInSetOfReachableTilesFromO_StaticBoard1(39,30));}
	@Test public void test_board1_1942(){commonTestCode1(39,31,isDInSetOfReachableTilesFromO_StaticBoard1(39,31));}
	@Test public void test_board1_1943(){commonTestCode1(39,32,isDInSetOfReachableTilesFromO_StaticBoard1(39,32));}
	@Test public void test_board1_1944(){commonTestCode1(39,33,isDInSetOfReachableTilesFromO_StaticBoard1(39,33));}
	@Test public void test_board1_1945(){commonTestCode1(39,34,isDInSetOfReachableTilesFromO_StaticBoard1(39,34));}
	@Test public void test_board1_1946(){commonTestCode1(39,35,isDInSetOfReachableTilesFromO_StaticBoard1(39,35));}
	@Test public void test_board1_1947(){commonTestCode1(39,36,isDInSetOfReachableTilesFromO_StaticBoard1(39,36));}
	@Test public void test_board1_1948(){commonTestCode1(39,37,isDInSetOfReachableTilesFromO_StaticBoard1(39,37));}
	@Test public void test_board1_1949(){commonTestCode1(39,38,isDInSetOfReachableTilesFromO_StaticBoard1(39,38));}
	@Test public void test_board1_1950(){commonTestCode1(39,39,isDInSetOfReachableTilesFromO_StaticBoard1(39,39));}
	@Test public void test_board1_1951(){commonTestCode1(39,40,isDInSetOfReachableTilesFromO_StaticBoard1(39,40));}
	@Test public void test_board1_1952(){commonTestCode1(39,41,isDInSetOfReachableTilesFromO_StaticBoard1(39,41));}
	@Test public void test_board1_1953(){commonTestCode1(39,42,isDInSetOfReachableTilesFromO_StaticBoard1(39,42));}
	@Test public void test_board1_1954(){commonTestCode1(39,43,isDInSetOfReachableTilesFromO_StaticBoard1(39,43));}
	@Test public void test_board1_1955(){commonTestCode1(39,44,isDInSetOfReachableTilesFromO_StaticBoard1(39,44));}
	@Test public void test_board1_1956(){commonTestCode1(39,45,isDInSetOfReachableTilesFromO_StaticBoard1(39,45));}
	@Test public void test_board1_1957(){commonTestCode1(39,46,isDInSetOfReachableTilesFromO_StaticBoard1(39,46));}
	@Test public void test_board1_1958(){commonTestCode1(39,47,isDInSetOfReachableTilesFromO_StaticBoard1(39,47));}
	@Test public void test_board1_1959(){commonTestCode1(39,48,isDInSetOfReachableTilesFromO_StaticBoard1(39,48));}
	@Test public void test_board1_1960(){commonTestCode1(40,0,isDInSetOfReachableTilesFromO_StaticBoard1(40,0));}
	@Test public void test_board1_1961(){commonTestCode1(40,1,isDInSetOfReachableTilesFromO_StaticBoard1(40,1));}
	@Test public void test_board1_1962(){commonTestCode1(40,2,isDInSetOfReachableTilesFromO_StaticBoard1(40,2));}
	@Test public void test_board1_1963(){commonTestCode1(40,3,isDInSetOfReachableTilesFromO_StaticBoard1(40,3));}
	@Test public void test_board1_1964(){commonTestCode1(40,4,isDInSetOfReachableTilesFromO_StaticBoard1(40,4));}
	@Test public void test_board1_1965(){commonTestCode1(40,5,isDInSetOfReachableTilesFromO_StaticBoard1(40,5));}
	@Test public void test_board1_1966(){commonTestCode1(40,6,isDInSetOfReachableTilesFromO_StaticBoard1(40,6));}
	@Test public void test_board1_1967(){commonTestCode1(40,7,isDInSetOfReachableTilesFromO_StaticBoard1(40,7));}
	@Test public void test_board1_1968(){commonTestCode1(40,8,isDInSetOfReachableTilesFromO_StaticBoard1(40,8));}
	@Test public void test_board1_1969(){commonTestCode1(40,9,isDInSetOfReachableTilesFromO_StaticBoard1(40,9));}
	@Test public void test_board1_1970(){commonTestCode1(40,10,isDInSetOfReachableTilesFromO_StaticBoard1(40,10));}
	@Test public void test_board1_1971(){commonTestCode1(40,11,isDInSetOfReachableTilesFromO_StaticBoard1(40,11));}
	@Test public void test_board1_1972(){commonTestCode1(40,12,isDInSetOfReachableTilesFromO_StaticBoard1(40,12));}
	@Test public void test_board1_1973(){commonTestCode1(40,13,isDInSetOfReachableTilesFromO_StaticBoard1(40,13));}
	@Test public void test_board1_1974(){commonTestCode1(40,14,isDInSetOfReachableTilesFromO_StaticBoard1(40,14));}
	@Test public void test_board1_1975(){commonTestCode1(40,15,isDInSetOfReachableTilesFromO_StaticBoard1(40,15));}
	@Test public void test_board1_1976(){commonTestCode1(40,16,isDInSetOfReachableTilesFromO_StaticBoard1(40,16));}
	@Test public void test_board1_1977(){commonTestCode1(40,17,isDInSetOfReachableTilesFromO_StaticBoard1(40,17));}
	@Test public void test_board1_1978(){commonTestCode1(40,18,isDInSetOfReachableTilesFromO_StaticBoard1(40,18));}
	@Test public void test_board1_1979(){commonTestCode1(40,19,isDInSetOfReachableTilesFromO_StaticBoard1(40,19));}
	@Test public void test_board1_1980(){commonTestCode1(40,20,isDInSetOfReachableTilesFromO_StaticBoard1(40,20));}
	@Test public void test_board1_1981(){commonTestCode1(40,21,isDInSetOfReachableTilesFromO_StaticBoard1(40,21));}
	@Test public void test_board1_1982(){commonTestCode1(40,22,isDInSetOfReachableTilesFromO_StaticBoard1(40,22));}
	@Test public void test_board1_1983(){commonTestCode1(40,23,isDInSetOfReachableTilesFromO_StaticBoard1(40,23));}
	@Test public void test_board1_1984(){commonTestCode1(40,24,isDInSetOfReachableTilesFromO_StaticBoard1(40,24));}
	@Test public void test_board1_1985(){commonTestCode1(40,25,isDInSetOfReachableTilesFromO_StaticBoard1(40,25));}
	@Test public void test_board1_1986(){commonTestCode1(40,26,isDInSetOfReachableTilesFromO_StaticBoard1(40,26));}
	@Test public void test_board1_1987(){commonTestCode1(40,27,isDInSetOfReachableTilesFromO_StaticBoard1(40,27));}
	@Test public void test_board1_1988(){commonTestCode1(40,28,isDInSetOfReachableTilesFromO_StaticBoard1(40,28));}
	@Test public void test_board1_1989(){commonTestCode1(40,29,isDInSetOfReachableTilesFromO_StaticBoard1(40,29));}
	@Test public void test_board1_1990(){commonTestCode1(40,30,isDInSetOfReachableTilesFromO_StaticBoard1(40,30));}
	@Test public void test_board1_1991(){commonTestCode1(40,31,isDInSetOfReachableTilesFromO_StaticBoard1(40,31));}
	@Test public void test_board1_1992(){commonTestCode1(40,32,isDInSetOfReachableTilesFromO_StaticBoard1(40,32));}
	@Test public void test_board1_1993(){commonTestCode1(40,33,isDInSetOfReachableTilesFromO_StaticBoard1(40,33));}
	@Test public void test_board1_1994(){commonTestCode1(40,34,isDInSetOfReachableTilesFromO_StaticBoard1(40,34));}
	@Test public void test_board1_1995(){commonTestCode1(40,35,isDInSetOfReachableTilesFromO_StaticBoard1(40,35));}
	@Test public void test_board1_1996(){commonTestCode1(40,36,isDInSetOfReachableTilesFromO_StaticBoard1(40,36));}
	@Test public void test_board1_1997(){commonTestCode1(40,37,isDInSetOfReachableTilesFromO_StaticBoard1(40,37));}
	@Test public void test_board1_1998(){commonTestCode1(40,38,isDInSetOfReachableTilesFromO_StaticBoard1(40,38));}
	@Test public void test_board1_1999(){commonTestCode1(40,39,isDInSetOfReachableTilesFromO_StaticBoard1(40,39));}
	@Test public void test_board1_2000(){commonTestCode1(40,40,isDInSetOfReachableTilesFromO_StaticBoard1(40,40));}
	@Test public void test_board1_2001(){commonTestCode1(40,41,isDInSetOfReachableTilesFromO_StaticBoard1(40,41));}
	@Test public void test_board1_2002(){commonTestCode1(40,42,isDInSetOfReachableTilesFromO_StaticBoard1(40,42));}
	@Test public void test_board1_2003(){commonTestCode1(40,43,isDInSetOfReachableTilesFromO_StaticBoard1(40,43));}
	@Test public void test_board1_2004(){commonTestCode1(40,44,isDInSetOfReachableTilesFromO_StaticBoard1(40,44));}
	@Test public void test_board1_2005(){commonTestCode1(40,45,isDInSetOfReachableTilesFromO_StaticBoard1(40,45));}
	@Test public void test_board1_2006(){commonTestCode1(40,46,isDInSetOfReachableTilesFromO_StaticBoard1(40,46));}
	@Test public void test_board1_2007(){commonTestCode1(40,47,isDInSetOfReachableTilesFromO_StaticBoard1(40,47));}
	@Test public void test_board1_2008(){commonTestCode1(40,48,isDInSetOfReachableTilesFromO_StaticBoard1(40,48));}
	@Test public void test_board1_2009(){commonTestCode1(41,0,isDInSetOfReachableTilesFromO_StaticBoard1(41,0));}
	@Test public void test_board1_2010(){commonTestCode1(41,1,isDInSetOfReachableTilesFromO_StaticBoard1(41,1));}
	@Test public void test_board1_2011(){commonTestCode1(41,2,isDInSetOfReachableTilesFromO_StaticBoard1(41,2));}
	@Test public void test_board1_2012(){commonTestCode1(41,3,isDInSetOfReachableTilesFromO_StaticBoard1(41,3));}
	@Test public void test_board1_2013(){commonTestCode1(41,4,isDInSetOfReachableTilesFromO_StaticBoard1(41,4));}
	@Test public void test_board1_2014(){commonTestCode1(41,5,isDInSetOfReachableTilesFromO_StaticBoard1(41,5));}
	@Test public void test_board1_2015(){commonTestCode1(41,6,isDInSetOfReachableTilesFromO_StaticBoard1(41,6));}
	@Test public void test_board1_2016(){commonTestCode1(41,7,isDInSetOfReachableTilesFromO_StaticBoard1(41,7));}
	@Test public void test_board1_2017(){commonTestCode1(41,8,isDInSetOfReachableTilesFromO_StaticBoard1(41,8));}
	@Test public void test_board1_2018(){commonTestCode1(41,9,isDInSetOfReachableTilesFromO_StaticBoard1(41,9));}
	@Test public void test_board1_2019(){commonTestCode1(41,10,isDInSetOfReachableTilesFromO_StaticBoard1(41,10));}
	@Test public void test_board1_2020(){commonTestCode1(41,11,isDInSetOfReachableTilesFromO_StaticBoard1(41,11));}
	@Test public void test_board1_2021(){commonTestCode1(41,12,isDInSetOfReachableTilesFromO_StaticBoard1(41,12));}
	@Test public void test_board1_2022(){commonTestCode1(41,13,isDInSetOfReachableTilesFromO_StaticBoard1(41,13));}
	@Test public void test_board1_2023(){commonTestCode1(41,14,isDInSetOfReachableTilesFromO_StaticBoard1(41,14));}
	@Test public void test_board1_2024(){commonTestCode1(41,15,isDInSetOfReachableTilesFromO_StaticBoard1(41,15));}
	@Test public void test_board1_2025(){commonTestCode1(41,16,isDInSetOfReachableTilesFromO_StaticBoard1(41,16));}
	@Test public void test_board1_2026(){commonTestCode1(41,17,isDInSetOfReachableTilesFromO_StaticBoard1(41,17));}
	@Test public void test_board1_2027(){commonTestCode1(41,18,isDInSetOfReachableTilesFromO_StaticBoard1(41,18));}
	@Test public void test_board1_2028(){commonTestCode1(41,19,isDInSetOfReachableTilesFromO_StaticBoard1(41,19));}
	@Test public void test_board1_2029(){commonTestCode1(41,20,isDInSetOfReachableTilesFromO_StaticBoard1(41,20));}
	@Test public void test_board1_2030(){commonTestCode1(41,21,isDInSetOfReachableTilesFromO_StaticBoard1(41,21));}
	@Test public void test_board1_2031(){commonTestCode1(41,22,isDInSetOfReachableTilesFromO_StaticBoard1(41,22));}
	@Test public void test_board1_2032(){commonTestCode1(41,23,isDInSetOfReachableTilesFromO_StaticBoard1(41,23));}
	@Test public void test_board1_2033(){commonTestCode1(41,24,isDInSetOfReachableTilesFromO_StaticBoard1(41,24));}
	@Test public void test_board1_2034(){commonTestCode1(41,25,isDInSetOfReachableTilesFromO_StaticBoard1(41,25));}
	@Test public void test_board1_2035(){commonTestCode1(41,26,isDInSetOfReachableTilesFromO_StaticBoard1(41,26));}
	@Test public void test_board1_2036(){commonTestCode1(41,27,isDInSetOfReachableTilesFromO_StaticBoard1(41,27));}
	@Test public void test_board1_2037(){commonTestCode1(41,28,isDInSetOfReachableTilesFromO_StaticBoard1(41,28));}
	@Test public void test_board1_2038(){commonTestCode1(41,29,isDInSetOfReachableTilesFromO_StaticBoard1(41,29));}
	@Test public void test_board1_2039(){commonTestCode1(41,30,isDInSetOfReachableTilesFromO_StaticBoard1(41,30));}
	@Test public void test_board1_2040(){commonTestCode1(41,31,isDInSetOfReachableTilesFromO_StaticBoard1(41,31));}
	@Test public void test_board1_2041(){commonTestCode1(41,32,isDInSetOfReachableTilesFromO_StaticBoard1(41,32));}
	@Test public void test_board1_2042(){commonTestCode1(41,33,isDInSetOfReachableTilesFromO_StaticBoard1(41,33));}
	@Test public void test_board1_2043(){commonTestCode1(41,34,isDInSetOfReachableTilesFromO_StaticBoard1(41,34));}
	@Test public void test_board1_2044(){commonTestCode1(41,35,isDInSetOfReachableTilesFromO_StaticBoard1(41,35));}
	@Test public void test_board1_2045(){commonTestCode1(41,36,isDInSetOfReachableTilesFromO_StaticBoard1(41,36));}
	@Test public void test_board1_2046(){commonTestCode1(41,37,isDInSetOfReachableTilesFromO_StaticBoard1(41,37));}
	@Test public void test_board1_2047(){commonTestCode1(41,38,isDInSetOfReachableTilesFromO_StaticBoard1(41,38));}
	@Test public void test_board1_2048(){commonTestCode1(41,39,isDInSetOfReachableTilesFromO_StaticBoard1(41,39));}
	@Test public void test_board1_2049(){commonTestCode1(41,40,isDInSetOfReachableTilesFromO_StaticBoard1(41,40));}
	@Test public void test_board1_2050(){commonTestCode1(41,41,isDInSetOfReachableTilesFromO_StaticBoard1(41,41));}
	@Test public void test_board1_2051(){commonTestCode1(41,42,isDInSetOfReachableTilesFromO_StaticBoard1(41,42));}
	@Test public void test_board1_2052(){commonTestCode1(41,43,isDInSetOfReachableTilesFromO_StaticBoard1(41,43));}
	@Test public void test_board1_2053(){commonTestCode1(41,44,isDInSetOfReachableTilesFromO_StaticBoard1(41,44));}
	@Test public void test_board1_2054(){commonTestCode1(41,45,isDInSetOfReachableTilesFromO_StaticBoard1(41,45));}
	@Test public void test_board1_2055(){commonTestCode1(41,46,isDInSetOfReachableTilesFromO_StaticBoard1(41,46));}
	@Test public void test_board1_2056(){commonTestCode1(41,47,isDInSetOfReachableTilesFromO_StaticBoard1(41,47));}
	@Test public void test_board1_2057(){commonTestCode1(41,48,isDInSetOfReachableTilesFromO_StaticBoard1(41,48));}
	@Test public void test_board1_2058(){commonTestCode1(42,0,isDInSetOfReachableTilesFromO_StaticBoard1(42,0));}
	@Test public void test_board1_2059(){commonTestCode1(42,1,isDInSetOfReachableTilesFromO_StaticBoard1(42,1));}
	@Test public void test_board1_2060(){commonTestCode1(42,2,isDInSetOfReachableTilesFromO_StaticBoard1(42,2));}
	@Test public void test_board1_2061(){commonTestCode1(42,3,isDInSetOfReachableTilesFromO_StaticBoard1(42,3));}
	@Test public void test_board1_2062(){commonTestCode1(42,4,isDInSetOfReachableTilesFromO_StaticBoard1(42,4));}
	@Test public void test_board1_2063(){commonTestCode1(42,5,isDInSetOfReachableTilesFromO_StaticBoard1(42,5));}
	@Test public void test_board1_2064(){commonTestCode1(42,6,isDInSetOfReachableTilesFromO_StaticBoard1(42,6));}
	@Test public void test_board1_2065(){commonTestCode1(42,7,isDInSetOfReachableTilesFromO_StaticBoard1(42,7));}
	@Test public void test_board1_2066(){commonTestCode1(42,8,isDInSetOfReachableTilesFromO_StaticBoard1(42,8));}
	@Test public void test_board1_2067(){commonTestCode1(42,9,isDInSetOfReachableTilesFromO_StaticBoard1(42,9));}
	@Test public void test_board1_2068(){commonTestCode1(42,10,isDInSetOfReachableTilesFromO_StaticBoard1(42,10));}
	@Test public void test_board1_2069(){commonTestCode1(42,11,isDInSetOfReachableTilesFromO_StaticBoard1(42,11));}
	@Test public void test_board1_2070(){commonTestCode1(42,12,isDInSetOfReachableTilesFromO_StaticBoard1(42,12));}
	@Test public void test_board1_2071(){commonTestCode1(42,13,isDInSetOfReachableTilesFromO_StaticBoard1(42,13));}
	@Test public void test_board1_2072(){commonTestCode1(42,14,isDInSetOfReachableTilesFromO_StaticBoard1(42,14));}
	@Test public void test_board1_2073(){commonTestCode1(42,15,isDInSetOfReachableTilesFromO_StaticBoard1(42,15));}
	@Test public void test_board1_2074(){commonTestCode1(42,16,isDInSetOfReachableTilesFromO_StaticBoard1(42,16));}
	@Test public void test_board1_2075(){commonTestCode1(42,17,isDInSetOfReachableTilesFromO_StaticBoard1(42,17));}
	@Test public void test_board1_2076(){commonTestCode1(42,18,isDInSetOfReachableTilesFromO_StaticBoard1(42,18));}
	@Test public void test_board1_2077(){commonTestCode1(42,19,isDInSetOfReachableTilesFromO_StaticBoard1(42,19));}
	@Test public void test_board1_2078(){commonTestCode1(42,20,isDInSetOfReachableTilesFromO_StaticBoard1(42,20));}
	@Test public void test_board1_2079(){commonTestCode1(42,21,isDInSetOfReachableTilesFromO_StaticBoard1(42,21));}
	@Test public void test_board1_2080(){commonTestCode1(42,22,isDInSetOfReachableTilesFromO_StaticBoard1(42,22));}
	@Test public void test_board1_2081(){commonTestCode1(42,23,isDInSetOfReachableTilesFromO_StaticBoard1(42,23));}
	@Test public void test_board1_2082(){commonTestCode1(42,24,isDInSetOfReachableTilesFromO_StaticBoard1(42,24));}
	@Test public void test_board1_2083(){commonTestCode1(42,25,isDInSetOfReachableTilesFromO_StaticBoard1(42,25));}
	@Test public void test_board1_2084(){commonTestCode1(42,26,isDInSetOfReachableTilesFromO_StaticBoard1(42,26));}
	@Test public void test_board1_2085(){commonTestCode1(42,27,isDInSetOfReachableTilesFromO_StaticBoard1(42,27));}
	@Test public void test_board1_2086(){commonTestCode1(42,28,isDInSetOfReachableTilesFromO_StaticBoard1(42,28));}
	@Test public void test_board1_2087(){commonTestCode1(42,29,isDInSetOfReachableTilesFromO_StaticBoard1(42,29));}
	@Test public void test_board1_2088(){commonTestCode1(42,30,isDInSetOfReachableTilesFromO_StaticBoard1(42,30));}
	@Test public void test_board1_2089(){commonTestCode1(42,31,isDInSetOfReachableTilesFromO_StaticBoard1(42,31));}
	@Test public void test_board1_2090(){commonTestCode1(42,32,isDInSetOfReachableTilesFromO_StaticBoard1(42,32));}
	@Test public void test_board1_2091(){commonTestCode1(42,33,isDInSetOfReachableTilesFromO_StaticBoard1(42,33));}
	@Test public void test_board1_2092(){commonTestCode1(42,34,isDInSetOfReachableTilesFromO_StaticBoard1(42,34));}
	@Test public void test_board1_2093(){commonTestCode1(42,35,isDInSetOfReachableTilesFromO_StaticBoard1(42,35));}
	@Test public void test_board1_2094(){commonTestCode1(42,36,isDInSetOfReachableTilesFromO_StaticBoard1(42,36));}
	@Test public void test_board1_2095(){commonTestCode1(42,37,isDInSetOfReachableTilesFromO_StaticBoard1(42,37));}
	@Test public void test_board1_2096(){commonTestCode1(42,38,isDInSetOfReachableTilesFromO_StaticBoard1(42,38));}
	@Test public void test_board1_2097(){commonTestCode1(42,39,isDInSetOfReachableTilesFromO_StaticBoard1(42,39));}
	@Test public void test_board1_2098(){commonTestCode1(42,40,isDInSetOfReachableTilesFromO_StaticBoard1(42,40));}
	@Test public void test_board1_2099(){commonTestCode1(42,41,isDInSetOfReachableTilesFromO_StaticBoard1(42,41));}
	@Test public void test_board1_2100(){commonTestCode1(42,42,isDInSetOfReachableTilesFromO_StaticBoard1(42,42));}
	@Test public void test_board1_2101(){commonTestCode1(42,43,isDInSetOfReachableTilesFromO_StaticBoard1(42,43));}
	@Test public void test_board1_2102(){commonTestCode1(42,44,isDInSetOfReachableTilesFromO_StaticBoard1(42,44));}
	@Test public void test_board1_2103(){commonTestCode1(42,45,isDInSetOfReachableTilesFromO_StaticBoard1(42,45));}
	@Test public void test_board1_2104(){commonTestCode1(42,46,isDInSetOfReachableTilesFromO_StaticBoard1(42,46));}
	@Test public void test_board1_2105(){commonTestCode1(42,47,isDInSetOfReachableTilesFromO_StaticBoard1(42,47));}
	@Test public void test_board1_2106(){commonTestCode1(42,48,isDInSetOfReachableTilesFromO_StaticBoard1(42,48));}
	@Test public void test_board1_2107(){commonTestCode1(43,0,isDInSetOfReachableTilesFromO_StaticBoard1(43,0));}
	@Test public void test_board1_2108(){commonTestCode1(43,1,isDInSetOfReachableTilesFromO_StaticBoard1(43,1));}
	@Test public void test_board1_2109(){commonTestCode1(43,2,isDInSetOfReachableTilesFromO_StaticBoard1(43,2));}
	@Test public void test_board1_2110(){commonTestCode1(43,3,isDInSetOfReachableTilesFromO_StaticBoard1(43,3));}
	@Test public void test_board1_2111(){commonTestCode1(43,4,isDInSetOfReachableTilesFromO_StaticBoard1(43,4));}
	@Test public void test_board1_2112(){commonTestCode1(43,5,isDInSetOfReachableTilesFromO_StaticBoard1(43,5));}
	@Test public void test_board1_2113(){commonTestCode1(43,6,isDInSetOfReachableTilesFromO_StaticBoard1(43,6));}
	@Test public void test_board1_2114(){commonTestCode1(43,7,isDInSetOfReachableTilesFromO_StaticBoard1(43,7));}
	@Test public void test_board1_2115(){commonTestCode1(43,8,isDInSetOfReachableTilesFromO_StaticBoard1(43,8));}
	@Test public void test_board1_2116(){commonTestCode1(43,9,isDInSetOfReachableTilesFromO_StaticBoard1(43,9));}
	@Test public void test_board1_2117(){commonTestCode1(43,10,isDInSetOfReachableTilesFromO_StaticBoard1(43,10));}
	@Test public void test_board1_2118(){commonTestCode1(43,11,isDInSetOfReachableTilesFromO_StaticBoard1(43,11));}
	@Test public void test_board1_2119(){commonTestCode1(43,12,isDInSetOfReachableTilesFromO_StaticBoard1(43,12));}
	@Test public void test_board1_2120(){commonTestCode1(43,13,isDInSetOfReachableTilesFromO_StaticBoard1(43,13));}
	@Test public void test_board1_2121(){commonTestCode1(43,14,isDInSetOfReachableTilesFromO_StaticBoard1(43,14));}
	@Test public void test_board1_2122(){commonTestCode1(43,15,isDInSetOfReachableTilesFromO_StaticBoard1(43,15));}
	@Test public void test_board1_2123(){commonTestCode1(43,16,isDInSetOfReachableTilesFromO_StaticBoard1(43,16));}
	@Test public void test_board1_2124(){commonTestCode1(43,17,isDInSetOfReachableTilesFromO_StaticBoard1(43,17));}
	@Test public void test_board1_2125(){commonTestCode1(43,18,isDInSetOfReachableTilesFromO_StaticBoard1(43,18));}
	@Test public void test_board1_2126(){commonTestCode1(43,19,isDInSetOfReachableTilesFromO_StaticBoard1(43,19));}
	@Test public void test_board1_2127(){commonTestCode1(43,20,isDInSetOfReachableTilesFromO_StaticBoard1(43,20));}
	@Test public void test_board1_2128(){commonTestCode1(43,21,isDInSetOfReachableTilesFromO_StaticBoard1(43,21));}
	@Test public void test_board1_2129(){commonTestCode1(43,22,isDInSetOfReachableTilesFromO_StaticBoard1(43,22));}
	@Test public void test_board1_2130(){commonTestCode1(43,23,isDInSetOfReachableTilesFromO_StaticBoard1(43,23));}
	@Test public void test_board1_2131(){commonTestCode1(43,24,isDInSetOfReachableTilesFromO_StaticBoard1(43,24));}
	@Test public void test_board1_2132(){commonTestCode1(43,25,isDInSetOfReachableTilesFromO_StaticBoard1(43,25));}
	@Test public void test_board1_2133(){commonTestCode1(43,26,isDInSetOfReachableTilesFromO_StaticBoard1(43,26));}
	@Test public void test_board1_2134(){commonTestCode1(43,27,isDInSetOfReachableTilesFromO_StaticBoard1(43,27));}
	@Test public void test_board1_2135(){commonTestCode1(43,28,isDInSetOfReachableTilesFromO_StaticBoard1(43,28));}
	@Test public void test_board1_2136(){commonTestCode1(43,29,isDInSetOfReachableTilesFromO_StaticBoard1(43,29));}
	@Test public void test_board1_2137(){commonTestCode1(43,30,isDInSetOfReachableTilesFromO_StaticBoard1(43,30));}
	@Test public void test_board1_2138(){commonTestCode1(43,31,isDInSetOfReachableTilesFromO_StaticBoard1(43,31));}
	@Test public void test_board1_2139(){commonTestCode1(43,32,isDInSetOfReachableTilesFromO_StaticBoard1(43,32));}
	@Test public void test_board1_2140(){commonTestCode1(43,33,isDInSetOfReachableTilesFromO_StaticBoard1(43,33));}
	@Test public void test_board1_2141(){commonTestCode1(43,34,isDInSetOfReachableTilesFromO_StaticBoard1(43,34));}
	@Test public void test_board1_2142(){commonTestCode1(43,35,isDInSetOfReachableTilesFromO_StaticBoard1(43,35));}
	@Test public void test_board1_2143(){commonTestCode1(43,36,isDInSetOfReachableTilesFromO_StaticBoard1(43,36));}
	@Test public void test_board1_2144(){commonTestCode1(43,37,isDInSetOfReachableTilesFromO_StaticBoard1(43,37));}
	@Test public void test_board1_2145(){commonTestCode1(43,38,isDInSetOfReachableTilesFromO_StaticBoard1(43,38));}
	@Test public void test_board1_2146(){commonTestCode1(43,39,isDInSetOfReachableTilesFromO_StaticBoard1(43,39));}
	@Test public void test_board1_2147(){commonTestCode1(43,40,isDInSetOfReachableTilesFromO_StaticBoard1(43,40));}
	@Test public void test_board1_2148(){commonTestCode1(43,41,isDInSetOfReachableTilesFromO_StaticBoard1(43,41));}
	@Test public void test_board1_2149(){commonTestCode1(43,42,isDInSetOfReachableTilesFromO_StaticBoard1(43,42));}
	@Test public void test_board1_2150(){commonTestCode1(43,43,isDInSetOfReachableTilesFromO_StaticBoard1(43,43));}
	@Test public void test_board1_2151(){commonTestCode1(43,44,isDInSetOfReachableTilesFromO_StaticBoard1(43,44));}
	@Test public void test_board1_2152(){commonTestCode1(43,45,isDInSetOfReachableTilesFromO_StaticBoard1(43,45));}
	@Test public void test_board1_2153(){commonTestCode1(43,46,isDInSetOfReachableTilesFromO_StaticBoard1(43,46));}
	@Test public void test_board1_2154(){commonTestCode1(43,47,isDInSetOfReachableTilesFromO_StaticBoard1(43,47));}
	@Test public void test_board1_2155(){commonTestCode1(43,48,isDInSetOfReachableTilesFromO_StaticBoard1(43,48));}
	@Test public void test_board1_2156(){commonTestCode1(44,0,isDInSetOfReachableTilesFromO_StaticBoard1(44,0));}
	@Test public void test_board1_2157(){commonTestCode1(44,1,isDInSetOfReachableTilesFromO_StaticBoard1(44,1));}
	@Test public void test_board1_2158(){commonTestCode1(44,2,isDInSetOfReachableTilesFromO_StaticBoard1(44,2));}
	@Test public void test_board1_2159(){commonTestCode1(44,3,isDInSetOfReachableTilesFromO_StaticBoard1(44,3));}
	@Test public void test_board1_2160(){commonTestCode1(44,4,isDInSetOfReachableTilesFromO_StaticBoard1(44,4));}
	@Test public void test_board1_2161(){commonTestCode1(44,5,isDInSetOfReachableTilesFromO_StaticBoard1(44,5));}
	@Test public void test_board1_2162(){commonTestCode1(44,6,isDInSetOfReachableTilesFromO_StaticBoard1(44,6));}
	@Test public void test_board1_2163(){commonTestCode1(44,7,isDInSetOfReachableTilesFromO_StaticBoard1(44,7));}
	@Test public void test_board1_2164(){commonTestCode1(44,8,isDInSetOfReachableTilesFromO_StaticBoard1(44,8));}
	@Test public void test_board1_2165(){commonTestCode1(44,9,isDInSetOfReachableTilesFromO_StaticBoard1(44,9));}
	@Test public void test_board1_2166(){commonTestCode1(44,10,isDInSetOfReachableTilesFromO_StaticBoard1(44,10));}
	@Test public void test_board1_2167(){commonTestCode1(44,11,isDInSetOfReachableTilesFromO_StaticBoard1(44,11));}
	@Test public void test_board1_2168(){commonTestCode1(44,12,isDInSetOfReachableTilesFromO_StaticBoard1(44,12));}
	@Test public void test_board1_2169(){commonTestCode1(44,13,isDInSetOfReachableTilesFromO_StaticBoard1(44,13));}
	@Test public void test_board1_2170(){commonTestCode1(44,14,isDInSetOfReachableTilesFromO_StaticBoard1(44,14));}
	@Test public void test_board1_2171(){commonTestCode1(44,15,isDInSetOfReachableTilesFromO_StaticBoard1(44,15));}
	@Test public void test_board1_2172(){commonTestCode1(44,16,isDInSetOfReachableTilesFromO_StaticBoard1(44,16));}
	@Test public void test_board1_2173(){commonTestCode1(44,17,isDInSetOfReachableTilesFromO_StaticBoard1(44,17));}
	@Test public void test_board1_2174(){commonTestCode1(44,18,isDInSetOfReachableTilesFromO_StaticBoard1(44,18));}
	@Test public void test_board1_2175(){commonTestCode1(44,19,isDInSetOfReachableTilesFromO_StaticBoard1(44,19));}
	@Test public void test_board1_2176(){commonTestCode1(44,20,isDInSetOfReachableTilesFromO_StaticBoard1(44,20));}
	@Test public void test_board1_2177(){commonTestCode1(44,21,isDInSetOfReachableTilesFromO_StaticBoard1(44,21));}
	@Test public void test_board1_2178(){commonTestCode1(44,22,isDInSetOfReachableTilesFromO_StaticBoard1(44,22));}
	@Test public void test_board1_2179(){commonTestCode1(44,23,isDInSetOfReachableTilesFromO_StaticBoard1(44,23));}
	@Test public void test_board1_2180(){commonTestCode1(44,24,isDInSetOfReachableTilesFromO_StaticBoard1(44,24));}
	@Test public void test_board1_2181(){commonTestCode1(44,25,isDInSetOfReachableTilesFromO_StaticBoard1(44,25));}
	@Test public void test_board1_2182(){commonTestCode1(44,26,isDInSetOfReachableTilesFromO_StaticBoard1(44,26));}
	@Test public void test_board1_2183(){commonTestCode1(44,27,isDInSetOfReachableTilesFromO_StaticBoard1(44,27));}
	@Test public void test_board1_2184(){commonTestCode1(44,28,isDInSetOfReachableTilesFromO_StaticBoard1(44,28));}
	@Test public void test_board1_2185(){commonTestCode1(44,29,isDInSetOfReachableTilesFromO_StaticBoard1(44,29));}
	@Test public void test_board1_2186(){commonTestCode1(44,30,isDInSetOfReachableTilesFromO_StaticBoard1(44,30));}
	@Test public void test_board1_2187(){commonTestCode1(44,31,isDInSetOfReachableTilesFromO_StaticBoard1(44,31));}
	@Test public void test_board1_2188(){commonTestCode1(44,32,isDInSetOfReachableTilesFromO_StaticBoard1(44,32));}
	@Test public void test_board1_2189(){commonTestCode1(44,33,isDInSetOfReachableTilesFromO_StaticBoard1(44,33));}
	@Test public void test_board1_2190(){commonTestCode1(44,34,isDInSetOfReachableTilesFromO_StaticBoard1(44,34));}
	@Test public void test_board1_2191(){commonTestCode1(44,35,isDInSetOfReachableTilesFromO_StaticBoard1(44,35));}
	@Test public void test_board1_2192(){commonTestCode1(44,36,isDInSetOfReachableTilesFromO_StaticBoard1(44,36));}
	@Test public void test_board1_2193(){commonTestCode1(44,37,isDInSetOfReachableTilesFromO_StaticBoard1(44,37));}
	@Test public void test_board1_2194(){commonTestCode1(44,38,isDInSetOfReachableTilesFromO_StaticBoard1(44,38));}
	@Test public void test_board1_2195(){commonTestCode1(44,39,isDInSetOfReachableTilesFromO_StaticBoard1(44,39));}
	@Test public void test_board1_2196(){commonTestCode1(44,40,isDInSetOfReachableTilesFromO_StaticBoard1(44,40));}
	@Test public void test_board1_2197(){commonTestCode1(44,41,isDInSetOfReachableTilesFromO_StaticBoard1(44,41));}
	@Test public void test_board1_2198(){commonTestCode1(44,42,isDInSetOfReachableTilesFromO_StaticBoard1(44,42));}
	@Test public void test_board1_2199(){commonTestCode1(44,43,isDInSetOfReachableTilesFromO_StaticBoard1(44,43));}
	@Test public void test_board1_2200(){commonTestCode1(44,44,isDInSetOfReachableTilesFromO_StaticBoard1(44,44));}
	@Test public void test_board1_2201(){commonTestCode1(44,45,isDInSetOfReachableTilesFromO_StaticBoard1(44,45));}
	@Test public void test_board1_2202(){commonTestCode1(44,46,isDInSetOfReachableTilesFromO_StaticBoard1(44,46));}
	@Test public void test_board1_2203(){commonTestCode1(44,47,isDInSetOfReachableTilesFromO_StaticBoard1(44,47));}
	@Test public void test_board1_2204(){commonTestCode1(44,48,isDInSetOfReachableTilesFromO_StaticBoard1(44,48));}
	@Test public void test_board1_2205(){commonTestCode1(45,0,isDInSetOfReachableTilesFromO_StaticBoard1(45,0));}
	@Test public void test_board1_2206(){commonTestCode1(45,1,isDInSetOfReachableTilesFromO_StaticBoard1(45,1));}
	@Test public void test_board1_2207(){commonTestCode1(45,2,isDInSetOfReachableTilesFromO_StaticBoard1(45,2));}
	@Test public void test_board1_2208(){commonTestCode1(45,3,isDInSetOfReachableTilesFromO_StaticBoard1(45,3));}
	@Test public void test_board1_2209(){commonTestCode1(45,4,isDInSetOfReachableTilesFromO_StaticBoard1(45,4));}
	@Test public void test_board1_2210(){commonTestCode1(45,5,isDInSetOfReachableTilesFromO_StaticBoard1(45,5));}
	@Test public void test_board1_2211(){commonTestCode1(45,6,isDInSetOfReachableTilesFromO_StaticBoard1(45,6));}
	@Test public void test_board1_2212(){commonTestCode1(45,7,isDInSetOfReachableTilesFromO_StaticBoard1(45,7));}
	@Test public void test_board1_2213(){commonTestCode1(45,8,isDInSetOfReachableTilesFromO_StaticBoard1(45,8));}
	@Test public void test_board1_2214(){commonTestCode1(45,9,isDInSetOfReachableTilesFromO_StaticBoard1(45,9));}
	@Test public void test_board1_2215(){commonTestCode1(45,10,isDInSetOfReachableTilesFromO_StaticBoard1(45,10));}
	@Test public void test_board1_2216(){commonTestCode1(45,11,isDInSetOfReachableTilesFromO_StaticBoard1(45,11));}
	@Test public void test_board1_2217(){commonTestCode1(45,12,isDInSetOfReachableTilesFromO_StaticBoard1(45,12));}
	@Test public void test_board1_2218(){commonTestCode1(45,13,isDInSetOfReachableTilesFromO_StaticBoard1(45,13));}
	@Test public void test_board1_2219(){commonTestCode1(45,14,isDInSetOfReachableTilesFromO_StaticBoard1(45,14));}
	@Test public void test_board1_2220(){commonTestCode1(45,15,isDInSetOfReachableTilesFromO_StaticBoard1(45,15));}
	@Test public void test_board1_2221(){commonTestCode1(45,16,isDInSetOfReachableTilesFromO_StaticBoard1(45,16));}
	@Test public void test_board1_2222(){commonTestCode1(45,17,isDInSetOfReachableTilesFromO_StaticBoard1(45,17));}
	@Test public void test_board1_2223(){commonTestCode1(45,18,isDInSetOfReachableTilesFromO_StaticBoard1(45,18));}
	@Test public void test_board1_2224(){commonTestCode1(45,19,isDInSetOfReachableTilesFromO_StaticBoard1(45,19));}
	@Test public void test_board1_2225(){commonTestCode1(45,20,isDInSetOfReachableTilesFromO_StaticBoard1(45,20));}
	@Test public void test_board1_2226(){commonTestCode1(45,21,isDInSetOfReachableTilesFromO_StaticBoard1(45,21));}
	@Test public void test_board1_2227(){commonTestCode1(45,22,isDInSetOfReachableTilesFromO_StaticBoard1(45,22));}
	@Test public void test_board1_2228(){commonTestCode1(45,23,isDInSetOfReachableTilesFromO_StaticBoard1(45,23));}
	@Test public void test_board1_2229(){commonTestCode1(45,24,isDInSetOfReachableTilesFromO_StaticBoard1(45,24));}
	@Test public void test_board1_2230(){commonTestCode1(45,25,isDInSetOfReachableTilesFromO_StaticBoard1(45,25));}
	@Test public void test_board1_2231(){commonTestCode1(45,26,isDInSetOfReachableTilesFromO_StaticBoard1(45,26));}
	@Test public void test_board1_2232(){commonTestCode1(45,27,isDInSetOfReachableTilesFromO_StaticBoard1(45,27));}
	@Test public void test_board1_2233(){commonTestCode1(45,28,isDInSetOfReachableTilesFromO_StaticBoard1(45,28));}
	@Test public void test_board1_2234(){commonTestCode1(45,29,isDInSetOfReachableTilesFromO_StaticBoard1(45,29));}
	@Test public void test_board1_2235(){commonTestCode1(45,30,isDInSetOfReachableTilesFromO_StaticBoard1(45,30));}
	@Test public void test_board1_2236(){commonTestCode1(45,31,isDInSetOfReachableTilesFromO_StaticBoard1(45,31));}
	@Test public void test_board1_2237(){commonTestCode1(45,32,isDInSetOfReachableTilesFromO_StaticBoard1(45,32));}
	@Test public void test_board1_2238(){commonTestCode1(45,33,isDInSetOfReachableTilesFromO_StaticBoard1(45,33));}
	@Test public void test_board1_2239(){commonTestCode1(45,34,isDInSetOfReachableTilesFromO_StaticBoard1(45,34));}
	@Test public void test_board1_2240(){commonTestCode1(45,35,isDInSetOfReachableTilesFromO_StaticBoard1(45,35));}
	@Test public void test_board1_2241(){commonTestCode1(45,36,isDInSetOfReachableTilesFromO_StaticBoard1(45,36));}
	@Test public void test_board1_2242(){commonTestCode1(45,37,isDInSetOfReachableTilesFromO_StaticBoard1(45,37));}
	@Test public void test_board1_2243(){commonTestCode1(45,38,isDInSetOfReachableTilesFromO_StaticBoard1(45,38));}
	@Test public void test_board1_2244(){commonTestCode1(45,39,isDInSetOfReachableTilesFromO_StaticBoard1(45,39));}
	@Test public void test_board1_2245(){commonTestCode1(45,40,isDInSetOfReachableTilesFromO_StaticBoard1(45,40));}
	@Test public void test_board1_2246(){commonTestCode1(45,41,isDInSetOfReachableTilesFromO_StaticBoard1(45,41));}
	@Test public void test_board1_2247(){commonTestCode1(45,42,isDInSetOfReachableTilesFromO_StaticBoard1(45,42));}
	@Test public void test_board1_2248(){commonTestCode1(45,43,isDInSetOfReachableTilesFromO_StaticBoard1(45,43));}
	@Test public void test_board1_2249(){commonTestCode1(45,44,isDInSetOfReachableTilesFromO_StaticBoard1(45,44));}
	@Test public void test_board1_2250(){commonTestCode1(45,45,isDInSetOfReachableTilesFromO_StaticBoard1(45,45));}
	@Test public void test_board1_2251(){commonTestCode1(45,46,isDInSetOfReachableTilesFromO_StaticBoard1(45,46));}
	@Test public void test_board1_2252(){commonTestCode1(45,47,isDInSetOfReachableTilesFromO_StaticBoard1(45,47));}
	@Test public void test_board1_2253(){commonTestCode1(45,48,isDInSetOfReachableTilesFromO_StaticBoard1(45,48));}
	@Test public void test_board1_2254(){commonTestCode1(46,0,isDInSetOfReachableTilesFromO_StaticBoard1(46,0));}
	@Test public void test_board1_2255(){commonTestCode1(46,1,isDInSetOfReachableTilesFromO_StaticBoard1(46,1));}
	@Test public void test_board1_2256(){commonTestCode1(46,2,isDInSetOfReachableTilesFromO_StaticBoard1(46,2));}
	@Test public void test_board1_2257(){commonTestCode1(46,3,isDInSetOfReachableTilesFromO_StaticBoard1(46,3));}
	@Test public void test_board1_2258(){commonTestCode1(46,4,isDInSetOfReachableTilesFromO_StaticBoard1(46,4));}
	@Test public void test_board1_2259(){commonTestCode1(46,5,isDInSetOfReachableTilesFromO_StaticBoard1(46,5));}
	@Test public void test_board1_2260(){commonTestCode1(46,6,isDInSetOfReachableTilesFromO_StaticBoard1(46,6));}
	@Test public void test_board1_2261(){commonTestCode1(46,7,isDInSetOfReachableTilesFromO_StaticBoard1(46,7));}
	@Test public void test_board1_2262(){commonTestCode1(46,8,isDInSetOfReachableTilesFromO_StaticBoard1(46,8));}
	@Test public void test_board1_2263(){commonTestCode1(46,9,isDInSetOfReachableTilesFromO_StaticBoard1(46,9));}
	@Test public void test_board1_2264(){commonTestCode1(46,10,isDInSetOfReachableTilesFromO_StaticBoard1(46,10));}
	@Test public void test_board1_2265(){commonTestCode1(46,11,isDInSetOfReachableTilesFromO_StaticBoard1(46,11));}
	@Test public void test_board1_2266(){commonTestCode1(46,12,isDInSetOfReachableTilesFromO_StaticBoard1(46,12));}
	@Test public void test_board1_2267(){commonTestCode1(46,13,isDInSetOfReachableTilesFromO_StaticBoard1(46,13));}
	@Test public void test_board1_2268(){commonTestCode1(46,14,isDInSetOfReachableTilesFromO_StaticBoard1(46,14));}
	@Test public void test_board1_2269(){commonTestCode1(46,15,isDInSetOfReachableTilesFromO_StaticBoard1(46,15));}
	@Test public void test_board1_2270(){commonTestCode1(46,16,isDInSetOfReachableTilesFromO_StaticBoard1(46,16));}
	@Test public void test_board1_2271(){commonTestCode1(46,17,isDInSetOfReachableTilesFromO_StaticBoard1(46,17));}
	@Test public void test_board1_2272(){commonTestCode1(46,18,isDInSetOfReachableTilesFromO_StaticBoard1(46,18));}
	@Test public void test_board1_2273(){commonTestCode1(46,19,isDInSetOfReachableTilesFromO_StaticBoard1(46,19));}
	@Test public void test_board1_2274(){commonTestCode1(46,20,isDInSetOfReachableTilesFromO_StaticBoard1(46,20));}
	@Test public void test_board1_2275(){commonTestCode1(46,21,isDInSetOfReachableTilesFromO_StaticBoard1(46,21));}
	@Test public void test_board1_2276(){commonTestCode1(46,22,isDInSetOfReachableTilesFromO_StaticBoard1(46,22));}
	@Test public void test_board1_2277(){commonTestCode1(46,23,isDInSetOfReachableTilesFromO_StaticBoard1(46,23));}
	@Test public void test_board1_2278(){commonTestCode1(46,24,isDInSetOfReachableTilesFromO_StaticBoard1(46,24));}
	@Test public void test_board1_2279(){commonTestCode1(46,25,isDInSetOfReachableTilesFromO_StaticBoard1(46,25));}
	@Test public void test_board1_2280(){commonTestCode1(46,26,isDInSetOfReachableTilesFromO_StaticBoard1(46,26));}
	@Test public void test_board1_2281(){commonTestCode1(46,27,isDInSetOfReachableTilesFromO_StaticBoard1(46,27));}
	@Test public void test_board1_2282(){commonTestCode1(46,28,isDInSetOfReachableTilesFromO_StaticBoard1(46,28));}
	@Test public void test_board1_2283(){commonTestCode1(46,29,isDInSetOfReachableTilesFromO_StaticBoard1(46,29));}
	@Test public void test_board1_2284(){commonTestCode1(46,30,isDInSetOfReachableTilesFromO_StaticBoard1(46,30));}
	@Test public void test_board1_2285(){commonTestCode1(46,31,isDInSetOfReachableTilesFromO_StaticBoard1(46,31));}
	@Test public void test_board1_2286(){commonTestCode1(46,32,isDInSetOfReachableTilesFromO_StaticBoard1(46,32));}
	@Test public void test_board1_2287(){commonTestCode1(46,33,isDInSetOfReachableTilesFromO_StaticBoard1(46,33));}
	@Test public void test_board1_2288(){commonTestCode1(46,34,isDInSetOfReachableTilesFromO_StaticBoard1(46,34));}
	@Test public void test_board1_2289(){commonTestCode1(46,35,isDInSetOfReachableTilesFromO_StaticBoard1(46,35));}
	@Test public void test_board1_2290(){commonTestCode1(46,36,isDInSetOfReachableTilesFromO_StaticBoard1(46,36));}
	@Test public void test_board1_2291(){commonTestCode1(46,37,isDInSetOfReachableTilesFromO_StaticBoard1(46,37));}
	@Test public void test_board1_2292(){commonTestCode1(46,38,isDInSetOfReachableTilesFromO_StaticBoard1(46,38));}
	@Test public void test_board1_2293(){commonTestCode1(46,39,isDInSetOfReachableTilesFromO_StaticBoard1(46,39));}
	@Test public void test_board1_2294(){commonTestCode1(46,40,isDInSetOfReachableTilesFromO_StaticBoard1(46,40));}
	@Test public void test_board1_2295(){commonTestCode1(46,41,isDInSetOfReachableTilesFromO_StaticBoard1(46,41));}
	@Test public void test_board1_2296(){commonTestCode1(46,42,isDInSetOfReachableTilesFromO_StaticBoard1(46,42));}
	@Test public void test_board1_2297(){commonTestCode1(46,43,isDInSetOfReachableTilesFromO_StaticBoard1(46,43));}
	@Test public void test_board1_2298(){commonTestCode1(46,44,isDInSetOfReachableTilesFromO_StaticBoard1(46,44));}
	@Test public void test_board1_2299(){commonTestCode1(46,45,isDInSetOfReachableTilesFromO_StaticBoard1(46,45));}
	@Test public void test_board1_2300(){commonTestCode1(46,46,isDInSetOfReachableTilesFromO_StaticBoard1(46,46));}
	@Test public void test_board1_2301(){commonTestCode1(46,47,isDInSetOfReachableTilesFromO_StaticBoard1(46,47));}
	@Test public void test_board1_2302(){commonTestCode1(46,48,isDInSetOfReachableTilesFromO_StaticBoard1(46,48));}
	@Test public void test_board1_2303(){commonTestCode1(47,0,isDInSetOfReachableTilesFromO_StaticBoard1(47,0));}
	@Test public void test_board1_2304(){commonTestCode1(47,1,isDInSetOfReachableTilesFromO_StaticBoard1(47,1));}
	@Test public void test_board1_2305(){commonTestCode1(47,2,isDInSetOfReachableTilesFromO_StaticBoard1(47,2));}
	@Test public void test_board1_2306(){commonTestCode1(47,3,isDInSetOfReachableTilesFromO_StaticBoard1(47,3));}
	@Test public void test_board1_2307(){commonTestCode1(47,4,isDInSetOfReachableTilesFromO_StaticBoard1(47,4));}
	@Test public void test_board1_2308(){commonTestCode1(47,5,isDInSetOfReachableTilesFromO_StaticBoard1(47,5));}
	@Test public void test_board1_2309(){commonTestCode1(47,6,isDInSetOfReachableTilesFromO_StaticBoard1(47,6));}
	@Test public void test_board1_2310(){commonTestCode1(47,7,isDInSetOfReachableTilesFromO_StaticBoard1(47,7));}
	@Test public void test_board1_2311(){commonTestCode1(47,8,isDInSetOfReachableTilesFromO_StaticBoard1(47,8));}
	@Test public void test_board1_2312(){commonTestCode1(47,9,isDInSetOfReachableTilesFromO_StaticBoard1(47,9));}
	@Test public void test_board1_2313(){commonTestCode1(47,10,isDInSetOfReachableTilesFromO_StaticBoard1(47,10));}
	@Test public void test_board1_2314(){commonTestCode1(47,11,isDInSetOfReachableTilesFromO_StaticBoard1(47,11));}
	@Test public void test_board1_2315(){commonTestCode1(47,12,isDInSetOfReachableTilesFromO_StaticBoard1(47,12));}
	@Test public void test_board1_2316(){commonTestCode1(47,13,isDInSetOfReachableTilesFromO_StaticBoard1(47,13));}
	@Test public void test_board1_2317(){commonTestCode1(47,14,isDInSetOfReachableTilesFromO_StaticBoard1(47,14));}
	@Test public void test_board1_2318(){commonTestCode1(47,15,isDInSetOfReachableTilesFromO_StaticBoard1(47,15));}
	@Test public void test_board1_2319(){commonTestCode1(47,16,isDInSetOfReachableTilesFromO_StaticBoard1(47,16));}
	@Test public void test_board1_2320(){commonTestCode1(47,17,isDInSetOfReachableTilesFromO_StaticBoard1(47,17));}
	@Test public void test_board1_2321(){commonTestCode1(47,18,isDInSetOfReachableTilesFromO_StaticBoard1(47,18));}
	@Test public void test_board1_2322(){commonTestCode1(47,19,isDInSetOfReachableTilesFromO_StaticBoard1(47,19));}
	@Test public void test_board1_2323(){commonTestCode1(47,20,isDInSetOfReachableTilesFromO_StaticBoard1(47,20));}
	@Test public void test_board1_2324(){commonTestCode1(47,21,isDInSetOfReachableTilesFromO_StaticBoard1(47,21));}
	@Test public void test_board1_2325(){commonTestCode1(47,22,isDInSetOfReachableTilesFromO_StaticBoard1(47,22));}
	@Test public void test_board1_2326(){commonTestCode1(47,23,isDInSetOfReachableTilesFromO_StaticBoard1(47,23));}
	@Test public void test_board1_2327(){commonTestCode1(47,24,isDInSetOfReachableTilesFromO_StaticBoard1(47,24));}
	@Test public void test_board1_2328(){commonTestCode1(47,25,isDInSetOfReachableTilesFromO_StaticBoard1(47,25));}
	@Test public void test_board1_2329(){commonTestCode1(47,26,isDInSetOfReachableTilesFromO_StaticBoard1(47,26));}
	@Test public void test_board1_2330(){commonTestCode1(47,27,isDInSetOfReachableTilesFromO_StaticBoard1(47,27));}
	@Test public void test_board1_2331(){commonTestCode1(47,28,isDInSetOfReachableTilesFromO_StaticBoard1(47,28));}
	@Test public void test_board1_2332(){commonTestCode1(47,29,isDInSetOfReachableTilesFromO_StaticBoard1(47,29));}
	@Test public void test_board1_2333(){commonTestCode1(47,30,isDInSetOfReachableTilesFromO_StaticBoard1(47,30));}
	@Test public void test_board1_2334(){commonTestCode1(47,31,isDInSetOfReachableTilesFromO_StaticBoard1(47,31));}
	@Test public void test_board1_2335(){commonTestCode1(47,32,isDInSetOfReachableTilesFromO_StaticBoard1(47,32));}
	@Test public void test_board1_2336(){commonTestCode1(47,33,isDInSetOfReachableTilesFromO_StaticBoard1(47,33));}
	@Test public void test_board1_2337(){commonTestCode1(47,34,isDInSetOfReachableTilesFromO_StaticBoard1(47,34));}
	@Test public void test_board1_2338(){commonTestCode1(47,35,isDInSetOfReachableTilesFromO_StaticBoard1(47,35));}
	@Test public void test_board1_2339(){commonTestCode1(47,36,isDInSetOfReachableTilesFromO_StaticBoard1(47,36));}
	@Test public void test_board1_2340(){commonTestCode1(47,37,isDInSetOfReachableTilesFromO_StaticBoard1(47,37));}
	@Test public void test_board1_2341(){commonTestCode1(47,38,isDInSetOfReachableTilesFromO_StaticBoard1(47,38));}
	@Test public void test_board1_2342(){commonTestCode1(47,39,isDInSetOfReachableTilesFromO_StaticBoard1(47,39));}
	@Test public void test_board1_2343(){commonTestCode1(47,40,isDInSetOfReachableTilesFromO_StaticBoard1(47,40));}
	@Test public void test_board1_2344(){commonTestCode1(47,41,isDInSetOfReachableTilesFromO_StaticBoard1(47,41));}
	@Test public void test_board1_2345(){commonTestCode1(47,42,isDInSetOfReachableTilesFromO_StaticBoard1(47,42));}
	@Test public void test_board1_2346(){commonTestCode1(47,43,isDInSetOfReachableTilesFromO_StaticBoard1(47,43));}
	@Test public void test_board1_2347(){commonTestCode1(47,44,isDInSetOfReachableTilesFromO_StaticBoard1(47,44));}
	@Test public void test_board1_2348(){commonTestCode1(47,45,isDInSetOfReachableTilesFromO_StaticBoard1(47,45));}
	@Test public void test_board1_2349(){commonTestCode1(47,46,isDInSetOfReachableTilesFromO_StaticBoard1(47,46));}
	@Test public void test_board1_2350(){commonTestCode1(47,47,isDInSetOfReachableTilesFromO_StaticBoard1(47,47));}
	@Test public void test_board1_2351(){commonTestCode1(47,48,isDInSetOfReachableTilesFromO_StaticBoard1(47,48));}
	@Test public void test_board1_2352(){commonTestCode1(48,0,isDInSetOfReachableTilesFromO_StaticBoard1(48,0));}
	@Test public void test_board1_2353(){commonTestCode1(48,1,isDInSetOfReachableTilesFromO_StaticBoard1(48,1));}
	@Test public void test_board1_2354(){commonTestCode1(48,2,isDInSetOfReachableTilesFromO_StaticBoard1(48,2));}
	@Test public void test_board1_2355(){commonTestCode1(48,3,isDInSetOfReachableTilesFromO_StaticBoard1(48,3));}
	@Test public void test_board1_2356(){commonTestCode1(48,4,isDInSetOfReachableTilesFromO_StaticBoard1(48,4));}
	@Test public void test_board1_2357(){commonTestCode1(48,5,isDInSetOfReachableTilesFromO_StaticBoard1(48,5));}
	@Test public void test_board1_2358(){commonTestCode1(48,6,isDInSetOfReachableTilesFromO_StaticBoard1(48,6));}
	@Test public void test_board1_2359(){commonTestCode1(48,7,isDInSetOfReachableTilesFromO_StaticBoard1(48,7));}
	@Test public void test_board1_2360(){commonTestCode1(48,8,isDInSetOfReachableTilesFromO_StaticBoard1(48,8));}
	@Test public void test_board1_2361(){commonTestCode1(48,9,isDInSetOfReachableTilesFromO_StaticBoard1(48,9));}
	@Test public void test_board1_2362(){commonTestCode1(48,10,isDInSetOfReachableTilesFromO_StaticBoard1(48,10));}
	@Test public void test_board1_2363(){commonTestCode1(48,11,isDInSetOfReachableTilesFromO_StaticBoard1(48,11));}
	@Test public void test_board1_2364(){commonTestCode1(48,12,isDInSetOfReachableTilesFromO_StaticBoard1(48,12));}
	@Test public void test_board1_2365(){commonTestCode1(48,13,isDInSetOfReachableTilesFromO_StaticBoard1(48,13));}
	@Test public void test_board1_2366(){commonTestCode1(48,14,isDInSetOfReachableTilesFromO_StaticBoard1(48,14));}
	@Test public void test_board1_2367(){commonTestCode1(48,15,isDInSetOfReachableTilesFromO_StaticBoard1(48,15));}
	@Test public void test_board1_2368(){commonTestCode1(48,16,isDInSetOfReachableTilesFromO_StaticBoard1(48,16));}
	@Test public void test_board1_2369(){commonTestCode1(48,17,isDInSetOfReachableTilesFromO_StaticBoard1(48,17));}
	@Test public void test_board1_2370(){commonTestCode1(48,18,isDInSetOfReachableTilesFromO_StaticBoard1(48,18));}
	@Test public void test_board1_2371(){commonTestCode1(48,19,isDInSetOfReachableTilesFromO_StaticBoard1(48,19));}
	@Test public void test_board1_2372(){commonTestCode1(48,20,isDInSetOfReachableTilesFromO_StaticBoard1(48,20));}
	@Test public void test_board1_2373(){commonTestCode1(48,21,isDInSetOfReachableTilesFromO_StaticBoard1(48,21));}
	@Test public void test_board1_2374(){commonTestCode1(48,22,isDInSetOfReachableTilesFromO_StaticBoard1(48,22));}
	@Test public void test_board1_2375(){commonTestCode1(48,23,isDInSetOfReachableTilesFromO_StaticBoard1(48,23));}
	@Test public void test_board1_2376(){commonTestCode1(48,24,isDInSetOfReachableTilesFromO_StaticBoard1(48,24));}
	@Test public void test_board1_2377(){commonTestCode1(48,25,isDInSetOfReachableTilesFromO_StaticBoard1(48,25));}
	@Test public void test_board1_2378(){commonTestCode1(48,26,isDInSetOfReachableTilesFromO_StaticBoard1(48,26));}
	@Test public void test_board1_2379(){commonTestCode1(48,27,isDInSetOfReachableTilesFromO_StaticBoard1(48,27));}
	@Test public void test_board1_2380(){commonTestCode1(48,28,isDInSetOfReachableTilesFromO_StaticBoard1(48,28));}
	@Test public void test_board1_2381(){commonTestCode1(48,29,isDInSetOfReachableTilesFromO_StaticBoard1(48,29));}
	@Test public void test_board1_2382(){commonTestCode1(48,30,isDInSetOfReachableTilesFromO_StaticBoard1(48,30));}
	@Test public void test_board1_2383(){commonTestCode1(48,31,isDInSetOfReachableTilesFromO_StaticBoard1(48,31));}
	@Test public void test_board1_2384(){commonTestCode1(48,32,isDInSetOfReachableTilesFromO_StaticBoard1(48,32));}
	@Test public void test_board1_2385(){commonTestCode1(48,33,isDInSetOfReachableTilesFromO_StaticBoard1(48,33));}
	@Test public void test_board1_2386(){commonTestCode1(48,34,isDInSetOfReachableTilesFromO_StaticBoard1(48,34));}
	@Test public void test_board1_2387(){commonTestCode1(48,35,isDInSetOfReachableTilesFromO_StaticBoard1(48,35));}
	@Test public void test_board1_2388(){commonTestCode1(48,36,isDInSetOfReachableTilesFromO_StaticBoard1(48,36));}
	@Test public void test_board1_2389(){commonTestCode1(48,37,isDInSetOfReachableTilesFromO_StaticBoard1(48,37));}
	@Test public void test_board1_2390(){commonTestCode1(48,38,isDInSetOfReachableTilesFromO_StaticBoard1(48,38));}
	@Test public void test_board1_2391(){commonTestCode1(48,39,isDInSetOfReachableTilesFromO_StaticBoard1(48,39));}
	@Test public void test_board1_2392(){commonTestCode1(48,40,isDInSetOfReachableTilesFromO_StaticBoard1(48,40));}
	@Test public void test_board1_2393(){commonTestCode1(48,41,isDInSetOfReachableTilesFromO_StaticBoard1(48,41));}
	@Test public void test_board1_2394(){commonTestCode1(48,42,isDInSetOfReachableTilesFromO_StaticBoard1(48,42));}
	@Test public void test_board1_2395(){commonTestCode1(48,43,isDInSetOfReachableTilesFromO_StaticBoard1(48,43));}
	@Test public void test_board1_2396(){commonTestCode1(48,44,isDInSetOfReachableTilesFromO_StaticBoard1(48,44));}
	@Test public void test_board1_2397(){commonTestCode1(48,45,isDInSetOfReachableTilesFromO_StaticBoard1(48,45));}
	@Test public void test_board1_2398(){commonTestCode1(48,46,isDInSetOfReachableTilesFromO_StaticBoard1(48,46));}
	@Test public void test_board1_2399(){commonTestCode1(48,47,isDInSetOfReachableTilesFromO_StaticBoard1(48,47));}
	@Test public void test_board1_2400(){commonTestCode1(48,48,isDInSetOfReachableTilesFromO_StaticBoard1(48,48));}

}
