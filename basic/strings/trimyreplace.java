package basic.strings;

public class trimyreplace {
    public static void main(String[] args) {
        // Declaración de una cadena con espacios al inicio y al final
        String texto = "   Hola, Mundo!   ";

        // Eliminar espacios al inicio y al final
        String textoTrimmed = texto.trim();

        // Imprimir la cadena sin espacios al inicio y al final
        System.out.println("Cadena sin espacios: '" + textoTrimmed + "'"); // Imprime: 'Hola, Mundo!'

        // Reemplazar una subcadena
        String textoReemplazado = textoTrimmed.replace("Mundo", "Java");

        // Imprimir la cadena con la subcadena reemplazada
        System.out.println("Cadena con reemplazo: '" + textoReemplazado + "'"); // Imprime: 'Hola, Java!'
    }
}
