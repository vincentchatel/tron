package view;

import java.awt.event.KeyEvent;

public interface IInputListener {
	
	void debut(IMoto player1, IMoto player2, IGame game);
	
	void keyPressed(KeyEvent e);

}
