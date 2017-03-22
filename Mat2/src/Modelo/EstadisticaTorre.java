package Modelo;
/**
 * 
 *
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class EstadisticaTorre {

    private String nombreJuego;
    private String idEstudiante;
    private int erroresUnidades;
    private int erroresDecenas;
    private int erroresCentenas;
    private int nivelAlcanzado;
    private String fecha;

    public EstadisticaTorre(String idEstudiante, String fecha) {
        nombreJuego = "La Torre";
        this.idEstudiante = idEstudiante;
        erroresUnidades = 0;
        erroresDecenas = 0;
        erroresCentenas = 0;
        nivelAlcanzado = 0;
        this.fecha = fecha;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
