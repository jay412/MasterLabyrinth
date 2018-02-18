package code;
import code.model.*;

import java.util.ArrayList;

import javax.swing.SwingUtilities;
import code.gui.GameBoardGUI;
import code.model.GameBoard;
import code.model.Player;

/**
 * Driver class has a main method which is entry point to run the game
 * @author weijin,satya 04-03-16 6:33pm
 * @author Ian, Josh	04-04-16
 */

public class Driver {
	
	/**
	  * This starts and sets up the game board and the players
	  * @param args the args are put in when you go to run config,
	  * and go to the arguments tab and type in the players that want to play
	  * For example you would type in: Tom Ben Jerry 
	  * Which would give you 3 players and be counted in the for loop by the in countNumOfPlayers
	  * @author Josh,Ken
	  */
	public static void main(String[] args){
		if(args.length > 1 && args.length < 5 ) {
			GameBoard gb = new GameBoard(args.length);
			gb.setupRandomBoard();
			
//			  ArrayList<MoveableTile> al = new ArrayList<MoveableTile>();
//				//MOveableCol1
//				MoveableTile m1 = new MoveableTile("I");
//				al.add(m1);
//				MoveableTile m2 = new MoveableTile("I");
//				al.add(m2);
//				MoveableTile m3 = new MoveableTile("I");
//				m3.rotate(90);
//				al.add(m3);
//				MoveableTile m4 = new MoveableTile("I");
//				m4.rotate(90);
//				al.add(m4);
//				MoveableTile m5 = new MoveableTile("L");
//				m5.rotate(90);
//				al.add(m5);
//				MoveableTile m6 = new MoveableTile("I");
//				m6.rotate(90);
//				al.add(m6);
//				MoveableTile m7 = new MoveableTile("I");
//				al.add(m7);
//				
//				//MoveableCol2
//				MoveableTile m8 = new MoveableTile("L");
//				m8.rotate(180);
//				al.add(m8);
//				MoveableTile m9 = new MoveableTile("I");
//				m9.rotate(90);
//				al.add(m9);
//				MoveableTile m10 = new MoveableTile("T");
//				al.add(m10);
//				MoveableTile m11 = new MoveableTile("I");
//				m11.rotate(0);
//				al.add(m11);
//				MoveableTile m12 = new MoveableTile("L");
//				m12.rotate(0);
//				al.add(m12);
//				MoveableTile m13 = new MoveableTile("T");
//				m13.rotate(0);
//				al.add(m13);
//				MoveableTile m14 = new MoveableTile("L");
//				m14.rotate(0);
//				al.add(m14);
//				
//				//MoveableCol3
//				MoveableTile m15 = new MoveableTile("L");
//				al.add(m15);
//				MoveableTile m16 = new MoveableTile("T");
//				m16.rotate(0);
//				al.add(m16);
//				MoveableTile m17 = new MoveableTile("L");
//				al.add(m17);
//				MoveableTile m18 = new MoveableTile("L");
//				m18.rotate(180);
//				al.add(m18);
//				MoveableTile m19 = new MoveableTile("T");
//				m19.rotate(90);
//				al.add(m19);
//				MoveableTile m20 = new MoveableTile("L");
//				m20.rotate(180);
//				al.add(m20);
//				MoveableTile m21 = new MoveableTile("T");
//				m21.rotate(90);
//				al.add(m21);
//				
//				//MoveableRow1
//				MoveableTile m22 = new MoveableTile("T");
//				m22.rotate(0);
//				al.add(m22);
//				MoveableTile m23 = new MoveableTile("L");
//				m23.rotate(90);
//				al.add(m23);
//				MoveableTile m24 = new MoveableTile("I");
//				m24.rotate(0);
//				al.add(m24);
//				MoveableTile m25 = new MoveableTile("L");
//				m25.rotate(90);
//				al.add(m25);
//				
//				//MoveableRow2
//				MoveableTile m26 = new MoveableTile("L");
//				m26.rotate(90);
//				al.add(m26);
//				MoveableTile m27 = new MoveableTile("I");
//				m27.rotate(90);
//				al.add(m27);
//				MoveableTile m28 = new MoveableTile("L");
//				m28.rotate(0);
//				al.add(m28);
//				MoveableTile m29 = new MoveableTile("L");
//				m29.rotate(90);
//				al.add(m29);
//				
//				//MoveableRow3
//				MoveableTile m30 = new MoveableTile("L");
//				m30.rotate(0);
//				al.add(m30);
//				MoveableTile m31 = new MoveableTile("I");
//				m31.rotate(0);
//				al.add(m31);
//				MoveableTile m32 = new MoveableTile("I");
//				m32.rotate(90);
//				al.add(m32);
//				MoveableTile m33 = new MoveableTile("I");
//				m33.rotate(90);
//				al.add(m33);
//				
//				MoveableTile m34 = new MoveableTile("L");
//				al.add(m34);
//			  
//			  
//			  gb.populateStaticMoveableTileArray(al);
//			  gb.setupStaticBoard();
			Player[] players = gb.getPlayers();
			if (args.length >= 2) {
				players[0].setName(args[0]);
				players[1].setName(args[1]);
			}
			if (args.length >= 3) {
				players[2].setName(args[2]);
			}
			if (args.length >= 4) {
				players[3].setName(args[3]);
			}
			
			SwingUtilities.invokeLater(new GameBoardGUI(gb));
		} else if (args.length == 1) {
			GameBoard gb = GameBoard.load(args[0]);
			if (gb != null) {
				SwingUtilities.invokeLater(new GameBoardGUI(gb));
			} else {
				System.out.println("Your game could not be loaded.");
			}
		}
		else{
			System.out.println("You should only have 2-4 players for this game.");
		}
	}
}
