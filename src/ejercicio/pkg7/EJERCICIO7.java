/*
Escribe un programa que imprima mediante un ciclo 
los números pares del 2 al 100
 */
package ejercicio.pkg7;

public class EJERCICIO7 {

    public static void main(String[] args) {
        int p=1;
        int contador=0;
        while(p <= 100)
        {
        if(p % 2 == 0 )
        {
        System.out.println( "es numero par "+p);
        }
        p++;
        }
    }
    
}
