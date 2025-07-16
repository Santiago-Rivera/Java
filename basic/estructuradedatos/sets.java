package basic.estructuradedatos;
import java.util.HashSet;

public class sets {
    public static void main(String[] args) {
        // Declaración e inicialización de un conjunto
        HashSet<Integer> numeros = new HashSet<>();

        // Añadir elementos al conjunto
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2); // Este elemento no se añadirá, ya que los conjuntos no permiten duplicados

        // Mostrar los elementos del conjunto
        System.out.println("Elementos del conjunto: " + numeros);

        // Comprobar si un elemento está en el conjunto
        if (numeros.contains(2)) {
            System.out.println("El conjunto contiene el número 2.");
        } else {
            System.out.println("El conjunto no contiene el número 2.");
        }

        // Eliminar un elemento del conjunto
        numeros.remove(1);
        System.out.println("Conjunto después de eliminar el número 1: " + numeros);

        // Comprobar el tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + numeros.size());

        // Comprobar si el conjunto está vacío
        if (numeros.isEmpty()) {
            System.out.println("El conjunto está vacío.");
        } else {
            System.out.println("El conjunto no está vacío.");
        }
    }
}
