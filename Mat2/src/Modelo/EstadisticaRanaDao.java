package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class EstadisticaRanaDao {

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

    public boolean validarUsuario(String nombre, String id_estudiante) {
        boolean r = false;
        String q = "SELECT nombre,id_estudiante FROM estudiante WHERE nombre='" + nombre + "'AND id_estudiante='" + id_estudiante + "'";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getObject(1));
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        r = asignar();
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
