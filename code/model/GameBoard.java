package code.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import code.model.Token;
import code.gui.GameBoardGUI;

/**
 *  This class sets up and populates the game board with Fixed and Moveable tiles,
 *  and creates and populates the players in the game.  It handles much of the logic
 *  for deciding the legality of situations as they arise during a game, such as
 *  if it is legal for a player to move from a given origin tile to a destination tile and 
 *  if it is legal for a player to insert the shiftable tile (the extra tile not on the
 *  board after populating the board with 49 tiles) at a chosen tile position. 
 *  
 * @author Ian, Josh 03-16-16 3:20-3:40pm
 * 
 * Ken, Ian, Josh 03-16-16 8-11pm
 * Edited by Weijin, Ian on 03-18-16 7am-9am
 */

public class GameBoard {
	
	/**
	 * Current player in the game; only this player may make a move, insertShiftable or rotateShiftable, etc.
	 */
	public static Player CURRENTPLAYER;
	
	public static boolean GAMEOVER = false;
	
	/**
	 * If true, prevents certain operations (if configured) from taking place, such as System.exit in save().
	 */
	public static boolean TESTING = false;
	
	/**
	 * index of currentPlayer in players[] array
	 */
	public static int currentPlayerIndex;
	
	/**
	 * true if the current player has ended its turn; false otherwise; is reset to false between
	 * switching current players
	 */
	private boolean _turnIsOver;
	
	/**
	 * ArrayList of type Token that holds references to all the tokens in the game
	 */
	private ArrayList<Token> _tokens; 
	
	/**
	 * The token the is currently collectible by players (given that it is face up).  Ex.: If the value of
	 * _currentTargetToken is 18, then this means tokens with values 1-17 has already been collected by players.
	 */
	private Token _currentTargetToken;
	
	/**
	 * 2-dimensional array of type AbstractTile[][].  Holds the references to MovableTiles
	 * and FixedTiles corresponding to tile pieces in the board game.
	 */
	private AbstractTile[][] _board;
	
	/**
	 * ArrayList that holds MoveableTile references corresponding to the MoveableTiles
	 * on the gameboard, and the single shiftable tile remaining in the arraylist after
	 * populating the board with tiles.
	 */
	private ArrayList<MoveableTile> _arrayOfMoveTiles;
	
	/**
	 * The number of players on the board/in the game.
	 */
	private int _numOfPlayers;
	
	/**
	 * An array of type Player[] holding the references to player objects in the game/on the board
	 */
	private Player[] _players;

	/**
	 * Observer of this GameBoard, of type GameBoardGUI
	 */
	private GameBoardGUI _observer;
	
//	private int _turns;
	
	/** 
	 * Constructor of GameBoard class with the int numPlayers as a parameter.
	 * This constructor creates-
	 * a new 2d array of 7x7 that acts as the gameboard,
	 * an arraylist of moveabletiles 
	 * and the player(s) 
	 * which are also assigned to the instance variables.
	 * 
	 * _numOfPlayers is assigned to the numPlayers which in tells the player class how 
	 * many players there are
	 * 
	 * @param numPlayers refers to the number of players that will be on the board
	 * @author Ken, Ian, Josh
	 * @author Ian, Satya 04-10-16
	 */
	public GameBoard(int numPlayers){
		if(numPlayers < 0 || numPlayers > Player.maxNumberOfPlayers) {
			numPlayers = 4;
		}
			_board = new AbstractTile[7][7];
			_arrayOfMoveTiles = new ArrayList<MoveableTile>();
			_numOfPlayers = numPlayers;
			_players = new Player[_numOfPlayers];
			_tokens = new ArrayList<Token>();
			currentPlayerIndex = 0;
	}
	/**
	 * This method populates the board
	 * by calling on populateRandomMoveableTileArray,populateBoardWithFixedTiles,
	 * populateBoardWithMoveableTiles,createAndPlacePlayers methods which help setup the board.
	 * The movable tiles are randomized and placed on the board, 
	 * along with the fixed tiles and the players.  Finally, the
	 * _observer is updated (GameBoardGUI).
	 * @author Ian, Weijin 
	 * @author Ian, Satya 04-10-16
	 */
	public void setupRandomBoard(){
		populateRandomMoveableTileArray();
		populateBoardWithFixedTiles();
		populateBoardWithMoveableTiles();
		createAndPlacePlayers();
		populateTokenArray();
		populateBoardWithTokensRandomly();
		CURRENTPLAYER = _players[0];
	}
	
	/**
	 * This method populates the static board by
	 * calling on populateBoardWithFixedTiles,
	 * populateBoardWithMoveableTiles,createAndPlacePlayers methods which setup the board.
	 * The board is populated with fixed and movable tiles that are placed
	 * at the same location each time the board is setup.  Finall, the
	 * _observer is updated (GameBoardGUI).
	 * @author Ken, Josh
	 * @author Ian, Satya 04-10-16
	 */
	public void setupStaticBoard(){
		populateBoardWithFixedTiles();
		populateBoardWithMoveableTiles();
		createAndPlacePlayers();
		populateTokenArray();
		populateStaticBoardWithTokens();
		CURRENTPLAYER = _players[0];
	}
	
	/**
	 * This method ads tokens to arraylist
	 * @author Weijin, Ian 03-18-16
	 */
	public void populateTokenArray() {
		_tokens.add(new Token(1, "Crab Apple"));
		_tokens.add(new Token(2, "Pine Cone"));
		_tokens.add(new Token(3, "Oak Leaf"));
		_tokens.add(new Token(4, "Oil of Black Slugs"));
		_tokens.add(new Token(5, "Four-leaf Clover"));
		_tokens.add(new Token(6, "Garlic"));
		_tokens.add(new Token(7, "Raven's Feather"));
		_tokens.add(new Token(8, "Henbane"));
		_tokens.add(new Token(9, "Spider"));
		_tokens.add(new Token(10, "Skull"));
		_tokens.add(new Token(11, "Magic Wand Made of Blindworm"));
		_tokens.add(new Token(12, "Quartz"));
		_tokens.add(new Token(13, "Toad"));
		_tokens.add(new Token(14, "Fire Salamander"));
		_tokens.add(new Token(15, "Weasel Spit"));
		_tokens.add(new Token(16, "Silver Thistle"));
		_tokens.add(new Token(17, "Snake"));
		_tokens.add(new Token(18, "Emerald"));
		_tokens.add(new Token(19, "Root of Mandrake"));
		_tokens.add(new Token(20, "Black Rooster"));
		_tokens.add(new Token(25, "Berries of Mistletoe"));
		
		_currentTargetToken = _tokens.get(0); //initialize current token to token (1, "Crab Apple")
	}
	
