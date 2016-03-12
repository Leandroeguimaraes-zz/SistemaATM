/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Leandro
 */


@NamedQueries({
	@NamedQuery(name = "Evento.buscaEvento",
                    query = "from Evento as event where event.id=:id"),
        @NamedQuery(name = "Evento.buscaEventos",
                    query = "from Evento as event where event.conta=:cont or event.contaDestino=:cont")
})
@Entity
@Table(name="Evento")
@SequenceGenerator(name="EVENTO_SEQUENCE", sequenceName="EVENTO_SEQUENCE", allocationSize=1, initialValue=0)

public class Evento implements java.io.Serializable{
    
    @Id    
    @Column(name="ID")
    private String id;
    
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTA", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta conta;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTADESTINO", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Conta contaDestino;
    
    @Column(name="VALOR")
    private double valor;
    
    @Column(name="DATA")
    @Temporal(value=TemporalType.DATE)
    private Date data;

    public Evento(String id, Conta conta, Conta contaDestino, double valor, Date data) {
        this.id = id;
        this.conta = conta;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.data = data;
    }

    public Evento() {
    }
       

    public Conta getConta() {
        return conta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
