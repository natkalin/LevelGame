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

public class Gnome implements Drawable {
	
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
}
