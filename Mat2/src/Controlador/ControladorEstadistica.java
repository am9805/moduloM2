
package Controlador;

import Modelo.EstadisticaTorreDAO;
import java.util.ArrayList;

/**
 *
 * @author angelica.arroyavem
 */
public class ControladorEstadistica {
    private EstadisticaTorreDAO esToDAO;
    
    public ArrayList<String> mostrarDatosTorre(){
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<String> r = esToDAO.informaciónTorre();
        return r;
    }
}
