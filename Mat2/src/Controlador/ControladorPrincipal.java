package Controlador;

import Modelo.Estudiante;
import Modelo.EstudianteDAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
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

    public boolean validarE(String nombre, String id_estudiante) {
        boolean a;
        edao = new EstudianteDAO();
        a = edao.validarUsuario(nombre, id_estudiante);

        return a;
    }

}
