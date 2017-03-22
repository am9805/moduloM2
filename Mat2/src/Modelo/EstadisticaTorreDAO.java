
package Modelo;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EstadisticaTorreDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    ConexionBD conexion = null;
    static Statement sentencia;

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

    public ArrayList<String> informaciónTorre() {
        ArrayList<String> r = new ArrayList<String>();
        String espa= "                              ";
        String espa2="                                        ";
        String espa3="                                               ";
        String q = "SELECT  T.nombre, T.apellidos, O.erroresUnidades, O.erroresDecenas, O.erroresCentenas, O.nivelAlcanzado FROM estudiante T, estadisticaTorre O WHERE T.id_estudiante = O.id_estudiante";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                String a = (rs.getObject(1) +espa+rs.getObject(2)+espa+ rs.getObject(3) +espa2+rs.getObject(4)+espa3+ rs.getObject(5)+espa+rs.getObject(6)).toString();
                
                r.add(a);
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        return r;

    }

    public boolean asignar() {
        boolean r = false;
        try {
            if (rs.last()) {

                r = true;
            }
        } catch (Exception e) {
        }

        return r;

    }
}
