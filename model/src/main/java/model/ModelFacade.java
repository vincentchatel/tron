package model;
//salut
import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }
   
    /** 
     * This method send the data of the game at the end of the game
     * 
     */
    @Override
    public void sendDataGame(String name, int time) throws SQLException {
         ExampleDAO.sendDataGame(name, time);
    }

 /** 
  * This method permit to create a new moto
  */
   
    public IMoto createMoto(int joueur, String nom) {
    	return new Moto(joueur, nom);
    }

}
