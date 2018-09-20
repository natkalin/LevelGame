package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;

/**
 * Gnome Piece Class
 * 
 * @author Natalie Kalin
 * @author Cale Waress
 * 
 */

public class Gnome implements Moveable {
	
	private boolean center = true;
	private char symbol;
	public int location;

	/**
	 * Constructor for the game piece
	 * 
	 * @param symbol  symbol for the game piece
	 * @param location initial location
	 */
	public Gnome(char symbol, int location) {
		super();
		this.symbol = symbol;
		this.location = location;
	}
	
	/**
	 * Draws the pieces symbol on the board
	 * 
	 * Abstract classes can have concrete/defined methods
	 * 
	 */
	public void draw() {
		System.out.print(symbol);
	}

	/**
	 * Moves the Gnome symbol on the board
	 * 
	 * Moves to the right 1, next turn moves to the left 2.
	 * Vacillates between these two movements.
	 * 
	 */
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		gameBoard[location] = null;
		
		int newLocation = 0;
		
		if (center == true) {
			newLocation = location + 1 ;
			center = false;
		} else {
			newLocation = location -2;
		}
				
		gameBoard[newLocation] = this;
	
		location = newLocation;	
	}
	
}
