package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

/**
 * Framework for LevelEngine. 
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 * 
 *
 */

public class LevelEngine {

	// Each level has a 1D array for the board containing pieces that can be drawn or null for empty
	private Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	// Only some pieces can move.
	private ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
	// Only game pieces interact
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();

	/**
	 * Determines the starting location of the player
	 * 
	 */
	public static final int PLAYER_START = 10;

	//instantiate game pieces
	Phoenix phoenix = new Phoenix('X', 3);
	Unicorn unicorn = new Unicorn('U', 19);
	Werewolf werewolf = new Werewolf('W', 2);
	Ghost ghost = new Ghost('G', 5);
	Gnome gnome1 = new Gnome('o',15);
	Gnome gnome2 = new Gnome('o',15);
	Gargoyle gargoyle = new Gargoyle('L', 7);
	
	/**
	 * Creates two different levels for the game board based on the 5 pieces.
	 * 
	 * @param levelNum The number of the level to be loaded. Level number should
	 * be from 1 to GameEngine.NUM_LEVELS
	 * 
	 */
	public void createLevel(int levelNum) {
		
		//nulls out the gameboard
		for (int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			gameBoard[i] = null;
		}
		
		//level 1
		if(levelNum == 1) //no werewolf on this level
		{
			interactingPieces.add(phoenix);
			
			interactingPieces.add(gargoyle);
			
			interactingPieces.add(unicorn);
			movingPieces.add(unicorn);
			
			
			interactingPieces.add(ghost);
			movingPieces.add(ghost);			
			
		} else { //level 2 
			
		
			interactingPieces.add(werewolf);
			
			interactingPieces.add(ghost);
			movingPieces.add(ghost);
			
			gameBoard[gnome2.location] = gnome2;
			
		}	
		
		//sets location of all pieces except gnome
		for(GamePiece piece : interactingPieces ) {
			gameBoard[piece.getLocation()] = piece;
		}
		
		//set gnome location (not a gamePiece)
		gameBoard[gnome1.location] = gnome1;
		
		

	}
	
	/**
	 * Returns the gameBoard, which is an array of Drawable
	 * 
	 */
	public Drawable[] getBoard() {
	
		return gameBoard;
	}
	
	/**
	 * Returns an arrayList of all moveable pieces
	 * 
	 */
	public ArrayList<Moveable> getMovingPieces() {
				
		return movingPieces;
	}
	
	/**
	 * Returns an arrayList of all interacting pieces
	 * 
	 */
	public ArrayList<GamePiece> getInteractingPieces(){
		
		return interactingPieces;
	}

	/**
	 * Returns the player's start location
	 * 
	 */
	public int getPlayerStartLoc() {
		
		return PLAYER_START;
	}
}
