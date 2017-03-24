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

    
    /**
     * GenerarNumero: recibe los objetos que debe generar y el tipo de orden en el que se debe generar los numeros, este metodo generar numeros de diez en diez de dos cifras
     */
    public void GenerarNumero(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {

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

        a.setText(Integer.toString(arreglo[0]));
        b.setText(Integer.toString(arreglo[1]));
        c.setText(Integer.toString(arreglo[2]));
        d.setText(Integer.toString(arreglo[3]));
        int numero2 = (ThreadLocalRandom.current().nextInt(1, 2 + 1));
        if (numero2 == 2) {
            e.setText("Menor a Mayor");
        } else {
            e.setText("Mayor a Menor");
        }
    }

}
