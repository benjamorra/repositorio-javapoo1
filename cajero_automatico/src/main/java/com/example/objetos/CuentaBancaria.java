package com.example.objetos;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;
    private boolean activa;
    ArrayList<Transaccion> historialTransacciones;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo,boolean activa,ArrayList<Transaccion> historialTransacciones) {
        this.numeroCuenta= numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.activa = activa;
        this.historialTransacciones = historialTransacciones;
    }

    public void registrarTransaccion(String tipo,double monto){

    LocalDateTime fechaHora = LocalDateTime.now();

    DateTimeFormatter formato =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    String fechaFormateada = fechaHora.format(formato);

    String descripcion =
            "[" + fechaFormateada + "] "
            + tipo
            + ": $" + monto
            + " | Saldo: $" + saldo;

    Transaccion t = new Transaccion();

    historialTransacciones.add(t);
     } 
   
     public void Deposito(double monto){
     if(monto>0){
        System.out.println("monto positivo");
     }else{
        throw new IllegalArgumentException("monto negativo");
     }
     
     saldo+=monto;
     System.out.println("su saldo es: "+ saldo);
     registrarTransaccion("DEPOSITO",monto);
   
    }

 public void Extraccion(double retiro){
    System.out.println("su saldo es:"+ saldo);
    System.out.println("cuanto desea retirar: "+ retiro);
    saldo-=retiro;
    System.out.println("su saldo actualizado es: "+saldo);
     registrarTransaccion("EXTRACCION",retiro);
   }
 public void transferencia(CuentaBancaria destino,double monto) throws Excepciones.SaldoInsuficienteException,Excepciones.CuentaInactivaException{
    
     if(this.activa){
      System.out.println("La cuenta esta activa:");

     }
     if(destino.isActiva() == false){
      throw new Excepciones.CuentaInactivaException();
      
     }
     if(monto<=0){
     throw new  IllegalArgumentException("Monto inválido");
     }
      this.saldo -= monto;

     saldo += monto;
    System.out.println("Transferencia realizada con éxito");
    }

    public double ConsultaDeSaldo(){
    registrarTransaccion("CONSULTA",0);
      return saldo;
     }
}