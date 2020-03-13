/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudadano;

import Protect.Trabajador;

/**
 *
 * @author User
 */
public class Ciudadano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Trabajador trabajador = new Trabajador("Jose Fuentes","5 años de experiencia");
        
         trabajador.setedad(25);
         
         System.out.println(trabajador.getedad());
         
         trabajador.ImprimirNombre();
         
        trabajador.ImprimirExperiencia();
       
        
    }
    
}
