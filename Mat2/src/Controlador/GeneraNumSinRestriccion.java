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

    /**
     * GenerarNumero: recibe los objetos que debe generar y el tipo de orden en
     * el que se debe generar los numeros, es metodo generar numeros sin
     * restriccion de dos y tres cifras
     */
    public void GenerarNumero(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {
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
        numNube1.setText(Integer.toString(arreglo[0]));
        numNube2.setText(Integer.toString(arreglo[1]));
        numNube3.setText(Integer.toString(arreglo[2]));
        numNube4.setText(Integer.toString(arreglo[3]));
        orden.setText("Mayor a Menor");

    }

}
