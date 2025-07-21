package basic.funciones;

public class funcionesconparametors_sobrecarga {
    public static void main(String[] args) {
        // Llamada a la función con dos parámetros
        int resultadoSuma = suma(5, 10);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // Llamada a la función con tres parámetros
        int resultadoSumaTres = suma(5, 10, 15);
        System.out.println("El resultado de la suma con tres parámetros es: " + resultadoSumaTres);
    }

    // Definición de la función con dos parámetros
    public static int suma(int a, int b) {
        return a + b;
    }

    // Sobrecarga de la función con tres parámetros
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
