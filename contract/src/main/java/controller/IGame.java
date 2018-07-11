package controller;

import java.awt.Graphics;

public interface IGame extends ActionListener{

	void setInputListener(IInputListener inputListener);
	
	public void reset(); 
	
	public void endGame();
	
	public void endGame(IMoto winner);
	
	public void pause();
	
	public void actionPerformed(ActionEvent e);
	
	public void paintComponent(Graphics g);
	
	public IMoto getWinner();
	
	public void setVainqueur(IMoto winner);
	
	public int getTempsFinale();
	
	public void setTempsFinale(int tempsFinale);
	
	public void update();
	
	public boolean isGameOver();
}
