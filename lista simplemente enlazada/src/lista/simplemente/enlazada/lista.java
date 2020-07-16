
package lista.simplemente.enlazada;

public class lista {
   
protected  nodo inicio,fin;   //punteros de inicio y final
public lista(){
    inicio=null;
    fin=null;
}
//metodo para si la lista esta vacia
public boolean estavacia(){
    if(inicio==null){
        return true;
    }else{
        return false;
    }
}


    //metodo para agregar un nodo al inicio de la lista
public void agregarALinicio(int elemento){
    inicio= new nodo(elemento, inicio);//creacion de nodo
    if(fin==null){
        fin=inicio;
    }}    
//metodo para agregar un nodo al final de la lista
public void agregarALFinal(int elemento){
    if(!estavacia()){
        fin.siguiente=new nodo(elemento);//fin.setenlace(nodo)
        fin=fin.siguiente;//fin=nodo;
    }else{
        inicio=fin=new nodo(elemento);
    }
    
    
 } 


//Metodo para mostar datos
public void mostraLista(){
    nodo recorrer=inicio;
    System.out.println();
    while(recorrer!=null){
        System.out.println("["+recorrer.dato+"]---->");
        recorrer=recorrer.siguiente;
    }}

  public int borrarDEinicio(){//METODO PARA BORRAR UN NODO DEL INCIO
        int elemento=inicio.dato;
        if(inicio==fin){
            inicio=null;
            fin=null;////= inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
//METODO PARA ELIMINAR UN NODO DEL FINAL
  public int borrarDEfinal(){
      int elemento=fin.dato;
      if(inicio==fin){   
          inicio=fin=null;
                     }else{
          nodo temporal=inicio;
          while(temporal.siguiente!=fin){
              temporal=temporal.siguiente;} 
          fin=temporal;
          fin.siguiente=null;} 
          return elemento;}
  //METODO PARA ELIMINAR UN NODO EN ESPECIFICO
  public void eliminarEspecificoNodo(int elemento){
      if(!estavacia()){
          if(inicio==fin && elemento==inicio.dato){
              inicio=fin=null;
          }else if(elemento==inicio.dato){
              inicio=inicio.siguiente;
          }else{
              nodo anterior,temporal;
              anterior=inicio;
              temporal=inicio.siguiente;
              while(temporal!=null && temporal.dato!=elemento){
                  anterior=anterior.siguiente;
                  temporal=temporal.siguiente;
              }
              if(temporal!=null){
                  anterior.siguiente=temporal.siguiente;
                  if(temporal==fin){
                      fin=anterior;
                     } } }}}  
  
  //METODO PARA BUSCAR UN ELEMENTO
  public boolean buscarelemento(int elemento){
      nodo temporal=inicio;
      while(temporal!=null && temporal.dato!=elemento){
      temporal=temporal.siguiente;
  }
      return temporal!=null;
  }
  
}

























