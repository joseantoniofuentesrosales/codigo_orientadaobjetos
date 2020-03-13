/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licenciado;

/**
 *
 * @author User
 */
public class Licenciado {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) { 
    Persona persona = new Persona();
    persona.setNombre("Jose");
    persona.setApellido("Fuentes");
    persona.setEdad (21);
    persona.setSexo ("Masculino");
    
System.out.println("Nombre: " + persona.getNombre() );
System.out.println("apellido: " + persona.getApellido() );
System.out.println("Edad: " + persona.getEdad() );
System.out.println("Sexo: " + persona.getSexo() );
}
public static class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;   

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
   }
  }
    
