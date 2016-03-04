/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Leandro
 */

@NamedQueries({
    @NamedQuery(name="Conta.listaContas", query="select a from Conta a"),
    @NamedQuery(name="Conta.buscaConta", query="select cont from Conta as cont "
                                         +"where cont.banco=: banco and cont.agencia=:agencia and cont.conta=:conta")
})

@Entity
@Table(name="CONTA")
@SequenceGenerator(name="CONTA_SEQUENCE", sequenceName="CONTA_SEQUENCE", allocationSize=1, initialValue=0)

public class Conta implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CONTA_SEQUENCE")
    
    private int idConta;
    
    @Column(name="BANCO")
    private String banco;
    
    @Column(name="AGENCIA")
    private String agencia;
    
    @Column(name="CONTA")
    private String conta;
    
    @Column(name="CPF")
    private String cpf;
    
    @Column(name="SENHA")
    private String senha;
    
    @Column(name="SALDO")
    private double saldo;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Usuario usuario;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco){
        this.banco = banco;
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
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
