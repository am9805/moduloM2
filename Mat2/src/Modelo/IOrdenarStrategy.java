package Modelo;

import Controlador.EstadisticaRana;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public interface IOrdenarStrategy {

    Calendar c1 = Calendar.getInstance();
    Calendar c = new GregorianCalendar();
    String dia = Integer.toString(c.get(Calendar.DATE));
    String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
    String annio = Integer.toString(c.get(Calendar.YEAR));
    String fecha = (dia + "/" + mes + "/" + annio);
    EstadisticaRana Estaditisticarana = new EstadisticaRana("FROGGIE", 0, 0, fecha);

    void ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro);

}
