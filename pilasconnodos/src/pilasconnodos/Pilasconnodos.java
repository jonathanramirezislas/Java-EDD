package pilasconnodos;

import javax.swing.JOptionPane;

public class Pilasconnodos {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        pila pilita = new pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1.EMPUJAR UN ELEMENTO EN LA PILA\n"
                        + "2.SACAR UN ELEMENTO DE LA PILA\n"
                        + "3.LA PILA ESTA VACIA?\n"
                        + "4.QUE ELEMENTO ESTA EN LA CIMA?\n"
                        + "5.TAMAÑO DE LA PILA?\n"
                        + "6.LIMPIAR PILA\n"
                        + "7.MOSTRAR ELEMENTOS\n"
                        + "8.SALIR\n"
                        + "que deceas hacer?", "menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Igresa el elemento a empujar a a pila",
                                "empujando elemento", JOptionPane.INFORMATION_MESSAGE));
                       pilita.empujar(elemento);                        
                        break;
                    case 2:
                        if (!pilita.estavacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es" + pilita.scara(),
                                    "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);

                        }

                        break;
                    case 3:
                        if (pilita.estavacia()) {
                            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA", "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "LA PILA ESTA NO VACIA", "PILA CONTIENE DATOS", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:
                        if (!pilita.estavacia()) {
                            JOptionPane.showMessageDialog(null, "EL ELEMENTO QUE ESTA EN LA CIMA" + pilita.cima(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                           JOptionPane.showMessageDialog(null, "El tamaño de la pila es" +pilita.tamaño(),
                                "Tamaño", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 6:
                        if(!pilita.estavacia()){
                           pilita.limpiar();
                                JOptionPane.showMessageDialog(null, "LA PILA SE HA VACIADP",
                                "VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"NO HAY NADA QUE LIMPIAR","PILA VACIA",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        break;
                    case 7:
                          if(!pilita.estavacia()){
                             pilita.mostrar();
                          }else{
                            JOptionPane.showMessageDialog(null,"NO HAY ELEMENTOS","SIN ELEMENTOS",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "amplicaicon finalizada", "fin", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta", "error", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
             JOptionPane.showMessageDialog(null, "ERROR"+n.getMessage());

            }

        } while (opcion != 8);
    }

}
