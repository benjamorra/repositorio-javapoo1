package com.example.objetos;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class polimorfismo extends constructor {
 private Integer edad;

 void persona(){
    System.out.println("morrita");
 }
 public void gmail(){
 System.out.println("morrita@gmail");
 } 

 public void caja_ahorro(String nombre){
    if(nombre == "benja"){
        System.out.println("puede pasar");
    }else{
        System.out.println("no puede pasar");
    }
 }
 

 // hacemos un constructor vacio para el atributo y poder usar el setter en main
 public polimorfismo(){

 }

 public void edad_pasar(){
 if(edad==18){
    System.out.println("pasa");
 } else{
    System.out.println("no pasas");
  }
  }
}


