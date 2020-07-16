
package tablashash;

import java.util.Arrays;



public class TablasHASH {

    
    String [] arreglo;
    int tamaño,contador;
  //CONSTRUCTOR
    public TablasHASH(int tam){
        tamaño=tam;
        arreglo=new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    
    public void funcionHash(String [] cadenaarreglo,String [] arreglo){
        int i=0;
        for(i=0;i<cadenaarreglo.length;i++){
            String elemento=cadenaarreglo[i];
            int indiceArreglo=Integer.parseInt(elemento)%7;//su pocicion que se le va a dar
            System.out.println("El indice es "+indiceArreglo+" Para el elemento "+elemento);
            while(arreglo[indiceArreglo]!="-1"){
                indiceArreglo++;
                System.out.println("Ocurrio una colicion en el indice "+(indiceArreglo-1)+" Cambiando al indice "+indiceArreglo);
                indiceArreglo%=tamaño;
            }
            arreglo[indiceArreglo]=elemento;
        }
    }
    //MEtodo para mostrar la tabla
    public void mostrar(){
        int incremento=0,i,j;
        for(i=0;i<1;i++){
            incremento+=8;
            for(j=0;j<71;j++){
                System.out.print("-");
            }
            System.out.println();
            for(j=incremento -8;j<incremento;j++){
                System.out.format("| %3s "+" ",j);
            }
            System.out.println("|");
            for(int n=0;n<71;n++){
                System.out.print("-");
            }
            System.out.println();
            
            for(j=incremento-8;j<incremento;j++){
                if(arreglo[j].equals("-1")){
                    System.out.print("|          ");
                }else{
                    System.out.print(String.format("| %3s"+" ",arreglo[j]));
                }
            }
            System.out.println("|");
            for(j=0;j<71;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    //Metodo para buscar una clave
    public String buscarclave(String elemento){
        int indiceArreglo=Integer.parseInt(elemento)%7;
        int contador=0;
        while(arreglo[indiceArreglo]!="-1"){
            if(arreglo[indiceArreglo]==elemento){
                System.out.println("El elemento "+elemento+" Fue encontrado en el indice "+indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamaño;
            contador++;
                if(contador>7){
                    break;
                }    
        }
        return null;
    }
    
    public static void main(String[] args) {

    TablasHASH hash=new TablasHASH(8);
    String [] elementos={"20","33","21","10","12","14","56","100"};
    hash.funcionHash(elementos, hash.arreglo);
    hash.mostrar();
    String buscar=hash.buscarclave("3333");
    if(buscar==null){
        System.out.println("EL ELEMENTO NO FUE ENCONTRADO");
    }
    }
    
}
