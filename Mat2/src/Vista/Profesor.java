
package Vista;

public class Profesor extends javax.swing.JFrame {
    
   
    public Profesor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idBus = new javax.swing.JTextField();
        atrasBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 480));
        setMinimumSize(new java.awt.Dimension(730, 480));
        setPreferredSize(new java.awt.Dimension(730, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(idBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 290, -1));

        atrasBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BtnAtras.png"))); // NOI18N
        atrasBtn2.setBorderPainted(false);
        atrasBtn2.setFocusPainted(false);
        atrasBtn2.setOpaque(true);
        atrasBtn2.setRolloverEnabled(false);
        atrasBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(atrasBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 80, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/DesempeñoT.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 344, 60));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Escriba identificación del estudiante:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(false);
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 680, 240));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoVenPrincipal.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtn2ActionPerformed
        Juegos j = new Juegos();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBtn2;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
