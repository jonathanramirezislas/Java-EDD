
package pilasconnodos;

import javax.swing.JOptionPane;

public class pila {
 
    private nodopila cima;
    int tamaño;
    public pila(){
        cima=null;
        tamaño=0;
    }
    //Metodo para saber cuuando la pila esta vacia
    public boolean estavacia(){
        return cima==null;
    }
    //metodo para empujuar o insertar en la pila
    public void empujar(int elemento){
        nodopila nuevo= new nodopila(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;
        tamaño++;
    }
    //meodo para scara el elemento de la cima
    public int scara(){
int auxiliar=cima.dato;
cima=cima.siguiente;
tamaño--;
        return auxiliar;
    }
    //metodo para saber quien esta en la cima de la pila
    public int cima(){
        return cima.dato;
    }
    //metodo para saber el tamaño de la pila
    public int tamaño(){
        return tamaño;
    }
    //metodo para limpiar la pila
    public void limpiar(){
        while(!estavacia()){
            scara();   
        }}
//Pra mostrar los elementos
    public void mostrar(){

        while (!estavacia())
     {
         int aux = cima.dato;
         System.out.println(aux);
         cima = cima.siguiente;
  
    }}
    
}
















