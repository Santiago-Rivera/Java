package basic.condicionales;

public class condicionales {
    public static void main(String[] args) {
        // Declaración de una variable
        int numero = 10;

        // Condicional if-else
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Condicional switch
        switch (numero) {
            case 1:
                System.out.println("El número es uno.");
                break;
            case 2:
                System.out.println("El número es dos.");
                break;
            default:
                System.out.println("El número no es ni uno ni dos.");
                break;
        }
    }
}
