package com.example.Listas;

public class Auto {
private String marca;
private String color;

public Auto(String marca,String color){
    this.marca= marca;
    this.color=color;
}

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}

public String getColor(){
    return marca;
}
public void setColor(String color){
    this.color=color;
}

    public String toString() {

        return "Marca: " + marca +
               " Año: " + color;

}
}
