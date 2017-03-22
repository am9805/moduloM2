
package Controlador;
/**
 * ControladorEstadistica: Esta clase se encarga de conectar la vista de profesor con las diferentes clases 
 * que tengan conexión con la base de datos.
 */
//import Modelo.EstadisticaRanaDAO;
import Modelo.EstadisticaTorreDAO;
import Modelo.EstudianteDAO;
import java.util.ArrayList;

/**
 *
 * @author angelica.arroyavem
 */
public class ControladorEstadistica {
    private EstadisticaTorreDAO esToDAO;
//    private EstadisticaRanaDAO esRaDAO;
    private EstudianteDAO estuDAO;

    /**
     * mostrarDatosTorre: Retorna un arreglo de strings con la información solicitada en la tabla "estadisticaTorre".
     * @return 
     */
    
    public ArrayList<String> mostrarDatosTorre(){
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<String> r = esToDAO.informacionTorre();
        return r;
    }
    /**
     * mostrarDatosEstudiante: Retorna un arreglo de strings con la información solicitada en la tabla "estudiante".
     * @return 
     */
    public ArrayList<String> mostrarDatosEstudiante(){
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionEstudiante();
        return r;
    }
    
    /**
     * mostrarDatosEstudiante: Retorna un arreglo de strings con la información solicitada en la tabla "estudiante" de estudiante
     * con la id que se entra por parámetro.
     * @return 
     */
     public ArrayList<String> mostrarDatosXestudiante(String id_estudiante){
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionXestudiante(id_estudiante);
        return r;
    }
     
     /////////////////BORRAAAAAAAAAAAAR///////////////////////////
//     
//      public ArrayList<String> mostrarDatosRana(){
//        esRaDAO = new EstadisticaRanaDAO();
//        ArrayList<String> r = esRaDAO.informaciónRana();
//        return r;
//    }
    
}
