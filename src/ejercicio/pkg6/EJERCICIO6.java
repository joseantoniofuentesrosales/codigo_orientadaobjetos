/*
 Crear un programa que imprima en consola
 un nombre de estudiante, una nota y 
 una etiqueta que diga Aprobado o Reprobado, 
 dependiendo del valor de la nota que tenga.
 */
package ejercicio.pkg6;

import javax.swing.JOptionPane;


public class EJERCICIO6 {

        
    public static void main(String arg[]){
        String nombre = "";
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String nota = JOptionPane.showInputDialog("Ingrese una nota");
        int no = Integer.parseInt(nota);
             if(no >=70 ){
                 JOptionPane.showMessageDialog(null,"El Alumno: " +nombre+ " Con la nota de :" +no + " Esta Aprobado");
                 
                 
                 
                 
             } else{
                 JOptionPane.showMessageDialog(null,"El Alumno: " +nombre+ " Con la nota de :" + no + " Esta Reprobado");
             }
   }
}
    

