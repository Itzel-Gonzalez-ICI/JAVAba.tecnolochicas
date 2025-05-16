import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    public static void main(String[] args) {
        Path carpetaConfig = Paths.get("C:/Users/Vale/Dekstop/JAVA básico/sesiones/sesión 7/RETO 01");
        Path archivoParametros = carpetaConfig.resolve("parametros.txt");

        guardarParametros(carpetaConfig, archivoParametros);
        leerParametros(archivoParametros);
    }

    public static void guardarParametros(Path carpeta, Path archivo) {
        try {
            // Crear carpeta si no existe
            if (Files.notExists(carpeta)) {
                Files.createDirectories(carpeta);
                System.out.println("Carpeta creada: " + carpeta.toString());
            }

            // Contenido del archivo
            String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            // Escribir el archivo
            Files.writeString(archivo, contenido);
            System.out.println("Archivo guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path archivo) {
        try {
            if (Files.exists(archivo)) {
                String contenido = Files.readString(archivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer los parámetros: " + e.getMessage());
        }
    }
}