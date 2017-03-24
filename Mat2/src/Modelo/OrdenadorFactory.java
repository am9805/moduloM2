package Modelo;

import Controlador.OrdenAscecendente;
import Controlador.OrdenDescendente;
import Controlador.OrdenarNumero;
import javax.swing.JLabel;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class OrdenadorFactory {

    private static OrdenadorFactory OrFactory;

    /**
     * 
     * @return 
     * este metodo es un singleton que permite instanciar la clase solo una ves e impedir el uso excesivo de memoria 
     */
    public static OrdenadorFactory getInstance() {
        OrFactory = new OrdenadorFactory();
        return (OrFactory);
    }

    /**
     * 
     * @param ordenador
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
     * @param Cronometro 
     * 
     * OrdenaNumero escoje el tipo de ordenamiento que debe tener el juego de acuero al parametro de ordenamiento
     * luego estos parametros los llevan a las clase contexto de ordenamiento donde se desarrolla el proceso para ordenar
     */
    public void OrdenarNumero(JLabel ordenador, JLabel roca1, JLabel roca2, JLabel roca3, JLabel roca4,
            JLabel numRoc1, JLabel numRoc2, JLabel numRoc3, JLabel numRoc4,
            JLabel nube1, JLabel nube2, JLabel nube3, JLabel nube4,
            JLabel Gif, JLabel RanaxRocaL, JLabel juguemos, JLabel Cronometro) {
        String orden;
        orden = ordenador.getText();
        switch (orden) {
            case "Menor a Mayor":
                OrdenarNumero gna = new OrdenarNumero(new OrdenAscecendente());
                gna.ordenarNum(roca1, roca2, roca3, roca4, numRoc1, numRoc2, numRoc3, numRoc4, nube1, nube2, nube3, nube4, Gif, RanaxRocaL, juguemos, Cronometro);
                break;
            case "Mayor a Menor":
                OrdenarNumero gnd = new OrdenarNumero(new OrdenDescendente());
                gnd.ordenarNum(roca1, roca2, roca3, roca4, numRoc1, numRoc2, numRoc3, numRoc4, nube1, nube2, nube3, nube4, Gif, RanaxRocaL, juguemos, Cronometro);
                break;
        }

    }

}
