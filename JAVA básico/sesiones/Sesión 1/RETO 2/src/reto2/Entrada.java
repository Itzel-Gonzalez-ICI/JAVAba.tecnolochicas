package reto2;
import java.lang.System;
public class Entrada {
    //declarando atributos
    String nombreEvento;
    double precio;
    //constructor
    public Entrada (String nombreEvento, double precio){
        this.nombreEvento =  nombreEvento;
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.printf("""
                Evento: %s | Precio: $%.2f
                """, nombreEvento, precio);
    }
}
