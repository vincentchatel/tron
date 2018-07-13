package view;

import controller.IGame;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Vincent
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Create the window
     * @param g
     */
    
    void createWindow(IGame g);
    
    /**
     * Set the inputListener
     * @param g
     */
    
    public void setInputListener(IGame g);
}
