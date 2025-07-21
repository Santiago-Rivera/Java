package basic.bucles;

public class foreach {
    public static void main(String[] args) {
        // Bucle foreach
        String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // Bucle foreach con un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Numero: " + numero);
        }

        // Bucle foreach con un array de cadenas
        String[] frutas = {"Manzana", "Banana", "Naranja", "Fresa"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // Bucle foreach con un array de booleanos
        boolean[] estados = {true, false, true, false};
        for (boolean estado : estados) {
            System.out.println("Estado: " + estado);
        }

        // Bucle foreach con un array de objetos
        class Persona {
            String nombre;
            int edad;

            Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public String toString() {
                return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
            }
        }
        Persona[] personas = {
            new Persona("Juan", 30),
            new Persona("Ana", 25),
            new Persona("Pedro", 40)
        };
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona);
        }
    }
}
