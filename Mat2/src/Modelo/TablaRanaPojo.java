
package Modelo;

public class TablaRanaPojo {
    private String nombre;
    private String apellidos;
    private int errorAscendente;
    private int errorDescendente;
    private String fecha;

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

    public int getErrorAscendente() {
        return errorAscendente;
    }

    public void setErrorAscendente(int errorAscendente) {
        this.errorAscendente = errorAscendente;
    }

    public int getErrorDescendente() {
        return errorDescendente;
    }

    public void setErrorDescendente(int errorDescendente) {
        this.errorDescendente = errorDescendente;
    }
    
    
}
