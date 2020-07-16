package pilasstack;

import java.util.Stack;

public class PilasStack {

    public static void main(String[] args) {

        Stack pilita = new Stack();

        pilita.add(10);
        pilita.add(20);
        pilita.add(30);
        pilita.add(40);
        pilita.add(50);
        pilita.push(100);
        System.out.println("Tamaño de la pila: " + pilita.size());//tamaño
        System.out.println("La sima es:" + pilita.peek());//para saber cual esta en la cima
        System.out.println("Sacanado un lemento de la pila" + pilita.pop());//sacar un elemento
        System.out.println("Tamaño de la pila: " + pilita.size());//tamaño
        System.out.println("LA PILA ESTA VACIA?"+pilita.isEmpty());//para saber si esta vacia
    }

}
