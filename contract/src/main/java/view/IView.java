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
    
    void createWindow(IGame g);
    
    public void setInputListener(IGame g);
}
