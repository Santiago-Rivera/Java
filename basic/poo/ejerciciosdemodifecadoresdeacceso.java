package basic.poo;

public class ejerciciosdemodifecadoresdeacceso {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greet();
        farewell();
        additionalMethod();
        anotherMethod();
        yetAnotherMethod();
        extraMethod();
        // Uncommenting the following lines will cause compilation errors
    }

    public static void greet() {
        System.out.println("Greetings from the ejerciciosdemodifecadoresdeacceso class!");
    }

    public static void farewell() {
        System.out.println("Farewell from the ejerciciosdemodifecadoresdeacceso class!");
    }

    public static void additionalMethod() {
        System.out.println("This is an additional method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    public static void anotherMethod() {
        System.out.println("This is another method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    public static void yetAnotherMethod() {
        System.out.println("This is yet another method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    public static void extraMethod() {
        System.out.println("This is an extra method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    /*private static void privateMethod() {
        System.out.println("This is a private method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    protected static void protectedMethod() {
        System.out.println("This is a protected method in the ejerciciosdemodifecadoresdeacceso class!");
    }*/
}
