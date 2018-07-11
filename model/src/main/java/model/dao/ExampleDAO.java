package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlExampleById   = "{call findExampleById(?)}";

    /** The sql example by name. */
    private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. */
    private static String sqlAllExamples   = "{call findAllExamples()}";
    
    private static String sqlInsertInformationByNameAndTime = "{call infoEndGame( ?, ?)}";

    /** The id column index. */
    private static int    NameColumnIndex    = 1;

    /** The name column index. */
    private static int    TimeColumnIndex  = 2;
    
    static IGame game;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
   /* public static Example getExampleById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static void sendDataGame(String name, int time) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlInsertInformationByNameAndTime);
        System.out.println("requete recuperer");
        
        callStatement.setString(1, name);
        System.out.println("name recuperer");
        
        callStatement.setInt(2, time);
        System.out.println("time recuperer");
        
        callStatement.execute();
    
    }
        	
    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
   /* public static List<Example> getAllExamples() throws SQLException {
        final ArrayList<Example> examples = new ArrayList<Example>();
        final CallableStatement callStatement = prepareCall(sqlAllExamples);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
            }
            result.close();
        }
        return examples;
    }*/
}
