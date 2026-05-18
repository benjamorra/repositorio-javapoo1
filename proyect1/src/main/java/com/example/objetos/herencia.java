package com.example.objetos;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class herencia extends constructor{
private String apellido;
private double peso_corporal; 

public herencia( String apellido , double peso_corporal, String cuenta, Integer pesos ){
super(pesos,cuenta);
this.apellido= apellido;
this.peso_corporal= peso_corporal;


}

}


