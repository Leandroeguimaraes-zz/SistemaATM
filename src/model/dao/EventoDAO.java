/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import javax.swing.JOptionPane;
import model.Conta;
import model.Evento;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class EventoDAO implements EventoInterfaceDAO{
    
    private Evento evento;
     @Override
    public Evento buscaEvento(String banco, String agencia, String numConta) {
         if(evento==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Evento.buscaEvento");
            query.setParameter("numConta", numConta);
            query.setParameter("agencia", agencia);
            query.setParameter("banco", banco);
            evento= (Evento) query.list().get(0);
            session.close();
        }
        return evento;
    }

    @Override
    public void setEvento(Evento evento) {
        this.evento=evento;
    }
    
    @Override
    public void salvar(Evento evento){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(evento);
        trans.commit();
        s.close();
       JOptionPane.showMessageDialog(null, "Salvo");
    }
    @Override
    public void atualiza(Evento evento){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(evento);
        trans.commit();
        s.close();
    }
    @Override
    public void excluir(Evento evento){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.delete(evento);
        trans.commit();
        s.close();
    }

   
    
}
