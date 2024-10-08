/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias;

/**
 *
 * @author cata7
 */
class CuentaAhorro extends Cuenta {
    private static final double TASA_RENDIMIENTO = 0.022;

    public CuentaAhorro(String titular, double saldoInicial) {
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
        return saldo * TASA_RENDIMIENTO / 12; // Intereses mensuales
    }

    private double calcularCostoDeposito(double monto) {
        if (monto < 500_000) return 3_000;
        else if (monto < 2_000_000) return 3_000 + 0.01 * monto;
        else if (monto <= 10_000_000) return 2_000 + 0.005 * monto;
        else if (monto < 100_000_000) return 0.018 * monto;
        else return 0.02 * monto;
    }
}