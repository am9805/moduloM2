package Controlador;

/**
 * ControladorEstadistica: Esta clase se encarga de conectar la vista de
 * profesor con las diferentes clases que tengan conexión con la base de datos.
 */
import Modelo.EstadisticaRanaDAO;
import Modelo.EstadisticaTorreDAO;
import Modelo.EstudianteDAO;
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
    public ArrayList<String> mostrarDatosTorre() {
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<String> r = esToDAO.informacionTorre();
        return r;
    }
    
     public ArrayList<String> mostrarDatosRana(){
        esRaDAO = new EstadisticaRanaDAO();
        ArrayList<String> r = esRaDAO.informacionRana();
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
    public ArrayList<String> mostrarDatosXestudianteT(String id_estudiante) {
       
        estuDAO = new EstudianteDAO();
        ArrayList<String> t = estuDAO.informacionXestudianteT(id_estudiante);
        
        return t;
    }
    
    public ArrayList<String> mostrarDatosXestudianteR(String id_estudiante) {
        ArrayList<String> a = new ArrayList<String>();
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionXestudianteR(id_estudiante);
        
        return r;
    }
    
    
    public ArrayList<String> unificarArrays(ArrayList<String> t, ArrayList<String> r) {
        ArrayList<String> a = new ArrayList<String>();

        if (r.size() < t.size()) {     // Array r < t
            a = arrayu(r,t);
        } else if (r.size() == t.size()) { //Arrays del mismo tamaño
            for (int i = 0; i < t.size(); i++) {
                a.add(t.get(i) + " " + r.get(i));
            }
        }else if(t.size()<r.size()){
            a=arrayu(r,t);
        }
        return a;
    }

    public ArrayList<String> arrayu(ArrayList<String> mayor, ArrayList<String> menor) {
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < menor.size(); i++) {
            a.add(menor.get(i) + " " + menor.get(i));

        }
        int y = a.size();
        for (int i = y; i < menor.size(); i++) { // Añade el resto de datos de d
            a.add(menor.get(i) + " " + menor.get(i));
        }
        return a;
    }

    /////////////////Padre modifico algo ///////////////////////////
//     
     
}
