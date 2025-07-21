package basic.bucles;

public class whileydowhile {
    public static void main(String[] args) {
        // Bucle while
        int i = 0;
        while (i < 10) {
            System.out.println("El valor de i es: " + i);
            i++;
        }

        // Bucle do-while
        int j = 0;
        do {
            System.out.println("El valor de j es: " + j);
            j++;
        } while (j < 10);

        // Bucle while con un array
        String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};
        int k = 0;
        while (k < nombres.length) {
            System.out.println("Nombre: " + nombres[k]);
            k++;
        }

        // Bucle do-while con un array
        int l = 0;
        do {
            if (l < nombres.length) {
                System.out.println("Nombre: " + nombres[l]);
            }
            l++;
        } while (l < nombres.length);

        // Bucle while con un rango
        System.out.println("Números del 1 al 10 usando while:");
        int m = 1;
        while (m <= 10) {
            System.out.println(m);
            m++;
        }
        // Bucle do-while con un rango
        System.out.println("Números del 1 al 10 usando do-while:");
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 10);
    }
}
