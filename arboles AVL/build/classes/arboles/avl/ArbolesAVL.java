
package arboles.avl;


public class ArbolesAVL {

    public static void main(String[] args) {
        arbol arbolito=new arbol();
    ///insertando nodos
        arbolito.instertar(10);
        arbolito.instertar(5);
        arbolito.instertar(13);
        arbolito.instertar(1);
        arbolito.instertar(6);
        arbolito.instertar(17);
        arbolito.instertar(16);
       arbolito.Preorden(arbolito.obtenerraiz());
        
        
        
    }
    
}
