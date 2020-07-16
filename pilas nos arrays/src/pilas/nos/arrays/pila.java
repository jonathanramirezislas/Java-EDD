
package pilas.nos.arrays;

public class pila {
   
    int vectorpila[];
    int cima;
    public pila(int tamanio){
        vectorpila=new int[tamanio];
        cima=-1;
    }
    //Metodo push o meter un elemento enla cima
    public void empujar(int dato){
        cima++;//para incertalo en la pocicion 0
        vectorpila[cima]=dato;
    }
    //metodo pop parar sacar un dato de la cima
    public int sacar(){
        int fuera=vectorpila[cima];
        cima--;
        return fuera;
    }
    //Metodo para saber si la pila esta vacia
    public boolean estavacia(){
        return cima==-1;  
    }
   ///Metodo para saber si la pila esta llena
    public boolean estallena(){
        return vectorpila.length-1==cima;//si el tamaño de la pila es igual a cima
    }
    //Metodo para saber que elemento esta en la cima
    public int cimapila(){
        return vectorpila[cima];
    }
    //METODO para saber el tamaño de la pila
    public int tamaniopila(){
        return vectorpila.length;
    }
    //METODO imprecion de la pila
  
}








