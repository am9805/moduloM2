package Controlador;

import Modelo.IGenerarNumeroStrategy;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class GeneraNumSecuencial implements IGenerarNumeroStrategy {

    @Override
    //METODO QUE GENERA NUMEROS SECUENCIALMENTE DE 1 EN 1
    public void GenerarNumero(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {
        int i = 0, cantidad = 4;
        int arreglo[] = new int[cantidad];

        int numero = (ThreadLocalRandom.current().nextInt(10, 96 + 1));
        arreglo[i] = numero;

        for (i = 1; i < cantidad; i++) {
            int numero1 = (ThreadLocalRandom.current().nextInt(numero, numero + 4));
            arreglo[i] = numero1;
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }

        for (int k = 0; k < cantidad; k++) {
            System.out.print((k + 1) + ".- " + arreglo[k] + "\n");
        }

        numNube1.setText(Integer.toString(arreglo[0]));
        numNube2.setText(Integer.toString(arreglo[1]));
        numNube3.setText(Integer.toString(arreglo[2]));
        numNube4.setText(Integer.toString(arreglo[3]));
        orden.setText("Menor a Mayor");
    }

}
