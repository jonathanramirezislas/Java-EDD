package arbolbinario;

public class arbol {

    nodoarbol raiz;//puntero donde va arracar el arbol

    public arbol() {
        raiz = null;
    }

    //Metodo para instertar un nuevo nodo en el arbol

    public void agreagrnodo(int d, String nom) {
        nodoarbol nuevo = new nodoarbol(d, nom);//creando nodo 
        if (raiz == null) {//en caso de que el arbol este vacio
            raiz = nuevo;//raiz apunta a nodo que apenas crreamos
        } else {
            nodoarbol auxiliar = raiz;//auxiliar apunta a raiz puntero
            nodoarbol padre;//puntero
            while (true) {
                padre = auxiliar;//padre apunta a la raiz 
                if (d < auxiliar.dato) {//para recorrer a ala izq en caso de ser menor al dato
                    auxiliar = auxiliar.hijoizquierdo;
                    if (auxiliar == null) {//para saber que llgamos el final donde esta vacio
                        padre.hijoizquierdo = nuevo;
                        return;//termina el metodo void
                    }

                } else {
                    auxiliar = auxiliar.hijoderecho;
                    if (auxiliar == null) {
                        padre.hijoderecho = nuevo;
                        return;
                    }
                }

            }
        }
    }
//METODO PARA SABER SI EL ARBOL ESTA VACIO
    public boolean estavacio(){
        return raiz==null;
    }
  //Metodo para recorrer el arol
    public void inorden(nodoarbol r){
        if(r!=null){
            inorden(r.hijoizquierdo);
            System.out.print(r.dato+", ");
            inorden(r.hijoderecho);
        }
    }
    //METODO PARA RECORRER EL ARBOL INORDEN
    public void Preorden(nodoarbol r){
        if(r!=null){
            System.out.print(r.dato+", ");
            Preorden(r.hijoizquierdo);
            Preorden(r.hijoderecho);
        }
        
    }
    //METODO EN POSORDEN
    public void Posorden(nodoarbol r){
        if(r!=null){
           
            Posorden(r.hijoizquierdo);
            Posorden(r.hijoderecho);
            System.out.print(r.dato+", ");
        }
        
    }
    //METODO PARA BUSCAR UN  NODOD EN EL ARBOL
    public nodoarbol buscarnodo(int d){
        nodoarbol aux=raiz;//aux apunta a la raiz
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoizquierdo;//auxiliar apunta a al hijo isquierdo
            }else{
                aux=aux.hijoderecho;//auxliar apunta a hijo derecho
            }
            if(aux==null){
                return null;
            }
        }
        return aux;    
    }
    //METODO PARA ELIMNAR UN NODOD DEL ARBOL
    public boolean eleminar(int d){
        nodoarbol aux=raiz;//puntero que apunta a raiz
        nodoarbol padre=raiz;//puntero padre que tambien apunta raiz
        boolean eshijoizq=true;//servira cuando este en el hijo este en el izq sera true
        while(aux.dato!=d){
            padre=aux;//ahora padre apunta a axu
            if(d<aux.dato){//sirve para que se vaya para la izq
                eshijoizq=true;
                aux=aux.hijoizquierdo;//llendose para la isquerida
            }else{
                eshijoizq=false;
                aux=aux.hijoderecho;//llendoce para la derecha
            }
            if(aux==null){
                return false;
            }
        }//fin de while
        if(aux.hijoizquierdo==null && aux.hijoderecho==null){//sierve para saber que es hoja
            if(aux==raiz){
                raiz=null;
            }else if(eshijoizq){
                padre.hijoizquierdo=null;
            }else{
                padre.hijoderecho=null;
            }
        }else if(aux.hijoderecho==null){
               if(aux==raiz){
                raiz=aux.hijoizquierdo;
            }else if(eshijoizq){
                padre.hijoizquierdo=aux.hijoizquierdo;
            }else{
                padre.hijoderecho=aux.hijoizquierdo;
            }
            
        }else if(aux.hijoizquierdo==null){
            if(aux==raiz){
                raiz=aux.hijoderecho;
            }else if(eshijoizq){
                padre.hijoderecho=aux.hijoderecho;///o puede ser padre.hijoiz=aux.hijoderecho;
            }else{
                padre.hijoderecho=aux.hijoderecho;
            }
        }else{
            nodoarbol remplazo=obtenernododremplazo(aux);
            if(aux==raiz){
                raiz=remplazo;  
            }else if(eshijoizq){
                padre.hijoizquierdo=remplazo;
            }else{
                padre.hijoderecho=remplazo;
            }
            remplazo.hijoizquierdo=aux.hijoizquierdo;
        }
        return true;
       
    }
    //metodo encargado de devolvernos el nodod rempaloz
public nodoarbol obtenernododremplazo(nodoarbol nodorem){
    nodoarbol remplazarpadre=nodorem;
    nodoarbol remplazo=nodorem;
    nodoarbol aux=nodorem.hijoderecho;
    while(aux!=null){
        remplazarpadre=remplazo;
        remplazo=aux;
        aux=aux.hijoizquierdo;
    }
    if(remplazo!=nodorem.hijoderecho){
        remplazarpadre.hijoizquierdo=remplazo.hijoderecho;//reacomodar los enlaces
        remplazo.hijoderecho=nodorem.hijoderecho;
    }
    System.out.println("EL NODO REMPLAZO ES: "+remplazo);
    return remplazo;
}
    
    
}
