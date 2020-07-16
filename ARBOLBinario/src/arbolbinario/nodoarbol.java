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

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public nodoarbol getHijoizquierdo() {
        return hijoizquierdo;
    }

    public void setHijoizquierdo(nodoarbol hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public nodoarbol getHijoderecho() {
        return hijoderecho;
    }

    public void setHijoderecho(nodoarbol hijoderecho) {
        this.hijoderecho = hijoderecho;
    }
    
    public String toString(){
        return nombre+"= SU DATO ES :"+dato;
    }
}
