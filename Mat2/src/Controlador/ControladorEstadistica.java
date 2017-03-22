package Controlador;

import Modelo.EstadisticaTorreDAO;
import java.util.ArrayList;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorEstadistica {

    private EstadisticaTorreDAO esToDAO;

    public ArrayList<String> mostrarDatosTorre() {
        esToDAO = new EstadisticaTorreDAO();
        ArrayList<String> r = esToDAO.informaciónTorre();
        return r;
    }
}
