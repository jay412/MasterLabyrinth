package code.model;

/**
 * This MoveableTile class is an extension of class AbstractTile.
 * It is used for the 34 moveable/non-fixed tiles in the game 
 * Master Labyrinth that can be moved.
 *
 * @author Satya, Ian (03-15-16)
 */
public class MoveableTile extends AbstractTile {
	
	/**
	 * this instance variable stores the last tile Number that the Moveable Tile had upon
	 * leaving the board after a shift operation.  During the next turn, this insertion point
	 * will not be valid (a tile cannot be inserted at the same spot at which it left the board
	 * during the previous turn, by the game rules).
	 */
	private int _lastTileNumberBeforeLeavingBoard = 100;
	
	/**This constructor is parameterless and calls super() by default
	 * @author Ian, Weijin 03-18-16
	 */
	public MoveableTile(){}
	
	/**This constructor takes in a String and calls the constructor of super that 
	 * takes a String parameter as well
	 * @param identity the String parameter
	 */
	public MoveableTile(String identity){
		super(identity);
	}
	
	/**
	 *  The method returns an integer of the last tile number that a tile was inserted into
	 * @return _lastTileNumberBeforeLeavingBoard the last tileNum position the MoveableTile
	 * had before being "popped off" the board from another insertion
	 * @author Josh,Weijin
	 */
	public int getLastTileNum(){
		return _lastTileNumberBeforeLeavingBoard;
	}
	
	/**
	 * The method sets the last tile number
	 * @param l is the last tile number position the MoveableTile
	 * had before being "popped off" the board from another insertion
	 * @author  Josh, Weijin
	 */
	public void setLastTileNum(int l){
		_lastTileNumberBeforeLeavingBoard = l;
	}
}
