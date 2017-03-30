
package nilsinhojunior.NilsinhoJunior;


public class ContaCorrente extends Conta{
        private double limite;

    public ContaCorrente(int numero) {
        super(numero);
    }
    
        public double getlimite(){
        return limite;
        
    }
    public void setLimite(double valor){
         limite=valor; 
    }
        
}
