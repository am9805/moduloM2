package Modelo;

import Controlador.GeneraNumDecenas;
import Controlador.GeneraNumSecuencial;
import Controlador.GeneraNumSinRestriccion;
import Controlador.GenerarNumero;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class GeneradorFactory {

    private static GeneradorFactory GenFactory;

    /**
     *
     * @return Este metodo es un singleton que permite instanciar la clase solo
     * una ves e impedir el uso excesivo de memoria
     */
    public static GeneradorFactory getInstance() {
        GenFactory = new GeneradorFactory();
        return (GenFactory);
    }

    /**
     *
     * @param numNube1
     * @param numNube2
     * @param numNube3
     * @param numNube4
     * @param orden GenerarNumero: genera los numero de acuerdo a la estrategia
     * de ordenamientos aleatoriamente
     */
    public void GenerarNumero(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {
        int x = (ThreadLocalRandom.current().nextInt(1, 3 + 1));

        if (x == 1) {
            GenerarNumero gn = new GenerarNumero(new GeneraNumDecenas());
            gn.GenerarNum(numNube1, numNube2, numNube3, numNube4, orden);
        }

        if (x == 2) {
            GenerarNumero gn = new GenerarNumero(new GeneraNumSecuencial());
            gn.GenerarNum(numNube1, numNube2, numNube3, numNube4, orden);
        }
        if (x == 3) {
            GenerarNumero gn = new GenerarNumero(new GeneraNumSinRestriccion());
            gn.GenerarNum(numNube1, numNube2, numNube3, numNube4, orden);
        }

    }

}
