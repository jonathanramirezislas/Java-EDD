/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionespersonalizadas;

public class miHelper {
    miHelper(){
        
    }
    public boolean validarPassword(String pass,String rpass) throws CustomException{//que puede generar errores de este tipo
        if(pass.equals(rpass)==false){//que si son diferentes hacer pasword es diferente a rpass 
            throw new CustomException("Los campos no son iguales");//generando una nueva exepcion
        }
        if(pass.length()<5){
            throw new CustomException("Es demaciada pequeña la contraseña");
        }
        return true;
    }
    
    
    
    
}
