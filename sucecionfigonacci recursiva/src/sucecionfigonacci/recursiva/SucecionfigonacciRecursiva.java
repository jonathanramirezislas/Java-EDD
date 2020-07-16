

package sucecionfigonacci.recursiva;

public class SucecionfigonacciRecursiva {

    public static void main(String[] args) {
  SucecionfigonacciRecursiva obj=new SucecionfigonacciRecursiva();     
  System.out.println("lA SUCECION FIBONACCI DE 12 es de ="+obj.fibonaciRecursividad(12));
        System.out.println("La sucecuion de fibonacii de 12 con ciclo es "+obj.fibonaciciclo(12));
    }
    public int fibonaciRecursividad(int n){
        if(n==1 || n==2){
            return 1;
        }else{//dominio del problema-1
            return fibonaciRecursividad(n-1)+fibonaciRecursividad(n-2);
            
        }
    
    }
        public int fibonaciciclo(int n){
            int fibo=0,primero=1,segundo=0;
            while(n>0){
                fibo=primero+segundo;
                primero=segundo;
                segundo=fibo;
                n--;
            }//n=4-1=3-1=2-1=1 fibo 0=1=1=3 primero =2=0=1=2 segundo =0=1=1=3
            return fibo;
            
        }
}

        
        
        
        