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

@NamedQuery(name = "Evento.buscaEvento",
            query = "select event from Evento as event "
            + "join event.conta as c "
            + "where c.numConta=:numConta and c.abanco=:banco and c.agencia=:agencia")

@Entity
@Table(name="Evento")
@SequenceGenerator(name="EVENTO_SEQUENCE", sequenceName="EVENTO_SEQUENCE", allocationSize=1, initialValue=0)

public class Evento implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EVENTO_SEQUENCE")
    
    private int idEvento;
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idconta", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta conta;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idconta", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta contaDestino;
    
    @Column(name="Valor")
    private double valor;
    
    @Column(name="Data")
    private Date data;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
