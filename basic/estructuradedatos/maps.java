package basic.estructuradedatos;
import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        // Declaración e inicialización de un mapa
        HashMap<String, Integer> edades = new HashMap<>();

        // Añadir elementos al mapa
        edades.put("Alice", 30);
        edades.put("Bob", 25);
        edades.put("Charlie", 35);

        // Acceso a los elementos del mapa
        System.out.println("Edad de Alice: " + edades.get("Alice"));
        System.out.println("Edad de Bob: " + edades.get("Bob"));

        // Modificación de un elemento del mapa
        edades.put("Alice", 31);
        System.out.println("Edad de Alice después de la modificación: " + edades.get("Alice"));

        // Eliminación de un elemento del mapa
        edades.remove("Bob");
        System.out.println("Mapa después de eliminar a Bob: " + edades);

        // Comprobación del tamaño del mapa
        System.out.println("Tamaño del mapa: " + edades.size());

        // Comprobación si el mapa está vacío
        if (edades.isEmpty()) {
            System.out.println("El mapa está vacío.");
        } else {
            System.out.println("El mapa no está vacío.");
        }
    }
}