	/**This is the tokens population for random board
	 * @author satya, Ken (April 3rd, 2016) (3:15 pm)
	 * @param index
	 */
	public void populateBoardWithTokensRandomly(){ 
		ArrayList<Token> tokens = new ArrayList<Token>();
		for(Token t: _tokens){
			tokens.add(t);
		}
		Collections.shuffle(tokens); 
		 for(int i =1; i<=5; i= i+2 ){
			 for(int j =1; j<=5; j++){
				 _board[i][j].setToken(tokens.get(0));
				 tokens.get(0).setTile(_board[i][j]);
				 tokens.remove(0);
			 }
		 }
		 for(int i = 2; i<=4; i= i+2 ){
			 for(int j =1; j<=5; j= j+2){
				 _board[i][j].setToken(tokens.get(0));
				 tokens.get(0).setTile(_board[i][j]);
				 tokens.remove(0);
			 }
		 }
	}
	/**This is the tokens population for static board
	 * @author satya, Ken (April 3rd, 2016) (4:20 pm)
	 * @param index
	 */
	public void populateStaticBoardWithTokens(){ 
		int t = 0; 
		for(int i =1; i<=5; i= i+2 ){
			 for(int j =1; j<=5; j++){
				 _board[i][j].setToken(_tokens.get(t));
				 _tokens.get(t).setTile(_board[i][j]);
				 //_tokens.remove(0);
				 t++;
			 }
		 }
		 for(int i = 2; i<=4; i= i+2 ){
			 for(int j =1; j<=5; j= j+2){
				 _board[i][j].setToken(_tokens.get(t));
				 _tokens.get(t).setTile(_board[i][j]);
				// _tokens.remove(0);
				 t++;
			 }
		 }
	}
	
	/**
	 * This method tries to get certain tokens
	 * @param index order of the tokens
	 * @return token in a specific position
	 * @author Ian, Ken
	 */
	public Token getToken(int index){
		return _tokens.get(index);
	}
	
	/**
	 * This method is looking for next token
	 * @return next target token 
	 * @author Ian, Ken
	 */
	public Token getCurrentTargetToken(){
		return _currentTargetToken;
	}
	
	/**
	 * This method is looking for next token
	 * @return the value of next token 
	 * @author Ian, Ken
	 */
	public int getCurrentTargetTokenValue(){
		return _currentTargetToken.getValue();
	}
	
	
	/**
	 * This method populates game board with fixed tiles (16) & rotate by appropriate angle
	 * The method instantiates 16 tiles of the FixedTile class that are then
	 * rotated by calling the .rotate method on each tile 
	 * 
	 * @author Ken, Ian
	 */
	public void populateBoardWithFixedTiles(){
		//populate game board with fixed tiles (16) & rotate by appropriate angle
		_board[0][0] = new FixedTile("L");
		_board[0][0].rotate(-90);
		_board[0][2] = new FixedTile("T");
		_board[0][2].rotate(180);
		_board[0][4] = new FixedTile("T");
		_board[0][4].rotate(180);
		_board[0][6] = new FixedTile("L");
		_board[0][6].rotate(180);
		
		_board[2][0] = new FixedTile("T");
		_board[2][0].rotate(-90);
		_board[2][2] = new FixedTile("T");
		_board[2][2].rotate(-90);
		_board[2][4] = new FixedTile("T");
		_board[2][4].rotate(180);
		_board[2][6] = new FixedTile("T");
		_board[2][6].rotate(90);
		
		_board[4][0] = new FixedTile("T");
		_board[4][0].rotate(-90);
		_board[4][2] = new FixedTile("T");
		_board[4][2].rotate(0);
		_board[4][4] = new FixedTile("T");
		_board[4][4].rotate(90);
		_board[4][6] = new FixedTile("T");
		_board[4][6].rotate(90);
		
		_board[6][0] = new FixedTile("L");
		_board[6][0].rotate(0);
		_board[6][2] = new FixedTile("T");
		_board[6][2].rotate(0);
		_board[6][4] = new FixedTile("T");
		_board[6][4].rotate(0);
		_board[6][6] = new FixedTile("L");
		_board[6][6].rotate(90);
	}
	
