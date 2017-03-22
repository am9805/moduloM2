
package Controlador;

import Modelo.EstadisticaTorreDAO;
import Modelo.EstudianteDAO;
import java.util.ArrayList;

/**
 *
 * @author angelica.arroyavem
 */
public class ControladorEstadistica {
    private EstadisticaTorreDAO esToDAO;
    private EstudianteDAO estuDAO;
    
    public ArrayList<String> mostrarDatosTorre(){
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<String> r = esToDAO.informaciónTorre();
        return r;
    }
    
    public ArrayList<String> mostrarDatosEstudiante(){
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionEstudiante();
        return r;
    }
    
     public ArrayList<String> mostrarDatosXestudiante(String id_estudiante){
        estuDAO = new EstudianteDAO();
        ArrayList<String> r = estuDAO.informacionXestudiante(id_estudiante);
        return r;
    }
    
    public void imprimir(ArrayList a){
        for(int i=0;i<=a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
