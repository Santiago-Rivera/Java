package basic.poo;

public class polimorfismo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greet();
        farewell();
        additionalMethod();
        anotherMethod();
        yetAnotherMethod();
        polymorphicMethod();
    }

    public static void greet() {
        System.out.println("Greetings from the polimorfismo class!");
    }

    public static void farewell() {
        System.out.println("Farewell from the polimorfismo class!");
    }

    public static void additionalMethod() {
        System.out.println("This is an additional method in the polimorfismo class!");
    }
    public static void anotherMethod() {
        System.out.println("This is another method in the polimorfismo class!");
    }
    public static void yetAnotherMethod() {
        System.out.println("This is yet another method in the polimorfismo class!");
    }
    public static void polymorphicMethod() {
        System.out.println("This is a polymorphic method in the polimorfismo class!");
    }
}
