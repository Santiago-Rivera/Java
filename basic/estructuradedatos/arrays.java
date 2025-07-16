package basic.estructuradedatos;

public class arrays {
    public static void main(String[] args) {
        // Declaración e inicialización de un array
        int[] numeros = {1, 2, 3, 4, 5};

        // Acceso a los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }

        // Modificación de un elemento del array
        numeros[2] = 10;
        System.out.println("Elemento modificado en la posición 2: " + numeros[2]);
    }
}
