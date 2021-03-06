/**
 * EstadisticaTorreDAO: Esta clase es la encargada de realizar la conexión del programa con la tabla 
 * "estadisticaTorre".
 */

package Modelo;
/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyave Mendoza
 * @author Juan Pablo Romero Laverde
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * EstadisticaTorreDAO: Constructor de la clase.
 * @author angelica.arroyavem
 */
public class EstadisticaTorreDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    ConexionBD conexion = null;
    static Statement sentencia;

    /**
     * AgregarEstadisticaT: Método encargado de agregar un objeto de tipo EstadisticaTorre (osea la estadistica que se va a almacenar
     * despues de que el niño haya jugado el juego de la torre) a la tabla "estadisticaTorre.
     * @param es
     * @return 
     */
    public boolean AgregarEstadisticaT(EstadisticaTorre es) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO estadisticaTorre (nombreJuego,id_estudiante,erroresUnidades,erroresDecenas,erroresCentenas, nivelAlcanzado, fecha) values (?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, es.getNombreJuego());
            ps.setString(2, es.getIdEstudiante());
            ps.setInt(3, es.getErroresUnidades());
            ps.setInt(4, es.getErroresDecenas());
            ps.setInt(5, es.getErroresCentenas());
            ps.setInt(6, es.getNivelAlcanzado());
            ps.setString(7, es.getFecha());
            ps.executeUpdate();
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
        return true;
    }
    /**
     * informacionTorre: Retorna un arreglo de TablaTorrePojo que contiene en cada campo los datos que estan el la tabla "estadisticaTorre".
     * @return 
     */
    public ArrayList<TablaTorrePojo> informacionTorre() {
        ArrayList<TablaTorrePojo> r = new ArrayList<>();
        String q = "SELECT  T.nombre, T.apellidos, O.erroresUnidades, O.erroresDecenas, O.erroresCentenas, O.nivelAlcanzado, O.fecha FROM estudiante T, estadisticaTorre O WHERE T.id_estudiante = O.id_estudiante";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                TablaTorrePojo torrePojo= new TablaTorrePojo();
                torrePojo.setNombre(rs.getString("nombre"));
                torrePojo.setApellidos(rs.getString("apellidos"));
                torrePojo.setErroresUnidades(rs.getInt("erroresUnidades"));
                torrePojo.setErroresDecenas(rs.getInt("erroresDecenas"));
                torrePojo.setErroresCentenas(rs.getInt("erroresCentenas"));
                torrePojo.setNivelAlcanzado(rs.getInt("nivelAlcanzado"));
                torrePojo.setFecha(rs.getString("fecha"));
                r.add(torrePojo);
            }

        } catch (Exception e) {
        }
        return r;

    }
}
