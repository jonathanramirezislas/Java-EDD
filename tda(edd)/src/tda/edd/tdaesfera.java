
package tda.edd;
public class tdaesfera {
     private double radio;
     
     tdaesfera(double radioinicial){
         if(radioinicial>0){
             this.radio=radioinicial;
         }else{this.radio=0;}}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
  public double getDiametro(){
      return (radio*2);
  }
  public double getCircuferencia(){
      return (Math.PI*getDiametro());
  }
  public double getArea(){
      return (4*Math.PI*radio*radio);
  }
  public double getvolumen(){
      return (4*Math.PI*Math.pow(radio,3))/3;
  }
  
  
  
     
}
