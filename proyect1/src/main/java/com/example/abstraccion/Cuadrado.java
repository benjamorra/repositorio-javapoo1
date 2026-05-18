package com.example.abstraccion;

public class Cuadrado implements Figura,Dibujar {
private double lado;

public Cuadrado(double lado){
    this.lado=lado;
}

@Override
public double calculo_area() {
   double resultado= lado * lado;
   return resultado; 
}

@Override
public void dibujo_tecnico() {
   System.out.println("dibujo tecnico de cuadrado");
}

}