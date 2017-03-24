/**
 * TablaTorrePojo: Clase encargada de encampsular los datos de la tabla Torre.
 * 
 */
package Modelo;
/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyave Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class TablaTorrePojo {
     private String nombre;
    private String apellidos;
     private int erroresUnidades;
    private int erroresDecenas;
    private int erroresCentenas;
    private int nivelAlcanzado;    
    private String fecha;

    /**
     * Métodos get y set de los atributos de la clase.
     * 
     */
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getErroresUnidades() {
        return erroresUnidades;
    }

    public void setErroresUnidades(int erroresUnidades) {
        this.erroresUnidades = erroresUnidades;
    }

    public int getErroresDecenas() {
        return erroresDecenas;
    }

    public void setErroresDecenas(int erroresDecenas) {
        this.erroresDecenas = erroresDecenas;
    }

    public int getErroresCentenas() {
        return erroresCentenas;
    }

    public void setErroresCentenas(int erroresCentenas) {
        this.erroresCentenas = erroresCentenas;
    }

    public int getNivelAlcanzado() {
        return nivelAlcanzado;
    }

    public void setNivelAlcanzado(int nivelAlcanzado) {
        this.nivelAlcanzado = nivelAlcanzado;
    }
    
    
    

    

    
    
    
}
