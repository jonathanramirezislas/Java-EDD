
package lista.simplemente.enlazada;

import javax.swing.JOptionPane;


public class ListaSimplementeEnlazada {


    public static void main(String[] args) {
        lista listita=new lista();
        int opcion=0,l;
        
        
        
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,""
                        + "1. AGREGAR UN ELEMENTO A LA LISTA\n "
                        + "2. AGREGRAR UN ELEMENTO AL FINAL\n"
                        + "3. MOSTRAR LOS DATOS DE LA LISTA\n"
                        + "4. ELIMINAR UN NODO DEL INICIO DE LA LISTA\n"
                        + "5.  ELIMINAR UN NODO DEL FIN DE LA LISTA\n"
                        + "6.  ELMINAR UN ELEMENTO EN ESPECIFICO\n"
                        + "7.  BUSCAMDO UN NODO EN LA LISTA\n"
                        + "8. SALIR",
                        "ESCRIVA AQUI SU OPCION"));
                
                switch(opcion){
                    case 1:
                        try{
                            l=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                    + "Ingresa el elemento","Insertando al inicio",3));
                            listita.agregarALinicio(l);//agregando al nodo
                            
                            
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                        }
                        
                        break;
                    case 2:
                        try{
                            l=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                    + "Ingresa el elemento","Insertando al FINAL",3));
                            listita.agregarALFinal(l);//agregando al nodo
                            
                            
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                        }
                            break;
                    case 3:
                         listita.mostraLista();
                        break;
                    case 4:
                           l=listita.borrarDEinicio();
                           JOptionPane.showMessageDialog(null,"EL ELEMENTO ELIMINADO ES: "+l,"eleminando nodo del incio",JOptionPane.INFORMATION_MESSAGE);
                           

                        break;
                    case 5:
                         l=listita.borrarDEfinal();
        JOptionPane.showMessageDialog(null,"EL ELEMENTO ELIMINADO ES: "+l,"eleminando nodo del final",JOptionPane.INFORMATION_MESSAGE);
     
                        break;
                    case 6:
                    l=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL"
                    + " ELEMENTO A ELEMINAR","ELIMINANDO EL NODOD EN ESPECIFICO",JOptionPane.INFORMATION_MESSAGE));
                    listita.eliminarEspecificoNodo(l);
                      JOptionPane.showMessageDialog(null,"EL ELEMENTO ELIMINADO ES: "+l,"eleminando nodo en especifico",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        
                      l=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL"
                    + " ELEMENTO A BUSCAR","BUSCANDO ELEMENTO",JOptionPane.INFORMATION_MESSAGE));
                     if( listita.buscarelemento(l)==true){
                     JOptionPane.showMessageDialog(null, "EL ELEMENTO "+l+" SI ESTA EN LA LISTA",
                             "NODO ENCONTRADO",JOptionPane.INFORMATION_MESSAGE);
                     }else{
                         JOptionPane.showMessageDialog(null, "EL ELEMENTO "+l+" NO ESTA EN LA LISTA",
                             "NODO NO ENCONTRADO",JOptionPane.INFORMATION_MESSAGE);
                          }
                      
                        break;
                    case 8:
                          JOptionPane.showMessageDialog(null,"PROGRAMA FINALIZADO");
                        break;
                    default:
                    JOptionPane.showMessageDialog(null,"OPCION INORRECTA");
         
                }  
            }catch(Exception e){
      JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
 }
   
        }while(opcion!=8);
} }
    


































