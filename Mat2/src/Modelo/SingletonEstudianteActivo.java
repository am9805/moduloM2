package Modelo;

/**
 * 
 * SingletonEstudianteActivo: Es usada para que en toda la aplicación este guardado el id del estudiante que esta jugando
 * actualmete.
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class SingletonEstudianteActivo {

    private static Estudiante instance;
    /**
     * getInstance: Método encargado de capturar un ÚNICO objeto de tipo estudiante.
     * @return 
     */
    public static Estudiante getInstance() {
        if (instance == null) {
            instance = new Estudiante();
        }
        return instance;
    }
    /**
     * setIdEstudiante: Método encargado de setear el id del estudiante en el objeto de tipo estudiante para que este este durante
     * toda la ejecución del programa.
     * @param id 
     */
    public void setIdEstudiante(String id) {
        instance.setIdEstudiante(id);
    }

}
