/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author angelica.arroyavem
 */
public class SingletonEstudianteActivo {
    
    private static Estudiante instance;
    
    public static Estudiante getInstance(){
        if(instance==null){
            instance = new Estudiante();
        }
        return instance;
    }
    
    public void setIdEstudiante(String id){
        instance.setIdEstudiante(id);
    }
    
}
