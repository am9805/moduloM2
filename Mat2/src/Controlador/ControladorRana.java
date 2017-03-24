/**
 *
 */
package Controlador;

import Modelo.EstadisticaRana;
import Modelo.EstadisticaRanaDAO;
import Modelo.SingletonEstudianteActivo;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyave Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorRana {

    Calendar c1 = Calendar.getInstance();
    Calendar c = new GregorianCalendar();
    String dia = Integer.toString(c.get(Calendar.DATE));
    String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
    String annio = Integer.toString(c.get(Calendar.YEAR));
    String fecha = (dia + "/" + mes + "/" + annio);
    ;
    EstadisticaRana estadisticaRana = new EstadisticaRana("FROGGIE", fecha, SingletonEstudianteActivo.getInstance().getIdEstudiante());

    public ControladorRana(EstadisticaRana estadisticaRana) {
        this.estadisticaRana = estadisticaRana;
    }
    /**
     * llenarTabla: Método encargado de llenar la tabla "estadisticaRana" con los datos que contiene el objeto
     * de tipo "estadisticaRana".
     */
    public void llenarTabla() {
        EstadisticaRanaDAO a = new EstadisticaRanaDAO();
        a.AgregarEstadisticaR(estadisticaRana);
    }
}
