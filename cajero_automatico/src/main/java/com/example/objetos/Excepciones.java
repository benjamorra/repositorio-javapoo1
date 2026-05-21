package com.example.objetos;

public class Excepciones {

    public static class SaldoInsuficienteException extends Exception{

        public SaldoInsuficienteException(){
            super("Saldo insuficiente para realizar la transacción.");
        }
    }

    public static class LimiteExtraccionExcedidoException extends Exception{

        public LimiteExtraccionExcedidoException(){
            super("Límite de extracción excedido.");
        }
    }

    public static class CuentaInactivaException extends Exception{

        public CuentaInactivaException(){
            super("La cuenta está inactiva.");
        }
    }

    public static class PinInvalidoException extends Exception{

        public PinInvalidoException(){
            super("PIN incorrecto.");
        }
    }
}