package Controlador;

/**
 * ControladorEstadistica: Esta clase se encarga de conectar la vista de
 * profesor con las diferentes clases que tengan conexión con la base de datos.
 */
import Modelo.EstadisticaRanaDAO;
import Modelo.EstadisticaTorreDAO;
import Modelo.EstudianteDAO;
import Modelo.JuegoxEstudiantePojo;
import Modelo.TablaRanaPojo;
import Modelo.TablaTorrePojo;
import java.util.ArrayList;

/**
 *
 * @author angelica.arroyavem
 */
public class ControladorEstadistica {

    private EstadisticaTorreDAO esToDAO;
    private EstadisticaRanaDAO esRaDAO;
    private EstudianteDAO estuDAO;

    /**
     * mostrarDatosTorre: Retorna un arreglo de strings con la información
     * solicitada en la tabla "estadisticaTorre".
     *
     * @return
     */
    public ArrayList<TablaTorrePojo> mostrarDatosTorre() {
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<TablaTorrePojo> r = esToDAO.informacionTorre();
        return r;
    }
    
     public ArrayList<TablaRanaPojo> mostrarDatosRana(){
        esRaDAO = new EstadisticaRanaDAO();
        ArrayList<TablaRanaPojo> r = esRaDAO.informacionRana();
        return r;
    }

    /**
     * mostrarDatosEstudiante: Retorna un arreglo de strings con la información
     * solicitada en la tabla "estudiante".
     *
     * @return
     */
    public ArrayList<String> mostrarDatosEstudiante() {
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionEstudiante();
        return r;
    }

    /**
     * mostrarDatosEstudiante: Retorna un arreglo de strings con la información
     * solicitada en la tabla "estudiante" de estudiante con la id que se entra
     * por parámetro.
     *
     * @return
     */
    public ArrayList<JuegoxEstudiantePojo> mostrarDatosXestudiante(String id_estudiante) {
       
        estuDAO = new EstudianteDAO();
        ArrayList<JuegoxEstudiantePojo> t = estuDAO.informacionXestudiante(id_estudiante);
        
        return t;
    }
    
     
}
