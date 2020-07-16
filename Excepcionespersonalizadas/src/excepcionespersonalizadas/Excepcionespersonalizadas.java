
package excepcionespersonalizadas;


public class Excepcionespersonalizadas {

   
    public static void main(String[] args) {
String user,pass,reppass;
user="juanito";
pass="110";
reppass="110";
        
miHelper llamar=new miHelper();
try{
    llamar.validarPassword(pass,reppass);
}catch(CustomException e){//excepcion personalizada
    System.out.println("NO se puede registrar debido a \n"+e.getMessage()+"\n");
}

        
        
    }
    
}
