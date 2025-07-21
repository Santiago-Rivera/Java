package basic.bucles;

public class buclefor {
    public static void main(String[] args) {
        // Bucle for
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);
        }

        // Bucle for con un array
        String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }

        // Bucle for con un rango

        System.out.println("Números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Bucle for con decremento
        System.out.println("Números del 10 al 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Bucle for anidado
        System.out.println("Tabla de multiplicar del 2:");
            for (int j = 1; j <= 10; j++) {
                System.out.println("2 x " + j + " = " + (2 * j));
            }
            System.out.println(); // Línea en blanco entre tablas
    }
}
