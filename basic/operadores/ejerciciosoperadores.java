package basic.operadores;

public class ejerciciosoperadores {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 20;
        int b = 10;

        // Operadores aritméticos
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de comparación
        boolean igualdad = (a == b);
        boolean desigualdad = (a != b);
        boolean mayorQue = (a > b);
        boolean menorQue = (a < b);
        boolean mayorOIgualQue = (a >= b);
        boolean menorOIgualQue = (a <= b);

        System.out.println("Igualdad (a == b): " + igualdad);
        System.out.println("Desigualdad (a != b): " + desigualdad);
        System.out.println("Mayor que (a > b): " + mayorQue);
        System.out.println("Menor que (a < b): " + menorQue);
        System.out.println("Mayor o igual que (a >= b): " + mayorOIgualQue);
        System.out.println("Menor o igual que (a <= b): " + menorOIgualQue);

        // Operadores de asignación
        int c = a; // Asignación simple
        c += b;    // Asignación con suma
        c -= b;    // Asignación con resta
        c *= b;    // Asignación con multiplicación
        c /= b;    // Asignación con división
        c %= b;    // Asignación con módulo

        System.out.println("Valor final de c: " + c);
    }
}
