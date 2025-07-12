package basic.operadores;

public class operadoreslogicos {
    public static void main(String[] args) {
        // Declaración de variables booleanas
        boolean a = true;
        boolean b = false;

        // Operador AND lógico
        boolean and = a && b; // AND lógico: true si ambos son true
        System.out.println("AND lógico (a && b): " + and);

        // Operador OR lógico
        boolean or = a || b; // OR lógico: true si al menos uno es true
        System.out.println("OR lógico (a || b): " + or);

        // Operador NOT lógico
        boolean notA = !a; // NOT lógico: invierte el valor de a
        System.out.println("NOT lógico (!a): " + notA);
    }
}
