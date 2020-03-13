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
public abstract class Formas {
    
    private String color;
    
    private String dibujar;
    
    private double radio;
    
    private int largo = 25;
    
    private double base = 15;
    
    private double altura = 20;
    
    private int lado = 15;
    
    public Formas(){
    
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
    return this.color;
    } 
     public void setDibujar(String dibujar){
        this.dibujar = dibujar;
    }
    public String getDibujar(){
    return this.dibujar;
    } 
    public void setRadio(double radio){
        this.radio = radio;
    }
   public double getRadio() {
        return radio;     
    }
   public void setLargo(int largo){
        this.largo = largo;
    }
    public int getLargo(){
        return this.largo;
    }
    public void setBase(double base){
    this.base = base;
    }
    public double getBase(){
    return base;
    }
    public void setAltura(double altura){
    this.altura = altura;
    }
    public double getAltura(){
    return altura;
    }
    public void setLado(int lado){
    this.lado = lado;
    }
    public int getLado(){
    return lado;
    }
    public double calcularRadio(){
        double r = 3.1415*Math.pow(radio,2);
        return r;
    }  
    public double calcularArea(){
        double a = (base*altura)/2;
        return a;
    }
    public int CalcularArea(){
        int area = (lado*lado);
        return area;
    }
    public void printInformation1(){
        System.out.println("Figura:" + dibujar);
        System.out.println("Color:" + color);
        setRadio(18);
        System.out.println("Radio:" + calcularRadio());
    }
     public void printInformation2(){
        System.out.println("Figura:" + dibujar);
        System.out.println("Color:" + color);
        setRadio(18);
        System.out.println("Largo:" + getLargo());
    }
    public void printInformation3(){
        System.out.println("Figura:" + dibujar);
        System.out.println("Color:" + color);
        System.out.println("Area:" + calcularArea());
    }
    public void printInformation4(){
        System.out.println("Figura:" + dibujar);
        System.out.println("Color:" + color);
        System.out.println("Area:" + CalcularArea());
    }
    
    
    abstract String getInformationFormas();  
}
