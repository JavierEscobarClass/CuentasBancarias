/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias;

/**
 *
 * @author cata7
 */
abstract class Cuenta {
    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public abstract void realizarDeposito(double monto);
    public abstract void realizarRetiro(double monto);
    public abstract double calcularIntereses();
    public double getSaldo() {
        return saldo;
    }
}