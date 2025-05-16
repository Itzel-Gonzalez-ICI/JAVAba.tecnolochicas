public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("FAC1989", "Taylor Swift", 1989.13);
        Factura f2 = new Factura("FAC1989", "Bruma café", 317.38);


        System.out.println(f1);
        System.out.println(f2);


        System.out.println("¿Las facturas son iguales?"+ f1.equals(f2));


    }
}