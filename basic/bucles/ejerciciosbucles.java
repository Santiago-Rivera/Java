package basic.bucles;

public class ejerciciosbucles {
    public static void main(String[] args) {
        // Ejercicio 1: Bucle for que imprime los números del 1 al 10
        System.out.println("Ejercicio 1: Números del 1 al 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Ejercicio 2: Bucle while que imprime los números del 10 al 1
        System.out.println("\nEjercicio 2: Números del 10 al 1");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // Ejercicio 3: Bucle do-while que imprime los números pares del 0 al 20
        System.out.println("\nEjercicio 3: Números pares del 0 al 20");
        int k = 0;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 20);

        // Ejercicio 4: Bucle foreach que imprime los elementos de un array de cadenas

        System.out.println("\nEjercicio 4: Elementos de un array de cadenas");
        String[] frutas = {"Manzana", "Banana", "Naranja", "Fresa"};
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
