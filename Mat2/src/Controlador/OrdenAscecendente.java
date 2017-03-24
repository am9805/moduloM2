package Controlador;

import Modelo.EstadisticaRanaDAO;
import Modelo.IOrdenarStrategy;
import static Modelo.IOrdenarStrategy.EstadisticaRana;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class OrdenAscecendente implements IOrdenarStrategy {

    @Override

    //METODO QUE ORDENA ASCENDENTEMENTE LOS NUMEROS GENERADOS
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
            if (arreglo[0] == numroc1) {
                roca2.setVisible(true);
                numRoc2.setVisible(true);

            } else {
                numRoc1.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar, TU PUEDES....!!");
                EstadisticaRana.setErrorAscendente(EstadisticaRana.getErrorAscendente() + 1);
            }
        }
        if (!"".equals(roc2)) {

            int numroc2 = Integer.parseInt(roc2);
            if (arreglo[1] == numroc2) {
                roca3.setVisible(true);
                numRoc3.setVisible(true);

            } else {
                numRoc2.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intentar, TU PUEDES....!!");
                EstadisticaRana.setErrorAscendente(EstadisticaRana.getErrorAscendente() + 1);
            }
        }
        if (!"".equals(roc3)) {

            int numroc3 = Integer.parseInt(roc3);
            if (arreglo[2] == numroc3) {
                roca4.setVisible(true);
                numRoc4.setVisible(true);

            } else {
                numRoc3.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocado, vuelve a intenntar, TU PUEDES....!!");
                EstadisticaRana.setErrorAscendente(EstadisticaRana.getErrorAscendente() + 1);
            }
        }

        if (!"".equals(roc4)) {

            int numroc4 = Integer.parseInt(roc4);
            if (arreglo[3] == numroc4) {
                
                JOptionPane.showMessageDialog(null, "FELICITACIONES HAS GANADO......!!!!");
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
                Cronometro.setVisible(false);
                System.out.println(EstadisticaRana.getErrorAscendente());

            } else {
                numRoc4.setText("");
                JOptionPane.showMessageDialog(null, "Te has equivocao, vuelve a intentar, TU PUEDES....!!");
                EstadisticaRana.setErrorAscendente(EstadisticaRana.getErrorAscendente() + 1);
            }
        }

    }
}
