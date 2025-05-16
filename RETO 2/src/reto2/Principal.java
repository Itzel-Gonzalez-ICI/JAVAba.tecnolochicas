package reto2;

public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 =  new Entrada("The Eras Tour", 130.1989);
        Entrada entrada2 = new Entrada("Morat", 2300.00);
        Entrada entrada3 = new Entrada("TINI", 7200.00+);
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }
}
