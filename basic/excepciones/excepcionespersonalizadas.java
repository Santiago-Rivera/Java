package basic.excepciones;

public class excepcionespersonalizadas {
    public static void main(String[] args) {
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Se ha capturado una excepción personalizada: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }

    static class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }
}
