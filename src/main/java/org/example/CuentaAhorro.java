package org.example;

public class CuentaAhorro implements CuentaBancaria {

    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }


    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }


    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No tiene suficientes fondos para realizar el retiro.");
        }
    }


    public double consultarSaldo() {
        return saldo;
    }
}