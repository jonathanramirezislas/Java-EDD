/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.de.busqueda;


public class METODOSDEBUSQUEDA {

    public static void main(String[] args) {
     busqueda bus=new busqueda();
     
     
     int vector1[] = {5, 6, 3, 44, 22, 1};
        bus.mostraarreglo(vector1);
        int indice=bus.busquedasecuencial(vector1, 22);
        if(indice!=1){
            System.out.println("Elemento encontrado en el indice: "+indice);
        }else{
            System.out.println("Elemento no enontrado");
        }
        System.out.println("//////////////////////////");
    ////////
    //recordar que debe estar ordenado
     int vector2[] = {1, 2, 3, 4, 5, 6};
           bus.mostraarreglo(vector2);
     int indice2=bus.busquedaBinaria(vector2, 4);
      if(indice!=1){
            System.out.println("Elemento encontrado en el indice: "+indice);
        }else{
            System.out.println("Elemento no enontrado");
        }
      
      
      
    }
}
