
package listas.doblemente.enlazadas;

import javax.swing.JOptionPane;

public class listadble {
    private nododoble inicio,fin; //punteros
    public listadble(){
     inicio=fin=null;
    }
    //metodo para saber cuando la lista esta vacia
    public boolean estavacia(){
        return inicio==null;
    }
    //metodo para agraggar nodos al final
    public void agregaralfinal(int el){
        if(!estavacia()){
            fin=new nododoble(el, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new nododoble(el);
        }}
   //metodo para agraggar nodos al inicio
    public void agregarinicio(int el){
        if(!estavacia()){
            fin=new nododoble(el, inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new nododoble(el);
        }}
    //Metodo para mostar la lista inicio fin
    public void mostrarlistainciofin(){
        if(!estavacia()){
            String datos="<=>";
            nododoble auxiliar=inicio;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,datos,
            "Mostraando lista de incio a fin",JOptionPane.INFORMATION_MESSAGE);
      } }
     //Metodo para mostar la lista fin inicio
    public void mostrarlistafininicio(){
        if(!estavacia()){
            String datos="<=>";
            nododoble auxiliar=fin;
            while(auxiliar!=null){
                datos=datos+"["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,
            "Mostraando lista de fin a inicio",JOptionPane.INFORMATION_MESSAGE);
        }}
    //Metodo para elmiminar del incio
    public int eleminardelInicio(){
     int elemento=inicio.dato;
     if(inicio==fin){
         inicio=fin=null;
     }else{
         inicio=inicio.siguiente;
         inicio.anterior=null;               
     }
     return elemento;
    }
    //Metodo para elminar de final
    public int eliminardelfinal(){
         int elemento=fin.dato;
     if(inicio==fin){
         inicio=fin=null;
     }else{
        fin=fin.anterior;
        fin.siguiente=null;}
     return elemento;
    }
    
    
}



















