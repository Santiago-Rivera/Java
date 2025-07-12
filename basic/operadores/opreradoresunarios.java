package basic.operadores;

public class opreradoresunarios {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 10;
        int b = 5;

        // Operador unario de suma
        int sumaUnaria = +a; // sigue siendo 10
        System.out.println("Suma unaria: " + sumaUnaria);

        // Operador unario de resta
        int restaUnaria = -b; // ahora es -5
        System.out.println("Resta unaria: " + restaUnaria);

        // Operador de incremento
        a++; // a ahora es 11
        System.out.println("Incremento: " + a);

        // Operador de decremento
        b--; // b ahora es 4
        System.out.println("Decremento: " + b);
    }
}
