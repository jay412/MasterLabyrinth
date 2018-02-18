package code.gui;
import code.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import code.model.GameBoard;


/**
 * This is the Handler for the 49 JButtons in the GameBoard, corresponding to the tiles in the game
 * @author Ian, Ken 04-10-16
 *
 */
public class GameBoardButtonHandler implements ActionListener{

	/**
	 * refers to the rows of the gameboard
	 */
	private int _row;
	
	/**
	 * refers to the columns of the gameboard
	 */
	private int _col;
	
	/**
	 * refers to the gameboard object
	 */
	GameBoard _gb;
	
	/**
	 * refers to the gameboardGUI object
	 */
	GameBoardGUI _gbGUI;
	
	/**
	 * This method takes in the the value of row and column
	 * and reference to the GameBoard and GameBoardGUI
	 * @param i the row
	 * @param j the column
	 * @param gb gameboard object
	 * @param gbGUI GameBoardGUI object
	 * @author Ian,Ken 04-10-16
	 */
	public GameBoardButtonHandler(int i, int j, GameBoard gb, GameBoardGUI gbGUI){
		_row = i;
		_col = j;
		_gb = gb;
		_gbGUI = gbGUI;
	}
	
	
	@Override
	/**
	 * This method ensures that the JButton click responds with the appropriate action in the game
	 * depending on whether the player has inserted the shiftable tile and/or moved during this turn.
	 * @param e The ActionEvent generated when one of the 49 JButtons on the GameBoard is clicked.
	 * @author Ian,Ken 04-10-16
	 */
	public void actionPerformed(ActionEvent e) {
		if(GameBoard.CURRENTPLAYER.getHasInsertedThisTurn() == false
				&& GameBoard.CURRENTPLAYER.getHasMovedThisTurn() == false){
			int tileNum = _row * 7 + _col;
			GameBoard.CURRENTPLAYER.insertShiftableTile(tileNum);
		}
		else if(GameBoard.CURRENTPLAYER.getHasInsertedThisTurn() == true
				&& GameBoard.CURRENTPLAYER.getHasMovedThisTurn() == false){
			int tileNum = _row * 7 + _col;
			AbstractTile playerCurrentTile = GameBoard.CURRENTPLAYER.getCurrentTile();
			int playerCurrentTileNumber = _gb.getTileNumFromTileReference(playerCurrentTile);
			
			//if the player has clicked the JButton corresponding to the tile on which he
			//is currently located, we do not respond to his click, because we do not need
			//to move him to where he is already located
			if(tileNum != playerCurrentTileNumber){
				GameBoard.CURRENTPLAYER.moveToTile(tileNum);
			}
		}
		else if(GameBoard.CURRENTPLAYER.getHasInsertedThisTurn() == false
				&& GameBoard.CURRENTPLAYER.getHasMovedThisTurn() == true){
			//This condition should never happen, so we do nothing here
		}
		else if(GameBoard.CURRENTPLAYER.getHasInsertedThisTurn() == true
				&& GameBoard.CURRENTPLAYER.getHasMovedThisTurn() == true){
			String s = "\t\t\t\tGAME INFO\n\nIt is now " + GameBoard.CURRENTPLAYER.getName() +
					"'s (" + GameBoard.CURRENTPLAYER.getColor() + " pawn) turn."+
					"\nCurrent Collectible Token Number: " + _gb.getCurrentTargetTokenValue()+"\n\nYou have already"+
					" inserted and moved this turn! Please End Your Turn.";
			_gbGUI.updateGameFeedBack(s);
			//If the player has already inserted and already moved then
			//we ignore his clicking the button because there's nothing
			//left that is legal for him to do with it
		}
		
	}

}
