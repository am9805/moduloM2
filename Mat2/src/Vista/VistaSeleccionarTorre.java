package Vista;

/**
 *
 * @author Santiago Bedoya Betancur.
 * @author Angelica Arroyave Mendoza.
 * @author Juan Pablo Romero Laverde.
 */
public class VistaSeleccionarTorre extends javax.swing.JFrame {

    public VistaSeleccionarTorre() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDosCifras = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        btnTresCifras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LaTorreT.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 300, 100));

        btnDosCifras.setBackground(new java.awt.Color(247, 204, 49));
        btnDosCifras.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnDosCifras.setForeground(new java.awt.Color(254, 254, 254));
        btnDosCifras.setText("Dos Cifras");
        btnDosCifras.setBorderPainted(false);
        btnDosCifras.setContentAreaFilled(false);
        btnDosCifras.setFocusPainted(false);
        btnDosCifras.setOpaque(true);
        btnDosCifras.setRolloverEnabled(false);
        btnDosCifras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosCifrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnDosCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 70));

        atrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BtnAtras.png"))); // NOI18N
        atrasBtn.setBorderPainted(false);
        atrasBtn.setFocusPainted(false);
        atrasBtn.setOpaque(true);
        atrasBtn.setRolloverEnabled(false);
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });
        getContentPane().add(atrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 70));

        btnTresCifras.setBackground(new java.awt.Color(48, 205, 182));
        btnTresCifras.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnTresCifras.setForeground(new java.awt.Color(254, 254, 254));
        btnTresCifras.setText("Tres Cifras");
        btnTresCifras.setBorderPainted(false);
        btnTresCifras.setContentAreaFilled(false);
        btnTresCifras.setFocusPainted(false);
        btnTresCifras.setOpaque(true);
        btnTresCifras.setRolloverEnabled(false);
        btnTresCifras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresCifrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnTresCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 240, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoGeneral.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosCifrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosCifrasActionPerformed
        NuevaVistaTorre(2);
    }//GEN-LAST:event_btnDosCifrasActionPerformed

    private void btnTresCifrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresCifrasActionPerformed
        NuevaVistaTorre(3);
    }//GEN-LAST:event_btnTresCifrasActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        Juegos j = new Juegos();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasBtnActionPerformed

    public void NuevaVistaTorre(int CantidadDeCifras) {
        VistaTorre NuevaTorre = new VistaTorre(CantidadDeCifras);
        this.dispose();
        NuevaTorre.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton btnDosCifras;
    private javax.swing.JButton btnTresCifras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
