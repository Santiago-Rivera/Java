package basic.estructuradedatos;
import java.util.ArrayList;

public class listas {
    public static void main(String[] args) {
        // Declaración e inicialización de una lista
        ArrayList<Integer> numeros = new ArrayList<>();

        // Añadir elementos a la lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Acceso a los elementos de la lista
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros.get(i));
        }

        // Modificación de un elemento de la lista
        numeros.set(1, 10);
        System.out.println("Elemento modificado en la posición 1: " + numeros.get(1));

        // Eliminación de un elemento de la lista
        numeros.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + numeros);

        // Comprobación del tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size());

        // Comprobación si la lista está vacía
        if (numeros.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }


    }
}
