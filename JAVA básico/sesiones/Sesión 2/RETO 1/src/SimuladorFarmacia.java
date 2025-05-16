import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        Solicitar los datos al usuario
        System.out.println(" ");
        System.out.print("----*INGRESE LOS SIGUIENTES DATOS*----");
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Ingrese el nombre del medicamento: ");
        var Medicamento = scanner.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double preciopp = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidadpiezas = scanner.nextInt();

//         Calculo total sin descuento
        double total = (preciopp * cantidadpiezas);

//        Si el total > a 500 = 15% de descuento
//
        boolean Descuento = total > 500;

        double descuentottl = Descuento ? total * 0.15 : 0;

//        Calculo final
        double totalFinal = total - descuentottl;

//        SALIDA DE DATOS
        System.out.println(" ");
        System.out.println("Medicamento: " + Medicamento);
        System.out.println("Cantidad: " + cantidadpiezas);
        System.out.println("Precio unitario: " + preciopp);
        System.out.println("Total sin descuento: " + total);
        System.out.println("¿Aplica descuento? : " + Descuento);
        System.out.println("Descuento: " + descuentottl);
        System.out.println("Total a pagar: " + totalFinal);

        scanner.close();


    }
}
