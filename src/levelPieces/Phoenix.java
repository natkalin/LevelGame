package levelPieces;

import gameEngine.Drawable;

/**
 * Ghost Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */
import gameEngine.InteractionResult;

public class Phoenix extends GamePiece{
	
	/**
	 * Constructor for the game piece
	 */
	public Phoenix(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Interacts with player piece
	 * 
	 * Phoenix will cause a get_point
	 * 
	 */
	@Override
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if(this.getLocation() == playerLocation)
		{
			return InteractionResult.GET_POINT;
		}
		
		return InteractionResult.NONE;
	}
}
