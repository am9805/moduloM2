/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EstadisticaRana;
import Modelo.EstadisticaRanaDAO;
import Modelo.SingletonEstudianteActivo;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author santiago.bedoya5
 */
public class ControladorRana {
    Calendar c1 = Calendar.getInstance();
    Calendar c = new GregorianCalendar();
    String dia = Integer.toString(c.get(Calendar.DATE));
    String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
    String annio = Integer.toString(c.get(Calendar.YEAR));
    String fecha = (dia + "/" + mes + "/" + annio);;
    EstadisticaRana estadisticaRana = new EstadisticaRana("FROGGIE", fecha, SingletonEstudianteActivo.getInstance().getIdEstudiante());
    
     public void llenarTabla() {
        EstadisticaRanaDAO a = new EstadisticaRanaDAO();        
        a.AgregarEstadisticaR(estadisticaRana);
    }
}
