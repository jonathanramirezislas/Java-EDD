
package recursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividad {

  
    public static void main(String[] args) {
        Recursividad objesc=new Recursividad();
        objesc.bajarescalera(20);
    }
    //Creando un metodo para bajara una escalera de manera recursiva
    public void bajarescalera(int escalones){
        if(escalones==0){//caso base       
            System.out.println("has terminado de bajar las escaleras");
                    
        }else{try {
            //domio divicion del problema menos 1
            Thread.sleep(500);//para correr el programa mas lento
          
            System.out.println("bajando escalon "+escalones);
            
            //haciendo uso de la recursividad
            bajarescalera(escalones-1);  
      
            } catch (InterruptedException ex) {
                Logger.getLogger(Recursividad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }

    
    
    
}
