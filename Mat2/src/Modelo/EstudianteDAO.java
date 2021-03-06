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

public class EstudianteDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    ConexionBD conexion = null;
    static Statement sentencia;

    /**
     * agregarEstudiante: Recibe como parámetro un objeto de tipo estudiante;
     * luego procede a asignar a cada celda de la tabla "estudiante" los valores
     * correspondientes".
     *
     * @param es
     * @return
     */
    public boolean agregarEstudiante(Estudiante es) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO estudiante (nombre,apellidos,grado,grupo,id_estudiante) values (?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, es.getNombre());
            ps.setString(2, es.getApellidos());
            ps.setString(3, es.getGrado());
            ps.setString(4, es.getGrupo());
            ps.setString(5, es.getIdEstudiante());
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
     * validarUsuario: Recibe como parámetros dos strings, los cuales son el
     * nombre y el id respectivamente del estudiante que está por loguearse en
     * la aplicación. Verifica que tanto el nombre como el usuario existan y
     * que, además, pertenezcan mutuamente.
     *
     * @param nombre
     * @param id_estudiante
     * @return boolean
     */
    public boolean validarUsuario(String nombre, String id_estudiante) {
        boolean r = false;
        String q = "SELECT nombre,id_estudiante FROM estudiante WHERE nombre='" + nombre + "'AND id_estudiante='" + id_estudiante + "'";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
            }

        } catch (Exception e) {

        }
        r = asignar();
        return r;
    }

    /**
     * asignar: Permite determinar la primera ocurrencia en la tabla del dato
     * ingresado.
     *
     * @return
     */
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

    /**
     * informacionEstudiante: Recupera toda la información de la tabla
     * estudiantes, retorna un array de strings.
     *
     * @return
     */
    public ArrayList<Estudiante> informacionEstudiante() {
        ArrayList<Estudiante> arrayEstudiantes = new ArrayList<>();
        String q = "SELECT ALL id_estudiante,nombre,apellidos,grado,grupo FROM estudiante ";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getString("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellidos(rs.getString("apellidos"));
                estudiante.setGrado(rs.getString("grado"));
                estudiante.setGrupo(rs.getString("grupo"));

                arrayEstudiantes.add(estudiante);
            }

        } catch (Exception e) {
        }
        return arrayEstudiantes;
    }

    /**
     * informacionXestudiante: Recupera de la tabla "estudiante", el estudiante
     * con el id ingresado por parámetro junto con sus respectivos datos de la
     * tabla "estadisticaTorre" y "estadisticaRana".
     *
     * @return
     */
    public ArrayList<JuegoxEstudiantePojo> informacionXestudiante(String id_estudiante) {
        ArrayList<JuegoxEstudiantePojo> r = new ArrayList<>();
        String q = "SELECT  E.nombre, E.apellidos, T.nombreJuego torre, T.erroresUnidades, T.erroresDecenas, T.erroresCentenas, T.nivelAlcanzado, R.nombreJuego rana, R.errorAscendente, R.errorDescendente FROM estudiante E INNER JOIN estadisticaTorre T ON E.id_estudiante = T.id_estudiante INNER JOIN estadisticaRana R ON E.id_estudiante = R.id_estudiante WHERE E.id_estudiante =" + "'" + id_estudiante + "'";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();

            while (rs.next()) {
                JuegoxEstudiantePojo estPojo = new JuegoxEstudiantePojo();
                estPojo.setNombre(rs.getString("nombre"));
                estPojo.setApellidos(rs.getString("apellidos"));
                estPojo.setErroresCentenas(rs.getString("erroresCentenas"));
                estPojo.setErroresDecenas(rs.getString("erroresDecenas"));
                estPojo.setErroresUnidades(rs.getString("erroresUnidades"));
                estPojo.setNivelAlcanzado(rs.getString("nivelAlcanzado"));
                estPojo.setNombreJuego(rs.getString("torre"));
                estPojo.setNombreJuegoR(rs.getString("rana"));
                estPojo.setErrorAscendente(rs.getString("errorAscendente"));
                estPojo.setErrorDescendente(rs.getString("errorDescendente"));
                r.add(estPojo);
            }

        } catch (Exception e) {
        }
        return r;
    }
}
