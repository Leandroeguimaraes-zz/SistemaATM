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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Leandro
 */
@NamedQuery(name = "Boleto.buscaBoleto",
            query = "select boleto from Boleto as boleto "
            + "where boleto.codigo=:codigo")


@Entity
@Table(name="Boleto")
@SequenceGenerator(name="BOLETO_SEQUENCE", sequenceName="BOLETO_SEQUENCE", allocationSize=1, initialValue=0)

public class Boleto implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="BOLETO_SEQUENCE")
    
    private int idBoleto;
    
    @Column (name="Codigo")
    private String codigo;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idconta", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta conta;
    
    @Column(name="Valor")
    private double valor;
    
    @Column(name="DataVencimento")
    private Date dataVencimento;

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

   

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
