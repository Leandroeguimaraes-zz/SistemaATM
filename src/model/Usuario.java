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

@Entity
@Table(name = "USUARIO")
@SequenceGenerator(name = "USUARIO_SEQUENCE", sequenceName = "USUARIO_SEQUENCE", allocationSize = 1, initialValue = 0)
public class Usuario implements java.io.Serializable {

    @Id
    @Column(name = "CPF")
    private String cpf;

    @Column(name = "NOME")
    private String nome;

//    public Usuario(String cpf, String nome) {
//        this.cpf = cpf;
//        this.nome = nome;
//    }
    
 

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
    
}
