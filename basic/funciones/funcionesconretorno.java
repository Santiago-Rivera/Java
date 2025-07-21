package basic.funciones;

public class funcionesconretorno {
    public static void main(String[] args) {
        // Llamada a la función
        int resultado = suma(5, 10);
        System.out.println("El resultado de la suma es: " + resultado);

        // Llamada a otra función
        int resultadoResta = resta(10, 5);
        System.out.println("El resultado de la resta es: " + resultadoResta);

        // Llamada a la función de multiplicación
        int resultadoMultiplicacion = multiplicacion(4, 5);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        // Llamada a la función de división
        try {
            double resultadoDivision = division(20, 4);
            System.out.println("El resultado de la división es: " + resultadoDivision);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Definición de la función
    public static int suma(int a, int b) {
        return a + b;
    }

    // Otra función de ejemplo
    public static int resta(int a, int b) {
        return a - b;
    }

    // Función para multiplicar
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // Función para dividir
    public static double division(int a, int b) {
        return funciones.division(a, b);
    }
}
