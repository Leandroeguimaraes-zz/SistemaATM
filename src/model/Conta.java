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
            query = "from Conta as c "
            + "where c.banco=:banco and c.agencia=:agencia and c.numConta=:numConta")
})

@Entity
@Table(name="CONTA")
@SequenceGenerator(name="CONTA_SEQUENCE", sequenceName="CONTA_SEQUENCE", allocationSize=1, initialValue=0)

public class Conta implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CONTA_SEQUENCE")
    @Column(name="IDCONTA")
    private int idConta;
    
    @Column(name="BANCO")
    private String banco;
    
    @Column(name="AGENCIA")
    private String agencia;
    

    @Column(name="NUMCONTA")
    private String numConta;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USUARIO", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Usuario usuario;

    @Column(name="SALDO")
    private double saldo;
    
    @Column(name = "SENHA")
    private String senha;
    
    

//    public Conta(String banco, String agencia, String numConta, Usuario usuario, double saldo, String senha) {
//        this.banco = banco;
//        this.agencia = agencia;
//        this.numConta = numConta;
//        this.usuario = usuario;
//        this.saldo = saldo;
//        this.senha = senha;
//    }

    
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
