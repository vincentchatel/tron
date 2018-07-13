package model;

public interface IMoto {
	
	/**
	 * the method for reset the game
	 */
	
	void reset();
	
	/** 
	 * Get the X
	 * @return x - the X for the position
	 */
	
	int getX();
	
	/** 
	 * Set the X of the position
	 * @param x - the X
	 */
	
	void setX(int x);
	
	/**
	 * Get the Y
	 * @return y - the Y for the position
	 */
	
	int getY();
	
	/** 
	 * the method for set the Y
	 * @param y - The y 
	 */
	
	void setY(int y);
	
	/**
	 * Get the direction of the direction 
	 * @return
	 */
	
	Direction getDirection();
	
	/**
	 * Set the direction 
	 * @param directon
	 */
	
	void setDirection(Direction directon);
	
	/** 
	 * Get the name 
	 * @return name
	 */
	
	String getName();

}
