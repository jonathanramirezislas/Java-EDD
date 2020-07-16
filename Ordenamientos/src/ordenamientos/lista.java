/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;
public class lista {
    protected  nodoSimple nodo, inicio = null, fin = null;
public lista(){
    inicio=null;
    fin=null;
}public boolean estavacia(){
    if(inicio==null){
        return true;
    }else{
        return false;}}
public void agregarALinicio(String elemento){
    nodo = new nodoSimple(elemento);
    if(estavacia()){
        fin=nodo;}nodo.setEnlace(inicio);inicio = nodo;}
public void mostraLista(){
   String datos=" ";
    nodo = inicio;
while (nodo != null){
       datos = datos + "[" + nodo.getDato() + "]=>";
                nodo = nodo.getEnlace();}
            System.out.println(datos);}}
