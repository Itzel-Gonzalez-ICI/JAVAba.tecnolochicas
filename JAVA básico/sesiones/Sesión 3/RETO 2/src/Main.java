import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        Optional<String> rfc = Optional.empty();

//
        Factura f1 = new Factura(1989.13, "Servicio de consultoría", "LOPJ850621HDFXXX01");
        Factura f2 = new Factura(4785.13, "Reparación de equipo", null);

//
        System.out.println(f1.getResumen());
        System.out.println();
        System.out.println(f2.getResumen());
    }

}