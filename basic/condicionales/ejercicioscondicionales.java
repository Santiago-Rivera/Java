package basic.condicionales;

public class ejercicioscondicionales {
    public static void main(String[] args) {
        // Ejercicio 1: Verificar si un número es par o impar
        int numero = 7;
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Ejercicio 2: Determinar el rango de un número
        int edad = 25;
        if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad < 20) {
            System.out.println("Eres un adolescente.");
        } else {
            System.out.println("Eres un adulto.");
        }

        // Ejercicio 3: Calcular el descuento basado en la edad
        if (edad < 18) {
            System.out.println("Tienes un descuento del 50%.");
        } else if (edad < 65) {
            System.out.println("Tienes un descuento del 20%.");
        } else {
            System.out.println("Tienes un descuento del 30%.");
        }
    }
}
