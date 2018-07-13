package view;

import java.awt.*;
import javax.swing.*;
import controller.IGame;
import view.InputListener;

public class Fenetre implements IFenetre{
	
	/**
	 * The Height
	 */
	
	public int height = 400;
	
	/**
	 * The Width
	 */
	
	public int width = 600;
	
	/**
	 * The constructor can create the window 
	 * @param g
	 */
	
	public Fenetre(IGame g) {
		JPanel p = (JPanel)g;
		JFrame f = new JFrame("Tron");
		InputListener inputListener = new InputListener();
		
		g.setInputListener(inputListener);
		p.setBackground(Color.BLACK);
		f.setSize(width, height);
		f.add(p);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addKeyListener(inputListener);
	}

}
