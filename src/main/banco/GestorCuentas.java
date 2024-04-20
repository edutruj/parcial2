package parcial_2;

import java.util.ArrayList;
import java.util.List;

public class GestorCuentas {
    private List<CuentaBancaria> cuentas;

    public GestorCuentas() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(int indiceCuenta, double cantidad) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            cuentas.get(indiceCuenta).depositar(cantidad);
        } else {
            System.out.println("Índice de cuenta inválido.");
        }
    }

    public void retirar(int indiceCuenta, double cantidad) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            cuentas.get(indiceCuenta).retirar(cantidad);
        } else {
            System.out.println("Índice de cuenta inválido.");
        }
    }

    public double consultarSaldo(int indiceCuenta) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            return cuentas.get(indiceCuenta).consultarSaldo();
        } else {
            System.out.println("Índice de cuenta inválido.");
            return -1;
        }
    }
}
