/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.de.busqueda;


public class busqueda {
    
    //Metodo de busqueda secuencial
  public int busquedasecuencial(int arreglo[],int elemento){
      int i;
      boolean encontrado=false;
      for(i=0;i<arreglo.length && encontrado==false;i++){
          if(elemento==arreglo[i]){
              encontrado=true;
              return i;
          }
      }
      return -1;
  }  
  
  //Metodo de busqueda binaria
  public int busquedaBinaria(int arreglo[],int elemento){
      int centro,primero,ultimo,valorcentral;
      primero=0;
      ultimo=arreglo.length-1;
      while(primero<=ultimo){
          centro=(primero+ultimo)/2;
          valorcentral=arreglo[centro];
          System.out.println("Comparando a "+elemento+" con"+arreglo[centro]);
          if(elemento==valorcentral){
              return centro;
          }else if(elemento<valorcentral){
              ultimo=centro-1;//dezplasarnos a la izquierda
          }else{
              primero=centro+1;///PARA desplazarnos a la derecha
          }
      }
      return -1;
  }
  
    //Metodo para mostrar el arreglo

    public void mostraarreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.println("[" + arreglo[k] + "]");
        }System.out.println();
    }
    
    
    
    
}
