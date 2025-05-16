package reto2;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoInicial = 1989.0;
        int entradaUsuario;
        do {
            System.out.println("""
                    Bienvenid@ al cajero automático, por favor selecciona una opción:
                        1. Consulta de saldo
                        2. Hacer un deposito
                        3. Retirar dinero
                        4. Salir
                    """);
            entradaUsuario = scanner.nextInt();
            switch (entradaUsuario) {
                case 1:
                    System.out.printf("Tu saldo actual es de $%.2f.", saldoInicial);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("¿Cuanto dinero deseas ingresar a tu cuenta?");
                    double deposito = scanner.nextDouble();
                    saldoInicial += deposito;
                    System.out.printf("""
                            Tu deposito de $%.2f se realizó con éxito.
                            Tu saldo actual es de $%.2f.
                            """, deposito, saldoInicial);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("¿Cuánto dinero deseas retirar de tu cuenta?");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldoInicial) {
                        System.out.println("Tu saldo es insuficiente.");
                    } else {
                        saldoInicial -= retiro;
                        System.out.printf("""
                                Tu retiro de $%.2f se realizó con exito.
                                Tu saldo actual es de $%.2f.
                                """, retiro, saldoInicial);
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Baiiiii!");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Entrada no válida");
                    System.out.println(" ");
            }

        } while (entradaUsuario != 4);
        scanner.close();
    }
}
