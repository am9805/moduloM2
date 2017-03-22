package Vista;

import Controlador.ControladorTorre;
import Modelo.ModeloTorre;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class OrganizarNumerosTorre extends javax.swing.JFrame {

    private VistaTorre VistaTorre;
    private ControladorTorre ControladorTorre;
    private ModeloTorre Torre;
    private String numero;

    public OrganizarNumerosTorre(VistaTorre VistaTorre, String numero) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.VistaTorre = VistaTorre;
        ControladorTorre = VistaTorre.getControladorTorre();
        Torre = VistaTorre.getTorre();
        this.numero = numero;
        transferirTexto(lbNumero1, txtFCentenas);
        transferirTexto(lbNumero2, txtFDecenas);
        transferirTexto(lbNumero3, txtFUnidades);
        bloquearTxtF(txtFUnidades, txtFDecenas, txtFCentenas);
        if (VistaTorre.getCantidadCifras() == 2) {
            txtFCentenas.setVisible(false);
            Centenas.setVisible(false);
            lbNumero1.setVisible(false);
        } else {
            lbNumero1.setText(numero.substring(2, 3));
        }
        lbNumero2.setText(numero.substring(1, 2));
        lbNumero3.setText(numero.substring(0, 1));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNumero1 = new javax.swing.JLabel();
        lbNumero2 = new javax.swing.JLabel();
        lbNumero3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVerificarNumero = new javax.swing.JButton();
        txtFCentenas = new javax.swing.JTextField();
        txtFDecenas = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Centenas = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 50, 20));
        getContentPane().add(lbNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));
        getContentPane().add(lbNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, 20));

        btnSalir.setText("Salir del juego");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, -1));

        btnVerificarNumero.setText("Verificar Número");
        btnVerificarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        getContentPane().add(txtFCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 149, 70, -1));
        getContentPane().add(txtFDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 149, 70, -1));
        getContentPane().add(txtFUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 149, 70, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Unidades.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Decenas.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 130, 70, -1));

        Centenas.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        Centenas.setText("Centenas.");
        getContentPane().add(Centenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoJTorre.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ControladorTorre cntrlTorre = ControladorTorre;
        cntrlTorre.llenarTabla();
        this.dispose();
        VistaTorre.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerificarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarNumeroActionPerformed
        boolean numeroValido = ControladorTorre.validarNumero(txtFUnidades, txtFDecenas, txtFCentenas, numero, false);
        if (numeroValido) {
            this.dispose();
            VistaTorre.setVisible(true);
        }
        reiniciarTxtF(txtFUnidades, txtFDecenas, txtFCentenas);
    }//GEN-LAST:event_btnVerificarNumeroActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        OrganizarNumerosTorre Nuevo = new OrganizarNumerosTorre(VistaTorre, numero);
        this.dispose();
        Nuevo.setVisible(true);
    }//GEN-LAST:event_btnReiniciarActionPerformed
    public void transferirTexto(JLabel numeroA, JTextField numeroC) {
        numeroA.setTransferHandler(new TransferHandler("text"));
        numeroC.setTransferHandler(new TransferHandler("text"));

        MouseListener ml = new MouseAdapter() {
            //creamos el método para transferir
            //datos al presionar con el ratón

            public void mousePressed(MouseEvent e) {
                JComponent jc = (JComponent) e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.COPY);

            }
        };
        numeroA.addMouseListener(ml);
        numeroC.addMouseListener(ml);
    }

    public void reiniciarTxtF(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas) {
        txtFUnidades.setText("");
        txtFDecenas.setText("");
        txtFCentenas.setText("");
    }

    public void bloquearTxtF(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas) {
        txtFUnidades.setEnabled(false);
        txtFDecenas.setEnabled(false);
        txtFCentenas.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Centenas;
    private javax.swing.JToggleButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificarNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JTextField txtFCentenas;
    private javax.swing.JTextField txtFDecenas;
    private javax.swing.JTextField txtFUnidades;
    // End of variables declaration//GEN-END:variables
}
