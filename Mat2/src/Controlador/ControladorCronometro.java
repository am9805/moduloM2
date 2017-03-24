package Controlador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class ControladorCronometro extends Thread { //una clase que hereda de la clase Thread

    boolean crono;
    private JLabel hilo, Roca1, Roca2, Roca3, Roca4, ro1, ro2, ro3, ro4, num1, num2, num3, num4, jugamos;

    public ControladorCronometro(JLabel hilo) {
        this.hilo = hilo;

    }

    ///CONSTRUCTOR DEL CRONOMETRO
    public ControladorCronometro(JLabel hilo, JLabel Roca1, JLabel Roca2, JLabel Roca3, JLabel Roca4, JLabel ro1, JLabel ro2, JLabel ro3, JLabel ro4, JLabel num1, JLabel num2, JLabel num3, JLabel num4, JLabel jugamos) {
        this.hilo = hilo;
        this.Roca1 = Roca1;
        this.Roca2 = Roca2;
        this.Roca3 = Roca3;
        this.Roca4 = Roca4;
        this.ro1 = ro1;
        this.ro2 = ro2;
        this.ro3 = ro3;
        this.ro4 = ro4;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.jugamos = jugamos;
        

    }

    public ControladorCronometro() {// Contructor porque la clase es heredada 
        super();
    }

    int horas = 00, minutos = 00, segundos = 00;

    //INICIO DEL CRONOMETRO  
    public void run() {
        hilo.setText("00:00:00");
        
        try {
           
            for (;;) {
                if("".equals(ro1.getText()) || "".equals(ro2.getText()) || "".equals(ro3.getText()) || "".equals(ro4.getText())){
                if (segundos == 59) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 59) {
                    minutos = 0;
                    horas++;
                }
                segundos++;

                hilo.setText(horas + ":" + minutos + ":" + segundos);

                Thread.sleep(1000);
                }
                if ((horas == 00 && minutos == 01 && segundos == 01)) {
                    hilo.setText("0:0:0");
                    System.out.println("Erroor");
                    Roca1.setVisible(false);
                    Roca2.setVisible(false);
                    Roca3.setVisible(false);
                    Roca4.setVisible(false);
                    ro1.setVisible(false);
                    ro2.setVisible(false);
                    ro3.setVisible(false);
                    ro4.setVisible(false);
                    num1.setVisible(false);
                    num2.setVisible(false);
                    num3.setVisible(false);
                    num4.setVisible(false);
                    jugamos.setVisible(true);
                    JOptionPane.showMessageDialog(null, "UUUUUUPSSS, SE TE HA ACABADO EL TIEMPO VUELVE A EMPEZAR AMIGUITO.....!!!!!!");
                    break;

                }
            
                if (!"".equals(ro1.getText()) && !"".equals(ro2.getText()) && !"".equals(ro3.getText()) &&!"".equals(ro4.getText())) {
                    hilo.setText("0:0:0");
                    stop();

                }

            }
        
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void terminar(  ){
        this.stop();
    }
}
