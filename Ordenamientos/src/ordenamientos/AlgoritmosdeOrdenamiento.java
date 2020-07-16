package ordenamientos;

import java.util.LinkedList;
import java.util.Queue;

public class AlgoritmosdeOrdenamiento {

    int j, i, temporal;

    public AlgoritmosdeOrdenamiento() {
        i = 0;
        j = 0;
        temporal = 0;
    }
//metodo burbuja version 1

    public void burbuja1(int[] arreglo) {
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
//metodo burbuja version 2

    public void burbuja2(int[] arreglo) {
int movimiento=0;        
do {
            for (j =0; j <arreglo.length-1; j++) {

                if (arreglo[j] > arreglo[j+1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                     movimiento++;}} 
}while(movimiento!=0);}
        
    
    //MEtodo radix
    public void radix(int [] arreglo){
        int x,i,j;
        for(x=Integer.SIZE-1;x>=0;x--){
            int aux []=new int[arreglo.length];
            j=0;
            for(i=0;i<arreglo.length;i++){
                boolean mover=arreglo[i]<<x>=0;//lo que hace si x es mayor a 0 ? devolvera un verdad o un falso
              /*
                if(x>y){ mayor=x;
                }else{  mayor=y;}
                es lo mismo q abajo con operador ternario
                resultado=(condicion) ? valor:valor2
                mayor=(x>y)?x:y;
                */ 
                if(x==0 ?  !mover:mover){
                      aux[j]=arreglo[i];
                      j++;
                        }else{
                    arreglo[i-j]=arreglo[i];
                }
            }
            for(i=j;i<aux.length;i++){
                aux[i]=arreglo[i-j];
            }
            arreglo=aux;
        }
      
        mostraarreglo(arreglo);
    }
    
    
    
    
    //Metodo quick
    public void quick(int[] arreglo,int primero,int ultimo){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        do{
            while(arreglo[i]<pivote){//moviendo pivote
                i++;
            }
            while(arreglo[j]>pivote){//moviendo pivote
                j--;
            }
            //aqui se hace el intercambio
            if(i<=j){
                aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
            
        }while(i<=j);
        if(primero<j){
            quick(arreglo,primero,j);
        }
        if(i<ultimo){
            quick(arreglo,i,ultimo);
        }
       
    }
    //METODO POR INSERCION
       public static void insercion(int[] v) {
        final int N = v.length;
        for(int i=1; i<N; i++) {
            int j=i;
            while(j>0 && v[j]<v[j-1] ){
                int tmp = v[j];
                v[j]    = v[j-1];
                v[j-1]  = tmp;
                j--;
            }
        }
    }
    //Ordenamiento por shell
       public void shell(int[] arreglo){
           int salto,i,j,k,aux;
           salto=arreglo.length/2;
           do {
               for(i=salto;i<arreglo.length;i++){
                   j=i-salto;
                   while(j>=0){
                       k=j+salto;
                       if(arreglo[j]<=arreglo[k]){
                           j=-1;
                       }else{
                           aux=arreglo[j];
                           arreglo[j]=arreglo[k];
                           arreglo[k]=aux;
                           j=j-salto;//j-=salto;
                           
                       }
                   }
               }
               salto=salto/2;
           }while(salto>0);
       }
       
    //Algoritmo de Ordenamiento por Intercalación
       public void intercalacion(int []arregloa,int []arreglob){
           int i,j,k;
           int arregloc[]=new int[arregloa.length+arreglob.length];
           //Repetir los arreglos A y B tengan elementos que comparar
        for(i=j=k=0;i<arregloa.length && j<arreglob.length;k++){//indice para arregloa es i y para el  es j y para el c es k
            if(arregloa[i]<arreglob[j]){
                arregloc[k]=arregloa[i];
                i++;
            }else{
                arregloc[k]=arreglob[j];
                j++;
            }
        }
        //Para añadir a arreglo c los elementosa sobrantes en caso de averlos dela arreglo a
        for(;i<arregloa.length;i++,k++){
            arregloc[k]=arregloa[i]; 
        }
           //Para añadir a arreglo c los elementosa sobrantes en caso de averlos de el arreglo b
        for(;j<arregloa.length;j++,k++){
            arregloc[k]=arreglob[j]; 
        }
           mostraarreglo(arregloc);
       }
       
   //Metodo para mezcla directa
       public int [] mezcladirecta(int [] arreglo){
           int i,j,k;
           if(arreglo.length>1){
               int nElementosIzq=arreglo.length/2;
               int nElementosDer=arreglo.length-nElementosIzq;
               int arregloIzq[]=new int[nElementosIzq];
               int arregloDer[]=new int[nElementosDer];
               //Copiando los elementos de la parte primera al arreloIzq
               for(i=0;i<nElementosIzq;i++){
                   arregloIzq[i]=arreglo[i];
               }
               //Copiando los elementos de la SEGUNDA primera al arreloDER
               for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++){
                   arregloDer[i-nElementosIzq]=arreglo[i];
               }
               //REcursividad
               arregloIzq=mezcladirecta(arregloIzq);
              arregloDer=mezcladirecta(arregloDer);
              i=0;
              j=0;
              k=0;
              while(arregloIzq.length!=j && arregloDer.length!=k){
                  if(arregloIzq[j]<arregloDer[k]){
                      arreglo[i]=arregloIzq[j];
                      i++;
                      j++;
                  }else{
                      arreglo[i]=arregloDer[k];
                      i++;
                      k++;
                  }
              }
              //Arrreglo final
              while(arregloIzq.length!=j){
                  arreglo[i]=arregloIzq[j];
                  i++;
                  j++;
              }
              while(arregloDer.length!=k){
                  arreglo[i]=arregloDer[k];
                  i++;
                  k++;
              }
           }
           return arreglo;
       }
      /////////////////////////////////////////////////////
       //METODO MEZCLA NATURAL
       public void mezclaNatural(int arreglo[]){
           int izquierda=0,Izq=0,Derecha=arreglo.length-1,Der=Derecha;
           boolean ordenado=false;
           do{
               ordenado=true;
               izquierda=0;
               while(izquierda<Derecha){
                   Izq=izquierda;
                   while(Izq<Derecha && arreglo[Izq]<=arreglo[Izq+1]){//para ver si van en orden los primeros 
                      Izq++; 
                   }
                   Der=Izq+1;
                   while(Der==Derecha-1 || Der<Derecha && arreglo[Der]<=arreglo[Der+1]){
                       Der++;
                   }
                   if(Der<=Derecha){
                       mezcladirecta2(arreglo);
                       ordenado=false;
                   }
                   izquierda=Izq;
               }
               
           }while(!ordenado);
       }
       
       
       //Mezcla directa 2
        public void mezcladirecta2(int [] arreglo){
           int i,j,k;
           if(arreglo.length>1){
               int nElementosIzq=arreglo.length/2;
               int nElementosDer=arreglo.length-nElementosIzq;
               int arregloIzq[]=new int[nElementosIzq];
               int arregloDer[]=new int[nElementosDer];
               //Copiando los elementos de la parte primera al arreloIzq
               for(i=0;i<nElementosIzq;i++){
                   arregloIzq[i]=arreglo[i];
               }
               //Copiando los elementos de la SEGUNDA primera al arreloDER
               for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++){
                   arregloDer[i-nElementosIzq]=arreglo[i];
               }
               //REcursividad
               arregloIzq=mezcladirecta(arregloIzq);
              arregloDer=mezcladirecta(arregloDer);
              i=0;
              j=0;
              k=0;
              while(arregloIzq.length!=j && arregloDer.length!=k){
                  if(arregloIzq[j]<arregloDer[k]){
                      arreglo[i]=arregloIzq[j];
                      i++;
                      j++;
                  }else{
                      arreglo[i]=arregloDer[k];
                      i++;
                      k++;
                  }
              }
              //Arrreglo final
              while(arregloIzq.length!=j){
                  arreglo[i]=arregloIzq[j];
                  i++;
                  j++;
              }
              while(arregloDer.length!=k){
                  arreglo[i]=arregloDer[k];
                  i++;
                  k++;
              }
           }
          
       }
      
   //////////////////////////////////////////    
//Metodo para mostrar el arreglo

    public void mostraarreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.println("[" + arreglo[k] + "]");
        }System.out.println();
    }

            
            }
        
        
    