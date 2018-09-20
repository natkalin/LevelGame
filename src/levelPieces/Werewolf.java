package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Ghost Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */

public class Werewolf extends GamePiece{

	
	/**
	 * Constructor for the game piece
	 */
	public Werewolf(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Interacts with player piece
	 * 
	 * Werewolf will cause a Kill
	 * 
	 */
	@Override
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if(super.getLocation() + 3 == playerLocation || super.getLocation() - 3 == playerLocation)
		{
			return InteractionResult.KILL;
		}
		
		return InteractionResult.NONE;
	}

}
