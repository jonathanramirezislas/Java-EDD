
package lista.simplemente.enlazada;

public class nodo {
    public int dato;
    public nodo siguiente;//puntero enlace
    
    public nodo(int d){//contructor 
        this.dato=d;
        this.siguiente=null;
    }
    public nodo(int d,nodo n){//contructor 
        dato=d;
        siguiente=n;
    }
    
}
