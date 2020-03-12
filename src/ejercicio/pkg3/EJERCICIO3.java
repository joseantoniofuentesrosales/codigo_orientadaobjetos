/*
Dadas las variables de tipo 
int M = 6, T = 1, K = -10 
indicar si la evaluación de estas expresiones 
daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)
 */
package ejercicio.pkg3;

import javax.swing.JOptionPane;

public class EJERCICIO3 {

    public static void main(String[] args) {
       int M = 6;
       int T = 1;
       int K = -10;
       int di = -5;
       boolean verdadero = true ;
        if (M > T){
           JOptionPane.showMessageDialog(null,"Verdadero M > K ");
        }else{
        JOptionPane.showMessageDialog(null,"Falso M no es mayor que K ");
        } 
       if(T/K==-5){
            JOptionPane.showMessageDialog(null,"Verdadero T / K ==-5 ");
        }else{
        JOptionPane.showMessageDialog(null,"Falso T / K no es -5 ");
        } 
       if ((M+T == 7)){
            JOptionPane.showMessageDialog(null,"Verdadero M +T==7 ");
        }else{
        JOptionPane.showMessageDialog(null,"Falso M + T no es 7");
         
       }
       if ((M-T == 5)){
            JOptionPane.showMessageDialog(null,"Verdadero M +T == 5 ");
        }else{
        JOptionPane.showMessageDialog(null,"Falso M + T no es 5");
       
    }
}         
     
    
        
        
        
    
    
}
