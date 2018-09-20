package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;

/**
 * Ghost Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */

public class Ghost extends GamePiece implements Moveable{
	
	Random randm = new Random();

	/**
	 * Constructor for the game piece
	 */
	public Ghost(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Interacts with player piece
	 * 
	 * Ghost will cause a hit
	 * 
	 */
	@Override
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if(super.getLocation() == playerLocation)
		{
			return InteractionResult.HIT;
		}
		
		return InteractionResult.NONE;
	}
	
	
	/**
	 * Moves the Ghost symbol on the board
	 * 
	 * Moves randomly on the board
	 * 
	 */
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		gameBoard[super.getLocation()] = null;
		int newLocation = randm.nextInt(GameEngine.BOARD_SIZE);
		
		//ensure it does not land on werewolf, phoenix, or gargoyle pieces
		while(newLocation == 2 && newLocation == 3 && newLocation == 7)
		{
			newLocation = randm.nextInt(GameEngine.BOARD_SIZE);
		}
			
		gameBoard[newLocation] = this;
	
		super.setLocation(newLocation);	
	}
	
}
