package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorCuentas menu = new GestorCuentas();


        CuentaBancaria cuentaCorriente = new CuentaCorriente(1000, 500);
        CuentaBancaria cuentaAhorro = new CuentaAhorro(5000, 0.05);


        menu.agregarCuenta(cuentaCorriente);
        menu.agregarCuenta(cuentaAhorro);

        while (true) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el índice de la cuenta: ");
                    int indiceDeposito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    menu.depositar(indiceDeposito, cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la cuenta: ");
                    int indiceRetiro = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    menu.retirar(indiceRetiro, cantidadRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese el índice de la cuenta: ");
                    int indiceConsulta = scanner.nextInt();
                    double saldo = menu.consultarSaldo(indiceConsulta);
                    if (saldo != -1) {
                        System.out.println("Saldo actual: " + saldo);
                    } else {
                        System.out.println("indice de cuenta invalido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
