package levelPieces;

import gameEngine.Drawable;

/**
 * Gargoyle Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */
import gameEngine.InteractionResult;

public class Gargoyle extends GamePiece{
	
	/**
	 * Constructor for the game piece
	 */
	public Gargoyle(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Interacts with player piece
	 * 
	 * Gargoyle will cause a get_point
	 * 
	 */
	@Override
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if((this.getLocation() - 1) == playerLocation || (this.getLocation() + 1) == playerLocation)
		{
			return InteractionResult.GET_POINT;
		}
		
		return InteractionResult.NONE;
	}
}