	/**
	 * This method populates the static board with the array of movable tiles 
	 * 
	 * @param aL is the array of movable tiles that are static 
	 * The location of the tiles are the same each time the board is created.
	 * 
	 * @author satya,Ken (03-19-16, 5:35pm)
	 */
	public void populateStaticMoveableTileArray(ArrayList<MoveableTile> al) {
		_arrayOfMoveTiles = al;
	}
	/** 
	 * The method is a getter for the board which returns the board
	 * 
	 * @return _board which is the 2d array of the AbstractTile class
	 * @author Ken, Ian
	 */
	public AbstractTile[][] getBoard(){
		return _board;
	}
	/**
	 * The method randomly populates board with movable tiles
	 * _arrayOfMoveTiles contains a total of 34 MoveableTile instances
	 * 6 T type tiles, 15 L type tiles, and 13 I type tiles
	 * These tiles are randomly rotated by calling .rotate(randomDegree()) 
	 * @author Ken, Ian
	 */
	public void populateRandomMoveableTileArray() {
		//_arrayOfMoveTiles contains a total of 34 MoveableTile instances
		//6 T type tiles, 15 L type tiles, and 13 I type tiles
		//The tiles are rotated at random to simulate them jumbled in a
		//bag, so they have random rotation on the board
		//there will be one MoveableTile left in the ArrayList
		//after using up 33 to populate the _board (of type AbstractTile[][])
	
		for(int i = 1; i <= 6; i++){
			MoveableTile mT = new MoveableTile("T");
			mT.rotate(randomDegree());
			_arrayOfMoveTiles.add(mT);
			
		}
		
		for(int i = 1; i <= 15; i++){
			MoveableTile mT = new MoveableTile("L");
			mT.rotate(randomDegree());
			_arrayOfMoveTiles.add(mT);
			
		}
		
		for(int i = 1; i <= 13; i++){
			MoveableTile mT = new MoveableTile("I");
			mT.rotate(randomDegree());
			_arrayOfMoveTiles.add(mT);
			
		}
		Collections.shuffle(_arrayOfMoveTiles);
		//System.out.println("Initial Size of array: " + _arrayOfMoveTiles.size());
	}
	/**
	 * The method creates a random int(0,90,-90,180) of degree for rotation
	 * @return returns a random degree which the .rotate method can 
	 * use to randomly rotate tiles
	 * 
	 * @author Weijin, Josh
	 */
	public int randomDegree(){
		int d = 0; //degree of rotation
		//Generate random int between 0 and 3 inclusive and map to appropriate degree
		//value of r is a member of set {0,90,-90,180}
		Random r = new Random();
		int randomDegree = r.nextInt(3);
		if(randomDegree == 0) {d = 0;}
		else if(randomDegree==1) {d = 90;}
		else if(randomDegree==2) {d = -90;}
		else if(randomDegree==3) {d = 180;}
		return d;
	}
	/**
	 * This method puts the movable tiles onto the board.
	 * The method uses a double for loop to set each tile on the board.
	 * by looping through the column(j) then the row(i).
	 * since the board has fixed tile the for loop for row(i) skips
	 * by two, only reaching the places where there isn't a tile.(1,3,5)
	 * Then after placing the tile it removes it from the arraylist
	 * so that the next tile  is the next item from the arraylist.
	 * Then once its done for the row it goes to the next column 
	 * continuing until it finishes row 7.
	 *
	 * 
	 * @author Ken, Ian
	 * @author Ken, Josh
	 */
	public void populateBoardWithMoveableTiles(){
		for(int i = 1; i <=5; i = i + 2){
			for(int j = 0; j < 7; j++){
				//int lastIndex = _arrayOfMoveTiles.size()-1;
				MoveableTile mT = _arrayOfMoveTiles.get(0);
				_board[j][i] = mT;
				_arrayOfMoveTiles.remove(mT);
			}
		}		

		for(int i = 1; i <=5; i = i + 2){
			for(int j = 0; j < 7; j = j + 2){
				//int lastIndex = _arrayOfMoveTiles.size()-1;
				MoveableTile mT = _arrayOfMoveTiles.get(0);
				_board[i][j] = mT;
				_arrayOfMoveTiles.remove(mT);
			}
		}

		MoveableTile mT = _arrayOfMoveTiles.get(_arrayOfMoveTiles.size()-1);
		mT.setLastTileNum(-1);
	}
	
	/**
	 * The method is a getter for the arraylist of movable tiles
	 * @return _arrayOfMoveTiles, the arraylist of moveable tiles
	 * @author Ian, Ken
	 */
	public ArrayList<MoveableTile> getMoveableTileArray(){
		return _arrayOfMoveTiles;
	}
	
	/**this method populates the board w/ between 1 and 4 players in the color order tan, blue,red and white at the 
	 * corresponding correct starting board locations
	 * 
	 * @author Ken, Ian
	*/
	public void createAndPlacePlayers(){
		AbstractTile[] at = {_board[2][2], _board[2][4], _board[4][2], _board[4][4]};
		for(int i = 0; i<_numOfPlayers;i++){
			Player p = new Player(Player._validColors[i]);
			p.setCurrentTile(at[i]);
			p.setGameBoard(this);
			_players[i] = p;
			at[i].addPlayer(p);
		}
	}
	/**
	 * The method is a getter that returns a coordinate of the tile
	 * @param row represents the row of the tile
	 * @param col represents the column of the tile
	 * @return the coordinates from the tile 
	 * 
	 * @author Ian, Josh 
	 */
	public AbstractTile getTileFromCoordinates(int row, int col){
		if(row < 0 || row > 48 || col < 0 || col > 48){
			return null;
		}
		return _board[row][col];
	}
	
