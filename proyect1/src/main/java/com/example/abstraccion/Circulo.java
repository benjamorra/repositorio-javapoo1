package com.example.abstraccion;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Circulo implements Figura,Dibujar {
 
   private double radio;

  public Circulo(double radio){
    this.radio= radio;
  }
 //@Override = indica que un método sobrescribe uno de la clase madre
    @Override
    public double calculo_area() {
    double resultado= 3.14* radio * radio;
    return resultado; 
    }
  @Override
  public void dibujo_tecnico(){
    System.out.println("dibujo tecnico de circulo");
  }
  
  

}
