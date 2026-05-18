package com.example.objetos;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class constructor {
private Integer pesos;
private String cuenta;

public constructor(Integer pesos, String cuenta){
    this.pesos= pesos;
    this.cuenta= cuenta;
}

public constructor(){
    
}
public void gmail(){
System.out.println("pepito@gmail");
} 
}
