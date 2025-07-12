package basic.condicionales;

public class sentenciaswitch {
    public static void main(String[] args) {
        // Declaración de una variable
        int numero = 10;

        // Condicional switch
        switch (numero) {
            case 1:
                System.out.println("El número es uno.");
                break;
            case 2:
                System.out.println("El número es dos.");
                break;
            case 3:
                System.out.println("El número es tres.");
                break;
            default:
                System.out.println("El número no es ni uno, ni dos, ni tres.");
                break;
        }
    }
}
