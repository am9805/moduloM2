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

    public static OrdenadorFactory getInstance() {
        OrFactory = new OrdenadorFactory();
        return (OrFactory);
    }

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
