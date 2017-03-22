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
                System.out.println(rs.getObject(1));
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
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
    public ArrayList<String> informacionEstudiante() {
        ArrayList<String> r = new ArrayList<String>();
        String espa = "                              ";
        String espa2 = "                                 ";
        String espa3 = "                                 ";
        String q = "SELECT ALL id_estudiante,nombre,apellidos,grado,grupo FROM estudiante ";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {

                String a = (rs.getObject(1) + espa + rs.getObject(2) + espa + rs.getObject(3) + espa2 + rs.getObject(4) + espa3 + rs.getObject(5)).toString();

                r.add(a);
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        return r;
    }
    
    /**
     * informacionXestudiante: Recupera de la tabla "estudiante", el estudiante con el id ingresado por parámetro
     * junto con sus respetivos datos de la tabla "estadisticaTorre" y "estadisticaRana".
     * @return 
     */
    public ArrayList<String> informacionXestudiante(String id_estudiante) {
       ArrayList<String> r = new ArrayList<String>();
        String espa= "     ";
        String q = "SELECT  T.nombre, T.apellidos, O.nombreJuego ,O.erroresUnidades, O.erroresDecenas, O.erroresCentenas, O.nivelAlcanzado, R.nombreJuego, R.errorAscendente, R.errorDescendente FROM estudiante T, estadisticaTorre O, estadisticaRana R WHERE T.id_estudiante='"+id_estudiante+"' AND T.id_estudiante = O.id_estudiante = R.id_estudiante";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                String a = (rs.getObject(1) +espa+rs.getObject(2)+espa+ rs.getObject(3) +espa+rs.getObject(4)+espa+ rs.getObject(5)+espa+rs.getObject(6)+espa+ rs.getObject(7) +espa+rs.getObject(8)+espa+ rs.getObject(9)+espa+rs.getObject(10)).toString();
                System.out.println(a);
                r.add(a);
            }
            System.out.println("Correcto");

        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        return r;
    }

}
