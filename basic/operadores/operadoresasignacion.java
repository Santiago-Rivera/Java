package basic.operadores;

public class operadoresasignacion {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 10;
        int b = 5;

        // Asignación simple
        int c = a; // c ahora es 10
        System.out.println("Asignación simple: c = " + c);

        // Asignación con suma
        c += b; // c ahora es 15 (10 + 5)
        System.out.println("Asignación con suma: c = " + c);

        // Asignación con resta
        c -= b; // c ahora es 10 (15 - 5)
        System.out.println("Asignación con resta: c = " + c);

        // Asignación con multiplicación
        c *= b; // c ahora es 50 (10 * 5)
        System.out.println("Asignación con multiplicación: c = " + c);

        // Asignación con división
        c /= b; // c ahora es 10 (50 / 5)
        System.out.println("Asignación con división: c = " + c);

        // Asignación con módulo
        c %= b; // c ahora es 0 (10 % 5)
        System.out.println("Asignación con módulo: c = " + c);
    }
}
