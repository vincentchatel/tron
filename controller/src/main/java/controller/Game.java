/**
 * 
 */
package controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import model.IMoto;

/**
 * @author Vincent
 *
 */
public class Game extends JPanel implements IGame {
	
	public static int DELTA = 1;
	public static int SIZE = 1;
	public static int DELAY = 5;
	
	private Timer timer = new Timer(DELAY, this);
	
	private IMoto player1;
	private IMoto player2;
	private IMoto winner;
	
	private boolean firstTime = true;
	private boolean gameOver = false;
	
	private int tempsFinale;
	public String vainqueur;
	
	private ControllerFacade ctrl;
	
	boolean doneRecap = false;
	
	public Date dstart;
	
	public Game(IMoto player1, IMoto player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		}
	
	List<Point> points = new ArrayList<Point>();
	List<Point> onePoints = new ArrayList<Point>();
	List<Point> twoPoints = new ArrayList<Point>();
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.GREEN);
		for(Point p : onePoints) {
			g2d.fill(new Rectangle2D.Double(p.getX(), p.getY(), SIZE, SIZE));
		}
		
		g2d.setColor(Color.RED);
		for(Point p : twoPoints) {
			g2d.fill(new Rectangle2D.Double(p.getX(),p.getY(), SIZE, SIZE));
		}
   }
	
	public void update() {
		if (firstTime) {
			reset();
			firstTime = false;
			dstart = new Date();
		}
		
		if(!gameOver) {
			switch(player1.getDirection()) {
			case HAUT:
				player1.setY(player1.getY() - DELTA);
				break;
			case DROITE:
				player1.setX(player1.getX() + DELTA);
				break;
			case BAS:
				player1.setY(player1.getY() + DELTA);
				break;
			case GAUCHE: 
				player1.setX(player1.getX() - DELTA);
				break;	
			}
			switch(player2.getDirection()) {
			case HAUT:
				player2.setY(player2.getY() - DELTA);
				break;
			case DROITE:
				player2.setX(player2.getX() + DELTA);
				break;
			case BAS: 
				player2.setY(player2.getY() + DELTA);
				break;
			case GAUCHE:
				player2.setX(player2.getX() - DELTA);
				break;

			
			
			
			
			
			}
		}
		
		
		
		
		
	}
	
	 
	
	
	
	
	

	
}
