package model;
 // atributos //
 
    public class Conta {
        
        private double poupar;
        private double pagarDespesa;
        private double sacar;
        private double depositar;
        
      // construtor //
      
    public Conta (double poupar , double pagarDespesa , double sacar , double depositar ){
         
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
        return this.depositar;
    }
    
    public void setDepositar (double Depositar){
        this.depositar = depositar;
    }
    
    public double getSacar (){
        return this.sacar;
    }
    
    public void setSacar (double Sacar){
        this.sacar = sacar;
    }
    
    public double getPagarDespesa (){
        return this.pagardespesa;
    }
    
    public void setPagarDespesa (double PegarDespesa){
        this.pagardespesa = pagardespesa;
    }
    
    public double getPoupar (){
        return this.poupar;
    }
    
    public void setPoupar (double Poupar){
        this.poupar = poupar;
    }
}
    
