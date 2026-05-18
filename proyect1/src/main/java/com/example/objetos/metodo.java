package com.example.objetos;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class metodo {
public int edad;
public String nombre; 

public void mostrarNombreyEdad(){
    System.out.println("hola mi nombre es " +nombre+" mi edad " +edad);
}
}
