/*
 1. Crear un nuevo proyecto en Netbeans 
 2. Crear un archivo de clase llamada Estudiante
    y agregar los métodos necesarios para obtener 
    los atributos de ese "objeto" desde la clase 
    que contiene el método principal de la aplicación.. 
     Basarse en el ejemplo del módulo 3
 2. Desde la clase que contiene el método principal (main),
    agregar el código necesario para instanciar ese objeto 
    y obtener los valores.
 */
package estudiante;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Estudiante {
public static void main(String arg[]){
       
}
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    
    {
        setnom("Jose");
        setape("Fuentes");
        setedad(21);
        setsex("M");
        
    }
    
   
    public void primeinfo()
    {
    JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n"+
                       "Apellido: "+apellido+"\n"+
                       "Edad: "+edad+"\n"+
                       "Sexo : "+sexo);
    }
    //métodos de la clase
    public void setnom(String Nombre) {
        this.nombre = Nombre;
    }
    public String getnom()
    {
        return this.nombre;
    }
    
    public void setape(String Apellido) {
        this.apellido = Apellido;
    }
    public String getape()
    {
        return this.apellido;
    }
    
    public void setedad(int edad) {
        this.edad = edad;
    }
    public int getedad()
    {
        return this.edad;
    }
    
    public void setsex(String sex) {
        this.sexo = sex;
    }
    public String getsex()
    {
        return this.sexo;
    }

}

