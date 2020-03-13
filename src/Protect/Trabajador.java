/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protect;

/**
 *
 * @author User
 */
public class Trabajador {
    
    public String nombre;
    
    private String experiencia;
    
    private int edad;
    
    public Trabajador(String nombre, String experiencia){
        this.nombre = nombre;
        this.experiencia = experiencia;
    }
    
    public void ImprimirExperiencia(){
        System.out.println(experiencia);
    }
    
    public void setedad(int nedad){
        this.edad = nedad;
    }
    public int getedad(){
    return edad;
    }
    public void ImprimirNombre(){
        System.out.println(nombre);
    }
}
