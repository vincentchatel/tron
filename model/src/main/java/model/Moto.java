package model;

public class Moto implements IMoto{
	
	/** 
	 * the X
	 */
	
	private int x = 0;
	
	/** 
	 * The Y
	 */
	
	private int y = 0;
	
	/** 
	 * the id of the player
	 */
	
	private int joueur;
	
	/** 
	 * The name of the player 
	 */
	
	public String nom;
	
	/** 
	 * The direction
	 */
	
	private Direction direction;
	
	/**
	 * The constructor of the class
	 * @param joueur
	 * @param nom
	 */
	
	public Moto(int joueur, String nom) {
		this.joueur = joueur;
		this.nom = nom;
		reset();
	}
	
	/**
	 * This method permit to initialize the position for a new game
	 */
	
	public void reset() {
		if(joueur == 1) direction = Direction.DROITE;
		if(joueur == 2) direction = Direction.GAUCHE;
	}
	
	/**
	 * Get the x of the position
	 */
	
	public int getX() {
		return x;
	}
	
	/** 
	 * Set the x of the position
	 * 
	 */
	
	public void setX(int x) {
		this.x = x;
	}
	
	/** 
	 * Get y of the position
	 */
	
	public int getY() {
		return y;
	}
	
	/** 
	 * Set y of the position
	 */
	
	public void setY(int y) {
		this.y = y;
	}
	
	/** 
	 * Get the direction
	 */
	
	public Direction getDirection() {
		return direction;
	}
	
	/** 
	 * Set the position 
	 */
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	/** 
	 * Get the name
	 *
	 */
	@Override
	public String getName() {
		return this.nom;
	}
	
	
	
}
