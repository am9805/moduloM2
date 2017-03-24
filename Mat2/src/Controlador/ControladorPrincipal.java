/**
 * ControladorPrincipal: Clase encargada de hacer las validaciones del logueo y de agregar los estudiantes/usuarios
 * a la base de datos.
 */

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

    private Estudiante estudiante;
    private EstudianteDAO estudianteDAO;
    
    /**
     * guardarE: Guarda en la tabla "estudiante" los datos que se obtienen al registratse en la ventana principal.
     * @param nombre
     * @param apellidos
     * @param grado
     * @param grupo
     * @param id_estudiante 
     */
    public void guardarE(JTextField nombre, JTextField apellidos, JTextField grado, JTextField grupo, JTextField id_estudiante) {
        estudiante = new Estudiante();
        estudianteDAO = new EstudianteDAO();

        if (!nombre.getText().isEmpty() && !apellidos.getText().isEmpty() && !grado.getText().isEmpty() && !grupo.getText().isEmpty() && !id_estudiante.getText().isEmpty()) {
            estudiante.setNombre(nombre.getText());
            estudiante.setApellidos(apellidos.getText());
            estudiante.setGrado(grado.getText());
            estudiante.setGrupo(grupo.getText());
            estudiante.setIdEstudiante(id_estudiante.getText());
            estudianteDAO.agregarEstudiante(estudiante);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
    }
    
    /**
     * validarE: Valida que el estudiante ya se haya registrado, esta consulta la hace con el método
     * "validarUsuario" quiene es el encargado de buscar el usuario en la base de datos.
     * @param nombre
     * @param id_estudiante
     * @return 
     */
    public boolean validarE(String nombre, String id_estudiante) {
        boolean valido;
        estudianteDAO = new EstudianteDAO();
        valido = estudianteDAO.validarUsuario(nombre, id_estudiante);

        return valido;
    }

}
