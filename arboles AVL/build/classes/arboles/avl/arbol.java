package arboles.avl;

public class arbol {

    private nodoarbol raiz;

    public arbol() {
        raiz = null;
    }
  public nodoarbol obtenerraiz(){
      return raiz;
  }

    //BUscar un nodo
    public nodoarbol buscar(int d, nodoarbol r) {
        if (raiz == null) {
            return null;
        } else if (r.dato == d) {
            return r;
        } else if (r.dato < d) {
            return buscar(d, r.hijoderecho);//recursividad
        } else {
            return buscar(d, r.hijoizquierdo);
        }
    }

    //Metodo para obtener el factro de equilibrio
    public int obtenerfe(nodoarbol x) {
        if (x == null) {
            return -1;
        } else {
            return x.fe;
        }
    }

    //Rotacion simple izq
    public nodoarbol rotacionizquierda(nodoarbol c) {
        nodoarbol aux = c.hijoizquierdo;//puntero aux apunta a hijo izq
        c.hijoizquierdo = aux.hijoderecho;//reacomodando los punteros
        aux.hijoderecho = c;
        c.fe = Math.max(obtenerfe(c.hijoizquierdo), obtenerfe(c.hijoderecho)) + 1;
        aux.fe = Math.max(obtenerfe(aux.hijoizquierdo), obtenerfe(aux.hijoderecho)) + 1;
        return aux;
    }

    //Metodo simple derecha
    public nodoarbol rotacionderecha(nodoarbol c) {
        nodoarbol aux = c.hijoderecho;//puntero aux apunta a hijo izq
        c.hijoderecho = aux.hijoizquierdo;//reacomodando los punteros
        aux.hijoizquierdo = c;
        c.fe = Math.max(obtenerfe(c.hijoizquierdo), obtenerfe(c.hijoderecho)) + 1;
        aux.fe = Math.max(obtenerfe(aux.hijoizquierdo), obtenerfe(aux.hijoderecho)) + 1;
        return aux;
    }

    //Rotacion doble a la derecha
    public nodoarbol rotaciondobleizquierda(nodoarbol c) {
        nodoarbol aux;
        c.hijoizquierdo = rotacionderecha(c.hijoizquierdo);
        aux = rotacionizquierda(c);
        return aux;
    }

    //Rotacion doble a la izquierda
    public nodoarbol rotaciondobleDercha(nodoarbol c) {
        nodoarbol aux;
        c.hijoderecho = rotacionizquierda(c.hijoderecho);
        aux = rotacionderecha(c);
        return aux;

    }

    //Metodo para insertar avl

    public nodoarbol insertar(nodoarbol nuevo, nodoarbol subarbol) {
        nodoarbol nuevopadre = subarbol;
        if (nuevo.dato < subarbol.dato) {
            if (subarbol.hijoizquierdo == null) {
                subarbol.hijoizquierdo = nuevo;
            } else {
                subarbol.hijoizquierdo = insertar(nuevo, subarbol.hijoizquierdo);
                if ((obtenerfe(subarbol.hijoizquierdo) - obtenerfe(subarbol.hijoderecho) == 2)) {
                    if (nuevo.dato < subarbol.hijoizquierdo.dato) {
                        nuevopadre = rotacionizquierda(subarbol);
                    } else {
                        nuevopadre = rotaciondobleizquierda(subarbol);
                    }

                }
            }
        } else if (nuevo.dato > subarbol.dato) {
            if (subarbol.hijoderecho == null) {
                subarbol.hijoderecho = nuevo;
            } else {
                subarbol.hijoderecho = insertar(nuevo, subarbol.hijoderecho);
                if ((obtenerfe(subarbol.hijoderecho) - obtenerfe(subarbol.hijoizquierdo) == 2)) {
                    if (nuevo.dato > subarbol.hijoderecho.dato) {
                        nuevopadre = rotacionderecha(subarbol);
                    } else {
                        nuevopadre = rotaciondobleDercha(subarbol);
                    }
                }
            }
        } else {
            System.out.println("NODO DUPLICADO");
        }
        //ACTUALIZANDO LA ALTURA
        if ((subarbol.hijoizquierdo == null) && (subarbol.hijoderecho != null)) {
            subarbol.fe = subarbol.hijoderecho.fe + 1;
        } else if ((subarbol.hijoderecho == null) && (subarbol.hijoizquierdo != null)) {
            subarbol.fe = subarbol.hijoizquierdo.fe + 1;

        } else {
            subarbol.fe = Math.max(obtenerfe(subarbol.hijoizquierdo), obtenerfe(subarbol.hijoderecho)) + 1;
        }
        return nuevopadre;
    }

    //Metodo para recorrer el arbol inorden
    public void inorden(nodoarbol r) {
        if (r != null) {
            inorden(r.hijoizquierdo);
            System.out.print(r.dato + ", ");
            inorden(r.hijoderecho);
        }
    }

    //METODO PARA RECORRER EL ARBOL INORDEN

    public void Preorden(nodoarbol r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            Preorden(r.hijoizquierdo);
            Preorden(r.hijoderecho);
        }

    }

    //METODO EN POSORDEN

    public void Posorden(nodoarbol r) {
        if (r != null) {

            Posorden(r.hijoizquierdo);
            Posorden(r.hijoderecho);
            System.out.print(r.dato + ", ");
        }

    }

    ////////////////////////METODO PARA INSERTAR
    public void instertar(int d) {
        nodoarbol nuevo = new nodoarbol(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertar(nuevo, raiz);
        }
    }

}
