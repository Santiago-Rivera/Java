package basic.strings;

public class equals {
    public static void main(String[] args) {
        // Declaración de dos cadenas
        String cadena1 = "Hola, Mundo";
        String cadena2 = "Hola, Mundo";
        String cadena3 = "Hola, mundo";

        // Comparar cadenas usando equals
        boolean sonIguales1 = cadena1.equals(cadena2);
        boolean sonIguales2 = cadena1.equals(cadena3);

        // Imprimir resultados de las comparaciones
        System.out.println("cadena1 es igual a cadena2: " + sonIguales1); // Imprime: true
        System.out.println("cadena1 es igual a cadena3: " + sonIguales2); // Imprime: false
    }
}
