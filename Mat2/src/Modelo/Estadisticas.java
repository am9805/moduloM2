
package Modelo;
/**
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public class Estadisticas {
        
      protected int  vReal;
      protected int vInsertado;
      protected int tipoE;
      protected int idEstudiante;
      
    
    public Estadisticas(int vReal, int vInsertado, int tipoE, int idEstudiante) {
        this.vReal = vReal;
        this.vInsertado = vInsertado;
        this.tipoE = tipoE;
        this.idEstudiante = idEstudiante;
    }

    public int getvReal() {
        return vReal;
    }

    public void setvReal(int vReal) {
        this.vReal = vReal;
    }

    public int getvInsertado() {
        return vInsertado;
    }

    public void setvInsertado(int vInsertado) {
        this.vInsertado = vInsertado;
    }

    public int getTipoE() {
        return tipoE;
    }

    public void setTipoE(int tipoE) {
        this.tipoE = tipoE;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
      
      
//    protected int eUnidades;
//    protected int eDecenas;
//    protected int eCentenas;
//    protected int nivel;
//
//    public EstadisticasT() {
//        this.eUnidades = 0;
//        this.eDecenas = 0;
//        this.eCentenas = 0;
//        this.nivel = 1;
//    }
//
//    public int geteUnidades() {
//        return eUnidades;
//    }
//
//    public void seteUnidades(int eUnidades) {
//        this.eUnidades = eUnidades;
//    }
//
//    public int geteDecenas() {
//        return eDecenas;
//    }
//
//    public void seteDecenas(int eDecenas) {
//        this.eDecenas = eDecenas;
//    }
//
//    public int geteCentenas() {
//        return eCentenas;
//    }
//
//    public void seteCentenas(int eCentenas) {
//        this.eCentenas = eCentenas;
//    }
//
//    public int getNivel() {
//        return nivel;
//    }
//
//    public void setNivel(int nivel) {
//        this.nivel = nivel;
//    }

       
    
}
