
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author angelica.arroyavem
 */

public class ConexionBD {
    private static Connection connection;

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/3306";
    private static String user = "root";
    private static String password = "root";

    private ConexionBD() {
    }

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
