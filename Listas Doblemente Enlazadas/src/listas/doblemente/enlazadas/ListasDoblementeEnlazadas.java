
package listas.doblemente.enlazadas;

import javax.swing.JOptionPane;

public class ListasDoblementeEnlazadas {

    public static void main(String[] args) {
listadble listita =new listadble();
int opcion=0,elemento;
do{
    try{
       opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.AGREGAR UN NODO AL INCIO\n"
                        + "2.AGRAGR UN NODOD AL FIN\n"
                        + "3.MOSTRAR LA LISTA DE INCIO A FIN\n"
                        + "4.MOSTRAR LA LISTA DE FIN A INCIO\n"
                        + "5.ELIMINAR UN NODO DEL INICIO\n"
                        + "6.ELIMINAR UN NODOD DEL FINAL\n"
                        + "7.SALIR\n"
                        +"QUE DECEAS HACER?","MENU DE OPCIONES",JOptionPane.INFORMATION_MESSAGE));
       switch(opcion){
        case 1: 
             elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
             "INGRESA EL ELEMENTO DEL NODO","AGREGANDO NODO",JOptionPane.INFORMATION_MESSAGE));
             listita.agregarinicio(elemento);
        break;
        case 2:
             elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
             "INGRESA EL ELEMENTO DEL NODO","AGREGANDO NODO",JOptionPane.INFORMATION_MESSAGE));
             listita.agregaralfinal(elemento);
        break;
        case 3:
            if(!listita.estavacia()){
                listita.mostrarlistainciofin();
            }else{
            JOptionPane.showMessageDialog(null,"NO HAY NODOS","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);
            }
        break;
        case 4:
             if(!listita.estavacia()){
                listita.mostrarlistafininicio();
            }else{
            JOptionPane.showMessageDialog(null,"NO HAY NODOS","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);
            }
        break;
        case 5:
        if(!listita.estavacia()){
        elemento=listita.eleminardelInicio();
      JOptionPane.showMessageDialog(null,"EL ELEMENTO ELIMINADO ES: "+elemento,"",JOptionPane.INFORMATION_MESSAGE);
        }else{
       JOptionPane.showMessageDialog(null,"NO HAY ELEMENTOS","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);}
        break;
        case 6:
        if(!listita.estavacia()){
        elemento=listita.eliminardelfinal();
        JOptionPane.showMessageDialog(null,"EL ELEMENTO ELIMINADO ES: "+elemento,"",JOptionPane.INFORMATION_MESSAGE); }
        else{
    JOptionPane.showMessageDialog(null,"NO HAY ELEMENTOS","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);

        }
        break;
        case 7:
        JOptionPane.showMessageDialog(null,"Aplicacion finalizada", "FIN",JOptionPane.INFORMATION_MESSAGE);
        break;
        default:
        JOptionPane.showMessageDialog(null,"La opcion no esta en el menu", "Eror",JOptionPane.INFORMATION_MESSAGE);
    }
        
    }catch(NumberFormatException n){
        JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
    }
    
}while(opcion!=7);
    }
    
}




























