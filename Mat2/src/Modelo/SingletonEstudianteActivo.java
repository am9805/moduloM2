package Modelo;

/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class SingletonEstudianteActivo {

    private static Estudiante instance;

    public static Estudiante getInstance() {
        if (instance == null) {
            instance = new Estudiante();
        }
        return instance;
    }

    public void setIdEstudiante(String id) {
        instance.setIdEstudiante(id);
    }

}
