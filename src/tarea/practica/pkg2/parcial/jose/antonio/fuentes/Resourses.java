/*
Crear una clase que se llame Recursos con 5 métodos diferentes.
Instanciar la clase en el programa principal
y llamar a los métodos con diferentes operaciones:

Primer método: Retornar un mensaje que diga: 
"Estoy aprendiendo, pero seré el mejor programador del mundo".

Segundo método: Declarar una variable entera y asignarle un número X 
que represente la nota del estudiante. Retornar un mensaje
dependiendo de esa variable si es mayor o igual a 70, el mensaje
debe decir Aprobado, de lo contrario Reprobado.

Tercer método: Retornar el resultado de una división de dos enteros
que proporcionemos como parámetros, considerar que la división
entre un denominador cero no puede ser realizado:

Cuarto método:  Debe retornar una lista de numeros del 1 al X. 
Donde X es un parámetro de entrada del método a crear.

 */
package tarea.practica.pkg2.parcial.jose.antonio.fuentes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Resourses {

    public static void main(String arg[]){
        JOptionPane.showMessageDialog(null,""+Metodo1());
        JOptionPane.showMessageDialog(null,""+Metodo2(80));
        JOptionPane.showMessageDialog(null,""+Metodo3(5,4));
        Metodo4(3);    
    }
      public static String Metodo1(){
        return "Estoy aprendiendo, pero seré el mejor programador del mundo.";
      
      }
      
      public static String Metodo2(int nota){
      
      if(nota >=70 ){
          return "Aprobado";
      } else{
          return "Reprobado";
      }
      
      }
      public static double Metodo3(int dividiendo, int divisor){
      try {
          if (divisor != 0){
              return dividiendo / divisor ;
              }
          }
      catch (ArithmeticException e ){
          System.out.println("No se puede dividir entre 0");
      }
      return 0;
      }
      public static void Metodo4(int num){
      int [] listaNumeros = null;
      if(num > 0){
          listaNumeros = new int [num + 1];
          for(int i = 1; i <listaNumeros.length; i++){
          listaNumeros[i]=i;
          System.out.println(Arrays.toString(listaNumeros));
          }
      }
      }
}
          
      
    

      
      
    

