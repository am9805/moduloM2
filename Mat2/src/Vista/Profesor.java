/**
 * Profesor: Esta clase se encarga de habilitar la ventana en la que el profesor consulta las estadísticas de los estudiantes.
 * 
 */

package Vista;

import Controlador.ControladorEstadistica;
import java.util.ArrayList;

public class Profesor extends javax.swing.JFrame {

    private ControladorEstadistica ctrlE;

    public Profesor() {
        initComponents();
        setLocationRelativeTo(null);
        p3.setVisible(false);
        p2.setVisible(false);
//        ranaRB.setVisible(false);
        ctrlE = new ControladorEstadistica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoBusqueda = new javax.swing.ButtonGroup();
        p3 = new javax.swing.JPanel();
        ranaRB = new javax.swing.JRadioButton();
        torreRB = new javax.swing.JRadioButton();
        p2 = new javax.swing.JPanel();
        idBus = new javax.swing.JTextField();
        radioBJuego = new javax.swing.JRadioButton();
        radioBEstudiante = new javax.swing.JRadioButton();
        consultar = new javax.swing.JButton();
        enunciado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3.setOpaque(false);
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ranaRB.setText("La Rana");
        ranaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranaRBActionPerformed(evt);
            }
        });
        p3.add(ranaRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        torreRB.setText("La Torre");
        torreRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torreRBActionPerformed(evt);
            }
        });
        p3.add(torreRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 50));

        p2.setOpaque(false);
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        p2.add(idBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 30));

        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 50));

        radioBJuego.setText("Por juego.");
        radioBJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(radioBJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));

        radioBEstudiante.setText("Por estudiante.");
        radioBEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(radioBEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        getContentPane().add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 120, -1));
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/DesempeñoT.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 344, 60));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione parámetro de búsqueda:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(false);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 680, 190));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoVenPrincipal.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void radioBJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBJuegoActionPerformed
        radioBEstudiante.setSelected(false);
        enunciado.setText("Seleccione uno de los siguientes juegos:");
        p3.setVisible(true);
        p2.setVisible(false);
        txtArea.setText("");
    }//GEN-LAST:event_radioBJuegoActionPerformed

    private void radioBEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBEstudianteActionPerformed
        txtArea.setText("");
        radioBJuego.setSelected(false);
        enunciado.setText("Escriba la identificación del estudiante:");
        p2.setVisible(true);
        p3.setVisible(false);
        ArrayList<String> a = new ArrayList<String>();
        a = ctrlE.mostrarDatosEstudiante();
        txtArea.append("Identificación         Nombre         Apellidos                   Grado                  Grupo " + "\n");
        for (int i = 0; i < a.size(); i++) {
            txtArea.append(a.get(i) + "\n");
        }
    }//GEN-LAST:event_radioBEstudianteActionPerformed

    private void ranaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranaRBActionPerformed
        torreRB.setSelected(false);
    }//GEN-LAST:event_ranaRBActionPerformed
    /**
     * Consultar: Al dar click en este boton se agrega a un text area un conjunto de estadisticas dependiendo 
     * del radio button que esté seleccionado.
     * @param evt 
     */
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (torreRB.isSelected() == true) {
//            ctrlE = new ControladorEstadistica();
            txtArea.setText("");

            ArrayList<String> arry = new ArrayList<String>();
            arry = ctrlE.mostrarDatosTorre();
            txtArea.append("Nombre            Apellidos           Fallas Unidades            Fallas Decenas              Falla Centenas               Último Nivel" + "\n");
            for (int i = 0; i < arry.size(); i++) {
                txtArea.append(arry.get(i) + "\n");
            }
        } else if (ranaRB.isSelected() == true) {
            txtArea.setText("");
            ArrayList<String> arry = new ArrayList<String>();
            arry = ctrlE.mostrarDatosRana();
            txtArea.append("Nombre            Apellidos           Fallas Ascendente            Fallas Descendente    " + "\n");
            for (int i = 0; i < arry.size(); i++) {
                txtArea.append(arry.get(i) + "\n");
            }
        } else if (radioBEstudiante.isSelected()) {
            if (!idBus.toString().isEmpty()) {
                txtArea.setText("");
                ArrayList<String> arry = new ArrayList<String>();
                arry = ctrlE.mostrarDatosXestudiante(idBus.toString());
                txtArea.append("N A   NJ     FU   FDece    FC    UN   NJ   FA   FDescen" + "\n");
                for (int i = 0; i < arry.size(); i++) {
                    txtArea.append(arry.get(i) + "\n");
                }

            } else {

            }
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void torreRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torreRBActionPerformed
        ranaRB.setSelected(false);

    }//GEN-LAST:event_torreRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JRadioButton radioBEstudiante;
    private javax.swing.JRadioButton radioBJuego;
    private javax.swing.JRadioButton ranaRB;
    private javax.swing.ButtonGroup tipoBusqueda;
    private javax.swing.JRadioButton torreRB;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
