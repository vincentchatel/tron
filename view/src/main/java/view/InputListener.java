package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import model.Direction;
import model.IMoto;
import view.*;
import controller.*;


public class InputListener extends KeyAdapter implements IInputListener{
	
	/**
	 * The player 1
	 */
	
	IMoto player1;
	
	/** 
	 * The player 2 
	 */
	
	IMoto player2;
	
	IGame game;
	
	/** 
	 * Debut of the game
	 */
	
	boolean debut = false;
	
	/** 
	 * This method permit to initialize the both players and the game
	 */
	
	public void debut(IMoto player1, IMoto player2, IGame game) {
		this.player1 = player1;
		this.player2 = player2;
		this.game = game;
		debut = true;
		
	}

	/**
	 * Permit to define all the different key for play 
	 */
	
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		Direction direction1 = player1.getDirection();
		Direction direction2 = player2.getDirection();
		if (debut) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_S:
				if (direction1 != Direction.BAS) player1.setDirection(Direction.HAUT);
				break;
			case KeyEvent.VK_D:
				if (direction1 != Direction.DROITE) player1.setDirection(Direction.GAUCHE); 
				break;
			case KeyEvent.VK_Z:
				if (direction1 != Direction.HAUT) player1.setDirection(Direction.BAS);
				break;
			case KeyEvent.VK_Q: 
				if (direction2 != Direction.GAUCHE) player1.setDirection(Direction.DROITE);
				break;
			case KeyEvent.VK_UP:
                if(direction2 != Direction.BAS) player2.setDirection(Direction.HAUT);
                break;
            case KeyEvent.VK_LEFT:
                if(direction2 != Direction.DROITE) player2.setDirection(Direction.GAUCHE);
                break;
            case KeyEvent.VK_DOWN:
                if(direction2 != Direction.HAUT) player2.setDirection(Direction.BAS);
                break;
            case KeyEvent.VK_RIGHT:
                if(direction2 != Direction.GAUCHE) player2.setDirection(Direction.DROITE);
				
			}
		
		}
			
	}
	
}
