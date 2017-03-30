
package nilsinhojunior.NilsinhoJunior;


public class Conta {
    
    private double saldo;
    private double numero;
 
    

            
    public double getNumero(){
        return numero; 
    }
    public void setNumero(double valor){
            numero=valor;
    }
    public double getSaldo(){
        return saldo;
 
    }
    public void setSaldo(double valor){
            saldo=valor;
    }
   
    Conta(int numero){
        this.saldo=numero; 
    }
    
    public void deposita(double valor){
        saldo=saldo+valor;
        
    }
    
   public boolean sacar(double valor){
       if(valor <=saldo){
           saldo=saldo-valor;
           return true;
       }
       else return false;
   }
   
   public boolean sacar(double valor, double valor2){
       if(valor <=saldo){
           saldo=saldo-valor;
           return true;
       }
     
      else{
       saldo=saldo-valor2;
           return true;
           
      
   }
   }
   
}
