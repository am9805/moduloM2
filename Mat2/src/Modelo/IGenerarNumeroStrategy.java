package Modelo;

import javax.swing.JLabel;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public interface IGenerarNumeroStrategy {

    /**
     *
     * @param numNube1
     * @param numNube2
     * @param numNube3
     * @param numNube4
     * @param orden5 Generar numero recive los parametros de los objetos que se
     * deben ordenar y los lleva a las estrategias de generacion
     */
    void GenerarNumero(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden5);

}
