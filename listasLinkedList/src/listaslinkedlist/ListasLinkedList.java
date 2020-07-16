package listaslinkedlist;

import java.util.LinkedList;

public class ListasLinkedList {

    public static void main(String[] args) {

        LinkedList listita = new LinkedList();

        listita.add(10);
        listita.add(50);
        listita.add(30);
        listita.add(40);
        listita.add(20);
        listita.add(100);
        int tamaño=listita.size();//regresa el tamaño
        int i=0;
        while(i<tamaño){
            System.out.println("["+listita.get(i)+"]");
            i++;
        }
        listita.remove(2);
        listita.add(3,100);///(ondice,numero)
        i=0;
        tamaño=listita.size();
        System.out.println("");
          while(i<tamaño){
            System.out.println("["+listita.get(i)+"]");
            i++;
        }
               
}}


