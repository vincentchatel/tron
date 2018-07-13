package view;

import java.awt.event.KeyEvent;
import model.IMoto;
import controller.IGame;

public interface IInputListener {
	
	/**
	 * initialize the both players and the game
	 * 
	 * @param player1
	 * @param player2
	 * @param game
	 */
	
	void debut(IMoto player1, IMoto player2, IGame game);
	
	/** 
	 * Set up the direction of the player when a key was pressed 
	 * @param e
	 */
	
	void keyPressed(KeyEvent e);

}
