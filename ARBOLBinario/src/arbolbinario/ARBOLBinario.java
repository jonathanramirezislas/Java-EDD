package arbolbinario;

import javax.swing.JOptionPane;

public class ARBOLBinario {

    public static void main(String[] args) {

        int opcion = 0, elemento;
        String nombre;
        arbol arbolito = new arbol();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.AGREGAR UN NODO\n"
                        + "2.RECORRER EN EN ORDEN INORDEN\n"
                        + "3.RECORRER EN ORDEN PREORDEN\n"
                        + "4.RECORRER EL ARBOL EN POSORDEN\n"
                        + "5.BUSCAR UN NODOD EN EL ARBOL\n"
                        + "6.ELEMINAR UN NODO"
                        + "7.SALIR\n" + "elige una opcion...", "menu arboles", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el el dato de tu nodo", "Agregando nodo", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "INGRESA EL NOMBRE DE TU NODO :",
                                "AGREGANDO NODO", JOptionPane.INFORMATION_MESSAGE);
                        arbolito.agreagrnodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estavacio()) {
                            System.out.println();
                            arbolito.inorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "SIN DATOS", JOptionPane.INFORMATION_MESSAGE);

                        }

                        break;
                    case 3:
                        if (!arbolito.estavacio()) {
                              System.out.println();
                            arbolito.Preorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "SIN DATOS", JOptionPane.INFORMATION_MESSAGE);

                        }

                        break;
                    case 4:
                        if (!arbolito.estavacio()) {
                      System.out.println();
                            arbolito.Posorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "SIN DATOS", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 5:
                        if (!arbolito.estavacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingresa el el el nodo a buscar", "Buscando nodo", JOptionPane.INFORMATION_MESSAGE));

                            if (arbolito.buscarnodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "EL NODO NO SE ENCUENTRA EN EL ARBOL", "NODOD NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                System.out.println("NODOD ENCONRADO DE: " + arbolito.buscarnodo(elemento));
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "SIN DATOS", JOptionPane.INFORMATION_MESSAGE);

                        }

                        break;
                    case 6:
                        if (!arbolito.estavacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingresa el el el nodo a eliminar", "Eliminando nodo", JOptionPane.INFORMATION_MESSAGE));
                       
                            if (arbolito.eleminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "EL NODO NO SE ENCUENTRA EN EL ARBOL", "NODOD NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "EL NODO HA SIDO ELIMINADO", "NODOD ELIMINADO", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO", "SIN DATOS", JOptionPane.INFORMATION_MESSAGE);

                        }

                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "APLICACION FINALIZADA", "FIN", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA", "CUIDADO", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
            }

        } while (opcion != 7);

    }

}
