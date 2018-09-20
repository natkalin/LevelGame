package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * Unicorn Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */

public class Unicorn extends GamePiece implements Moveable{

	/**
	 * Constructor for the game piece
	 */
	public Unicorn(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Interacts with player piece
	 * 
	 * Unicorn will cause an advance
	 * 
	 */
	@Override
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if(super.getLocation() == playerLocation)
		{
			return InteractionResult.ADVANCE;
		}
		
		return InteractionResult.NONE;
	}
	
	/**
	 * Moves the Unicorn symbol on the board
	 * 
	 * Moves to the right 3 on every turn
	 * 
	 */
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		gameBoard[super.getLocation()] = null;
		
		int newLocation = super.getLocation() + 3;
		
		if(newLocation > GameEngine.BOARD_SIZE) {
			newLocation = newLocation - GameEngine.BOARD_SIZE;
		}
		
		gameBoard[newLocation] = this;
	
		super.setLocation(newLocation);	
	}

}
