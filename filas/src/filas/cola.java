/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

public class cola {
    nodocola inicio,fin;
    int tamaño;
    public cola(){
        inicio=fin=null;
        tamaño=0;
    }
    //metodo para saber si esta vacia
    public boolean estavacia(){
        return inicio==null;
    }
    //metodo para insertar
    public void insertar(int elemento){
        nodocola nuevo=new nodocola(elemento);
        if(estavacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    //metodo para quitar elemento del inicio
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        return aux;
    }
    //metodo oara saber quien esta al incio 
    public int inciocola(){
        return inicio.dato;
    }
    public int tamañocola(){
        return tamaño;
    }
    
}











