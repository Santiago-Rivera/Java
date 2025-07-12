package basic.strings;

public class concatenacion {
    public static void main(String[] args) {
        // Declaración de cadenas
        String saludo = "Hola, ";
        String nombre = "Mundo";

        // Concatenación de cadenas
        String mensaje = saludo + nombre;
        System.out.println(mensaje); // Imprime: Hola, Mundo

        // Concatenación con un número
        int numero = 2023;
        String mensajeConNumero = mensaje + " " + numero;
        System.out.println(mensajeConNumero); // Imprime: Hola, Mundo 2023

        // Concatenación con un carácter
        char exclamacion = '!';
        String mensajeFinal = mensaje + exclamacion;
        System.out.println(mensajeFinal); // Imprime: Hola, Mundo!
    }
}