	/**
	 * this method takes in an AbstractTile parameter aT and checks to see if
	 * the _board contains that tile.  If so, the method returns the coordinates
	 * (row and column) of the tile in the _board array as a return type of
	 * int[] of size 2, where the first index is row and the 2nd is column.
	 * @param aT the reference to the abstract tile whose coordinates we want
	 * @return coord, the int[] coordinates of the tile
	 * 
	 * @author Ian, Josh, Weijin
	 */
	public int[] getCoordinates(AbstractTile aT){
		//check if aT is in _board
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				if(aT == _board[i][j]){
					int[] coord = new int[2];
					coord[0] = i;  //i is the row
					coord[1] = j;  //j is the col
					return coord;
				}
			}
		}
		return (new int[] {-1,-1});
		
	}
	
	/**
	 * This method returns the tileNum in range [0,48] if the tile exists
	 * in _board array.  If it is not in the _board then return -1.
	 * @param aT is the reference to abstract tile whose tilenum we would like
	 * @return the tile number variable aT references
	 * 
	 * @author Ian, Weijin
	 */
	public int getTileNumFromTileReference(AbstractTile aT){
		if(aT==null){return -2;}
		int tileNum;
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				if(aT == _board[i][j]){
					tileNum = i * 7 + j;
					return tileNum;
				}
			}
		}
		//return -1 if tile not in _board;
		return -1;
	}
	
	/**
	 * This method takes tile number (0-48, where 0th tile is upper left of gameboard
	 * at coordinates (0,0), 1 is (0,1), 47 is (6,5), 48 is (6,6) and so on, and returns
	 * reference to tile object in _board.  Returns a tile if tilNum in range [0,48] and
	 * null otherwise
	 * @param tileNum the tile number of the abstract tile
	 * @return aT the reference to the abstract tile
	 * @author Weijin, Ian 03-18-16
	 */
	public AbstractTile getTileFromTileNumber(int tileNum){
		int tileRow = tileNum / 7;
		int tileCol = tileNum % 7;
		if(0 <= tileNum && tileNum <= 48){
			AbstractTile aT = getTileFromCoordinates(tileRow,tileCol);
			return aT;
		}
		return null;
	}
	
	private int _notAllowedToInsertAt;
	
	public int getNonInsertable(){
		if(_notAllowedToInsertAt == 1){ return 1; }
		if(_notAllowedToInsertAt == 3){ return 2; }
		if(_notAllowedToInsertAt == 5){ return 3; }
		if(_notAllowedToInsertAt == 13){ return 4; }
		if(_notAllowedToInsertAt == 27){ return 5; }
		if(_notAllowedToInsertAt == 41){ return 6; }
		if(_notAllowedToInsertAt == 47){ return 7; }
		if(_notAllowedToInsertAt == 45){ return 8; }
		if(_notAllowedToInsertAt == 43){ return 9; }
		if(_notAllowedToInsertAt == 35){ return 10; }
		if(_notAllowedToInsertAt == 21){ return 11; }
		if(_notAllowedToInsertAt == 7){ return 12; }
		return _notAllowedToInsertAt;
	}
	
	public void setNonInsertable(int num){
		if(num == 1){ num = 1; }
		if(num == 2){ num = 3; }
		if(num == 3){ num = 5; }
		if(num == 4){ num = 13; }
		if(num == 5){ num = 27; }
		if(num == 6){ num = 41; }
		if(num == 7){ num = 47; }
		if(num == 8){ num = 45; }
		if(num == 9){ num = 43; }
		if(num == 10){ num = 35; }
		if(num == 11){ num = 21; }
		if(num == 12){ num = 7; }
		_notAllowedToInsertAt = num;
		_arrayOfMoveTiles.get(_arrayOfMoveTiles.size()-1).setLastTileNum(num);
	}
	
	/**
	 * Save a plain-text representation of the game's models, then exit the game.
	 */
	public void save(){
		String result = "";
		
		// Players
		for (int i = currentPlayerIndex; i < _players.length; i++) {
			result += _players[i] + ",";
		}
		for (int i = 0; i < currentPlayerIndex; i++) {
			result += _players[i] + ",";
		}
		result = result.substring(0, result.length() - 1);  // remove extra comma
		
		result += "\n";
		
		// Tiles
		for(int i=0; i<49; i++){
			result = result + getTileFromTileNumber(i).getEncodedTile();
			if(i != 48){ result = result + ","; }
		}
		
		result += "\n";
		
		// Non-insertion location
		result += getNonInsertable();
		
		// Write to file
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new File("masterlabyrinth.mls"));
			printWriter.println(result);
		} catch (FileNotFoundException e) {
			System.out.println("The game could not be saved.");
			System.out.println(e.getMessage());
		} finally {
			if (printWriter != null) {
				printWriter.close();
			}
			if (!TESTING) {
				System.exit(0);
			}
		}
	}

	/**
	 * This method determines if inserting the shiftable tile (the only remaining MoveableTile
	 * in the _arrayOfMoveTiles after populating the board with tiles) is legal for a given, chosen
	 * insertion tile position.   
	 * 
	 * @param insertionPositionTileNumberOnGameBoard the tile Number of the tile on the board at which insertion begins (not the tile being inserted)
	 * @return boolean true if it is a legal insertion and false otherwise
	 * @author Josh, Weijin 3-20-16
	 * @author Josh, Ian 03-21-16 3-7pm
	 */
	public boolean checkIfInsertShiftableTileLegal(int insertionPositionTileNumberOnGameBoard){
		if(_arrayOfMoveTiles.size() != 1){return false;}
		MoveableTile shiftable = _arrayOfMoveTiles.get(0);
		//if n equals a shiftable tileNum location
		if(insertionPositionTileNumberOnGameBoard == 1||insertionPositionTileNumberOnGameBoard == 3
				||insertionPositionTileNumberOnGameBoard == 5||insertionPositionTileNumberOnGameBoard == 7
				||insertionPositionTileNumberOnGameBoard == 13||insertionPositionTileNumberOnGameBoard == 21
				||insertionPositionTileNumberOnGameBoard == 27||insertionPositionTileNumberOnGameBoard == 35
				||insertionPositionTileNumberOnGameBoard == 41||insertionPositionTileNumberOnGameBoard == 43
				||insertionPositionTileNumberOnGameBoard == 45||insertionPositionTileNumberOnGameBoard == 47){
			//return false if during the last turn the shiftable tile existed at tileNum location n
			if(shiftable.getLastTileNum() == insertionPositionTileNumberOnGameBoard){ 
				if(_observer!=null){
					String s = "\t\t\t\tGAME INFO\n\nIt is now " + CURRENTPLAYER.getName() +
							"'s (" + CURRENTPLAYER.getColor() + " pawn) turn."+
							"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue()+"\n\nIllegel insertion point!"+
							" Try again!";
					_observer.updateGameFeedBack(s);
				}
				return false;
			}
			//else we are free to insert
			else{
				AbstractTile insPointTile = getTileFromTileNumber(insertionPositionTileNumberOnGameBoard);
				int[] coordInsPointTile = getCoordinates(insPointTile);
				int row = coordInsPointTile[0];
				int col = coordInsPointTile[1];
				
				//insert shiftable MoveableTile from left (shift right) of board at one of tileNum 7, 21, 35
				if(insertionPositionTileNumberOnGameBoard == 7 || insertionPositionTileNumberOnGameBoard == 21 
						|| insertionPositionTileNumberOnGameBoard == 35){
					MoveableTile temp = _arrayOfMoveTiles.remove(0);
					int tileNumNewShiftable = insertionPositionTileNumberOnGameBoard + 6;
					_notAllowedToInsertAt = tileNumNewShiftable;
					MoveableTile newShiftable = (MoveableTile) getTileFromTileNumber(tileNumNewShiftable);
					newShiftable.setLastTileNum(tileNumNewShiftable);
					_arrayOfMoveTiles.add(newShiftable);
					for(int i = 5; i >= 0; i--){
						AbstractTile aT = _board[row][i];
						_board[row][i+1] = aT;
					}
					_board[row][col] = temp;

					if(newShiftable.hasPlayer()){
						ArrayList<Player> players = newShiftable.getPlayers();
						for(Player p: players){
							_board[row][col].addPlayer(p);
							p.setCurrentTile(_board[row][col]);
						}
						newShiftable.getPlayers().clear();
					}
					
					if(newShiftable.hasToken()){
						Token t = newShiftable.removeToken();
						_board[row][col].setToken(t);
						t.setTile(_board[row][col]);
					}
					
					if(_observer!=null){
						_observer.update();	
					}
					if(_observer!=null){
					String s = "\t\t\t\tGAME INFO\n\nIt is now " + GameBoard.CURRENTPLAYER.getName() +
							"'s (" + GameBoard.CURRENTPLAYER.getColor() + " pawn) turn."+
							"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue();
					_observer.updateGameFeedBack(s);
					}
					return true;
				}
				
				//insert shiftable MoveableTile from right (shift left) of board at one of tileNum 7, 21, 35
				else if(insertionPositionTileNumberOnGameBoard == 13 || insertionPositionTileNumberOnGameBoard == 27 
						|| insertionPositionTileNumberOnGameBoard == 41){
					MoveableTile temp = _arrayOfMoveTiles.remove(0);
					int tileNumNewShiftable = insertionPositionTileNumberOnGameBoard - 6;
					_notAllowedToInsertAt = tileNumNewShiftable;
					MoveableTile newShiftable = (MoveableTile) getTileFromTileNumber(tileNumNewShiftable);

					newShiftable.setLastTileNum(tileNumNewShiftable);
					_arrayOfMoveTiles.add(newShiftable);
					for(int i = 1; i <= 6; i++){
						AbstractTile aT = _board[row][i];
						_board[row][i-1] = aT;
					}
					_board[row][col] = temp;

					if(newShiftable.hasPlayer()){
						ArrayList<Player> players = newShiftable.getPlayers();
						for(Player p: players){
							_board[row][col].addPlayer(p);
							p.setCurrentTile(_board[row][col]);
						}
						players.clear();
					}
					
					if(newShiftable.hasToken()){
						Token t = newShiftable.removeToken();
						_board[row][col].setToken(t);
						t.setTile(_board[row][col]);
					}
					
					if(_observer!=null){
						_observer.update();	
					}
					if(_observer!=null){
						String s = "\t\t\t\tGAME INFO\n\nIt is now " + GameBoard.CURRENTPLAYER.getName() +
								"'s (" + GameBoard.CURRENTPLAYER.getColor() + " pawn) turn."+
								"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue();
						_observer.updateGameFeedBack(s);
					}
					return true;
				}
				
				//insert shiftable MoveableTile from top (shift down) of board at one of tileNum 7, 21, 35
				if(insertionPositionTileNumberOnGameBoard == 1 || insertionPositionTileNumberOnGameBoard == 3 
						|| insertionPositionTileNumberOnGameBoard == 5){
					MoveableTile temp = _arrayOfMoveTiles.remove(0);
					int tileNumNewShiftable = insertionPositionTileNumberOnGameBoard + 42;
					_notAllowedToInsertAt = tileNumNewShiftable;
					MoveableTile newShiftable = (MoveableTile) getTileFromTileNumber(tileNumNewShiftable);

					newShiftable.setLastTileNum(tileNumNewShiftable);
					_arrayOfMoveTiles.add(newShiftable);
					for(int i = 5; i >= 0; i--){
						AbstractTile aT = _board[i][col];
						_board[i+1][col] = aT;
					}
					_board[row][col] = temp;

					if(newShiftable.hasPlayer()){
						ArrayList<Player> players = newShiftable.getPlayers();
						for(Player p: players){
							_board[row][col].addPlayer(p);
							p.setCurrentTile(_board[row][col]);
						}
						players.clear();
					}
					
					if(newShiftable.hasToken()){
						Token t = newShiftable.removeToken();
						_board[row][col].setToken(t);
						t.setTile(_board[row][col]);
					}
					
					if(_observer!=null){
						_observer.update();	
					}
					if(_observer!=null){
					String s = "\t\t\t\tGAME INFO\n\nIt is now " + GameBoard.CURRENTPLAYER.getName() +
							"'s (" + GameBoard.CURRENTPLAYER.getColor() + " pawn) turn."+
							"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue();
					_observer.updateGameFeedBack(s);
					}
					return true;
				}
				
				//insert shiftable MoveableTile from bottom (shift up) of board at one of tileNum 7, 21, 35
				else{ // insertionPositionTileNumberOnGameBoard == 43 || insertionPositionTileNumberOnGameBoard == 45 
					  // || insertionPositionTileNumberOnGameBoard == 47
					MoveableTile temp = _arrayOfMoveTiles.remove(0);
					int tileNumNewShiftable = insertionPositionTileNumberOnGameBoard - 42;
					_notAllowedToInsertAt = tileNumNewShiftable;
					MoveableTile newShiftable = (MoveableTile) getTileFromTileNumber(tileNumNewShiftable);

					newShiftable.setLastTileNum(tileNumNewShiftable);
					_arrayOfMoveTiles.add(newShiftable);
					for(int i = 1; i <= 6; i++){
						AbstractTile aT = _board[i][col];
						_board[i-1][col] = aT;
					}
					_board[row][col] = temp;

					if(newShiftable.hasPlayer()){
						ArrayList<Player> players = newShiftable.getPlayers();
						for(Player p: players){
							_board[row][col].addPlayer(p);
							p.setCurrentTile(_board[row][col]);
						}
						players.clear();
					}
					
					if(newShiftable.hasToken()){
						Token t = newShiftable.removeToken();
						_board[row][col].setToken(t);
						t.setTile(_board[row][col]);
					}
					
					if(_observer!=null){
						_observer.update();	
					}
					if(_observer!=null){
					String s = "\t\t\t\tGAME INFO\n\nIt is now " + GameBoard.CURRENTPLAYER.getName() +
							"'s (" + GameBoard.CURRENTPLAYER.getColor() + " pawn) turn."+
							"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue();
					_observer.updateGameFeedBack(s);
					}
					return true;
				}

					
			}
		}
		//insertionPositionTileNumberOnGameBoard is not a legal insertion position; thus return false
		if(_observer!=null){
		String s = "\t\t\t\tGAME INFO\n\nIt is now " + CURRENTPLAYER.getName() +
				"'s (" + CURRENTPLAYER.getColor() + " pawn) turn."+
				"\nCurrent Collectible Token Number: " + getCurrentTargetTokenValue()+"\n\nIllegel insertion point!"+
				" Try again!";
		_observer.updateGameFeedBack(s);
		}
		return false;
		
	}
	
	/**
	 * This method is updating the game feedback 
	 * @param s the text on game feedback panel
	 * @author Ian, Satya
	 */
	public void updateGameFeedBack(String s){
		if(_observer!=null){
		_observer.updateGameFeedBack(s);
		}
	}
	
	
	 /**
	  * This method checks if a move from a given origin tile to a desination tile is 
	  * legal.  The player calls this method to check if a given move is legal for the
	  * player.  The algorithm follows a path of 1s on a tile's face (the _top, _bottom,
	  * _left, and _right instance variables from AbstractTile class) corresponding to the
	  * path connections between tiles in the game board Master Labyrinth.  A connection
	  * exists between any two adjacent, touching tiles if they share an edge at which
	  * both tiles have a value of 1.  A path exists from an origin tile to a destination
	  * tile is a path of such connecting 1-pairs can be traversed from the origin to 
	  * the destination.
	  *
	  * @param originTile the origin tile of the player 
	  * @param destinationTile the destination tile of the player 
	  * @return true if the path is legal or false if its not a legal move
	  * @author Weijin, Ken, Ian(3-17-16)
	  * @author satya,Ken (03-19-16, 4pm)
	  * @author Ian, Satya 04-10-16
	  */
	public boolean checkIfMoveLegal(AbstractTile originTile, AbstractTile destinationTile){
		//int originTileNum = getTileNumFromTileReference(originTile);
		//int destinationTileNum = getTileNumFromTileReference(destinationTile);
		ArrayList<AbstractTile> tobechecked  = new ArrayList<AbstractTile>();
		tobechecked.add(originTile);
		ArrayList<AbstractTile> possibleDestinations = new ArrayList<AbstractTile>();
		//possibleDestinations.add(originTile);
		while(tobechecked.size()>0){
			AbstractTile currentTile = tobechecked.get(0);
			tobechecked.remove(currentTile);
			int[] currentCoord = getCoordinates(currentTile);
			int currentRow = currentCoord[0];
			int currentCol = currentCoord[1];
			
			//checking tile above current tile
			AbstractTile tileAbove;
			if(currentRow!=0){
				tileAbove = _board[currentRow-1][currentCol];
			} else { tileAbove = null; }
			if(tileAbove != null){
				if(currentTile.getTop()==1 && tileAbove.getBottom() ==1){
					if(!possibleDestinations.contains(tileAbove)){
						tobechecked.add(tileAbove);
						possibleDestinations.add(tileAbove);
					}
				}
			}
			
			//checking tile below current tile
			AbstractTile tileBelow;
			if(currentRow!=6){
				tileBelow = _board[currentRow+1][currentCol];
			} else { tileBelow = null; }
			if(tileBelow != null){
				if(currentTile.getBottom()==1 && tileBelow.getTop() ==1){
					if(!possibleDestinations.contains(tileBelow)){
						tobechecked.add(tileBelow);
						possibleDestinations.add(tileBelow);
					}
				}
			}
			
			//checking tile to left of current tile
			AbstractTile tileLeft;
			if(currentCol!=0){
				tileLeft = _board[currentRow][currentCol-1];
			} else { tileLeft = null; }
			if(tileLeft != null){
				if(currentTile.getLeft()==1 && tileLeft.getRight() ==1){
					if(!possibleDestinations.contains(tileLeft)){
						tobechecked.add(tileLeft);
						possibleDestinations.add(tileLeft);
					}
				}
			}
			
			//checking tile to right of current tile
			AbstractTile tileRight;
			if(currentCol!=6){
				tileRight = _board[currentRow][currentCol+1];
			} else { tileRight = null; }
			if(tileRight != null){
				if(currentTile.getRight()==1 && tileRight.getLeft() ==1){
					if(!possibleDestinations.contains(tileRight)){
						tobechecked.add(tileRight);
						possibleDestinations.add(tileRight);
					}
				}
			}
		
		}
//		System.out.println("The origin tile number is: "+originTileNum+"\nThe destination tile number is: "+ 
//							destinationTileNum);
//		System.out.println("\nThe tile numbers of the destination tiles are: ");
//		for(AbstractTile aT: possibleDestinations){
//			System.out.println(getTileNumFromTileReference(aT));
//		}
//		System.out.print("\n");
		if(possibleDestinations.contains(destinationTile)){
//			System.out.println("Valid Move: There exists a path between origin and destination!");
		}
		else{
//			System.out.println("Invalid Move: There exists NO path between origin and destination.");
		}
		possibleDestinations.remove(originTile);
		return(possibleDestinations.contains(destinationTile));

	} //end of legalMove method
	
	/**
	 * The method is a getter which returns _players
	 * @return _players the array of players in the game
	 * @author Ian, Ken
	 */
	public Player[] getPlayers(){
		return _players;
	}
	
	public String getEncodedPlayers(){
		String toReturn = "";
		int size = _players.length;
		for(int i=0; i<size; i++){
			toReturn = toReturn + _players[i].toString();
			if(i != size - 1){ toReturn = toReturn + ","; }
		}
		return toReturn;
	}
	
	/**
	 * This method sets the players using parameter 
	 * passed into the method 
	 * @param players array
	 * @author weijin,Satya 04-03-16 5:28pm
	 */
