/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

public class caminosminimos {

    ///Metodo para determinar todos los caminos floyd
    public String algoritmoFloyd(long[][] mAdy) {
        int vertice = mAdy.length;
        long matrizAdyaciencia[][] = mAdy;
        String caminos[][] = new String[vertice][vertice];//vamos ir guardabdo los caminos
        String caminosaxuliares[][] = new String[vertice][vertice];
        String caminorecorrido = "", cadena = "", caminitos = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        //incializando las matrizes caminos y caminos aux
        for (i = 0; i < vertice; i++) {
            for (j = 0; j < vertice; j++) {
                caminos[i][j] = "";
                caminosaxuliares[i][j] = "";
            }
        }
        for (k = 0; k < vertice; k++) {
            for (i = 0; i < vertice; i++) {
                for (j = 0; j < vertice; j++) {
                    temporal1 = matrizAdyaciencia[i][j];
                    temporal2 = matrizAdyaciencia[i][k];
                    temporal3 = matrizAdyaciencia[k][j];
                    temporal4 = temporal2 + temporal3;
//ENcontrando el minimo
                    minimo = Math.min(temporal1, temporal4);//minimo almacenara el minimo de los temporales 1 y 4
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminorecorrido = "";
                            caminosaxuliares[i][j] = k + "";
                            caminos[i][j] = caminoR(i, k, caminosaxuliares, caminorecorrido) + (k + 1);

                        }

                    }
                    matrizAdyaciencia[i][j] = (long) minimo;

                }
            }
        }
        //Agregando el camino minimo a cadena
        for (i = 0; i < vertice; i++) {
            for (j = 0; j < vertice; j++) {
                cadena = cadena + "[" + matrizAdyaciencia[i][j] + "]";

            }
            cadena = cadena + "\n";
        }
        ////////////////////////////Important
        for (i = 0; i < vertice; i++) {
            for (j = 0; j < vertice; j++) {
                if (matrizAdyaciencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ")IRSE por ....(" + (i + 1) + " , " + (j + 1) + "\n";
                        } else {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ")IRSE po...(" + (i + 1) + ", " + caminos[i][j] + ", " + (j + 1) + ") \n";
                        }
                    }
                }
            }
        }
        return "La matriz de caminos mas cortos entre los diferentes vertices es :\n" + cadena
                + "\nLos diferentes caminos mas cortos entre Vertices son: \n" + caminitos;
    }

    public String caminoR(int i, int k, String[][] caminosauxiliares, String caminorecorrido) {
        if (caminosauxiliares[i][k].equals("")) {
            return "";
        } else {
            //recursividad al millon compas
            caminorecorrido += caminoR(i, Integer.parseInt(caminosauxiliares[i][k].toString()),
                    caminosauxiliares,
                    caminorecorrido) + (Integer.parseInt(caminosauxiliares[i][k].toString()) + 1) + ", ";
            return caminorecorrido;
        }
    }

}
