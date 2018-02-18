package tests.gameboard;

import static org.junit.Assert.*;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.GameBoard;

public class GetTileFromTileNumberTests {
		
	public void commonCodeForTileNumbers0To48WithPopulatedBoard(int row, int col, int tileNum){
		GameBoard gb = new GameBoard(4);
		gb.setupRandomBoard();
		AbstractTile expected;
		int r = tileNum / 7;
		int c = tileNum % 7;
		if(tileNum >=0 && tileNum <= 48){expected = gb.getBoard()[r][c];}
		else if(row < 0 || row > 48 || col < 0 || col > 48 || tileNum < 0 || tileNum > 48){ expected = null;}
		else{expected = gb.getBoard()[row][col];}
		AbstractTile actual = gb.getTileFromTileNumber(tileNum);
		assertTrue("",expected==actual);
	}
		
		//Valid Tile Number, Valid Coordinates
		@Test public void test0(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,0,0);}
		@Test public void test1(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,1,1);}
		@Test public void test2(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,2,2);}
		@Test public void test3(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,3,3);}
		@Test public void test4(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,4,4);}
		@Test public void test5(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,5,5);}
		@Test public void test6(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,6,6);}
		@Test public void test7(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,0,7);}
		@Test public void test8(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,1,8);}
		@Test public void test9(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,2,9);}
		@Test public void test10(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,3,10);}
		@Test public void test11(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,4,11);}
		@Test public void test12(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,5,12);}
		@Test public void test13(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,6,13);}
		@Test public void test14(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,0,14);}
		@Test public void test15(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,1,15);}
		@Test public void test16(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,2,16);}
		@Test public void test17(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,3,17);}
		@Test public void test18(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,4,18);}
		@Test public void test19(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,5,19);}
		@Test public void test20(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,6,20);}
		@Test public void test21(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,0,21);}
		@Test public void test22(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,1,22);}
		@Test public void test23(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,2,23);}
		@Test public void test24(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,3,24);}
		@Test public void test25(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,4,25);}
		@Test public void test26(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,5,26);}
		@Test public void test27(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,6,27);}
		@Test public void test28(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,0,28);}
		@Test public void test29(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,1,29);}
		@Test public void test30(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,2,30);}
		@Test public void test31(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,3,31);}
		@Test public void test32(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,4,32);}
		@Test public void test33(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,5,33);}
		@Test public void test34(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,6,34);}
		@Test public void test35(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,0,35);}
		@Test public void test36(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,1,36);}
		@Test public void test37(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,2,37);}
		@Test public void test38(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,3,38);}
		@Test public void test39(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,4,39);}
		@Test public void test40(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,5,40);}
		@Test public void test41(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,6,41);}
		@Test public void test42(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,0,42);}
		@Test public void test43(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,1,43);}
		@Test public void test44(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,2,44);}
		@Test public void test45(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,3,45);}
		@Test public void test46(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,4,46);}
		@Test public void test47(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,5,47);}
		@Test public void test48(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,6,48);}

		//Invalid Tile Number and Valid Coordinates
		@Test public void test49(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,0,100);}
		@Test public void test50(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,1,100);}
		@Test public void test51(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,2,100);}
		@Test public void test52(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,3,100);}
		@Test public void test53(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,4,100);}
		@Test public void test54(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,5,100);}
		@Test public void test55(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,6,100);}
		@Test public void test56(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,0,100);}
		@Test public void test57(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,1,100);}
		@Test public void test58(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,2,100);}
		@Test public void test59(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,3,100);}
		@Test public void test60(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,4,100);}
		@Test public void test61(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,5,100);}
		@Test public void test62(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,6,100);}
		@Test public void test63(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,0,100);}
		@Test public void test64(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,1,100);}
		@Test public void test65(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,2,100);}
		@Test public void test66(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,3,100);}
		@Test public void test67(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,4,100);}
		@Test public void test68(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,5,100);}
		@Test public void test69(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,6,100);}
		@Test public void test70(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,0,100);}
		@Test public void test71(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,1,100);}
		@Test public void test72(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,2,100);}
		@Test public void test73(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,3,100);}
		@Test public void test74(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,4,100);}
		@Test public void test75(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,5,100);}
		@Test public void test76(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,6,100);}
		@Test public void test77(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,0,100);}
		@Test public void test78(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,1,100);}
		@Test public void test79(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,2,100);}
		@Test public void test80(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,3,100);}
		@Test public void test81(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,4,100);}
		@Test public void test82(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,5,100);}
		@Test public void test83(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,6,100);}
		@Test public void test84(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,0,100);}
		@Test public void test85(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,1,100);}
		@Test public void test86(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,2,100);}
		@Test public void test87(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,3,100);}
		@Test public void test88(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,4,100);}
		@Test public void test89(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,5,100);}
		@Test public void test90(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,6,100);}
		@Test public void test91(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,0,100);}
		@Test public void test92(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,1,100);}
		@Test public void test93(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,2,100);}
		@Test public void test94(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,3,100);}
		@Test public void test95(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,4,100);}
		@Test public void test96(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,5,100);}
		@Test public void test97(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,6,100);}

		@Test public void test98(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,0,-100);}
		@Test public void test99(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,1,-100);}
		@Test public void test100(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,2,-100);}
		@Test public void test101(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,3,-100);}
		@Test public void test102(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,4,-100);}
		@Test public void test103(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,5,-100);}
		@Test public void test104(){commonCodeForTileNumbers0To48WithPopulatedBoard(0,6,-100);}
		@Test public void test105(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,0,-100);}
		@Test public void test106(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,1,-100);}
		@Test public void test107(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,2,-100);}
		@Test public void test108(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,3,-100);}
		@Test public void test109(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,4,-100);}
		@Test public void test110(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,5,-100);}
		@Test public void test111(){commonCodeForTileNumbers0To48WithPopulatedBoard(1,6,-100);}
		@Test public void test112(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,0,-100);}
		@Test public void test113(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,1,-100);}
		@Test public void test114(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,2,-100);}
		@Test public void test115(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,3,-100);}
		@Test public void test116(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,4,-100);}
		@Test public void test117(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,5,-100);}
		@Test public void test118(){commonCodeForTileNumbers0To48WithPopulatedBoard(2,6,-100);}
		@Test public void test119(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,0,-100);}
		@Test public void test120(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,1,-100);}
		@Test public void test121(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,2,-100);}
		@Test public void test122(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,3,-100);}
		@Test public void test123(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,4,-100);}
		@Test public void test124(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,5,-100);}
		@Test public void test125(){commonCodeForTileNumbers0To48WithPopulatedBoard(3,6,-100);}
		@Test public void test126(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,0,-100);}
		@Test public void test127(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,1,-100);}
		@Test public void test128(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,2,-100);}
		@Test public void test129(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,3,-100);}
		@Test public void test130(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,4,-100);}
		@Test public void test131(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,5,-100);}
		@Test public void test132(){commonCodeForTileNumbers0To48WithPopulatedBoard(4,6,-100);}
		@Test public void test133(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,0,-100);}
		@Test public void test134(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,1,-100);}
		@Test public void test135(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,2,-100);}
		@Test public void test136(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,3,-100);}
		@Test public void test137(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,4,-100);}
		@Test public void test138(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,5,-100);}
		@Test public void test139(){commonCodeForTileNumbers0To48WithPopulatedBoard(5,6,-100);}
		@Test public void test140(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,0,-100);}
		@Test public void test141(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,1,-100);}
		@Test public void test142(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,2,-100);}
		@Test public void test143(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,3,-100);}
		@Test public void test144(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,4,-100);}
		@Test public void test145(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,5,-100);}
		@Test public void test146(){commonCodeForTileNumbers0To48WithPopulatedBoard(6,6,-100);}
		
		@Test public void test2000(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,10,0);}
		@Test public void test147(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,11,1);}
		@Test public void test148(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,12,2);}
		@Test public void test149(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,13,3);}
		@Test public void test150(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,14,4);}
		@Test public void test151(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,15,5);}
		@Test public void test152(){commonCodeForTileNumbers0To48WithPopulatedBoard(10,16,6);}
		@Test public void test153(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,10,7);}
		@Test public void test154(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,11,8);}
		@Test public void test155(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,12,9);}
		@Test public void test156(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,13,10);}
		@Test public void test157(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,14,11);}
		@Test public void test158(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,15,12);}
		@Test public void test159(){commonCodeForTileNumbers0To48WithPopulatedBoard(11,16,13);}
		@Test public void test160(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,10,14);}
		@Test public void test161(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,11,15);}
		@Test public void test162(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,12,16);}
		@Test public void test163(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,13,17);}
		@Test public void test164(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,14,18);}
		@Test public void test165(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,15,19);}
		@Test public void test166(){commonCodeForTileNumbers0To48WithPopulatedBoard(12,16,20);}
		@Test public void test167(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,10,21);}
		@Test public void test168(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,11,22);}
		@Test public void test169(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,12,23);}
		@Test public void test170(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,13,24);}
		@Test public void test171(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,14,25);}
		@Test public void test172(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,15,26);}
		@Test public void test173(){commonCodeForTileNumbers0To48WithPopulatedBoard(13,16,27);}
		@Test public void test174(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,10,28);}
		@Test public void test175(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,11,29);}
		@Test public void test176(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,12,30);}
		@Test public void test177(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,13,31);}
		@Test public void test178(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,14,32);}
		@Test public void test179(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,15,33);}
		@Test public void test180(){commonCodeForTileNumbers0To48WithPopulatedBoard(14,16,34);}
		@Test public void test181(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,10,35);}
		@Test public void test182(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,11,36);}
		@Test public void test183(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,12,37);}
		@Test public void test184(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,13,38);}
		@Test public void test185(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,14,39);}
		@Test public void test186(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,15,40);}
		@Test public void test187(){commonCodeForTileNumbers0To48WithPopulatedBoard(15,16,41);}
		@Test public void test188(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,10,42);}
		@Test public void test189(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,11,43);}
		@Test public void test190(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,12,44);}
		@Test public void test191(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,13,45);}
		@Test public void test192(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,14,46);}
		@Test public void test193(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,15,47);}
		@Test public void test194(){commonCodeForTileNumbers0To48WithPopulatedBoard(16,16,48);}

		@Test public void test195(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-10,0);}
		@Test public void test196(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-11,1);}
		@Test public void test197(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-12,2);}
		@Test public void test198(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-13,3);}
		@Test public void test199(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-14,4);}
		@Test public void test200(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-15,5);}
		@Test public void test201(){commonCodeForTileNumbers0To48WithPopulatedBoard(-10,-16,6);}
		@Test public void test202(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-10,7);}
		@Test public void test203(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-11,8);}
		@Test public void test204(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-12,9);}
		@Test public void test205(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-13,10);}
		@Test public void test206(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-14,11);}
		@Test public void test207(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-15,12);}
		@Test public void test208(){commonCodeForTileNumbers0To48WithPopulatedBoard(-11,-16,13);}
		@Test public void test209(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-10,14);}
		@Test public void test210(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-11,15);}
		@Test public void test211(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-12,16);}
		@Test public void test212(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-13,17);}
		@Test public void test213(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-14,18);}
		@Test public void test214(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-15,19);}
		@Test public void test215(){commonCodeForTileNumbers0To48WithPopulatedBoard(-12,-16,20);}
		@Test public void test216(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-10,21);}
		@Test public void test217(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-11,22);}
		@Test public void test218(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-12,23);}
		@Test public void test219(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-13,24);}
		@Test public void test220(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-14,25);}
		@Test public void test221(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-15,26);}
		@Test public void test222(){commonCodeForTileNumbers0To48WithPopulatedBoard(-13,-16,27);}
		@Test public void test223(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-10,28);}
		@Test public void test224(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-11,29);}
		@Test public void test225(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-12,30);}
		@Test public void test226(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-13,31);}
		@Test public void test227(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-14,32);}
		@Test public void test228(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-15,33);}
		@Test public void test229(){commonCodeForTileNumbers0To48WithPopulatedBoard(-14,-16,34);}
		@Test public void test230(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-10,35);}
		@Test public void test231(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-11,36);}
		@Test public void test232(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-12,37);}
		@Test public void test233(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-13,38);}
		@Test public void test234(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-14,39);}
		@Test public void test235(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-15,40);}
		@Test public void test236(){commonCodeForTileNumbers0To48WithPopulatedBoard(-15,-16,41);}
		@Test public void test237(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-10,42);}
		@Test public void test238(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-11,43);}
		@Test public void test239(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-12,44);}
		@Test public void test240(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-13,45);}
		@Test public void test241(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-14,46);}
		@Test public void test242(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-15,47);}
		@Test public void test243(){commonCodeForTileNumbers0To48WithPopulatedBoard(-16,-16,48);}

}
