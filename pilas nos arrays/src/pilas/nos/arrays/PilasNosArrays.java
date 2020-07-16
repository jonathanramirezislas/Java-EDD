package pilas.nos.arrays;

import javax.swing.JOptionPane;

public class PilasNosArrays {

    public static void main(String[] args) {

        int opcion = 0, elemento, tamaño;
        boolean estado = false;
        try {

            tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "DE  QUE TAMAÑO QUIERE LA PILA",
                    "SOLICITANDO EL TAMAÑO", JOptionPane.INFORMATION_MESSAGE));
            pila pilita = new pila(tamaño);

            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1.EMPUJAR UN ELEMENTO EN LA PILA\n"
                        + "2.SACAR UN ELEMENTO DE LA PILA\n"
                        + "3.LA PILA ESTA VACIA?\n"
                        + "4.LA PILA ESTA LLENA?\n"
                        + "5.QUE ELEMENTO ESTA EN LA CIMA?\n"
                        + "6.TAMAÑO DE LA PILA\n"
                        + "7.SALIR\n"
                        + "que deceas hacer?", "menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Igrsa el elemento a empujar a a pila",
                                "empujando elemento", JOptionPane.INFORMATION_MESSAGE));
                        if (!pilita.estallena()) {
                            pilita.empujar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta llena", "PILA llena", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 2:
                        if (!pilita.estavacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es " + pilita.sacar(),
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
                        if (pilita.estallena()) {
                            JOptionPane.showMessageDialog(null, "LA PILA ESTA LLENA", "PILA LLENA", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "LA PILA CONTIENE ESPACIO AUN", "PILA LA PILA NO ESTA LLENA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!pilita.estavacia()) {
                            JOptionPane.showMessageDialog(null, "EL ELEMENTO QUE ESTA EN LA CIMA " + pilita.cimapila(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "PILA VACIA", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                  JOptionPane.showMessageDialog(null, "El tamaño de la pila es "+pilita.tamaniopila(),
                          "Tamaño",JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "amplicaicon finalizada", "fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta", "error", JOptionPane.INFORMATION_MESSAGE);
                }

            } while (opcion != 7);

        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
        }

    }

}
