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

public class OrganizarNumeros extends javax.swing.JFrame {

    private VistaTorre VistaTorre;
    private ControladorTorre ControladorTorre;
    private ModeloTorre Torre;

    public OrganizarNumeros(VistaTorre VistaTorre) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.VistaTorre = VistaTorre;
        ControladorTorre = VistaTorre.getControladorTorre();
        Torre = VistaTorre.getTorre();
        transferirTexto(lbNumero1, txtFCentenas);
        transferirTexto(lbNumero2, txtFDecenas);
        transferirTexto(lbNumero3, txtFUnidades);
        bloquearTxtF( txtFUnidades, txtFDecenas,  txtFCentenas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnVerificarNumero = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbNumero1 = new javax.swing.JLabel();
        lbNumero2 = new javax.swing.JLabel();
        lbNumero3 = new javax.swing.JLabel();
        txtFCentenas = new javax.swing.JTextField();
        txtFDecenas = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Centenas = new javax.swing.JLabel();

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNumero1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero1.setText("1");
        jPanel1.add(lbNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 20));

        lbNumero2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero2.setText("4");
        jPanel1.add(lbNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, 20));

        lbNumero3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumero3.setText("4");
        jPanel1.add(lbNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 70, 20));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Unidades.");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Decenas.");

        Centenas.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        Centenas.setText("Centenas.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVerificarNumero)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Centenas)
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtFCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtFDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnVerificarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Centenas)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        VistaTorre.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerificarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarNumeroActionPerformed

    }//GEN-LAST:event_btnVerificarNumeroActionPerformed
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

    public void bloquearTxtF(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas) {
        txtFUnidades.setEnabled(false);
        txtFDecenas.setEnabled(false);
        txtFCentenas.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Centenas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificarNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JTextField txtFCentenas;
    private javax.swing.JTextField txtFDecenas;
    private javax.swing.JTextField txtFUnidades;
    // End of variables declaration//GEN-END:variables
}
