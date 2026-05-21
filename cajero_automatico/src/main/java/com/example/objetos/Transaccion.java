package com.example.objetos;

public class Transaccion {
private enum tipo{DEPOSITO,EXTRACCION,TRANSFERENCIA,CONSULTA};
private double monto;
private String fecha;
private String descripcion;
}
