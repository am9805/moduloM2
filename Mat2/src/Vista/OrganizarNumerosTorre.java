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

        btnSalir = new javax.swing.JButton();
        btnVerificarNumero = new javax.swing.JButton();
        txtFCentenas = new javax.swing.JTextField();
        txtFDecenas = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Centenas = new javax.swing.JLabel();
        lbNumero1 = new javax.swing.JLabel();
        lbNumero3 = new javax.swing.JLabel();
        lbNumero2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Salir del juego");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVerificarNumero.setText("Verificar Número");
        btnVerificarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarNumeroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Unidades.");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Decenas.");

        Centenas.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        Centenas.setText("Centenas.");

        lbNumero1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero1.setText("1");

        lbNumero3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero3.setText("4");

        lbNumero2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero2.setText("4");

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtFCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnVerificarNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(lbNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(lbNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Centenas)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Centenas)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnVerificarNumero)
                .addGap(17, 17, 17)
                .addComponent(btnSalir)
                .addGap(17, 17, 17)
                .addComponent(btnReiniciar))
        );

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
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JTextField txtFCentenas;
    private javax.swing.JTextField txtFDecenas;
    private javax.swing.JTextField txtFUnidades;
    // End of variables declaration//GEN-END:variables
}
