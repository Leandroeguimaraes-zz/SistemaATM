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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Leandro
 */
@NamedQueries({
    @NamedQuery(name="Usuario.listaUsuarios", query="select a from Usuario a")
})

@Entity 
@Table(name="Usuario")
@SequenceGenerator(name="USUARIO_SEQUENCE", sequenceName="USUARIO_SEQUENCE", allocationSize=1, initialValue=0)
public class Usuario implements java.io.Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="USUARIO_SEQUENCE")
    
    private int idUsuario;
    
    @Column(name="cpf")
    private String cpf;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="senha")
    private String senha;
    
    @JoinColumn(name="conta")
    private Conta conta;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
}
