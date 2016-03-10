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
    @NamedQuery(name = "Conta.buscaConta",
            query = "select conta from Conta as c "
            + "where c.banco=:banco and c.agencia=:agencia and c.numConta=:numConta")
})

@Entity
@Table(name="Conta")
@SequenceGenerator(name="CONTA_SEQUENCE", sequenceName="CONTA_SEQUENCE", allocationSize=1, initialValue=0)

public class Conta implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CONTA_SEQUENCE")
    
    private int idConta;
    
    @Column(name="Banco")
    private String banco;
    
    @Column(name="Agencia")
    private String agencia;
    

    @Column(name="numConta")
    private String numConta;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Usuario usuario;

    
    @Column(name="Saldo")
    private double saldo;
    
    @Column(name = "senha")
    private String senha;

    
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
}
