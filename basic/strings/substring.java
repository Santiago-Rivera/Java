package basic.strings;

public class substring {
    public static void main(String[] args) {
        // Declaración de una cadena
        String texto = "Hola, Mundo";

        // Obtener un substring desde la posición 5 hasta el final
        String subcadena = texto.substring(5);

        // Imprimir el substring
        System.out.println("El substring desde la posición 5 es: " + subcadena); // Imprime: , Mundo

        // Obtener un substring desde la posición 0 hasta la 4
        String subcadena2 = texto.substring(0, 4);

        // Imprimir el segundo substring
        System.out.println("El substring desde la posición 0 hasta la 4 es: " + subcadena2); // Imprime: Hola
    }
}
