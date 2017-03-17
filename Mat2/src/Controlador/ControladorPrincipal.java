/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.EstudianteDAO;
import Vista.Principal;
import java.util.ArrayList;
import javax.swing.JTextField;

public class ControladorPrincipal {

    Principal p = new Principal();

    
    public static void main(String args[]) {
        Principal pi = new Principal();
        pi.setVisible(true);
    }
    
    public void guardarE() {
//        
//        if(p.getK()==2){
//            System.out.println(p.getK());
            Estudiante e = new Estudiante((p.getNombre()).toString(), (p.getApellidos()).toString(), (p.getGrado()).toString(), (p.getGrupo()).toString(), (p.getId()).toString());
            EstudianteDAO dao = new EstudianteDAO();
            dao.agregarEstudiante(e);
//        llenarE(e);
//        }
    }
    
    
//    public ArrayList<Estudiante> llenarE (Estudiante estudiante){
//        ArrayList <Estudiante> a = new ArrayList();
//        a.add(estudiante);
//        System.out.println("2");
//        for(int i =0; i<=a.size();i++){
//            System.out.println("1");
//            System.out.println(a.get(i));
//        }
//        return a;
//    }
//    
//    public void recorrer (ArrayList<Estudiante> e){
//        for(int i =0; i<=e.size();i++){
//            System.out.println(e.get(i));
//        }
//    }
//        
//    public void guardarP() {
//        Estudiante e = new Estudiante((p.getNombre()).toString(), (p.getApellidos()).toString(), (p.getGrado()).toString(), (p.getGrupo()).toString(), (p.getId()).toString());
//    }


}
