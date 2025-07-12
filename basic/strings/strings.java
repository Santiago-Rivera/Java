package basic.strings;

public class strings {
    public static void main(String[] args) {
        // Declaración de cadenas
        String saludo = "Hola, ";
        String nombre = "Mundo";

        // Concatenación de cadenas
        String mensaje = saludo + nombre;
        System.out.println(mensaje); // Imprime: Hola, Mundo

        // Longitud de una cadena
        int longitud = mensaje.length();
        System.out.println("Longitud del mensaje: " + longitud); // Imprime: 12

        // Acceso a caracteres individuales
        char primerCaracter = mensaje.charAt(0);
        System.out.println("Primer carácter: " + primerCaracter); // Imprime: H

        // Subcadena
        String subcadena = mensaje.substring(0, 5);
        System.out.println("Subcadena: " + subcadena); // Imprime: Hola,
    }
}
