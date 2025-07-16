package basic.estructuradedatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ejerciciosestructuras {
    public static void main(String[] args) {
        // Aquí puedes implementar ejercicios prácticos utilizando las estructuras de datos
        // como listas, conjuntos, mapas y arrays.

        // Ejemplo de ejercicio con un array
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        // Ejemplo de ejercicio con una lista
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // Ejemplo de ejercicio con un conjunto
        HashSet<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(1);
        numerosUnicos.add(2);
        numerosUnicos.add(2); // Este no se añadirá porque es duplicado

        System.out.println("Números únicos: " + numerosUnicos);

        // Ejemplo de ejercicio con un mapa
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Alice", 30);
        edades.put("Bob", 25);

        for (String clave : edades.keySet()) {
            System.out.println(clave + " tiene " + edades.get(clave) + " años.");
        }

        // Ejercicio adicional: Comprobar si un nombre está en la lista

        String nombreABuscar = "Bob";
        if (nombres.contains(nombreABuscar)) {
            System.out.println(nombreABuscar + " está en la lista de nombres.");
        } else {
            System.out.println(nombreABuscar + " no está en la lista de nombres.");
        }

        // Ejercicio adicional: Comprobar si un número está en el conjunto
        int numeroABuscar = 3;
        if (numerosUnicos.contains(numeroABuscar)) {
            System.out.println("El número " + numeroABuscar + " está en el conjunto.");
        } else {
            System.out.println("El número " + numeroABuscar + " no está en el conjunto.");
        }

        // Ejercicio adicional: Comprobar si un nombre está en el mapa
        String nombreEnMapa = "Alice";
        if (edades.containsKey(nombreEnMapa)) {
            System.out.println(nombreEnMapa + " está en el mapa con edad: " + edades.get(nombreEnMapa));
        } else {
            System.out.println(nombreEnMapa + " no está en el mapa.");
        }
    }
}
