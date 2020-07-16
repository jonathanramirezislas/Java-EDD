
package arboles.avl;

public class nodoarbol {
    int dato,fe;// fe es el factor de equilibrio
    nodoarbol hijoizquierdo,hijoderecho;
    
    public nodoarbol(int d){
        this.dato=d;
        this.fe=0;
        this.hijoderecho=null;
        this.hijoizquierdo=null;
    }
    
}
