package basic.bucles;

public class controldebucles {
    public static void main(String[] args) {
        // Bucle for con control de bucle
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Se ha alcanzado el valor 5, saliendo del bucle.");
                break; // Sale del bucle cuando i es igual a 5
            }
            System.out.println("El valor de i es: " + i);
        }

        // Bucle while con control de bucle
        int j = 0;
        while (j < 10) {
            if (j == 3) {
                System.out.println("Se ha alcanzado el valor 3, continuando al siguiente ciclo.");
                j++; // Incrementa j para evitar un bucle infinito
                continue; // Salta a la siguiente iteración del bucle
            }
            System.out.println("El valor de j es: " + j);
            j++;
        }

        // Bucle do-while con control de bucle
        int k = 0;
        do {
            if (k == 7) {
                System.out.println("Se ha alcanzado el valor 7, saliendo del bucle.");
                break; // Sale del bucle cuando k es igual a 7
            }
            System.out.println("El valor de k es: " + k);
            k++;
        } while (k < 10);

        // Bucle foreach con control de bucle
        String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};
        for (String nombre : nombres) {
            if (nombre.equals("Pedro")) {
                System.out.println("Se ha encontrado a Pedro, saliendo del bucle.");
                break; // Sale del bucle cuando se encuentra a Pedro
            }
            System.out.println("Nombre: " + nombre);
        }
    }
}
