/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Leandro
 */

//@NamedQueries({
//    @NamedQuery(Name="Conta.")
//})

@Entity
@Table(name="Conta")
@SequenceGenerator(name="CONTA_SEQUENCE", sequenceName="CONTA_SEQUENCE", allocationSize=1, initialValue=0)

public class Conta implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CONTA_SEQUENCE")
    
    private int idConta;
    
    @Column(name="Agencia")
    private String agencia;
    
    @Column(name="Conta")
    private String conta;
    
    @Column(name="Saldo")
    private String saldo;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    
}
