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
public class GeneraNumDecenas implements IGenerarNumeroStrategy {

    @Override

    //METODO QUE GENERA NUMEROS ALEATORIOS DE 10 EN  10
    public void GenerarNumero(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {

        int i = 0, cantidad = 4;
        int arreglo[] = new int[cantidad];

        int numero = (ThreadLocalRandom.current().nextInt(10, 99 + 1));
        arreglo[i] = numero - (numero % 10);

        for (i = 1; i < cantidad; i++) {
            int numero1 = (ThreadLocalRandom.current().nextInt(10, 99 + 1));
            arreglo[i] = numero1 - (numero1 % 10);
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
        int numero2 = (ThreadLocalRandom.current().nextInt(1, 2 + 1));
        if (numero2 == 2) {
            orden.setText("Menor a Mayor");
        } else {
            orden.setText("Mayor a Menor");
        }
    }

}
