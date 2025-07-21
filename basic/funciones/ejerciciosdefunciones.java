package basic.funciones;

public class ejerciciosdefunciones {
    public static void main(String[] args) {
        // Llamada a la función de suma
        int resultadoSuma = suma(5, 10);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // Llamada a la función de resta
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

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return funciones.division(a, b);
    }
}
