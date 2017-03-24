/**
 * Profesor: Esta clase se encarga de habilitar la ventana en la que el profesor consulta las estadísticas de los estudiantes.
 *
 */
package Vista;

import Controlador.ControladorEstadistica;
import Modelo.JuegoxEstudiantePojo;
import Modelo.TablaRanaPojo;
import Modelo.TablaTorrePojo;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Profesor extends javax.swing.JFrame {

    private ControladorEstadistica ctrlE;

    public Profesor() {
        initComponents();
        setLocationRelativeTo(null);
        panelRana.setVisible(false);
        panelTorre.setVisible(false);
        ctrlE = new ControladorEstadistica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoBusqueda = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        porEstudiante = new javax.swing.JPanel();
        idBus = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        porJuego = new javax.swing.JPanel();
        panelTorre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTorre = new javax.swing.JTable();
        panelRana = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRana = new javax.swing.JTable();
        consultar2 = new javax.swing.JButton();
        torreRB = new javax.swing.JRadioButton();
        ranaRB = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/DesempeñoT.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 344, 60));

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 120, -1));

        porEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBusActionPerformed(evt);
            }
        });
        porEstudiante.add(idBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 220, 30));

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        porEstudiante.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 130, -1));

        jLabel5.setText("Escriba la identificacion del estudiante:");
        porEstudiante.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 260, 30));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Nombre", "F.Unidades", "F.Decenas", "F.Centenas", "Nivel Alcanzado", "Juego", "F.Asendente", "F.Descendente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll1.setViewportView(tabla1);

        porEstudiante.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 790, 300));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F.Unidades = Fallos en unidades . / F.Decenas= Fallo Descenas. / F.Centenas= Fallo Centenas ");
        porEstudiante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 560, 20));

        jLabel3.setText("F.Ascendente = Fallo Ascendente.  / F.Des = Fallo Descendente.");
        porEstudiante.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jTabbedPane1.addTab("Por estudiante", porEstudiante);

        porJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTorre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTorre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Fallo Unidades", "Fallo Decenas", "Fallo Centenas", "Último Nivel", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTorre);

        panelTorre.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        porJuego.add(panelTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 240));

        panelRana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Fallo Ascendente", "Fallo Descendente", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRana);

        panelRana.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, -1));

        porJuego.add(panelRana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 670, 240));

        consultar2.setText("Consultar");
        consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar2ActionPerformed(evt);
            }
        });
        porJuego.add(consultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 150, -1));

        torreRB.setText("La Torre");
        torreRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torreRBActionPerformed(evt);
            }
        });
        porJuego.add(torreRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        ranaRB.setText("La Rana");
        ranaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranaRBActionPerformed(evt);
            }
        });
        porJuego.add(ranaRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jTabbedPane1.addTab("Por Juego", porJuego);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 800, 340));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoVenPrincipal.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ranaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranaRBActionPerformed
        torreRB.setSelected(false);
    }//GEN-LAST:event_ranaRBActionPerformed

    private void torreRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torreRBActionPerformed

        ranaRB.setSelected(false);
    }//GEN-LAST:event_torreRBActionPerformed

    private void consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar2ActionPerformed
        if (tablaRana.getSize().height == 0) {
            if (ranaRB.isSelected()) {
                panelRana.getSize();
                panelTorre.setVisible(false);
                panelRana.setVisible(true);
                ArrayList<TablaRanaPojo> array = ctrlE.mostrarDatosRana();
                DefaultTableModel model = (DefaultTableModel) tablaRana.getModel();
                int i = 0;
                while (i < array.size()) {
                    TablaRanaPojo e = array.get(i);
                    model.addRow(new Object[]{e.getNombre(), e.getApellidos(), e.getErrorAscendente(), e.getErrorDescendente(), e.getFecha()});
                    i++;
                }
            }
        }
        if (ranaRB.isSelected()) {
            panelTorre.setVisible(false);
            panelRana.setVisible(true);

        }
        if (tablaTorre.getSize().height == 0) {
            if (torreRB.isSelected()) {
                panelTorre.setVisible(true);
                panelRana.setVisible(false);
                ArrayList<TablaTorrePojo> array = ctrlE.mostrarDatosTorre();
                DefaultTableModel model = (DefaultTableModel) tablaTorre.getModel();
                int i = 0;
                while (i < array.size()) {
                    TablaTorrePojo e = array.get(i);
                    model.addRow(new Object[]{e.getNombre(), e.getApellidos(), e.getErroresUnidades(), e.getErroresDecenas(), e.getErroresCentenas(), e.getNivelAlcanzado(), e.getFecha()});
                    i++;
                }
            }
        }
        if (torreRB.isSelected()) {
            panelTorre.setVisible(true);
            panelRana.setVisible(false);

        }

    }//GEN-LAST:event_consultar2ActionPerformed
    private void Clear_Table1(JTable tabla) {
        tabla.setModel(new DefaultTableModel());
        for (int i = 0; i < tabla.getRowCount(); i++) {

            i -= 1;
        }
    }
    private void idBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBusActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        String id_estudiante = idBus.getText();
        ArrayList<JuegoxEstudiantePojo> array = ctrlE.mostrarDatosXestudiante(id_estudiante);
        DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
        int i = 0;
        while (i < array.size()) {
            JuegoxEstudiantePojo e = array.get(i);
            model.addRow(new Object[]{e.getNombre(), e.getApellidos(), e.getNombreJuego(), e.getErroresUnidades(), e.getErroresDecenas(), e.getErroresCentenas(), e.getNivelAlcanzado(), e.getNombreJuegoR(), e.getErrorAscendente(), e.getErrorDescendente()});
            i++;
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JButton consultar2;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelRana;
    private javax.swing.JPanel panelTorre;
    private javax.swing.JPanel porEstudiante;
    private javax.swing.JPanel porJuego;
    private javax.swing.JRadioButton ranaRB;
    private javax.swing.JButton salir;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tablaRana;
    private javax.swing.JTable tablaTorre;
    private javax.swing.ButtonGroup tipoBusqueda;
    private javax.swing.JRadioButton torreRB;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
