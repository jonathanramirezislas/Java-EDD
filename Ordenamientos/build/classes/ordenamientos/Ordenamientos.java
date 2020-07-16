package ordenamientos;

public class Ordenamientos {
    
    public static void main(String[] args) {
        AlgoritmosdeOrdenamiento ordenar = new AlgoritmosdeOrdenamiento();
        int vector1[] = {5, 6, 3, 44, 22, 1};
        int vector2[] = {5, 6, 3, 44, 22, 1};
        int vector3[] = {5, 2, 1, 8, 3, 9, 7};
        int vector4[] = {5, 2, 1, 8, 3, 9, 7};
        int vector5[] = {5, 2, 1, 8, 3, 9, 7};
        System.out.println("Arreglo origina");
        ordenar.mostraarreglo(vector1);
        System.out.println("Arreglo ordenado con burbuja");
        ordenar.burbuja2(vector1);
        ordenar.mostraarreglo(vector1);
        /////////////////////
        System.out.println("/////////////////////////");
        System.out.println("Arreglo original");
        ordenar.mostraarreglo(vector2);
        System.out.println("Arreglo reodenado con radix");
        ordenar.radix(vector2);
        ///////////////////////
        System.out.println("/////////////////////////");
        System.out.println("Arreglo original");
        ordenar.mostraarreglo(vector3);
        System.out.println("Arreglo reodenado con quick");
        ordenar.quick(vector3, 0, vector3.length - 1);
        ordenar.mostraarreglo(vector3);
        //////////////////////////////////
        System.out.println("/////////////////////////");
        System.out.println("Arreglo original");
        ordenar.mostraarreglo(vector4);
        System.out.println("Arreglo rodenado por insercion");
        ordenar.insercion(vector4);
        ordenar.mostraarreglo(vector4);
        ///////////////////////////////
        System.out.println("/////////////////////////");
        System.out.println("Arreglo original");
        ordenar.mostraarreglo(vector5);
        System.out.println("Arreglo rodenado por shell");
        ordenar.shell(vector5);
        ordenar.mostraarreglo(vector5);
////////////////////////////////
        System.out.println("/////////////////////////");
        System.out.println("ARREGLO MPOR INTERCALACION CON DOS ARREGLOS que deben estar ordenados");
        ordenar.burbuja1(vector1);
        ordenar.shell(vector5);
        ordenar.intercalacion(vector1, vector5);
///////////////////
        System.out.println("/////////////////////////");
        int vector6[] = {5, 2, 1, 8, 3, 9, 7};
        System.out.println("Arreglo original");
        ordenar.mostraarreglo(vector6);
        System.out.println("Ordenacion por mezcla directa");
        vector6 = ordenar.mezcladirecta(vector6);
        ordenar.mostraarreglo(vector6);
////////////////////////////////////////////
        System.out.println("Arreglo original");
        int vector7[] = {5, 6, 3, 44, 22, 1};
        ordenar.mostraarreglo(vector7);
        System.out.println("Ordenacion por mezcla natural");
        ordenar.mezclaNatural(vector7);
        ordenar.mostraarreglo(vector7);
    }
    
}
