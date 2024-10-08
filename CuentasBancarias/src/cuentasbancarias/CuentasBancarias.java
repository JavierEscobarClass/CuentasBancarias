/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentasbancarias;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author cata7
 */
public class CuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Apertura de Cuentas");
            System.out.println("2. Transferencias");
            System.out.println("3. Cajero Automático");
            System.out.println("4. Cierre de Mes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    banco.aperturaCuentas(scanner);
                    break;
                case 2:
                    banco.transferencias(scanner);
                    break;
                case 3:
                    banco.cajeroAutomático(scanner);
                    break;
                case 4:
                    banco.cierreDeMes(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}
