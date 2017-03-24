/**
 * ConexionBD: Clase encargada de establecer la conexión con la base de datos.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyave Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ConexionBD {

    private static Connection connection;

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/mat";
    private static String user = "root";
    private static String password = "root";
     /**
      * ConexionBD: Constructor de la clase.
      */
    private ConexionBD() {
    }
    /**
     * getConexion: Método encargado de conectar la base de datos.
     * @return 
     */
    public static Connection getConexion() {
        if (connection == null) {

            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return connection;
    }

}
