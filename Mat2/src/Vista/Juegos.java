package Vista;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class Juegos extends javax.swing.JFrame {

    public Juegos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        juegoTorre = new javax.swing.JButton();
        juegoRana = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AprendamosConMatT.png"))); // NOI18N
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 550, 130));

        juegoTorre.setBackground(new java.awt.Color(48, 205, 182));
        juegoTorre.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        juegoTorre.setForeground(new java.awt.Color(254, 254, 254));
        juegoTorre.setText("LA TORRE");
        juegoTorre.setAutoscrolls(true);
        juegoTorre.setBorderPainted(false);
        juegoTorre.setFocusPainted(false);
        juegoTorre.setOpaque(true);
        juegoTorre.setRolloverEnabled(false);
        juegoTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegoTorreActionPerformed(evt);
            }
        });
        getContentPane().add(juegoTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 240, 70));

        juegoRana.setBackground(new java.awt.Color(247, 204, 49));
        juegoRana.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        juegoRana.setForeground(new java.awt.Color(254, 254, 254));
        juegoRana.setText("FROGGIE");
        juegoRana.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        juegoRana.setBorderPainted(false);
        juegoRana.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        juegoRana.setFocusPainted(false);
        juegoRana.setOpaque(true);
        juegoRana.setRolloverEnabled(false);
        juegoRana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegoRanaActionPerformed(evt);
            }
        });
        getContentPane().add(juegoRana, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoVenPrincipal.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juegoTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juegoTorreActionPerformed
        VistaSeleccionarTorre seleccionarTorreVentana = new VistaSeleccionarTorre();
        seleccionarTorreVentana.setVisible(true);
        dispose();
    }//GEN-LAST:event_juegoTorreActionPerformed

    private void juegoRanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juegoRanaActionPerformed
        PrincipalRana juegoRanaVentana = new PrincipalRana();
        juegoRanaVentana.setVisible(true);
        dispose();
    }//GEN-LAST:event_juegoRanaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton juegoRana;
    private javax.swing.JButton juegoTorre;
    // End of variables declaration//GEN-END:variables
}
