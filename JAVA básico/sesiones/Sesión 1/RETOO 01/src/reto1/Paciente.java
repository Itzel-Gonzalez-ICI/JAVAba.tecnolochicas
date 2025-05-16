package reto1;
import java.lang.System;

public class Paciente {
    //atributos
    private String name;
    private int age;
    private String numExpediente;

    // constructor
    public Paciente(String name, int age, String numExpediente) {
        this.name = name;
        this.age = age;
        this.numExpediente = numExpediente;
    }

    //metodo para mostrar la informacion del paciente
    public void MostrarInformacion() {
        System.out.printf("""
                Nombre del paciente: %s.
                Edad del paciente: %d.
                Numero de expediente: %s.""", name, age, numExpediente);
    }
}

