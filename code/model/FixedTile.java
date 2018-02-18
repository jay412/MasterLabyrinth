package code.model;

/**
 * This FixedTile class is an extension of class AbstractTile.
 * It is used for 16 tiles in the game Master Labyrinth that
 * do not move.
 *
 * @author Satya, Ian (03-15-16)
 */
public class FixedTile extends AbstractTile {
	
	
	/**This constructor is parameterless and calls super() by default
	 * @author Ian, Weijin 03-18-16
	 */
	public FixedTile(){}
	
	
	/**This constructor has a String parameter and calls super(identity) by default
	 * @param identity the string parameter
	 * @author Ian, Weijin 03-18-16
	 */
	public FixedTile(String identity){
		super(identity);
	}
}