//	public void setPlayers(Player[] players){
//		_players = players;
//	}

//	OUR STAGE 1 CODE DOES NOT NEED THIS PRINTBOARD METHOD -- IT WAS USEFUL IN DEBUGGING,
//	AND MAY BE USEFUL LATER, SO WE LEAVE IT IN.
	/**
	 * The method just creates a version of the board that prints to the console --
	 *  the board that can be used to check if everything is working correctly
	 *  it uses the 1 or 0 in each direction to show if the path is there or not
	 *  example:     0
	 * 			  0		1     this is a L shape tile that allows a path on SE and S
	 * 				 1	
	 * @author Ian,Ken
	 */
	public void printBoard(){
		
		System.out.println("     Col: 0\t\t\t     Col: 1\t\t\t     Col: 2\t\t\t     Col: 3\t\t\t     Col: 4\t\t\t     Col: 5\t\t\t     Col: 6");
		
		for(int i = 0; i < 7; i++){
			System.out.println("Row: " + i);
			for(int j = 0; j < 7; j++){
				System.out.print("\t" + _board[i][j]._top + " \t\t\t");
			}	
			System.out.print("\n\n");
			for(int j = 0; j < 7; j++){
				if(_board[i][j].hasPlayer()){
					String allColors = "";
					for(Player p: _board[i][j].getPlayers()){
						allColors = allColors + " " + p.getColor().charAt(0); 
					}
					System.out.print(_board[i][j]._left + "\t"+ allColors +"\t" + _board[i][j]._right + "\t\t");
				}
				else{
					System.out.print(_board[i][j]._left + "\t\t" + _board[i][j]._right + "\t\t");
				}
			}	
			System.out.print("\n\n");
			for(int j = 0; j < 7; j++){
				System.out.print("\t" + _board[i][j]._bottom + "\t\t\t");
			}
			System.out.print("\n\n");
		}
		
		System.out.print("\n\nShiftable Tile: \n");
		MoveableTile shiftable = _arrayOfMoveTiles.get(0);
		System.out.print("\t" + shiftable.getTop() + "\n\n" + shiftable.getLeft() + "\t\t" + shiftable.getRight() +
						"\t\t\n\n\t" + shiftable.getBottom() + "\n"); 
	}
	
	/**
	 * This methods sets up the observer
	 * @return observer the state of the game
	 * @author Ian,Weijin 
	 */
	public GameBoardGUI getObserver() {
		return _observer;
	}
	
	/**
	 * This method assigns the observer
	 * @param observer the state of the game
	 * @author Ian,Weijin
	 */
	public void setObserver(GameBoardGUI observer) {
		
		_observer = observer;
	}
	
	/**
	 *This method updates the observer
	 * @author Ian,Weijin
	 */
	public void playerHasAlteredBoard(){	
		if(_observer!=null){
			_observer.update();	
		}
	
	}
	/**
	 * This method assigns the turn
	 * @param turns whose turn is it
	 * @author ken,Josh (April 3,2016)(8:20pm)
	 */
