package basic.poo;

import static basic.poo.ejerciciosdeclasesyobjetos.anotherMethod;
import static basic.poo.ejerciciosdeclasesyobjetos.yetAnotherMethod;

public class ejerciciosdeherencia {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greet();
        farewell();
        additionalMethod();
        anotherMethod();
        yetAnotherMethod();
    }

    public static void greet() {
        System.out.println("Greetings from the ejerciciosdeherencia class!");
    }

    public static void farewell() {
        System.out.println("Farewell from the ejerciciosdeherencia class!");
    }

    public static void additionalMethod() {
        System.out.println("This is an additional method in the ejerciciosdeherencia class!");
    }
}
