
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

public class EstudianteDAO {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    ConexionBD conexion = null;
    static Statement sentencia;

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
    
     public boolean validarUsuario(String nombre) {      
        boolean r = false;
        String q = "SELECT * FROM estudiante" + " WHERE nombre='"+nombre+"'";
        try {
            rs = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        
        return r;
                
    
    }
     
      public  boolean asignar(){
      boolean r = false;
        try {
            if(rs.last()){
                
                r=true;
            }
        } catch (Exception e) {
        }
      
      return r;
                
    }
}
