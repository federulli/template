package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.queue.*;

public class Main {

    public static void main(String[] args) {
        Queue<String> cola = new Queue<>();
        if (cola.isEmpty()) {
            System.out.println("TRUE");
            cola.add("hola");
            cola.add("pepe");
            System.out.println(cola.top());
            cola.remove();
            System.out.println(cola.top());
            cola.remove();
            System.out.println(cola.isEmpty());

        } else {
            System.out.println(cola.size());
            System.out.println("FFALSE");
        }

    }
}
