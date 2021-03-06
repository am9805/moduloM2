/**
 * Estudiante: Clase encargada de almacenar datos del estudiante.
 */

package Modelo;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyave Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class Estudiante {

    private String nombre;
    private String apellidos;
    private String grado;
    private String grupo;
    private String idEstudiante;
    
     /**
      * Estudiante: Constructor de la clase.
      * @param nombre
      * @param apellidos
      * @param grado
      * @param grupo
      * @param idEstudiante 
      */
    public Estudiante(String nombre, String apellidos, String grado, String grupo, String idEstudiante) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grado = grado;
        this.grupo = grupo;
        this.idEstudiante = idEstudiante;
    }
    /**
     * Estudiante: Constructor de la clase.
     */
    public Estudiante() {
    }
    
    /**
     * Métodos get y set de los atributos de la clase "Estudiante".
     */
    
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

}
