/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres.hanoi.recursividad;


public class TorresHanoiRecursividad {

    public static void main(String[] args) {
        TorresHanoiRecursividad obj=new TorresHanoiRecursividad();
        obj.torre(3, 1, 2, 3);
    }
    public void torre(int discos,int t1,int t2,int t3){
        if(discos==1){//caso base
            System.out.println("Mover de discos de torre"+t1+" a torre"+t3);
        }//dominio
        else{
        torre(discos-1,t1,t3,t2);
        System.out.println("Mover de discos de torre"+t1+" a torre"+t3);
         torre(discos-1,t2,t1,t3);
        }
        
    }
    
}






