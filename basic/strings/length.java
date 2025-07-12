package basic.strings;

public class length {
    public static void main(String[] args) {
        // Declaración de una cadena
        String texto = "Hola, Mundo";

        // Longitud de la cadena
        int longitud = texto.length();

        // Imprimir la longitud
        System.out.println("La longitud de la cadena es: " + longitud); // Imprime: 12

        // Verificar si la longitud es mayor que 10
        if (longitud > 10) {
            System.out.println("La cadena es larga.");
        } else {
            System.out.println("La cadena es corta.");
        }
    }
}
