package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class EstadisticaRanaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    ConexionBD conexion = null;
    static Statement sentencia;

    public boolean AgregarEstadisticaR(EstadisticaRana es) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO estadisticaRana (nombreJuego, id_estudiante, errorAscendente,errorDescendente, fecha) values (?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, es.getNombreJuego());
            ps.setString(2, es.getIdEstudiante());
            ps.setInt(3, es.getErrorAscendente());
            ps.setInt(4, es.getErrorDescendente());
            ps.setString(5, es.getFecha());
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
     * Este método retorna un arreglo de tipo tablaRanaPojo, que recupera toda la información de la tabla "estadisticaRana".
     * @return 
     */
    public ArrayList<TablaRanaPojo> informacionRana() {
        ArrayList<TablaRanaPojo> r = new ArrayList<>();
        String q = "SELECT  T.nombre, T.apellidos, O.nombreJuego, O.errorAscendente, O.errorDescendente FROM estudiante T, estadisticaRana O WHERE T.id_estudiante = O.id_estudiante";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                TablaRanaPojo ranaPojo = new TablaRanaPojo();
                ranaPojo.setNombre(rs.getString("nombre"));
                ranaPojo.setApellidos(rs.getString("apellidos"));
                ranaPojo.setErrorAscendente(rs.getInt("errorAscendente"));
                ranaPojo.setErrorDescendente(rs.getInt("errorDescendente"));

                r.add(ranaPojo);
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        return r;

    }
}