//	public void setTurn(int turns){
//		_turns = turns;
//	}
	/**
	 * This method determines whose turn is it
	 * @param turns whose turn it is 
	 * @author ken,Josh (April 3,2016)(8:20pm)
	 */
//	public int getCurrentTurn(){
//		return _turns;
//	}
	
	/**
	 * This method keeps each player's order of his/her turn
	 * @param turns
	 * @author ken,Josh (April 3,2016)(8:20pm)
	 */
	//This is just a basic and maybe stupid structure for counting the player turns
	//large code needs to be updated
//	public void Turns(String s){		
//		
//		GameBoard gb = new GameBoard(4);
//		int _p = gb._numOfPlayers;
//		int state = 0;
//		
//		if (_p == 2){
//			switch(state){
//			case 0:
//			}
//		}
//		
//		if (_p == 3){
//			switch(state){}
//		}
//		
//		if (_p == 4){
//			switch(state){}
//		}
//	}
	
	/**
	 * This method changes currentPlayer to the next currentPlayer (i.e., if player 1 ends turn,
	 * now it is player 2's turn)
	 * @author Ian, Satya 04-10-16
	 */
	public void toggleNextPlayer(){
		currentPlayerIndex = (currentPlayerIndex + 1) % _players.length;
		CURRENTPLAYER = _players[currentPlayerIndex];
		if (_observer != null) {
			_observer.update();
		}
	}
	
	/**
	 * This method toggles currentTargetToken to the next token
	 * @author weijin,Satya
	 */
	public void toggleNextToken(){
		if(_currentTargetToken.getValue() == 25){ 
			GAMEOVER = true;
			
			_observer.gameOver();
			
		}
		else{
			int index = _tokens.indexOf(_currentTargetToken);
			_currentTargetToken = _tokens.get(index+1);
			System.out.println("The old taget token number was: " + _tokens.get(index).getValue());
			System.out.println("The new target token is token number: " + _currentTargetToken.getValue());
		}
	}
	
	public static GameBoard load(String fileName){
		Scanner scanner = null;
		String[] lines = new String[3];
		try {
			scanner = new Scanner(new File(fileName));
			
			// Read the lines
			int i = 0;
			for (i = 0; i < 3 && scanner.hasNextLine(); i++) {
				lines[i] = scanner.nextLine();
			}
			
			// Ensure we read all 3 lines
			if (i != 3) {
				System.out.println("The game save file was in an unexpected format.");
				return null;
			}
		} catch (FileNotFoundException e) {
			System.out.println("The game save file could not be found.");
			return null;
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		ArrayList<String> players = split(lines[0], false);
		ArrayList<String> tiles = split(lines[1], false);
		int nonInsertionLocation = Integer.parseInt(lines[2]);
		
		GameBoard gb = new GameBoard(players.size());
		gb.populateTokenArray();
		
		loadPlayers(gb, players);
		loadTiles(gb, tiles);
		for(Player p: gb.getPlayers()){
			if(p.getColor().equals("Green")){
				p.setColor("Tan");
			}else if(p.getColor().equals("Black")){
				p.setColor("White");
			}
		}
		gb._currentTargetToken = findCurrentTargetToken(gb);
		gb.setNonInsertable(nonInsertionLocation);
		
		return gb;
	}
	
	private static Token findCurrentTargetToken(GameBoard gb) {
		int highest = 1;
		for(Player p: gb.getPlayers()){
			if(p.getTokens() != null){
				for(Token t: p.getTokens()){
					int temp = t.getValue();
					if(temp > highest){
						highest = temp;
					}
				}
			}
		}
		if(highest == 1) return gb.getToken(0);
		else if(highest == 20) return gb.getToken(20);
		else return gb.getToken(highest);
	}
	
	private static void loadPlayers(GameBoard gb, ArrayList<String> list) {
		Player[] players = gb.getPlayers();
		
		for (int playerCount = 0; playerCount < list.size(); playerCount++) {
			ArrayList<String> playerL = split(list.get(playerCount), true);
			/* playerL indices:
			 * - 0: name
			 * - 1: color
			 * - 2: wands
			 * - 3: formula card
			 * - 4: tokens
			 */
			
			Player p = new Player(Player.importColor(playerL.get(1)));
			p.setName(playerL.get(0));
			
			ArrayList<String> formulaCards = split(playerL.get(3), true);
			for (int formulaCardCount = 0; formulaCardCount < formulaCards.size(); formulaCardCount++) {
				int formulaCard = Integer.parseInt(formulaCards.get(formulaCardCount));
				
				// Calculate the formula card index
				int formulaCardIndex;
				if (formulaCard == 25) {
					formulaCardIndex = 20;
				} else {
					formulaCardIndex = formulaCard - 1;
				}
				
				p.getFormulaCardIndices().set(formulaCardCount, formulaCardIndex);
			}
			
			ArrayList<String> tokens = split(playerL.get(4), true);
			for (int tokenCount = 0; tokenCount < tokens.size(); tokenCount++) {
				int token = Integer.parseInt(tokens.get(tokenCount));
				
				// Calculate the token index
				int tokenIndex;
				if (token == 25) {
					tokenIndex = 20;
				} else {
					tokenIndex = token - 1;
				}
				
				p.addToken(gb._tokens.get(tokenIndex));
			}
			
			p.setGameBoard(gb);
			
			players[playerCount] = p;
		}
		CURRENTPLAYER = players[0];
	}
	

	private static void loadTiles(GameBoard gb, ArrayList<String> list) {
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for (int count = 0; count < list.size(); count++) {
			ArrayList<String> data = split(list.get(count), true);
			String type = data.get(0);
			AbstractTile tile;
			// Fixed tiles
			if (count % 14 < 7 && count % 2 == 0) {
				tile = new FixedTile(type);
			}
			// Movable tiles
			else {
				tile = new MoveableTile(type);
				char t = type.charAt(0);
				if (countMap.containsKey(t)) {
					countMap.put(
						t,
						countMap.get(t) + 1
					);
				} else {
					countMap.put(t, 1);
				}
			}
			
			// Add token to tile
			int tokenNum = Integer.parseInt(data.get(1));
			if (tokenNum != 0) {
				Token token;
				if(tokenNum == 25) token = gb.getToken(20); 
				else token = gb.getToken(tokenNum - 1);
				tile.setToken(token);
				token.setTile(tile);
			}
			
			// Players that should be on the tile
			for (String color : split(data.get(2), true)) {
				for (Player player : gb.getPlayers()) {
					if (Player.importColor(color).equals(player.getColor())) {
						tile.addPlayer(player);
						player.setCurrentTile(tile);
						break;
					}
				}
			}
			
			// Add the tile to the board
			int r = count / 7;
			int c = count % 7;
			gb._board[r][c] = tile;
		}
		
		// Determine the extra tile
		MoveableTile tile = null;
		if (countMap.get('I') < 13) {
			tile = new MoveableTile("I");
		} else if (countMap.get('L') < 15) {
			tile = new MoveableTile("L");
		} else if (countMap.get('T') < 6) {
			tile = new MoveableTile("T");
		}
		tile.setLastTileNum(-1);
		
		gb._arrayOfMoveTiles = new ArrayList<MoveableTile>();
		gb._arrayOfMoveTiles.add(tile);
	}
	
	/**
	 * Splits a string delimited by commas and optionally grouped by brackets.
	 * This is similar to how a CSV might be parsed, except that brackets are
	 * used in place of quotes.
	 * Example (with outer brackets): "[A,B,[C,[D,E]],F]" => ["A", "B", "[C,[D,E]]", "F"]
	 * Example (without outer brackets): "A,B,[C,[D,E]],F" => ["A", "B", "[C,[D,E]]", "F"]
	 * @param string The {@link String} to be split.
	 * @param withOuterBrackets If the input {@code string} is within an extra set of brackets.
	 * @return
	 */
	private static ArrayList<String> split(String string, boolean withOuterBrackets){
		int bracketCount = 0;
		if (withOuterBrackets) {
			string = string.substring(1, string.length()-1);
		}
		ArrayList<String> parts = new ArrayList<String>();
		String part = "";
		for (int x = 0; x < string.length(); x++) {
			char c = string.charAt(x);
			if(c == '['){
				bracketCount++;
			}
			if(c == ']'){
				bracketCount--;
			}
			if (bracketCount == 0) {
				if (c != ',') {
					part += c;
				} else {
					parts.add(part);
					part = "";
//					x++;
				}
			} else {
				part += c;
			}
		}
		if (!"".equals(part)) {
			parts.add(part);
		}
		
		return parts;
	}
	
} //end of Game Board class definition
