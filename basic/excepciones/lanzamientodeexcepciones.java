package basic.excepciones;

public class lanzamientodeexcepciones {
    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (Exception e) {
            System.out.println("Se ha capturado una excepción: " + e.getMessage());
        }
    }

    public static void lanzarExcepcion() throws Exception {
        throw new Exception("Esta es una excepción lanzada intencionalmente.");
    }
}
