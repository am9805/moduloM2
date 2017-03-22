package Controlador;

import Modelo.GeneradorFactory;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorGenerarNumero {

    //SINGLETON PARA CONTRADOR 
    private static ControladorGenerarNumero GenNumero;

    public static ControladorGenerarNumero getInstance() {
        GenNumero = new ControladorGenerarNumero();
        return (GenNumero);
    }

    //METODO PARA GENERAR
    public void generadorNumeros(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e) {

        GeneradorFactory Gf = GeneradorFactory.getInstance();
        Gf.GenerarNumero(a, b, c, d, e);

    }

}
