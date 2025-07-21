package basic.poo;

public class modificadoresdeacceso {
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
        System.out.println("Greetings from the modificadoresdeacceso class!");
    }

    public static void farewell() {
        System.out.println("Farewell from the modificadoresdeacceso class!");
    }

    public static void additionalMethod() {
        System.out.println("This is an additional method in the modificadoresdeacceso class!");
    }

    public static void anotherMethod() {
        System.out.println("This is another method in the modificadoresdeacceso class!");
    }

    public static void yetAnotherMethod() {
        System.out.println("This is yet another method in the modificadoresdeacceso class!");
    }
    public static void extraMethod() {
        System.out.println("This is an extra method in the modificadoresdeacceso class!");
    }

    /*private static void privateMethod() {
        System.out.println("This is a private method in the ejerciciosdemodifecadoresdeacceso class!");
    }

    protected static void protectedMethod() {
        System.out.println("This is a protected method in the ejerciciosdemodifecadoresdeacceso class!");
    }*/
}
