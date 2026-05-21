package com.example;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.objetos.CuentaBancaria;
import com.example.objetos.Excepciones;
import com.example.objetos.Transaccion;


public class App 
{
    public static void main( String[] args )
    {
    Scanner scanner = new Scanner(System.in);
     ArrayList<Transaccion> historial = new ArrayList<>();

      int opcion=0;
      CuentaBancaria cuenta= new CuentaBancaria("2930", "benjamin", 2000, true, historial );
      CuentaBancaria lola=new CuentaBancaria("0202", "lola", 1000, true, historial);
      do{
        System.out.println("*******menu*******");
        System.out.println("opcion 1: Deposito ");
        System.out.println("opcion 2: Extraccion ");
        System.out.println("opcion 3: Transferencia ");
        System.out.println("opcion 4: consulta de saldo ");
        System.out.println("opcion 0: salir ");
        opcion = scanner.nextInt();
       switch (opcion) {
        case 1:
            cuenta.Deposito(600);
            break;
        case 2:
            cuenta.Extraccion(1000);

            break;

        case 3:
           try{

         cuenta.transferencia(lola,1000);

          }catch(Exception e){

        System.out.println(e.getMessage());

    }
        case 4:
           System.out.println("saldo actual es: "+cuenta.ConsultaDeSaldo()); 
            break;

        case 0:
            System.out.println("Saliendo...");
            break;

        default:
            System.out.println("Opcion invalida");
            break;
       
       }
    
      }while(opcion!=0);
     

    }
}
