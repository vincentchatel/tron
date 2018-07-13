package controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IMoto;
import view.IInputListener;

/**
 * 
 * <h1>The Interface IGame.</h1>
 * 
 * @author Vincent
 *
 */

public interface IGame extends ActionListener{
	
	/**
	 * set the input listener
	 * @param inputListener - the input Listener
	 */

	void setInputListener(IInputListener inputListener);
	
	/**
	 * the reset method
	 */
	
	public void reset(); 
	
	/**
	 * the end game when they are no winner
	 */
	
	public void endGame();
	
	/**
	 * the end game when they are no winner
	 * 
	 * @param winner
	 */
	
	public void endGame(IMoto winner);
	
	/**
	 * this method a pause in the game
	 */
	
	public void pause();
	
	/**
	 * this method manage the action performed
	 */
	
	public void actionPerformed(ActionEvent e);
	
	/**
	 * the graphic for the wall
	 * @param g
	 */
	
	public void paintComponent(Graphics g);
	
	/**
	 * get the winner
	 * @return winner - the winner
	 */
	
	public IMoto getWinner();
	
	/**
	 * set the vainqueur
	 * @param winner
	 */
	
	public void setVainqueur(IMoto winner);
	
	/**
	 * the duration of the game
	 * @return tempsFinale - the duration
	 */
	
	public int getTempsFinale();
	
	/**
	 * set the tempsFinale
	 * @param tempsFinale
	 */
	
	public void setTempsFinale(int tempsFinale);
	
	/** 
	 * this method update the deplacement and the window
	 */
	
	public void update();
	
	/**
	 * this method permit for the game to know when the game is over
	 * @return
	 */
	
	public boolean isGameOver();
}
