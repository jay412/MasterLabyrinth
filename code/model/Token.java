package code.model;


/**
 * This token class contains instance variables and methods for Token
 * @author Satya, Josh, Ian 03-16-16
 * @author Weijin, Ian 03-18-16
 *
 */
public class Token {
	
	/**
	 * int value of this token
	 */
	private int _value;
	
	/**
	 * String name of this token
	 */
	private String _name;
	
//		/**
//		 * true if token face up, false if face down
//		 */
//		private boolean _faceUp;
	
	/*
	 * true if already picked up by a player, false otherwise
	 */
	private boolean _pickedUp;
	
	/**
	 * The player that has picked up this token (null if none)
	 */
	private Player _myPlayer;
	
	/**
	 * The tile on which this token currently resides (null if none)
	 */
	private AbstractTile _myTile;
	
	/**
	 * @author Satya, Ken (April 3rd,2016) (2:48pm)
	 */

	public Token(int v, String name){
		_value = v;
		_name = name;
		//_faceUp = false;
		_myPlayer = null;
		_myTile = null;
		_pickedUp = false;
	}
	
	/**
	 * 
	 * @return tokens' value
	 * @author Weijin, Ian 03-18-16
	 */
	public int getValue(){
		 return _value;
	}
	
	/**
	 * 
	 * @return
	 * @author Weijin, Ian 03-18-16
	 */
	public String getName(){
		return _name;
	}
	
//		/**
//		 * @author Weijin, Ian 03-18-16
//		 */
//		public void flipToFaceUp(){
//			_faceUp = true;
//		}
	
	/**
	 * This method returns the tile on which this token resides
	 * @return the tile on which this token resides
	 * @author Weijin, Ian 03-18-16
	 */
	public AbstractTile getTile(){
		return _myTile;
	}

	/**
	 * This method sets the tile on which this token resides
	 * @param aT the tile on which this token resides
	 * @author Weijin, Ian 03-18-16
	 */
	public void setTile(AbstractTile aT){
		_myTile = aT;
	}
	
	/**
	 * This method sets the player who has picked up this token
	 * @param p Player who has picked up token
	 * @author Weijin, Ian 03-18-16
	 */
	public void setPlayer(Player p){
		_myPlayer = p;
	}
	
	/**
	 * This method returns the player who holds this token
	 * @return the Player who holds/owns this token
	 * @author Weijin, Ian 03-18-16
	 */
	public Player getPlayer(){
		return _myPlayer;
	}
	
//		/**
//		 * 
//		 * @return
//		 * @author Weijin, Ian 03-18-16
//		 */
//		public boolean isFaceUp(){
//			return _faceUp;
//		}
	
	
	/**
	 * this method sets token picks up status
	 */
	public void setTokenPickedUpStatus() {
		_pickedUp = true;
	}
	
	/**
	 * this method returns boolean value
	 * @return boolean _pickup
	 */
	public boolean getTokenPickedUpStatus(){
		return _pickedUp;
	}
	
	@Override
	public String toString() {
		return String.valueOf(_value);  // note: used implicitly by Player.toString()
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Token) {
			Token t = (Token) o;
			return _value == t._value;
		}
		return false;
	}

}
