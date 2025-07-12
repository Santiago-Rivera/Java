package basic.operadores;

public class operadorescomparacion {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 10;
        int b = 5;

        // Igualdad
        boolean igualdad = (a == b);
        System.out.println("Igualdad (a == b): " + igualdad);

        // Desigualdad
        boolean desigualdad = (a != b);
        System.out.println("Desigualdad (a != b): " + desigualdad);

        // Mayor que
        boolean mayorQue = (a > b);
        System.out.println("Mayor que (a > b): " + mayorQue);

        // Menor que
        boolean menorQue = (a < b);
        System.out.println("Menor que (a < b): " + menorQue);

        // Mayor o igual que
        boolean mayorOIgualQue = (a >= b);
        System.out.println("Mayor o igual que (a >= b): " + mayorOIgualQue);

        // Menor o igual que
        boolean menorOIgualQue = (a <= b);
        System.out.println("Menor o igual que (a <= b): " + menorOIgualQue);
    }
}
