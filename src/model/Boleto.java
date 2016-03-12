
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Leandro
 */
@NamedQuery(name = "Boleto.buscaBoleto",
            query = "from Boleto as bol "
            + "where bol.codigo=:codigo")


@Entity
@Table(name="Boleto")
@SequenceGenerator(name="BOLETO_SEQUENCE", sequenceName="BOLETO_SEQUENCE", allocationSize=1, initialValue=0)

public class Boleto implements java.io.Serializable{
    
    @Id    
    @Column (name="CODIGO")
    private String codigo;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTADESTINO", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta conta;
    
    @Column(name="VALOR")
    private double valor;
    
    @Column(name="DATAVENCIMENTO")
    @Temporal(value=TemporalType.DATE)
    private Date dataVencimento;  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
}
