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
    @NamedQuery(name = "Usuario.listaUsuarios", query = "select a from Usuario a"),
    @NamedQuery(name = "Usuario.buscaUsuario",
            query = "select user from Usuario as user "
            + "where user.cpf =: cpf")
})

@Entity
@Table(name = "USUARIO")
@SequenceGenerator(name = "USUARIO_SEQUENCE", sequenceName = "USUARIO_SEQUENCE", allocationSize = 1, initialValue = 0)
public class Usuario implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQUENCE")
    private int idUsuario;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TELEFONE")
    private String telefone;
    
    @Column(name = "ENDERECO")
    private String endereco;
    
    public Usuario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    /**
     *
     * @param conta onde o deposito sera feito
     * @param valor a ser depositado
     * @throws ValorInvalidoException valor < zero.
     */
    
    /**
    public void deposita(Conta conta, double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        double saldo = conta.getSaldo();
        double novoSaldo = saldo + valor;
        conta.setSaldo(novoSaldo);
    }
    */

    /**
     *
     * @param conta conta onde a quantia sera sacada
     * @param valor valor a ser sacado
     * @throws ValorInvalidoException valor < 0
     * @throws SaldoInsuficienteException saldo < valor
     */
    /**
    public void saca(Conta conta, double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        double saldo = conta.getSaldo();
        double novoSaldo = saldo - valor;
        if (novoSaldo < 0) {
            throw new SaldoInsuficienteException();
        }
        conta.setSaldo(novoSaldo);
    }
    */

}
