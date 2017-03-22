package Vista;

import Controlador.ControladorGenerarNumero;
import Controlador.ControladorOrdenar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class PrincipalRana extends javax.swing.JFrame {

    int numeroEntradas = 1;
    boolean crono;

    public PrincipalRana() {
        initComponents();
        setLocationRelativeTo(null);
        Gif.setVisible(false);
        Roca1.setVisible(true);
        Roca2.setVisible(false);
        Roca3.setVisible(false);
        Roca4.setVisible(false);
        ro2.setVisible(false);
        ro3.setVisible(false);
        ro4.setVisible(false);
//        lblCronometro.setText("0:0:0");

    }

    public void transferirTexto(JLabel nub, JLabel roc) {
        nub.setTransferHandler(new TransferHandler("text"));
        roc.setTransferHandler(new TransferHandler("text"));

        MouseListener ml = new MouseAdapter() {
            //creamos el método para transferir
            //datos al presionar con el ratón

            public void mousePressed(MouseEvent e) {
                JComponent jc = (JComponent) e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.COPY);

            }
        };
        nub.addMouseListener(ml);
        roc.addMouseListener(ml);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RanaxRocaL = new javax.swing.JLabel();
        ro1 = new javax.swing.JLabel();
        ro2 = new javax.swing.JLabel();
        ro3 = new javax.swing.JLabel();
        ro4 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        Roca1 = new javax.swing.JLabel();
        Roca2 = new javax.swing.JLabel();
        Roca4 = new javax.swing.JLabel();
        Nube3 = new javax.swing.JLabel();
        Roca3 = new javax.swing.JLabel();
        forden = new javax.swing.JLabel();
        Gif = new javax.swing.JLabel();
        Nube4 = new javax.swing.JLabel();
        Nube1 = new javax.swing.JLabel();
        Nube2 = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        jugar = new javax.swing.JLabel();
        Estanque = new javax.swing.JLabel();
        avanzar = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1375, 745));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RanaxRocaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/RanaxRoca.png"))); // NOI18N
        getContentPane().add(RanaxRocaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 180, 160));

        ro1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro1.setForeground(new java.awt.Color(1, 1, 1));
        ro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 140, 80));

        ro2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro2.setForeground(new java.awt.Color(1, 1, 1));
        ro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 720, 140, 80));

        ro3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro3.setForeground(new java.awt.Color(1, 1, 1));
        ro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 160, 110));

        ro4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        ro4.setForeground(new java.awt.Color(1, 1, 1));
        ro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 720, 140, 80));

        num1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(1, 1, 1));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 170, 110));

        num2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(1, 1, 1));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 110));

        num3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(1, 1, 1));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 170, 110));

        num4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(1, 1, 1));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 170, 110));

        Roca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Rocka2.png"))); // NOI18N
        getContentPane().add(Roca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 160, 80));

        Roca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Rocka2.png"))); // NOI18N
        getContentPane().add(Roca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, 160, 80));

        Roca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Rocka2.png"))); // NOI18N
        getContentPane().add(Roca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 170, 80));

        Nube3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Nube .png"))); // NOI18N
        Nube3.setText("jLabel1");
        getContentPane().add(Nube3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 170, 110));

        Roca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Rocka2.png"))); // NOI18N
        getContentPane().add(Roca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 160, 110));

        forden.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        getContentPane().add(forden, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 280, 40));

        Gif.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/output_BnuDB1.gif"))); // NOI18N
        getContentPane().add(Gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 990, 290));

        Nube4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Nube .png"))); // NOI18N
        Nube4.setText("jLabel1");
        getContentPane().add(Nube4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 170, 110));

        Nube1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Nube .png"))); // NOI18N
        Nube1.setText("jLabel1");
        getContentPane().add(Nube1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 170, 110));

        Nube2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Nube .png"))); // NOI18N
        Nube2.setText("jLabel1");
        getContentPane().add(Nube2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 110));

        TITULO.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        TITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Titulo2.png"))); // NOI18N
        getContentPane().add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 330, 150));

        jugar.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        jugar.setForeground(new java.awt.Color(255, 255, 255));
        jugar.setText("JUGEMOS");
        jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarMouseClicked(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 330, -1));

        Estanque.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Estanque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/estanque1.png"))); // NOI18N
        getContentPane().add(Estanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 620, 1250, 230));

        avanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/arbolTerminar1.png"))); // NOI18N
        avanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avanzarMouseClicked(evt);
            }
        });
        getContentPane().add(avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 420, -1, -1));

        texto1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        texto1.setText(" La rana hasta el loto quiere llegar  saltando en a roca lo podrán lograr.  ");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 690, 60));

        texto2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        texto2.setText("De                                                         las debes ordenar, arrastra los numeros");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 740, -1));

        texto3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        texto3.setText("Para poder Ganar");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        texto4.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        texto4.setForeground(new java.awt.Color(255, 255, 255));
        texto4.setText("HAS CLIC AQUI PARA QUE  ");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        lblCronometro.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 250, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondito2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseClicked

        ro1.setText("");
        ro2.setText("");
        ro3.setText("");
        ro4.setText("");
//       lblCronometro.setVisible(true);
        crono = true;

        Gif.setVisible(false);

        RanaxRocaL.setVisible(true);
        Roca1.setVisible(true);
        Roca2.setVisible(false);
        Roca3.setVisible(false);
        Roca4.setVisible(false);

//        ControladorCronometro c = new ControladorCronometro(lblCronometro, Roca1, Roca2, Roca3, Roca4, ro1, ro2, ro3, ro4, num1, num2, num3, num4,jugar, crono); //Intancio la clase         
//        c.start();
//
        ControladorGenerarNumero generar = ControladorGenerarNumero.getInstance();
        generar.generadorNumeros(num1, num2, num3, num4, forden);

        transferirTexto(num1, ro1);
        transferirTexto(num2, ro2);
        transferirTexto(num3, ro3);
        transferirTexto(num4, ro4);

        jugar.setVisible(false);

        numeroEntradas = numeroEntradas + 1;

    }//GEN-LAST:event_jugarMouseClicked

    private void avanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avanzarMouseClicked

        ControladorOrdenar ordenar = ControladorOrdenar.getInstance();
        ordenar.OrdenarNumeros(forden, Roca1, Roca2, Roca3, Roca4, ro1, ro2, ro3, ro4, num1, num2, num3, num4, Gif, RanaxRocaL, jugar, lblCronometro);

    }//GEN-LAST:event_avanzarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estanque;
    private javax.swing.JLabel Gif;
    private javax.swing.JLabel Nube1;
    private javax.swing.JLabel Nube2;
    private javax.swing.JLabel Nube3;
    private javax.swing.JLabel Nube4;
    private javax.swing.JLabel RanaxRocaL;
    private javax.swing.JLabel Roca1;
    private javax.swing.JLabel Roca2;
    private javax.swing.JLabel Roca3;
    private javax.swing.JLabel Roca4;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel avanzar;
    private javax.swing.JLabel forden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugar;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel ro1;
    private javax.swing.JLabel ro2;
    private javax.swing.JLabel ro3;
    private javax.swing.JLabel ro4;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables

}
