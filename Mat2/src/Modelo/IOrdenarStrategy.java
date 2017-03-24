package Modelo;

import Controlador.ControladorRana;
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
    EstadisticaRana EstadisticaRana = new EstadisticaRana("FROGGIE", fecha, SingletonEstudianteActivo.getInstance().getIdEstudiante());

    /**
     *
     * @return Este metodo guarda en un objeto de tipo estadisitca Rana
     */
    public static EstadisticaRana getEstadisticaRana() {
        return EstadisticaRana;
    }

    /**
     *
     * @param roca1
     * @param roca2
     * @param roca3
     * @param roca4
     * @param numRoc1
     * @param numRoc2
     * @param numRoc3
     * @param numRoc4
     * @param nube1
     * @param nube2
     * @param nube3
     * @param nube4
     * @param Gif
     * @param RanaxRocaL
     * @param juguemos
     * @param Cronometro ordenar: es el metodo por el que pasaran los datos que
     * ordenaran los numeros de acuerdo a las estrategias de ordenamiento
     */
    void ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro);

}
