package Controlador;

import Modelo.IGenerarNumeroStrategy;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.concurrent.ThreadLocalRandom.current;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class GeneraNumSinRestriccion implements IGenerarNumeroStrategy {

    @Override

    //METODO QUE GENERA NUMEROS SIN RESTRICION  DE 1 A 99 Y 100 A  999
    public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {
        int n = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int limiteInferior;
        int limiteSuperior;
        int arreglo[] = new int[4];
        if (n == 2) {
            limiteInferior = 100;
            limiteSuperior = 999;
        } else {
            limiteInferior = 10;
            limiteSuperior = 99;
        }
        arreglo[0] = (current().nextInt(limiteInferior, limiteSuperior + 1));
        for (int i = 1; i < 4; i++) {
            arreglo[i] = (int) (current().nextInt(limiteInferior, limiteSuperior + 1));
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }
        a.setText(Integer.toString(arreglo[0]));
        b.setText(Integer.toString(arreglo[1]));
        c.setText(Integer.toString(arreglo[2]));
        d.setText(Integer.toString(arreglo[3]));
        e.setText("Mayor a Menor");

    }

}
