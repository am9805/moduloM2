/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPrincipal;
import Modelo.SingletonEstudianteActivo;
import javax.swing.JOptionPane;

/**
 *
 * @author angelica.arroyavem
 */
public class Principal extends javax.swing.JFrame {

    private ControladorPrincipal ctrlPrincipal;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        panelProfesor.setVisible(false);
        panelRegistro.setVisible(false);
        panelOpcion.setVisible(false);
        panelOpcion.setOpaque(false);
        panelLogin.setVisible(false);
        ctrlPrincipal = new ControladorPrincipal();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        estudiante = new javax.swing.JButton();
        profe = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        usuarioE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passE = new javax.swing.JTextField();
        sigE1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        panelOpcion = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        regis = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        sigE = new javax.swing.JButton();
        panelProfesor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        usuarioP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sigP = new javax.swing.JButton();
        passP = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 460));
        setMinimumSize(new java.awt.Dimension(730, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ModuloMatT.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 100));

        estudiante.setBackground(new java.awt.Color(247, 204, 49));
        estudiante.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        estudiante.setForeground(new java.awt.Color(254, 254, 254));
        estudiante.setText("Estudiante (Click Aquí!).");
        estudiante.setBorderPainted(false);
        estudiante.setFocusPainted(false);
        estudiante.setRolloverEnabled(false);
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 250, 70));

        profe.setBackground(new java.awt.Color(48, 205, 182));
        profe.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        profe.setForeground(new java.awt.Color(254, 254, 254));
        profe.setText("Profesor (Click Aquí!).");
        profe.setBorderPainted(false);
        profe.setFocusPainted(false);
        profe.setPreferredSize(new java.awt.Dimension(259, 79));
        profe.setRolloverEnabled(false);
        profe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profeActionPerformed(evt);
            }
        });
        getContentPane().add(profe, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 119, 250, 70));

        panelLogin.setOpaque(false);
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel8.setText("Estudiante:");
        panelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 86, 25));
        panelLogin.add(usuarioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 177, -1));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel9.setText("Identificación:");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        panelLogin.add(passE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 184, -1));

        sigE1.setText("Siguiente");
        sigE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigE1ActionPerformed(evt);
            }
        });
        panelLogin.add(sigE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 93, 141, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Inicio de Sesión");
        panelLogin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 310, -1));

        inicio.setBackground(new java.awt.Color(247, 204, 49));
        inicio.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        inicio.setForeground(new java.awt.Color(254, 254, 254));
        inicio.setText("Iniciar Sesión.");
        inicio.setBorderPainted(false);
        inicio.setRolloverEnabled(false);
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        regis.setBackground(new java.awt.Color(247, 204, 49));
        regis.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        regis.setForeground(new java.awt.Color(254, 254, 254));
        regis.setText("Registrarse.");
        regis.setBorderPainted(false);
        regis.setFocusPainted(false);
        regis.setRolloverEnabled(false);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionLayout = new javax.swing.GroupLayout(panelOpcion);
        panelOpcion.setLayout(panelOpcionLayout);
        panelOpcionLayout.setHorizontalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelOpcionLayout.setVerticalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 340, 140));

        panelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRegistro.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel3.setText("Identificación:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setText("Grado:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel5.setText("Grupo:");

        sigE.setBackground(java.awt.Color.lightGray);
        sigE.setText("Siguiente");
        sigE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addComponent(sigE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombre)
                            .addComponent(apellidos)
                            .addComponent(id))
                        .addGap(13, 13, 13))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sigE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 310, 180));

        panelProfesor.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel6.setText("Usuario:");

        usuarioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioPActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel7.setText("Contraseña:");

        sigP.setText("Siguiente");
        sigP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProfesorLayout = new javax.swing.GroupLayout(panelProfesor);
        panelProfesor.setLayout(panelProfesorLayout);
        panelProfesorLayout.setHorizontalGroup(
            panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProfesorLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(passP))
                    .addGroup(panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProfesorLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sigP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelProfesorLayout.setVerticalGroup(
            panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProfesorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7))
                    .addGroup(panelProfesorLayout.createSequentialGroup()
                        .addComponent(usuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(sigP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 250, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoVenPrincipal.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigEActionPerformed
        boolean validarE;
        validarE = ctrlPrincipal.validarE(nombre.getText(), id.getText());
        if (!validarE) {
            ctrlPrincipal.guardarE(nombre, apellidos, grado, grupo, id);
            panelRegistro.setVisible(false);
            panelLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante ya esta registrado.");
            vaciar();
        }
    }//GEN-LAST:event_sigEActionPerformed

    private void profeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profeActionPerformed
        panelProfesor.setVisible(true);
        panelRegistro.setVisible(false);
    }//GEN-LAST:event_profeActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed

        esconder();
        panelOpcion.setVisible(true);
        panelProfesor.setVisible(false);
    }//GEN-LAST:event_estudianteActionPerformed

    private void sigPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigPActionPerformed
        if (usuarioP.getText().equals("profesor") && passP.getText().equals("123")) {
            Profesor profeVentana = new Profesor();
            profeVentana.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sigPActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        panelRegistro.setVisible(true);
        panelProfesor.setVisible(false);
        panelOpcion.setVisible(false);
    }//GEN-LAST:event_regisActionPerformed

    private void sigE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigE1ActionPerformed
        boolean bol;
        bol = ctrlPrincipal.validarE(usuarioE.getText(), passE.getText());
        if (!bol) {
            JOptionPane.showMessageDialog(null, "Ingresa bien los datos.");
        } else {
            SingletonEstudianteActivo.getInstance().setIdEstudiante(passE.getText());
            Juegos ventanaJuegos = new Juegos();
            ventanaJuegos.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sigE1ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        panelLogin.setVisible(true);
        panelProfesor.setVisible(false);
        panelOpcion.setVisible(false);
    }//GEN-LAST:event_inicioActionPerformed

    private void usuarioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioPActionPerformed

    public void esconder() {
        panelRegistro.setVisible(false);
        panelProfesor.setVisible(false);
        panelOpcion.setVisible(false);
        panelLogin.setVisible(false);
    }

    public void vaciar() {
        nombre.setText("");
        apellidos.setText("");
        grado.setText("");
        grupo.setText("");
        id.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton estudiante;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField grado;
    private javax.swing.JTextField grupo;
    private javax.swing.JTextField id;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelOpcion;
    private javax.swing.JPanel panelProfesor;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField passE;
    private javax.swing.JPasswordField passP;
    private javax.swing.JButton profe;
    private javax.swing.JButton regis;
    private javax.swing.JButton sigE;
    private javax.swing.JButton sigE1;
    private javax.swing.JButton sigP;
    private javax.swing.JTextField usuarioE;
    private javax.swing.JTextField usuarioP;
    // End of variables declaration//GEN-END:variables
}
