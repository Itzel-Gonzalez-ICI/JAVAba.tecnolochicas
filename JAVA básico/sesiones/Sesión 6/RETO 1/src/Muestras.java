import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class Muestras {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Abeja europea");
        lista.add("Flor de girasol");
        lista.add("Mariposa monarca");
        lista.add("Flor de lavanda");
        lista.add("Abeja carpintera");
        lista.add("Flor de girasol"); // se repite

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(lista);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> mapaMuestrasInvestigador = new HashMap<>();
        mapaMuestrasInvestigador.put("M-001", "Dra. Yakelin Herrada");
        mapaMuestrasInvestigador.put("M-002", "Dr. Octavio Delgado");
        mapaMuestrasInvestigador.put("M-003", "Dra. Valeria Trinidad");
        mapaMuestrasInvestigador.put("M-004", "Dr. Luis Ramírez");


        // Paso 4: Mostrar resultados

        // Mostrar lista completa y ordenada de muestras
        System.out.println("Lista completa de muestras en orden de llegada:");
        for (String especie : lista) {
            System.out.println("• " + especie);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especieUnica : especiesUnicas) {
            System.out.println("• " + especieUnica);
        }

        System.out.println("\nRelación ID de muestra → Investigador:");
        for (String id : mapaMuestrasInvestigador.keySet()) {
            System.out.println(id + " → " + mapaMuestrasInvestigador.get(id));
        }

        // Búsqueda por ID de muestra
        System.out.println("\nBúsqueda de investigador por ID de muestra:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID de muestra (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (mapaMuestrasInvestigador.containsKey(idBusqueda)) {
            System.out.println("Investigador responsable: " + mapaMuestrasInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró un investigador para ese ID.");
        }

        scanner.close();
    }
}