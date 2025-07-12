package basic.strings;

public class charAt {
    public static void main(String[] args) {
        // Declaración de una cadena
        String texto = "Hola, Mundo";

        // Obtener el carácter en la posición 7
        char caracter = texto.charAt(7);

        // Imprimir el carácter
        System.out.println("El carácter en la posición 7 es: " + caracter); // Imprime: M

        // Verificar si el carácter es una letra mayúscula
        if (Character.isUpperCase(caracter)) {
            System.out.println("El carácter es una letra mayúscula.");
        } else {
            System.out.println("El carácter no es una letra mayúscula.");
        }
    }
}
