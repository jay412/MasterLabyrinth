package code.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import code.model.*;

/**
 * This class implements token button with ActionListener
 * which action event will be generated when the button clicked
 * @author Ian,Satya 04-15-16
 *
 */
public class TokenButtonHandler implements ActionListener {
	private int _row;
	private int _col;
	private GameBoard _gb;
	private JButton _jb;
	
	/**
	 * This method takes in the the value of row and column
	 * and reference to the gameboard and jbutton
	 * @param r the row
	 * @param c the column
	 * @param gb the GameBoard object
	 * @param jb the JButton 
	 * @author Ian,Satya 04-15-16
	 */
	public TokenButtonHandler(int r, int c, GameBoard gb, JButton jb){
		_row = r;
		_col = c;
		_gb = gb;
		_jb = jb;
	}
	
	/**
	 * This method calculates the Jbutton that is clicked using row and column and then lets the player to
	 * pick up the token on that tile.
	 * @param e action event generated when the tokens been collected
	 * @author Ian,Satya 04-15-16
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int tokenTileNum = _row*7 +_col;
		AbstractTile at = _gb.getTileFromTileNumber(tokenTileNum);
		Token t = at.getToken();
		GameBoard.CURRENTPLAYER.pickUpToken(t);
	}
}
