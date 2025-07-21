package basic.excepciones;

public class excepciones {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Esto lanzará una excepción ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }
    }
}
