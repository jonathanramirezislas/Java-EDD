
package numero.factorial.recursividad;

public class NumeroFactorialRecursividad {

    public static void main(String[] args) {
        NumeroFactorialRecursividad obj=new NumeroFactorialRecursividad();
        obj.factorialrecursivo(4);
        System.out.println("El factorial de 4 con recursividad es ="+ obj.factorialrecursivo(4));
        System.out.println("el factorial de 4 con ciclo="+obj.factorialciclo(4));
    }

    public int factorialrecursivo(int n) {
        if (n < 0) {
            return 0;
        }else{//caso base
            if (n == 0) {
                return 1;
            }else{
                //domio del problema
            return n*factorialrecursivo(n-1);
            }
        }
    }
    //creando metodo factorial mediante ciclo
    public int factorialciclo(int n){
       int factor=1;
        if (n<0){
            return 0;
        }else
            while(n!=0){
              factor =n*factor;  
            n--;
        }
        return factor;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    