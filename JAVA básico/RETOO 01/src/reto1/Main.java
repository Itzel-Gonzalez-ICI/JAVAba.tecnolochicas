package reto1;
import java.lang.System;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos la clase scanner para leer los inputs del usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del paciente");
        String name = teclado.nextLine();
        System.out.println("¿Cuál es la edad del paciente?");
        int age = teclado.nextInt();
        teclado.nextLine(); //limpiar el buffer del scanner
        System.out.println("¿Cual es el expediente del paciente?");
        String numExpediente = teclado.nextLine();
        //crear objeto con la info recabada
        Paciente paciente1 =  new Paciente(name, age, numExpediente);
        //llamar al metodo para imprimir la informacion
        paciente1.MostrarInformacion();
        //cerrar la clase scanner
        teclado.close();
    }
}
