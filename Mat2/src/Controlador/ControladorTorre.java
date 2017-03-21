package Controlador;

import Modelo.EstadisticaTorre;
import Modelo.EstadisticaTorreDAO;
import Modelo.Estudiante;
import Modelo.ModeloTorre;
import Modelo.SingletonEstudianteActivo;
import java.util.Calendar;
import javax.swing.JTextField;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author Santiago Bedoya Betancur
 * @author Angelica Arroyame Mendoza
 * @author Juan Pablo Romero Laverde
 */
public abstract class ControladorTorre {
    
    protected ModeloTorre Torre = new ModeloTorre();
    protected Estudiante Estudiante = new Estudiante();
    protected EstadisticaTorre EstadisticaTorre;
    
    public abstract boolean validarNumero(JTextField txtFUnidades, JTextField txtFDecenas, JTextField txtFCentenas, String numeroCorrecto);
    
    public abstract String cifrasALetras(int a);
    
    public abstract int numeroAleatorio();
    
    public ModeloTorre getTorre() {
        return Torre;
    }
    
    public ControladorTorre() {
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String Fecha = dia + "/" + mes + "/" + annio;
        EstadisticaTorre = new EstadisticaTorre(SingletonEstudianteActivo.getInstance().getIdEstudiante(), Fecha);
    }
    
    public void errores(boolean unidadesCorrectas, boolean decenasCorrectas, boolean centenasCorrectas) {
        if (!unidadesCorrectas) {
            EstadisticaTorre.setErroresUnidades(EstadisticaTorre.getErroresUnidades() + 1);
        }
        if (!decenasCorrectas) {
            EstadisticaTorre.setErroresDecenas(EstadisticaTorre.getErroresDecenas() + 1);
        }
        if (!centenasCorrectas) {
            EstadisticaTorre.setErroresCentenas(EstadisticaTorre.getErroresCentenas() + 1);
        }
        if (unidadesCorrectas && decenasCorrectas && centenasCorrectas) {
            EstadisticaTorre.setNivelAlcanzado(EstadisticaTorre.getNivelAlcanzado() + 1);
        }
    }
    

//    public String mensaje(int numeroMensaje) {
//        String[] mensajes = new String[4];
//        mensajes[0] = "Te equivocaste. ¡Puedes lograrlo!";
//        mensajes[1] = "Muy Bien. ¡Continúa!";
//        mensajes[2] = "Aún no has terminado, la proxima vez lo lograras.";
//        mensajes[3] = "Ha ocurrido un pequeño temblor.\nOrganiza los números por favor.";
//        return mensajes[numeroMensaje];
//    }

    public String[] centenas() {
        String[] centenas = {"ciento", "cien", "doscientos", "trescientos", "cuatrocientos",
            "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        return centenas;
    }
    
    public String[] decenas() {
        String[] decenas = {"diez", "once", "doce", "trece", "catorce", "quince", "dieci", "veinte",
            "veinti", "treinta", "cuarenta", "ciencuenta", "sesenta", "setenta", "ochenta", "noventa"};
        return decenas;
    }
    
    public String[] unidades() {
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        return unidades;
    }
    
    public void siguienteNumeroAleatorio() {
        String numeros;
        Torre.setNumeroActual(numeroAleatorio());
        numeros = Integer.toString(Torre.getNumeroActual());
        if (siguienteNumeroEnLetras()) {
            numeros = cifrasALetras(Torre.getNumeroActual());
            numeros = numeros.substring(0, 1).toUpperCase() + numeros.replaceFirst(numeros.substring(0, 1), "");
        }
        Torre.setNumeroString(numeros);
    }
    
    public boolean siguienteNumeroEnLetras() {
        boolean decision = true;
        if (Torre.getCantidadNumerosEnDigitos() == 5) {
            return true;
        }
        if (Torre.getCantidadNumerosEnLetras() == 5) {
            return false;
        }
        if (current().nextInt(0, 1 + 1) == 0) {
            decision = false;
            Torre.setCantidadNumerosEnDigitos(Torre.getCantidadNumerosEnDigitos() + 1);
        } else {
            Torre.setCantidadNumerosEnLetras(Torre.getCantidadNumerosEnLetras() + 1);
        }
        return decision;
    }
    
    public void llenarTabla() {
        EstadisticaTorreDAO a = new EstadisticaTorreDAO();
        a.AgregarEstadisticaT(EstadisticaTorre);
    }
    
}
