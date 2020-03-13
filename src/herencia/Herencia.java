/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Protect.Circulo;
import Protect.Cuadrado;
import Protect.Linea;
import Protect.Triangulo;

/**
 *
 * @author User
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(circulo.getInformationFormas());
        circulo.printInformation1();
        
        System.out.println(linea.getInformationFormas());
        linea.printInformation2();
        
        System.out.println(triangulo.getInformationFormas());
        triangulo.printInformation3();
        
        System.out.println(cuadrado.getInformationFormas());
        cuadrado.printInformation4();
    }
    
}
