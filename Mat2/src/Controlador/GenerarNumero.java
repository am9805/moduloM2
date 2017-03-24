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

    /**
     * GenerarNumero es un contructor vacio
     * 
     */
    public GenerarNumero() {
    }

    /**
     *
     * @param Generar
     *
     * GenerarNumero es un constructor que recibe como parametro un orgeto de
     * tipo Igenerarstrategy
     */
    public GenerarNumero(IGenerarNumeroStrategy Generar) {
        this.Generar = Generar;
    }

    /**
     *
     * @param numNube1
     * @param numNube2
     * @param numNube3
     * @param numNube4
     * @param orden GenerarNum: imboca los metodos de la interfaz
     * IgeneraStrategy de acuedo al tipo de orden, ( escoge la estrategia de
     * generamiento).
     */
    public void GenerarNum(JLabel numNube1, JLabel numNube2, JLabel numNube3, JLabel numNube4, JLabel orden) {
        Generar.GenerarNumero(numNube1, numNube2, numNube3, numNube4, orden);
    }

}
