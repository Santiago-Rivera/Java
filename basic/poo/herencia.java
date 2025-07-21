package basic.poo;

import static basic.poo.clasesyobjetos.additionalMethod;
import static basic.poo.ejerciciosdeclasesyobjetos.anotherMethod;
import static basic.poo.ejerciciosdeclasesyobjetos.yetAnotherMethod;
import static basic.poo.poo.farewell;

public class herencia {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greet();
        farewell();
        additionalMethod();
        anotherMethod();
        yetAnotherMethod();
    }

    public static void greet() {
        System.out.println("Greetings from the herencia class!");
    }
}
