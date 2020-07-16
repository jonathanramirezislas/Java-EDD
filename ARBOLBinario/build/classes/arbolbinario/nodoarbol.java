package arbolbinario;

public class nodoarbol {

    int dato;
    String nombre;
    nodoarbol hijoizquierdo, hijoderecho;//punteros

    public nodoarbol(int d, String nom) {
        dato = d;
        nombre = nom;
        hijoizquierdo = null;
        hijoderecho = null;
    }
    public String toString(){
        return nombre+"= SU DATO ES :"+dato;
    }
}
