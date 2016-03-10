package model;

import java.util.Date;

public class Boleto {
    
    private String codigo;
    private Conta contaDestino;
    private double valor;
    private Date dataVencimento;

    public Boleto(String codigo, Conta conta, double valor, Date data){
        this.codigo = codigo;
        this.contaDestino = conta;
        this.valor = valor;
        this.dataVencimento = data;
        
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public Conta getConta() {
        return this.contaDestino;
    }

    public double getValor() {
        return this.valor;
    }
    
    public Date getData(){
        return this.dataVencimento;
    }
    
}
