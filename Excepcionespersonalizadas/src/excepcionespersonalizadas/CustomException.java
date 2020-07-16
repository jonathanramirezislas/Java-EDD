
package excepcionespersonalizadas;


public class CustomException extends Exception {//exteniende de una lcase de java de excepcion
    
    public static final long serialVersionUID=700L;//VARIABLE VALOR LONG 
    public CustomException(String mensaje){//recive el mensaje 
        super(mensaje);//manda a llamar al constructor de la clase exception
    }
}
