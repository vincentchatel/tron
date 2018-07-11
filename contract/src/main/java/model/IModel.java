package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {
	
	void sendDataGame(String name, int time) throws SQLException;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
   

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
 
     */
    IMoto createMoto(int joueur, String nom);
}
