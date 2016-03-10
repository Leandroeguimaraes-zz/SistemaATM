package model;

import java.util.Date;


public class Evento {
    private String id;
    private Conta conta;
    private Conta contaDestino;
    private double valor;
    private Date data;
    
    public Evento(String id, Conta conta, Conta contaDest, double valor, Date data){
        this.id = id;
        this.conta = conta;
        this.contaDestino = contaDest;
        this.valor = valor;
        this.data = data;
    }
    
    public String getId(){
        return this.id;
    }
    
    public Conta getConta(){
        return this.conta;
    }
    
    public Conta getContaDestino(){
        return this.contaDestino;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public Date getData(){
        return this.data;
    }
}
