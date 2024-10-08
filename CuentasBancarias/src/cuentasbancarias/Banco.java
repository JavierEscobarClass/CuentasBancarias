/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias;

/**
 *
 * @author cata7
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void aperturaCuentas(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.next();
        System.out.print("Ingrese apellido del cliente: ");
        String apellido = scanner.next();
        System.out.print("Ingrese edad del cliente: ");
        int edad = scanner.nextInt();
        String representante = null;
        if (edad < 18) {
            System.out.print("Ingrese nombre del representante: ");
            representante = scanner.next();
            System.out.print("Ingrese apellido del representante: ");
            representante += " " + scanner.next();
        }

        System.out.print("Seleccione tipo de cuenta (1: Ahorro, 2: Corriente): ");
        int tipo = scanner.nextInt();
        double saldoInicial;

        if (tipo == 1) {
            System.out.print("Ingrese monto inicial para la cuenta de ahorro: ");
            saldoInicial = scanner.nextDouble();
            cuentas.add(new CuentaAhorro(nombre, saldoInicial));
        } else {
            do {
                System.out.print("Ingrese monto inicial para la cuenta corriente (mínimo 200,000): ");
                saldoInicial = scanner.nextDouble();
            } while (saldoInicial < 200_000);
            cuentas.add(new CuentaCorriente(nombre, saldoInicial));
        }

        System.out.println("Cuenta creada exitosamente.");
    }

    public void transferencias(Scanner scanner) {
        // Lógica para realizar transferencias
        // Se pueden implementar métodos adicionales aquí
    }

    public void cajeroAutomático(Scanner scanner) {
        // Lógica para realizar retiros en cajero automático
        // Se pueden implementar métodos adicionales aquí
    }

    public void cierreDeMes(Scanner scanner) {
        for (Cuenta cuenta : cuentas) {
            double intereses = cuenta.calcularIntereses();
            cuenta.realizarDeposito(intereses); // Agrega o resta intereses del saldo
            System.out.println("Estado de cuenta de " + cuenta.titular + ": Saldo actual: " + cuenta.getSaldo());
        }
    }
}