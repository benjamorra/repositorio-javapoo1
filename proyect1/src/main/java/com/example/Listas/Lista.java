package com.example.Listas;
import java.util.LinkedList;

public class Lista{
    LinkedList <Auto> autos= new LinkedList<>();

 public void agregar(int indice,Auto auto){
  autos.add(indice,auto);
     
}
  // foreach
 public void mostrar(){
   int i = 0;
   for(Auto auto : autos){
    System.out.println("******************");
     System.out.println(
         "Auto " + i + ": " + auto);
           i++;
    }
}
 

}
