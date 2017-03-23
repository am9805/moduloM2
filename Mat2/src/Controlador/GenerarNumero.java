package Controlador;

import Modelo.IGenerarNumeroStrategy;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class GenerarNumero {//CLASE CONTEXTO

    private IGenerarNumeroStrategy Generar;

    public GenerarNumero() {
    }

    // CONTRUCTOR QUE HEREDA DE LA INTERFAZ GENERAR NUMERO

    public GenerarNumero(IGenerarNumeroStrategy Generar) {
        this.Generar = Generar;
    }

    //METODO QUE INVOCA LOS METODOS DE LA INTERFACE

    public void GenerarNum(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {
        Generar.GenerarNumero(numNube1, numNube2, numNube3, numNube4, orden);
    }

}
