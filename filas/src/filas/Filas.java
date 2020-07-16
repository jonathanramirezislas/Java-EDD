
package filas;

import javax.swing.JOptionPane;

public class Filas {

  
    public static void main(String[] args) {
       int opcion=0,elemento=0;
       cola filita=new cola();
       
       do{
           try{
               opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                               "1.INSERTA UN ELEMENTO\n"
                              + "2.QUITAR AL PRIMERO QUE LLEGO\n"
                              + "3.la cola esta vacia?\n"
                              + "4.ELEMENTO UBICADO AL INICIO DE LA COLA\n"
                              + "5.TAMAÑO DE LA COLA\n"
                              + "6.Saalir","MEnu",JOptionPane.INFORMATION_MESSAGE));
               
               switch(opcion){
                   case 1:
                       elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                               "INGRESA EL ELEMENTO","INSERTANDO",JOptionPane.INFORMATION_MESSAGE));
                       filita.insertar(elemento);
                       
                       break;
                   case 2:
                       if(!filita.estavacia()){
                           JOptionPane.showMessageDialog(null,"EL ELEMNTO ELIMINADO ES"+filita.quitar(),
                                   "QUITANDO ELEMENTO",JOptionPane.INFORMATION_MESSAGE);
                           
                       }else{
                           JOptionPane.showMessageDialog(null,"LA fila esta vacia",
                                   "fila vacia",JOptionPane.INFORMATION_MESSAGE);
                       }
                       
                       break;
                   case 3:
                       if(filita.estavacia()){
                            JOptionPane.showMessageDialog(null,"LA fila esta vacia",
                                   "fila vacia",JOptionPane.INFORMATION_MESSAGE);
                       }else{
                            JOptionPane.showMessageDialog(null,"LA fila NO esta vacia",
                                   "fila ",JOptionPane.INFORMATION_MESSAGE);
                       }
                       
                       break;                 
                   case 4:
                       if(!filita.estavacia()){
                            JOptionPane.showMessageDialog(null,"EL ELEMENTO UBICADO AL INCIO DE LA COLA ES"
                                    +filita.quitar(),
                                   "quitando",JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null,"LA fila esta vacia",
                                   "fila vacia",JOptionPane.INFORMATION_MESSAGE);
                       }
                       
                       break;
                   case 5:
                       JOptionPane.showMessageDialog(null,"EL TAMAÑO DE LA COLA ES"+filita.tamañocola(),
                                   "Tamaño",JOptionPane.INFORMATION_MESSAGE);
                       break;
                   case 6:
                       JOptionPane.showMessageDialog(null,"APLICACION FINALIZADA",
                                   "FIN",JOptionPane.INFORMATION_MESSAGE);
                       break;
                   default:
           JOptionPane.showMessageDialog(null,"OPCION INCORRECTA",
                                   "CUIDADO",JOptionPane.INFORMATION_MESSAGE);
               
               }   
           }catch(NumberFormatException n){
               JOptionPane.showMessageDialog(null,"ERROR"+n.getMessage());
           
           }
           
       }while(opcion!=6);
    }
    
}
