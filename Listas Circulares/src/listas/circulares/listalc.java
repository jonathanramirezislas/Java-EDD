
package listas.circulares;

import javax.swing.JOptionPane;

public class listalc {
    
    nodolc ultimo;
    public listalc(){
        ultimo=null;
    }
    //metodo para saber cuando la lista esta vacia
    public boolean estavacia(){
     return ultimo==null;   
    }
    //metodo para insestar nodos
    public listalc insertar(int elemento){
     nodolc nuevo=new nodolc(elemento);
     if(ultimo!=null){
         nuevo.siguiente=ultimo.siguiente;
         ultimo.siguiente=nuevo;       
     }
     ultimo=nuevo;
     return this;//retorna el objeto nde lc
    }
    //metodo para mostrar la lista
    public void mostrarlista(){
        nodolc auxiliar=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena+"["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,cadena,"MOSTRANDO LA LISTA CIRCULAR",
                JOptionPane.INFORMATION_MESSAGE);
    }
    //METODO PARA ELIMINAR UN NODO DE LA LISTA
    public boolean eliminarnodo(int elemento){
        nodolc actual;
        boolean encontrado=false;
        actual=ultimo;
        while(actual.siguiente!=ultimo && !encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;    
            }
        }
   encontrado=(actual.siguiente.dato==elemento);
         if(encontrado){
             nodolc auxliar=actual.siguiente;
             if(ultimo==ultimo.siguiente){
                 ultimo=null;
             }else{
                 if(auxliar==ultimo){
                     ultimo=actual;
                 }
                 actual.siguiente=auxliar.siguiente;
             }
             auxliar=null;
         }
        return  encontrado==true;}
    
}
















