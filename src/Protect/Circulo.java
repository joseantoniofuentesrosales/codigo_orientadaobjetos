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
public class Circulo extends Formas {
    
    public Circulo(){
    
        setColor("Rojo");
        
        setDibujar("Circulo");
    }

    @Override
   public String getInformationFormas() {
   return "Informacion acerca del circulo";
    }
    
    
    
}
