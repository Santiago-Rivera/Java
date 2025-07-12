package basic.strings;

public class ejerciciosstrings {
    public static void main(String[] args) {
        // Ejercicio 1: Formatear una cadena
        String nombre = "Ana";
        int edad = 25;
        double altura = 1.65;
        String mensaje = String.format("Hola, mi nombre es %s, tengo %d años y mido %.2f metros.", nombre, edad, altura);
        System.out.println(mensaje);

        // Ejercicio 2: Eliminar espacios y reemplazar subcadenas
        String texto = "   Hola, Mundo!   ";
        String textoTrimmed = texto.trim();
        System.out.println("Cadena sin espacios: '" + textoTrimmed + "'");
        String textoReemplazado = textoTrimmed.replace("Mundo", "Java");
        System.out.println("Cadena con reemplazo: '" + textoReemplazado + "'");

        // Ejercicio 3: Convertir a mayúsculas y minúsculas
        String original = "Hola, Mundo";
        String mayusculas = original.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);
        String minusculas = original.toLowerCase();
        System.out.println("Cadena en minúsculas: " + minusculas);

        // Ejercicio 4: Comparar cadenas
        String cadena1 = "Hola, Mundo";
        String cadena2 = "Hola, Mundo";
        String cadena3 = "Hola, mundo";
        boolean sonIguales1 = cadena1.equals(cadena2);
        boolean sonIguales2 = cadena1.equals(cadena3);
        System.out.println("cadena1 es igual a cadena2: " + sonIguales1);
        System.out.println("cadena1 es igual a cadena3: " + sonIguales2);
    }
}
