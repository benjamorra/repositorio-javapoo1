package com.example;
import com.example.objetos.polimorfismo;
import com.example.Listas.Auto;
import com.example.Listas.array;
import com.example.Listas.Lista;
import com.example.abstraccion.Cuadrado;
import com.example.objetos.constructor;
import com.example.objetos.herencia;

public class App 
{
    public static void main( String[] args )
    {
        constructor cliente1= new constructor(1000,"benja");
        constructor cliente2=new constructor();
          System.out.println("el saldo es: "+cliente1.getPesos());
          System.out.println("la cuenta es: "+cliente1.getCuenta());
          cliente2.setCuenta("lola");
          cliente2.setPesos(3000);
           System.out.println("la cuenta es: "+cliente2.getCuenta());
           System.out.println("la cuenta es: "+cliente2.getPesos());

       herencia persona =new herencia("benja", 87.2, "bz", 231);
       System.out.println("dato: "+ persona.getApellido()+ "dato2:"+persona.getCuenta()+ "dato3:"+persona.getPeso_corporal() + "dato 4: "+persona.getPesos());
         
       constructor p2=new constructor(1000, "lola");
        System.out.println("cuenta: "+p2.getCuenta()+ "plata: "+p2.getPesos());
       p2.gmail();
     constructor p = new polimorfismo();
     polimorfismo person1 =new polimorfismo();
        p.gmail();
        person1.caja_ahorro("benja");
        person1.setEdad(18);
        person1.edad_pasar();

       Cuadrado cuad1=new Cuadrado(10);
       cuad1.calculo_area();
       cuad1.dibujo_tecnico();
       

       array lista = new array();

        lista.agregar(new Auto("Toyota","azul"));
        lista.agregar(new Auto("Ford","negro"));
        lista.agregar(new Auto("BMW","rojo"));

        lista.mostrar();

       Lista linkelista =new Lista();
        linkelista.agregar(0,new Auto("Toyota","azul"));
        linkelista.agregar(1,new Auto("Ford","negro"));
        linkelista.agregar(0,new Auto("BMW","rojo"));
        linkelista.mostrar();
       
        int numeros[]= {1,3,4,5};
        try{
        System.out.println("el valor de la posicion numero 4 es: "+numeros[4]);
        } catch(Exception e){
            System.out.println("no se encuentra esa posicion");
        }finally{
            System.out.println("termino el programa");
        }

    }   
 } 

