package basic.strings;

public class format {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre = "Juan";
        int edad = 30;
        double altura = 1.75;

        // Formatear la cadena usando String.format
        String mensaje = String.format("Hola, mi nombre es %s, tengo %d años y mido %.2f metros.", nombre, edad, altura);

        // Imprimir el mensaje formateado
        System.out.println(mensaje); // Imprime: Hola, mi nombre es Juan, tengo 30 años y mido 1.75 metros.
    }
}
