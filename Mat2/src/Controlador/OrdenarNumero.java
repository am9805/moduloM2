package Controlador;

import Modelo.IOrdenarStrategy;
import javax.swing.JLabel;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class OrdenarNumero {

    private JLabel ordenNumerico;
    private IOrdenarStrategy orden;

    //CONTRUCTORES DIVERSOS 
    public OrdenarNumero(IOrdenarStrategy orden) {
        this.orden = orden;
    }

    public OrdenarNumero() {
    }

    public OrdenarNumero(JLabel ordenNumerico) {
        this.ordenNumerico = ordenNumerico;
    }

    // METODO QUE INVOCA LA INTERFAZ DE ORDENAMIENTO E INVOCA LOS METODOS DE DICHA INTERFAZ
    public void ordenarNum(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro) {
        orden.ordenar(roca1, roca2, roca3, roca4, numRoc1, numRoc2, numRoc3, numRoc4, nube1, nube2, nube3, nube4, Gif, RanaxRocaL, juguemos, Cronometro);

    }

}
