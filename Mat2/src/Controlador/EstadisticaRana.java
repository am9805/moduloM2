package Controlador;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class EstadisticaRana {

    private String NombreJuego;
    private int ErrorAscendente;
    private int ErrorDescendente;
    private String Fecha;

    public EstadisticaRana() {
    }

    //CONSTRUCTOR PARA ESTADISTICAS
    public EstadisticaRana(String NombreJuego, int ErrorAscendente, int ErrorDescendente, String Fecha) {
        this.NombreJuego = NombreJuego;
        this.ErrorAscendente = 0;
        this.ErrorDescendente = 0;
        this.Fecha = Fecha;
    }

    //METODOS GET SET PARA ESTADISTICASS
    public String getNombreJuego() {
        return NombreJuego;
    }

    public void setNombreJuego(String NombreJuego) {
        this.NombreJuego = NombreJuego;
    }

    public int getErrorAscendente() {
        return ErrorAscendente;
    }

    public void setErrorAscendente(int ErrorAscendente) {
        this.ErrorAscendente = ErrorAscendente;
    }

    public int getErrorDescendente() {
        return ErrorDescendente;
    }

    public void setErrorDescendente(int ErrorDescendente) {
        this.ErrorDescendente = ErrorDescendente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

}
