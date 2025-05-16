import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class TemasCompartidos {

    // Clase interna Tema con Comparable
    static class Tema implements Comparable<Tema> {
        private String titulo;
        private int prioridad;

        public Tema(String titulo, int prioridad) {
            this.titulo = titulo;
            this.prioridad = prioridad;
        }

        public String getTitulo() {
            return titulo;
        }

        public int getPrioridad() {
            return prioridad;
        }

        @Override
        public String toString() {
            return "Tema: " + titulo + " | Prioridad: " + prioridad;
        }

        @Override
        public int compareTo(Tema otro) {
            return this.titulo.compareToIgnoreCase(otro.titulo);
        }
    }

    public static void main(String[] args) {

        // Lista concurrente para los temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

// Agregar temas
        temas.add(new Tema("Introducción a la Inteligencia Artificial", 2));
        temas.add(new Tema("Aprendizaje Automático", 1));
        temas.add(new Tema("Redes Neuronales Profundas", 3));
        temas.add(new Tema("Ética en la Computación Inteligente", 2));

// Repositorio de recursos compartidos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Introducción a la Inteligencia Artificial", "https://recursos.edu/ia");
        recursos.put("Aprendizaje Automático", "https://recursos.edu/ml");
        recursos.put("Redes Neuronales Profundas", "https://recursos.edu/deeplearning");
        recursos.put("Ética en la Computación Inteligente", "https://recursos.edu/eticaia");

        // Mostrar lista original
        System.out.println("---TEMAS ACTIVOS---");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Ordenar alfabéticamente (orden natural)
        Collections.sort(temas);
        System.out.println("\n---TEMAS ORDENADOS ALFABÉTICAMENTE---");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Ordenar por prioridad
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n---TEMAS ORDENADOS POR PRIORIDAD---");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Mostrar recursos por tema
        System.out.println("\n---RECURSOS ASOCIADOS POR TEMA---");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔗 " + titulo + " → " + recursos.get(titulo));
        }
    }
}