
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.EstudianteDAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorPrincipal {

    private Estudiante est;
    private EstudianteDAO edao;

    public void guardarE(JTextField nombre, JTextField apellidos, JTextField grado, JTextField grupo, JTextField id_estudiante) {
        est = new Estudiante();
        edao = new EstudianteDAO();

        if (!nombre.getText().isEmpty() && !apellidos.getText().isEmpty() && !grado.getText().isEmpty() && !grupo.getText().isEmpty() && !id_estudiante.getText().isEmpty()) {
            est.setNombre(nombre.getText());
            est.setApellidos(apellidos.getText());
            est.setGrado(grado.getText());
            est.setGrupo(grupo.getText());
            est.setIdEstudiante(id_estudiante.getText());
            edao.agregarEstudiante(est);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
    }

    public boolean validarE(String nombre) {
        boolean a;
        edao = new EstudianteDAO();
        a = edao.validarUsuario(nombre);        
        return a;
    }

}
