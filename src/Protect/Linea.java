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
public class Linea extends Formas {
    
    public Linea(){
    setColor("Azul");
    setDibujar("Linea");
    }

    @Override
    public String getInformationFormas() {
    return "Informacion acerca de la linea";
    }
}
