package basic.poo;

public class abstraccion {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greet();
        farewell();
        additionalMethod();
    }

    public static void greet() {
        System.out.println("Greetings from the abstraccion class!");
    }

    public static void farewell() {
        System.out.println("Farewell from the abstraccion class!");
    }

    public static void additionalMethod() {
        System.out.println("This is an additional method in the abstraccion class!");
    }
}
