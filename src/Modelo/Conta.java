/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author VM
 */
public class Conta {
    private String titular;
    private String agencia;
    private String conta;
    private TipoConta tipoConta;
    private String senha;
    private StatusConta status;
    private double saldo;

    public Conta(String titular, String agencia, String conta, TipoConta tipoConta, String senha, StatusConta status, double saldo) throws TitularInvalidoException, AgenciaInvalidoException, ContaInvalidoException, SenhaInvalidaException {
        this.setTitular(titular);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setTipoConta(tipoConta);
        this.setSenha(senha);
        this.setStatus(status);
        this.setSaldo(saldo);
    }

    

    public void setTitular(String titular) throws TitularInvalidoException {
        if(titular.isEmpty()){
            throw new TitularInvalidoException();
        }
        this.titular = titular;
    }

    public void setAgencia(String agencia) throws AgenciaInvalidoException {
        if(agencia.isEmpty()){
            throw new AgenciaInvalidoException();
        }
        this.agencia = agencia;
    }

    public void setConta(String conta) throws ContaInvalidoException {
        if(conta.isEmpty()){
            throw new ContaInvalidoException();
        }
        this.conta = conta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSenha(String senha) throws SenhaInvalidaException {
        try{
            Long.parseLong(senha);
        }catch(NumberFormatException ex){
            throw new SenhaInvalidaException();
        }
        this.senha = senha;
    }

    public void setStatus(StatusConta status) {
        this.status = status;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public String getSenha() {
        return senha;
    }

    public StatusConta getStatus() {
        return status;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
}
