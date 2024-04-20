package parcial_2;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
    }


    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }


    public void retirar(double cantidad) {
        if (saldo + limiteSobregiro >= cantidad) {
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


