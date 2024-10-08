/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias;

/**
 *
 * @author cata7
 */
class CuentaCorriente extends Cuenta {
    private static final double TASA_MANTENIMIENTO = 0.015;

    public CuentaCorriente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void realizarDeposito(double monto) {
        if (monto > 0) {
            double costo = calcularCostoDeposito(monto);
            saldo += monto - costo;
            System.out.println("Deposito realizado. Costo: " + costo);
        }
    }

    @Override
    public void realizarRetiro(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    @Override
    public double calcularIntereses() {
        return -saldo * TASA_MANTENIMIENTO; // Costo mensual
    }

    private double calcularCostoDeposito(double monto) {
        if (monto < 500_000) return 7_000;
        else if (monto < 2_000_000) return 5_000 + 0.02 * monto;
        else if (monto <= 10_000_000) return 4_000 + 0.02 * monto;
        else return 0.033 * monto;
    }
}   
