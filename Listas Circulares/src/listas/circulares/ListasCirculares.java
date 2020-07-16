package listas.circulares;

import javax.swing.JOptionPane;

public class ListasCirculares {

    public static void main(String[] args) {
        listalc listita = new listalc();
        int opcion=0, elemento;boolean eleminada=false;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.AGREGAR UN NODO A LA LISTA CIRCULAR\n"
                        + "2.ELIMINAR UN NODO DE LA LISTA\n"
                        + "3.MOSTRAR LA LISTA CIRCULAR FIN\n"
                        + "4.SALIR\n"
                        + "QUE DECEAS HACER?", "MENU DE OPCIONES", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "INGRESA EL ELEMENTO DEL NODO", "AGREGANDO NODO A LA LISTA CIRCULAR", JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if(!listita.estavacia()){
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "INGRESA EL ELEMENTO A ELIMINAR", "ELMININANDO", JOptionPane.INFORMATION_MESSAGE));
                      eleminada=listita.eliminarnodo(elemento);
                      if(eleminada){
          JOptionPane.showMessageDialog(null,"EL ELEMNTO ELIMINADO ES"+elemento,"ELEMINADO",JOptionPane.INFORMATION_MESSAGE);
   
                      }else{
  JOptionPane.showMessageDialog(null,"EL ELEMENTO NO ESTA EN LA LISTA","ELEMENTO NO ELEMINADO",JOptionPane.INFORMATION_MESSAGE);

                      }}else{
JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);

                        }
                              
                        break;
                    case 3:
                       if(!listita.estavacia()){
                        listita.mostrarlista();
                    }else{
                JOptionPane.showMessageDialog(null,"AUN NO HAY NODOS","LISTA VACIA",JOptionPane.INFORMATION_MESSAGE);

                       }
                      
                       break;
                    case 4:
                    JOptionPane.showMessageDialog(null,"APLICACION FINALIZADA","FIN",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu", "Eror", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        }while (opcion!= 4);

    }

}
