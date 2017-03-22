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
    public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {
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

        a.setText(Integer.toString(arreglo[0]));
        b.setText(Integer.toString(arreglo[1]));
        c.setText(Integer.toString(arreglo[2]));
        d.setText(Integer.toString(arreglo[3]));
        e.setText("Menor a Mayor");
    }

}
