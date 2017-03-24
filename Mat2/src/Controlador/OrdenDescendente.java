package Controlador;

import Modelo.EstadisticaRanaDAO;
import Modelo.IOrdenarStrategy;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class OrdenDescendente implements IOrdenarStrategy {

    @Override

    /**
     * ordenar en orden ascendente es una de las estrategias de ordenamiento 
     * que se utilizaran para el funcionamiento del juego
     * el metodo ordena los numeros de mayor a manor
     * tiene las restricciones de errores y las condiciones de avances 
     * ademas genera mensajes para validar un error o el avance y lleva los errores a la estadistica

     */
    public void ordenar(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro) {

        String roc1 = numRoc1.getText();
        String roc2 = numRoc2.getText();
        String roc3 = numRoc3.getText();
        String roc4 = numRoc4.getText();

        String numeroNube1 = nube1.getText();
        int numNube1 = Integer.parseInt(numeroNube1);
        String numeroNube2 = nube2.getText();
        int numNube2 = Integer.parseInt(numeroNube2);
        String numeroNube3 = nube3.getText();
        int numNube3 = Integer.parseInt(numeroNube3);
        String numeroNube4 = nube4.getText();
        int numNube4 = Integer.parseInt(numeroNube4);

        int arreglo[] = new int[4];

        arreglo[0] = numNube1;
        arreglo[1] = numNube2;
        arreglo[2] = numNube3;
        arreglo[3] = numNube4;

        Arrays.sort(arreglo);

        if (!"".equals(roc1)) {

            int numroc1 = Integer.parseInt(roc1);
            if (arreglo[3] == numroc1) {
                roca2.setVisible(true);
                numRoc2.setVisible(true);
            } else {
                numRoc1.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar,TU PUEDES....!!");
                EstadisticaRana.setErrorDescendente(EstadisticaRana.getErrorDescendente() + 1);
//        
            }
        }
        if (!"".equals(roc2)) {

            int numroc2 = Integer.parseInt(roc2);
            if (arreglo[2] == numroc2) {
                roca3.setVisible(true);
                numRoc3.setVisible(true);
            } else {
                numRoc2.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar,TU PUEDES....!!");
                EstadisticaRana.setErrorDescendente(EstadisticaRana.getErrorDescendente() + 1);
//              
            }
        }
        if (!"".equals(roc3)) {

            int numroc3 = Integer.parseInt(roc3);
            if (arreglo[1] == numroc3) {
                roca4.setVisible(true);
                numRoc4.setVisible(true);
            } else {
                numRoc3.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar, TU PUEDES....!!");
                EstadisticaRana.setErrorDescendente(EstadisticaRana.getErrorDescendente() + 1);
//             
            }
        }

        if (!"".equals(roc4)) {
            int numroc4 = Integer.parseInt(roc4);
            if (arreglo[0] == numroc4) {
               
                JOptionPane.showMessageDialog(null, "FELICITACIONES HAS GANADO......!!!!");
                RanaxRocaL.setVisible(false);
                Gif.setVisible(true);

                numRoc1.setVisible(false);
                numRoc2.setVisible(false);
                numRoc3.setVisible(false);
                numRoc4.setVisible(false);
                roca1.setVisible(false);
                roca2.setVisible(false);
                roca3.setVisible(false);
                roca4.setVisible(false);
                RanaxRocaL.setVisible(false);
                juguemos.setVisible(true);
                Cronometro.setText("0000");
                Cronometro.setVisible(false);

            } else {
                numRoc4.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar, TU PUEDES....!!");
                EstadisticaRana.setErrorDescendente(EstadisticaRana.getErrorDescendente() + 1);

            }
            
        }

    }
}
