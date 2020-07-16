
package listas.doblemente.enlazadas;

public class nododoble {
    public int dato;
    nododoble siguiente,anterior;
     //constructor para cuando no hay nodos
    public nododoble(int el){
        this(el,null,null);
    }
    //constructor para cuando ya hay nodos
    public nododoble(int el,nododoble s,nododoble a){
        dato=el;
        siguiente=s;
        anterior=a;
    }
   
    
}










