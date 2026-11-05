package model; 

public class Conta { 
 // atributos //  
    private int numero; 
    private String cliente; 
    private double saldo; 
    private double limite; 

    public Conta() {    
        
    }
    // construtor // 
    public Conta (int numero, String cliente, double saldo, double limite){ 
        this.numero = numero; 
        this.cliente = cliente; 
        this.saldo = saldo; 
        this.limite = limite; 
    } 
        // getter e setters //
      public String getCliente (){ 
        return this.cliente; 
    } 
    public void setCliente (String cliente){ 
        this.cliente = cliente; 
    } 
    
    public double getSaldo (){ 
        return this.saldo; 
    } 

     public double getLimite (){ 
        return this.limite; 
    } 
    
     public int getNumero (){ 
        return this.numero; 
    } 
    public void setNumero (int numero){ 
        this.numero = numero;    
    } 
}
