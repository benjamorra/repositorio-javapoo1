package com.example.Listas;
import java.util.ArrayList;

public class array {

ArrayList <Auto> autos= new ArrayList<>();

public void agregar(Auto auto){
 autos.add(auto);
     
}
public void mostrar(){
for(int i=0;i<autos.size();i++){
    System.out.println("******************");
    System.out.println("auto "+i+ ": " + autos.get(i));
}
}
}
