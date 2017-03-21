/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 *
 * @author JuanPablo
 */
public class EstadisticaRana {

    private String nombreJuego;
    private int errorAscendente;
    private int errorDescendente;
    private String fecha;    
    String idEstudiante;

    public EstadisticaRana() {
    }

    public EstadisticaRana(String nombreJuego, int errorAscendente, int errorDescendente, String fecha, String idEstudiante) {
        this.nombreJuego = nombreJuego;
        this.errorAscendente = errorAscendente;
        this.errorDescendente = errorDescendente;
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    
}