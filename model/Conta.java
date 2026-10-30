package model;
 // atributos //
 
    public class Conta {
        
        private double poupar;
        private double pagarDespesa;
        private double sacar;
        private double depositar;
        
      // construtor //
      
    public conta (double poupar , double pagarDespesa , double sacar , double depositar ){
         
        this.depositar = depositar;
        this.sacar = sacar;
        this.pagarDespesa = pagarDespesa;
        this.poupar = poupar;
         
     } 
       
        // getter and setters //
        
    public String getConta (){
        return this.conta;
        
    }
    
    public void setConta (String conta ){
        this.conta = conta;
    }
    
      // getters setters //
      
    public double getDepositar (){
        return this.Depositar;
    }
    
    public void setDepositar (double Depositar){
        this.Depositar = Depositar;
    }
    
    public double getSacar (){
        return this.Sacar;
    }
    
    public void setSacar (double Sacar){
        this.Sacar = Sacar;
    }
    
    public double getPagarDespesa (){
        return this.PagarDespesa;
    }
    
    public void setPagarDespesa (double PegarDespesa){
        this.PagarDespesa = PagarDespesa;
    }
    
    public double getPoupar (){
        return this.Poupar;
    }
    
    public void setPoupar (double Poupar){
        this.Poupar = Poupar;
    }
}
    
