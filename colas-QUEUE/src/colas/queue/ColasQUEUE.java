package colas.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ColasQUEUE {

    public static void main(String[] args) {
        Queue<String> colita = new LinkedList<String>();
        Scanner tec=new Scanner(System.in);
        String l = " ";

        for (int i = 0; i < 7; i++) {
            l = JOptionPane.showInputDialog("Dame el nombre :");
            colita.add(l);
        }
      for(int i=0;i<4;i++){
          colita.remove();
      }
       for (int i = 0; i < 5; i++) {
            l = JOptionPane.showInputDialog("Dame el nuevo  nombre :");
            colita.add(l);
        }
       //No existe metodo para retornar el elemento bajo una posisicon
        
        while(!colita.isEmpty()){
            System.out.println("Elementos de la cola"+colita.remove());
       
        }

    }

}
