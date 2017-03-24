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

    public IOrdenarStrategy getOrden() {
        return orden;
    }

    /**
     *
     * @param orden ordenarNumero: es un ontructor que tiene como parametro un
     * objeto de tipo Iordenar Strategy
     */
    public OrdenarNumero(IOrdenarStrategy orden) {
        this.orden = orden;
    }

    /**
     * OrdenarNumero: contructor vacio
     */
    public OrdenarNumero() {
    }

    /**
     *
     *
     * @param ordenNumerico OrdenNumerico: es un contructor el cual recibe un
     * label que tiene la informacion de como sera el orden del numero
     */
    public OrdenarNumero(JLabel ordenNumerico) {
        this.ordenNumerico = ordenNumerico;
    }

    /**
     *
     * @param roca1
     * @param roca2
     * @param roca3
     * @param roca4
     * @param numRoc1
     * @param numRoc2
     * @param numRoc3
     * @param numRoc4
     * @param nube1
     * @param nube2
     * @param nube3
     * @param nube4
     * @param Gif
     * @param RanaxRocaL
     * @param juguemos
     * @param Cronometro OrdenarNum1: este metodo invoca la interfaz de
     * ordenamiento e invoca los metodos de dicha y interfaz
     *
     */
    public void ordenarNum(JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro) {
        orden.ordenar(roca1, roca2, roca3, roca4, numRoc1, numRoc2, numRoc3, numRoc4, nube1, nube2, nube3, nube4, Gif, RanaxRocaL, juguemos, Cronometro);

    }

}
